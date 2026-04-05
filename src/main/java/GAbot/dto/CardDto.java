package GAbot.dto;
import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class CardDto {
    protected long id;
    protected String name;
    protected String imageURL;
    public String getSlug(){
        return name;
    }
}
