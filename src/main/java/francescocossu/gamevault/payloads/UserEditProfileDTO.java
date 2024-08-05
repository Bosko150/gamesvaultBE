package francescocossu.gamevault.payloads;

public record UserEditProfileDTO(
        String profilePic,
        String username,
        String name,
        String surname
) {
}
