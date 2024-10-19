package dacn.com.profileservice.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.*;

import dacn.com.profileservice.dto.request.ProfileCreationRequest;
import dacn.com.profileservice.dto.response.UserProfileResponse;
import dacn.com.profileservice.service.UserProfileService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;

@RestController
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileController {
    UserProfileService userProfileService;

    @PostMapping("/users")
    UserProfileResponse createProfile(@RequestBody ProfileCreationRequest request) {
        return userProfileService.createProfile(request);
    }

    @GetMapping("/users/{profileId}")
    UserProfileResponse getProfile(@PathVariable("profileId") UUID profileId) {
        return userProfileService.getProfile(profileId);
    }
}
