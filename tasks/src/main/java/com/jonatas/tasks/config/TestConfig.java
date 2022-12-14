package com.jonatas.tasks.config;

import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jonatas.tasks.model.TaskModel;
import com.jonatas.tasks.model.UserModel;
import com.jonatas.tasks.repository.TaskRepository;
import com.jonatas.tasks.repository.UserRepository;

@Configuration
@Profile(value = "test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TaskRepository taskRepository;

    @Override
    public void run(String... args) throws Exception {

        var u1 = new UserModel("Bela", "bela@gmail.com", "123456", null);
        var u2 = new UserModel("Mel", "mel@gmail.com", "123456", null);
        var u3 = new UserModel("Marley", "marley@gmail.com", "123456", null);

        userRepository.saveAll(Arrays.asList(u1, u2, u3));

        var t1 = new TaskModel("ir ao mercado", "preciso comprar verduras", LocalDateTime.now(), false);
        var t2 = new TaskModel("lavar roupa", "separar as roupas brancas das coloridas antes de lavar",
                LocalDateTime.now(), false);
        var t3 = new TaskModel("estudar", "fazer a revisão de matemática", LocalDateTime.now(), false);

        taskRepository.saveAll(Arrays.asList(t1, t2, t3));

        Thread.sleep(500);

        taskRepository.findAll().stream().forEach(x -> {
            System.out.println(x.toString());
        });
        userRepository.findAll().stream().forEach(x -> {
            System.out.println(x.toString());
        });

    }

}
