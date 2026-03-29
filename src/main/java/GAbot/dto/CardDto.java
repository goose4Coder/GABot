package GAbot.dto;
import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class CardDto {
    protected long id;
    protected String name;
    protected String imageURL;
    protected boolean foil;
    protected int amount;
}
