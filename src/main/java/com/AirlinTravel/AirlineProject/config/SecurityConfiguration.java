/*
 * package com.AirlinTravel.AirlineProject.config;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.context.annotation.Bean; import
 * org.springframework.context.annotation.Configuration; import
 * org.springframework.security.config.annotation.authentication.builders.
 * AuthenticationManagerBuilder; //import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity;
 * 
 * //import org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter;
 * 
 * import org.springframework.security.crypto.password.NoOpPasswordEncoder;
 * 
 * import javax.sql.DataSource;
 * 
 * @SuppressWarnings("deprecation")
 * 
 * @Configuration public class SecurityConfiguration extends
 * WebSecurityConfigurerAdapter {
 * 
 * @Override protected void configure(AuthenticationManagerBuilder auth) throws
 * Exception {
 * auth.inMemoryAuthentication().withUser("Aadhi").password("12345").roles(
 * "ADMIN");
 * 
 * // .and() // .withUser("Kumar").password("78945").roles("ADMIN"); //
 * 
 * auth.jdbcAuthentication() // .dataSource(dataSource) //
 * .usersByUsernameQuery("Select name,password from users where name =?") //
 * .authoritiesByUsernameQuery("Select name,role from users where name=?");
 * 
 * }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * http.csrf().disable(); http.authorizeRequests().antMatchers(
 * "/api/v1.0/flight/airline/inventory/getflights").authenticated()
 * .antMatchers("/airline/*").authenticated().anyRequest().permitAll();
 * http.httpBasic();
 * 
 * }
 * 
 * @Bean public static NoOpPasswordEncoder passwordEncoder() { return
 * (NoOpPasswordEncoder) NoOpPasswordEncoder.getInstance(); } }
 */