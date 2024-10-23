package dacn.com.profileservice.service;

import java.util.List;
import java.util.UUID;

import dacn.com.profileservice.dto.request.ProfileCreationRequest;
import dacn.com.profileservice.dto.response.UserProfileResponse;

public interface UserProfileService {
    UserProfileResponse createProfile(ProfileCreationRequest request);

    UserProfileResponse getProfile(UUID id);

    List<UserProfileResponse> getAllProfiles();
}
