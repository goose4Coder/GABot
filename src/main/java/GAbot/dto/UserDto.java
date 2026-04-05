package GAbot.dto;

import lombok.Builder;
import lombok.Getter;

@Builder(toBuilder = true)
@Getter
public class UserDto {
    protected long id;
    protected long userId;
    protected String exchangerUsername;
}
