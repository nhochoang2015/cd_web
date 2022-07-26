package hotel_booking.controller.config;

import java.security.NoSuchAlgorithmException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.logout.LogoutHandler;

import hotel_booking.Utility;
import hotel_booking.service.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	@Autowired
	private DataSource dataSource;
	@Autowired
	private AuthenticationSuccessHandler authenticationSuccessHandler;
	@Autowired
	private AuthenticationFailureHandler authenticationFailureHandler;
	@Autowired
	private LogoutHandler logoutHandler;

	@Override
	protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
//		String userNameQuery = "select EMAIL as username, " + "MAT_KHAU as password, " + "HOAT_DONG as enabled"
//				+ " from TAI_KHOAN where EMAIL = ?";
//		String authoritiesQuery = "select EMAIL as username, " + "TEN_VAI_TRO as authority "
//				+ "from TAI_KHOAN tk JOIN VAI_TRO vt on vt.MA_VAI_TRO = tk.MA_VAI_TRO" + " where EMAIL = ?";
		auth.userDetailsService(myUserDetailsService);
//		.dataSource(dataSource)..usersByUsernameQuery(userNameQuery)
//				.authoritiesByUsernameQuery(authoritiesQuery);
	}

	@Override
	protected void configure(final HttpSecurity http) throws Exception {
		http.csrf().disable().authorizeRequests()
		.antMatchers("/admin","/admin/*" ,"/admin_page/**").hasAuthority("ADMIN")
		.antMatchers("/quiz", "/test").hasAnyAuthority("ADMIN", "USER")
		.antMatchers("/", "/user_page/**")
		.permitAll()
		.and().formLogin().loginPage("/login")
		.loginProcessingUrl("/handleLogin")
		.successHandler(authenticationSuccessHandler)
		.failureHandler(authenticationFailureHandler).and()
		.logout().logoutUrl("/logout").addLogoutHandler(logoutHandler).deleteCookies("JSESSIONID").and()
		.exceptionHandling().accessDeniedPage("/accessDenied");

	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new PasswordEncoder() {

			@Override
			public boolean matches(CharSequence rawPassword, String encodedPassword) {
				// TODO Auto-generated method stub
				boolean result = false;
				try {
					result = Utility.convertToMD5(rawPassword.toString()).equals(encodedPassword);
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return result;
			}

			@Override
			public String encode(CharSequence rawPassword) {
				// TODO Auto-generated method stub
				String result = "";
				try {
					result = Utility.convertToMD5(rawPassword.toString());
				} catch (NoSuchAlgorithmException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				return result;
			}
		};
	}

}