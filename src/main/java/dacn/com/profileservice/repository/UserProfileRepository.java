package dacn.com.profileservice.repository;

import java.util.UUID;

import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.stereotype.Repository;

import dacn.com.profileservice.entity.UserProfile;

@Repository
public interface UserProfileRepository extends Neo4jRepository<UserProfile, UUID> {}
