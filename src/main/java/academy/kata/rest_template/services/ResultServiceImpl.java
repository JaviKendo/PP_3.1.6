package academy.kata.rest_template.services;

import academy.kata.rest_template.models.User;
import org.springframework.stereotype.Service;

@Service
public class ResultServiceImpl implements ResultService {

    private final CommunicationService communication;

    private String resultOfTheFirstPart;
    private String resultOfTheSecondPart;
    private String resultOfTheThirdPart;

    public ResultServiceImpl(CommunicationService communication) {
        this.communication = communication;
    }

    @Override
    public String getResult() {
        communication.getAllUsers();

        User user = new User(3L, "James", "Brown", (byte) 25);
        resultOfTheFirstPart = communication.addUser(user);

        user.setName("Thomas");
        user.setLastName("Shelby");
        resultOfTheSecondPart = communication.updateUser(user);

        resultOfTheThirdPart = communication.deleteUserById(user.getId());

        return resultOfTheFirstPart + resultOfTheSecondPart + resultOfTheThirdPart;
    }

    @Override
    public String getResultOfTheFirstPart() {
        return resultOfTheFirstPart;
    }

    @Override
    public String getResultOfTheSecondPart() {
        return resultOfTheSecondPart;
    }

    @Override
    public String getResultOfTheThirdPart() {
        return resultOfTheThirdPart;
    }

}
