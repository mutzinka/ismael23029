package com.rungroup.web2.service.Impl;

//import com.rungroup.web2.JavaEmail.Mail;
import com.rungroup.web2.model.User;
import com.rungroup.web2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
//    private Mail email;




    @Override
    public String logConfirmation(String email, String password) {
        try {
            User user = userRepository.findByEmailAndPassword(email, password);
            if (user != null && user.getRole().equals("ADMIN")) {
                return "redirect:/schools?userid="+user.getId();
            }
            else if (user != null && user.getRole().equals("USER")) {
                return "redirect:/userSchools?userid="+user.getId();
            }
            else {
                return "redirect:/login";
            }
        } catch (Exception ex) {
            return "redirect:/login";
        }
    }

    @Override
    public void saveUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void userApply(long userid) {
        User user = userRepository.findById(userid);
//       email.onApplying(user);
    }

}
