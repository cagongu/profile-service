package dacn.com.profileservice.dto.response;

import java.time.LocalDate;
import java.util.UUID;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserProfileResponse {
    UUID id;
    String firstName;
    String lastName;
    LocalDate dob;
    String phoneNumber;
    String email;
    String city;
}
