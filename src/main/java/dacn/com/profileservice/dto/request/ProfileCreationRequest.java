package dacn.com.profileservice.dto.request;

import java.time.LocalDate;
import java.util.UUID;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProfileCreationRequest {
    UUID userId;
    String firstName;
    String lastName;
    LocalDate dob;
    String phoneNumber;
    String email;
    String city;
}
