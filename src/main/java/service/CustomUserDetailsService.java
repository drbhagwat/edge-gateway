package service;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import model.CustomUserDetails;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import repo.UserRepository;

import java.util.Optional;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomUserDetailsService implements UserDetailsService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String name)  {
        Optional<User> user = userRepository.findByName(name);

        if (user.isEmpty()) {
            throw new UsernameNotFoundException("Could not find the user " + name);
        }
        return new CustomUserDetails(user.get());
    }
}
