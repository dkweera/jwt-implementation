package jwt.implementation.service;

import jwt.implementation.models.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<User> store = new ArrayList<>();

    public UserService() {
        store.add(new User(UUID.randomUUID().toString(), "dhruv", "kweera@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "kweev", "kweel@gmail.com"));
        store.add(new User(UUID.randomUUID().toString(), "ruv", "ra@gmail.com"));
    }

    public List<User> getUsers() {
        return this.store;
    }
}
