package academy.kata.rest_template.services;

import academy.kata.rest_template.models.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface CommunicationService {

    List<User> getAllUsers();

    String addUser(User user);

    String updateUser(User user);

    String deleteUserById(Long id);

    String getSessionId(ResponseEntity<List<User>> responseEntity);

    void changeHttpHeaders(String sessionId);

}