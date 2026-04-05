package GAbot.dto;

import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class OfferDto {
    protected CardDto offeredCard;
    protected UserDto owner;
    protected int amount;
    protected boolean foil;
    protected String details;
}
