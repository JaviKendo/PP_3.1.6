package academy.kata.rest_template.services;

import academy.kata.rest_template.models.User;

public interface CommunicationService {

    void getAllUsers();

    String addUser(User user);

    String updateUser(User user);

    String deleteUserById(Long id);

}