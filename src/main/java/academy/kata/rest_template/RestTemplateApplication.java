package academy.kata.rest_template;

import academy.kata.rest_template.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestTemplateApplication {

//    private static CommunicationServiceImpl communication;

    public static void main(String[] args) {
        SpringApplication.run(RestTemplateApplication.class, args);

//        performAllOperations();
    }

    public static void performAllOperations() {
//        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
//
//        CommunicationServiceImpl communication = con text.getBean("communication", CommunicationServiceImpl.class);

//        CommunicationServiceImpl communication = new CommunicationServiceImpl();
//        communication.getAllUsers();
//
//        User user = new User(3L, "James", "Brown", (byte) 25);
//        communication.addUser(user);
//
//        user.setName("Thomas");
//        user.setLastName("Shelby");
//        communication.updateUser(user);
//
//        communication.deleteUserById(3L);
    }

//    @Autowired
//    public void setCommunication(CommunicationServiceImpl communication) {
//        this.communication = communication;
//    }
}
