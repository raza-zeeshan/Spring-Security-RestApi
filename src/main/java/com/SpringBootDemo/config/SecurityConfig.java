package com.SpringBootDemo.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Bean
	@ConditionalOnMissingBean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		http.authorizeHttpRequests(
				auth -> auth.requestMatchers("/about", "/contact", "/welcome").permitAll().anyRequest().authenticated())
				.formLogin(Customizer.withDefaults()).httpBasic(Customizer.withDefaults());
		return http.build();
//		
//		.requestMatchers("/home", "/deposit", "/balance").hasAnyRole("admin", "user")
//		.requestMatchers("/loan", "/change").hasRole("admin")
	}

//	@Bean
//	public UserDetailsService userDetailsService(PasswordEncoder encoder) {
//		UserDetails u1 = User.withUsername("Zeeshan").password(encoder.encode("12345678")).roles("admin").build();
//		UserDetails u2 = User.withUsername("Anupam").password(encoder.encode("87654321")).roles("user").build();
//		return new InMemoryUserDetailsManager(u1, u2);
//	}

//	@Bean
//	public PasswordEncoder psEncoder() {
//		return new BCryptPasswordEncoder();
//	}

}
