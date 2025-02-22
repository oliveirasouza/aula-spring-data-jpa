package dio.aula.repository;

import dio.aula.model.User;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class StartApp implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("francisco");
        user.setUsername("oliveira");
        user.setPassword("123456");

        userRepository.save(user);

        System.out.println("User saved: " + user);

        List<User> users = userRepository.findAll();
        System.out.println("Usuário cadastrado no banco de dados: " + users);
        for (User u : users) {
            System.out.println(u);
        }
    }
}