package com.josef.workshopmongo.config;

import com.josef.workshopmongo.domain.Post;
import com.josef.workshopmongo.domain.User;
import com.josef.workshopmongo.dto.AuthorDTO;
import com.josef.workshopmongo.repository.PostRepository;
import com.josef.workshopmongo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepository.deleteAll();
        postRepository.deleteAll();

        User maria = new User(null, "Maria Brown", "maria@gmail.com");
        User alex = new User(null, "Alex Green", "alex@gmail.com");
        User bob = new User(null, "Bob Grey", "bob@gmail.com");
        userRepository.saveAll(Arrays.asList(maria, alex, bob));

        Post post1 = new Post(null, sdf.parse("21/03/2025"), "Lets go travel", "I am travelig to SP", new AuthorDTO(maria));
        Post post2 = new Post(null, sdf.parse("23/03/2025"), "Good morning!", "I woke up happy today!", new AuthorDTO(maria));
        postRepository.saveAll(Arrays.asList(post1, post2));

        maria.addPosts(Arrays.asList(post1, post2));
        userRepository.save(maria);
    }
}
