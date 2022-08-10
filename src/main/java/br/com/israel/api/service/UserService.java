package br.com.israel.api.service;

import br.com.israel.api.domain.User;
import br.com.israel.api.domain.dto.UserDTO;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();

    User create(UserDTO obj);
}
