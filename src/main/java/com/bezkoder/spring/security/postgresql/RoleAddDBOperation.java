package com.bezkoder.spring.security.postgresql;


import com.bezkoder.spring.security.postgresql.models.ERole;
import com.bezkoder.spring.security.postgresql.models.Role;
import com.bezkoder.spring.security.postgresql.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class RoleAddDBOperation implements CommandLineRunner {
    @Autowired
    RoleRepository kekW;
    @Override
    public void run(String... args) throws Exception {
        kekW.saveAll(Arrays.asList(

                new Role(ERole.ROLE_USER),
                new Role(ERole.ROLE_MODERATOR),
                new Role(ERole.ROLE_ADMIN)
                )

        );


    }
}
