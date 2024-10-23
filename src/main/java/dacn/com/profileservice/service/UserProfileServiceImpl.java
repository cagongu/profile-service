package dacn.com.profileservice.service;

import java.util.List;
import java.util.UUID;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;

import dacn.com.profileservice.dto.request.ProfileCreationRequest;
import dacn.com.profileservice.dto.response.UserProfileResponse;
import dacn.com.profileservice.entity.UserProfile;
import dacn.com.profileservice.mapper.UserProfileMapper;
import dacn.com.profileservice.repository.UserProfileRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class UserProfileServiceImpl implements UserProfileService {
    UserProfileRepository userProfileRepository;
    UserProfileMapper userProfileMapper;

    @Override
    public UserProfileResponse createProfile(ProfileCreationRequest request) {
        UserProfile userProfile = userProfileMapper.profileCreationRequesttoUserProfile(request);
        userProfileRepository.save(userProfile);

        return userProfileMapper.userProfiletoUserProfileResponse(userProfile);
    }

    @Override
    public UserProfileResponse getProfile(UUID id) {
        UserProfile userProfile =
                userProfileRepository.findById(id).orElseThrow(() -> new RuntimeException("Profile not found"));
        return userProfileMapper.userProfiletoUserProfileResponse(userProfile);
    }

    @PreAuthorize("hasRole('ADMIN')")
    @Override
    public List<UserProfileResponse> getAllProfiles() {
        var profiles = userProfileRepository.findAll();

        return profiles.stream()
                .map(userProfileMapper::userProfiletoUserProfileResponse)
                .toList();
    }
}
