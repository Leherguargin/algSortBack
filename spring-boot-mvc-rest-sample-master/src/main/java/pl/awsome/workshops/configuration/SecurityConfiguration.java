//package pl.awsome.workshops.configuration;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.cache.annotation.EnableCaching;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.web.access.channel.ChannelProcessingFilter;
//import org.springframework.security.web.firewall.HttpFirewall;
//import org.springframework.security.web.firewall.StrictHttpFirewall;
//
//
//@Configuration
//@EnableCaching(proxyTargetClass = true)
//@EnableConfigurationProperties
//@EnableGlobalMethodSecurity(prePostEnabled = true)
//public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//       // http.addFilterBefore(new CorsFilter(), ChannelProcessingFilter.class);
//        http
//                .authorizeRequests()
//                .antMatchers("/**").permitAll()
//                .and().csrf().disable().cors().configure();//możę git xd dobra, jak to tesotwałes? postman? możębay  c
//
//    }//to hasło autoamczytynie genrowane przez spring security po co? jak masz palikację webową to wtedy logujesz się w niej poprzez admin i to hasło
//    //ogólnie ja bym w sumie zmienił jednak tą metodę wyżej, aby pozawalać na wszytko cnoo sądzisz?
//    //no warto xD warto by ją tro
//
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        super.configure(web);
//        web.httpFirewall(allowUrlEncodedSlashHttpFirewall());
//
//    }
//
//    @Bean
//    public HttpFirewall allowUrlEncodedSlashHttpFirewall() {
//        StrictHttpFirewall firewall = new StrictHttpFirewall();
//        firewall.setAllowUrlEncodedSlash(true);
//        firewall.setAllowSemicolon(true);
//        return firewall;
//    }
//}
//
