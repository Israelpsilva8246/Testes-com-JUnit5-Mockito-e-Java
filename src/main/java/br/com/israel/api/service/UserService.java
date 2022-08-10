package br.com.israel.api.service;

import br.com.israel.api.domain.User;

public interface UserService {

    User findById(Integer id);
}
