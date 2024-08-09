package francescocossu.gamevault.controllers;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.checkout.Session;
import com.stripe.param.checkout.SessionCreateParams;
import francescocossu.gamevault.entities.Game;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class StripeController {

    @Value("${STRIPE_SECRET_KEY}")
    private String secretKey;

    @PostConstruct
    public void init() {
        Stripe.apiKey = secretKey;
    }

    @PostMapping("/create-checkout-session")
    public @ResponseBody Map<String, Object> createCheckoutSession(@RequestBody List<Game> games) throws StripeException {
        SessionCreateParams.Builder sessionParamsBuilder = SessionCreateParams.builder()
                .addPaymentMethodType(SessionCreateParams.PaymentMethodType.CARD)
                .setMode(SessionCreateParams.Mode.PAYMENT)
                .setSuccessUrl("https://your-domain.com/success.html")
                .setCancelUrl("https://your-domain.com/cancel.html");

        for (Game game : games) {
            SessionCreateParams.LineItem lineItem = SessionCreateParams.LineItem.builder()
                    .setPriceData(
                            SessionCreateParams.LineItem.PriceData.builder()
                                    .setCurrency("eur")
                                    .setProductData(
                                            SessionCreateParams.LineItem.PriceData.ProductData.builder()
                                                    .setName(game.getTitle())
                                                    .build()
                                    )
                                    .setUnitAmount((long) (game.getDiscountedPrice() * 100)) // Converti il prezzo in centesimi
                                    .build()
                    )
                    .setQuantity(1L) // Puoi adattare questo se hai dati sulla quantità
                    .build();

            sessionParamsBuilder.addLineItem(lineItem);
        }

        Session session = Session.create(sessionParamsBuilder.build());

        Map<String, Object> responseData = new HashMap<>();
        responseData.put("id", session.getId());

        return responseData;
    }
}
