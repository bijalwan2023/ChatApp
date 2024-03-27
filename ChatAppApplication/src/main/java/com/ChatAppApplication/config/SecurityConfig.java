package com.ChatAppApplication.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	//authentication
	
	@Bean
	public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
		
		//admin
	UserDetails admin=User.withUsername("kavita").password(passwordEncoder.encode("pwd1"))
			.roles("ADMIN")
			.build();
	//another user
	UserDetails user=User.withUsername("john").password(passwordEncoder.encode("pwd2"))
			.roles("USER")
			.build();
	return new InMemoryUserDetailsManager(admin,user);
		
	}
	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
        .authorizeRequests()
            //.requestMatchers("/").permitAll()
            .requestMatchers("/").authenticated()
            .and()
        .formLogin();
    return http.build();
	}

}
