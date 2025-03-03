package E_com.E_commerce.SecurityConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

	 @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http
	       
	        
            .authorizeHttpRequests(authorize -> authorize
            		.requestMatchers("/","/images/**","/add","/added","/edit","/update","/delete","/logout").permitAll()
            	
                .anyRequest().authenticated()
            )
            .httpBasic(Customizer.withDefaults())
            .formLogin(form -> form
        			.loginPage("/login")
        			.permitAll()
        		);  // Allow all to access the login page
     
	        
	        return http.build();
	}

	@Bean
	public UserDetailsService users() {
		// The builder will ensure the passwords are encoded before saving in memory
		UserBuilder users = User.withDefaultPasswordEncoder();
		UserDetails user = users
			.username("user")
			.password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
			.roles("USER")
			.build();
		UserDetails admin = users
			.username("admin")
			.password("{bcrypt}$2a$10$GRLdNijSQMUvl/au9ofL.eDwmoohzzS7.rmNSJZ.0FxO/BTk76klW")
			.roles("USER", "ADMIN")
			.build();
		
		return new InMemoryUserDetailsManager(user, admin);
	}

}
