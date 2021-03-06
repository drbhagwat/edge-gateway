/*
package service;

import com.jwava.cloudgateway.errors.UserAlreadyExists;
import com.jwava.cloudgateway.errors.UserNotFound;
import com.jwava.cloudgateway.model.User;
import com.jwava.cloudgateway.repo.UserRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import repo.UserRepository;

import java.util.Optional;

@Service
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserService {
    @Value("${user.already.exists}")
    private String userAlreadyExists;

    @Value("${user.not.found}")
    private String userNotFound;

    @Autowired
    private UserRepository userRepository;

    public Page<User> getAll(Integer pageNo, Integer pageSize,
                             String sortBy, String orderBy) {
        Pageable pageable = orderBy.equals("A") ? PageRequest.of(pageNo, pageSize
                , Sort.by(sortBy).ascending())
                : PageRequest.of(pageNo, pageSize, Sort.by(sortBy).descending());
        return userRepository.findAll(pageable);
    }

    public User get(String name) throws UserNotFound {
        Optional<User> optionalUser = userRepository.findByName(name);

        if (optionalUser.isEmpty()) {
            throw new UserNotFound(userNotFound);
        }
        return optionalUser.get();
    }

    public User add(User user) throws UserAlreadyExists {
        try {
            get(user.getName());
            throw new UserAlreadyExists(userAlreadyExists);
        } catch (UserNotFound userNotFoundException) {
            return userRepository.save(user);
        }
    }

    public User update(String name, User user) throws UserNotFound {
        User existingUser = get(name);
        existingUser.setFirstSuccessfulLogin(user.getFirstSuccessfulLogin());
        existingUser.setMostRecentLoginSuccessful(user.isMostRecentLoginSuccessful());
        return userRepository.save(existingUser);
    }

    public void delete(String name) throws UserNotFound {
        userRepository.delete(get(name));
    }
}
*/
