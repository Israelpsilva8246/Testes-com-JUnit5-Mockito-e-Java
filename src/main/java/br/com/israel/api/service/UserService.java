package br.com.israel.api.service;

import br.com.israel.api.domain.User;

import java.util.List;

public interface UserService {

    User findById(Integer id);

    List<User> findAll();
}
