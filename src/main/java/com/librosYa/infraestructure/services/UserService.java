package com.librosYa.infraestructure.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.librosYa.api.dto.request.UserRequest;
import com.librosYa.api.dto.response.UserAllResponse;
import com.librosYa.domain.entities.User;
import com.librosYa.domain.repositories.UserRepository;
import com.librosYa.infraestructure.abstract_services.IUserService;
import com.librosYa.infraestructure.mappers.UserMapper;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

@Service
@AllArgsConstructor
public class UserService implements IUserService {
  @Autowired 
  private final UserRepository userRepository;
  @Autowired
  private final UserMapper userMapper;
  @Override
  public UserAllResponse create(UserRequest request) {
    
    User user = this.userMapper.toUser(request);
    return this.userMapper.toUserAllResponse(this.userRepository.save(user));
  }
  @Override
  public UserAllResponse update(Long id, UserRequest request) {
    User existingUser = getUserById(id);
    userMapper.updateFromUserRequest(request, existingUser);
    User updatedUser = this.userRepository.save(existingUser);
    return this.userMapper.toUserAllResponse(updatedUser);

  }
  @Override
  public void delete(Long id) {
    this.userRepository.deleteById(id);
    
  }
  @Override
  public Page<UserAllResponse> getAll(Pageable pageable) {
    Page<User> users = this.userRepository.findAll(pageable);
    return users.map(this.userMapper::toUserAllResponse);
    
  }
  @Override
  public Optional<UserAllResponse> getById(Long id) {
    Optional<User> user = this.userRepository.findById(id);
    return user.map(this.userMapper::toUserAllResponse);
    
  }
  @Override
  public User getUserById(Long id) {
    return this.userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("User not found"));
    
  }
}
