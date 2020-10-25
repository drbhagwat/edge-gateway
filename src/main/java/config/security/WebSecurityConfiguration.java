/*
package config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.core.userdetails.MapReactiveUserDetailsService;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.server.SecurityWebFilterChain;


@Configuration
@EnableWebFluxSecurity
public class WebSecurityConfiguration {

    @Value("${PERMIT_ALL_PATH}")
    private String[] permitAllPath;

    @Value("${ADMIN_PATH}")
    private String[] adminPath;

    @Value("${USER_PATH}")
    private String[] userPath;

*/
/*
    @Autowired
    private UserDetailsService customUserDetailService;
*//*


    @Autowired
    private PasswordEncoder passwordEncoder;

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public MapReactiveUserDetailsService userDetailsService() {
        UserDetails user = User
                .withUsername("user")
                .password(passwordEncoder().encode("password"))
                .roles("USER")
                .build();
        return new MapReactiveUserDetailsService(user);
    }

    @Bean
    public SecurityWebFilterChain securitygWebFilterChain(
            ServerHttpSecurity http) {
        return http.authorizeExchange()
                .anyExchange().authenticated()
                .and().formLogin().and().build();
    }

    */
/*
    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.userDetailsService(customUserDetailService).passwordEncoder(passwordEncoder);
    }
*//*


*/
/*
        httpSecurity
                .authorizeRequests()
                .antMatchers("/", "/home").permitAll()
                .anyRequest().authenticated()
                .and()
                .formLogin();
*//*

}
*/
/*

        httpSecurity.csrf().disable()
                .authorizeRequests()
                .antMatchers(permitAllPath).permitAll()
                .anyRequest()
                .authenticated()
                .and().httpBasic();

                .antMatchers(adminPath).hasRole("ADMIN")
                .antMatchers(userPath).hasAnyRole("USER", "ADMIN")
                .antMatchers(permitAllPath).permitAll()
        .and().csrf().ignoringAntMatchers("/h2-console/**") //don't apply CSRF protection to /h2-console
        .and().headers().frameOptions().sameOrigin(); //allow use of frame to same origin urls
*/
