package dacn.com.profileservice.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import dacn.com.profileservice.dto.request.ProfileCreationRequest;
import dacn.com.profileservice.dto.response.UserProfileResponse;
import dacn.com.profileservice.entity.UserProfile;

@Mapper(componentModel = "spring")
public interface UserProfileMapper {
    @Mapping(target = "id", ignore = true)
    UserProfile profileCreationRequesttoUserProfile(ProfileCreationRequest request);

    UserProfileResponse userProfiletoUserProfileResponse(UserProfile entity);
}
