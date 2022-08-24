package com.example._02_structural_patterns._06_adapter.java._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
