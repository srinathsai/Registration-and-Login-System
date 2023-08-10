package registerationlogin.security;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import registerationlogin.entity.User;
import registerationlogin.repository.UserRepository;

import java.util.stream.Collectors;

@Service
public class CustomUserDetails implements UserDetailsService {
    private UserRepository userRepository;
    public CustomUserDetails(UserRepository userRepository){
        this.userRepository=userRepository;
    }

    @Override   // this function is uses spring loadUserByUsername method that retrieves object from db and returns into spring security provided user.
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email);
        if(user!=null){
            return new org.springframework.security.core.userdetails.User(user.getEmail(), user.getPassword(),user.getRoles().stream().map((role)->new SimpleGrantedAuthority(role.getName())).collect(Collectors.toList()));
        }
        else{
            throw new UsernameNotFoundException("Invalid email or password");
        }
    }
}
