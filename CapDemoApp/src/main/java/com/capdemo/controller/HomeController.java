package com.capdemo.controller;

<<<<<<< HEAD
import org.springframework.beans.factory.annotation.Autowired;
=======
>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.capdemo.domain.User;
<<<<<<< HEAD
import com.capdemo.service.UserService;
=======
>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443

@Controller
public class HomeController {

<<<<<<< HEAD
	@Autowired
	private UserService userService;
	
	
=======
>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443
	@RequestMapping("/")
	public String home() {
		return "redirect:/index";
	}
	
	@RequestMapping("/index")
    public String index() {
        return "index";
    }
	
	
	@RequestMapping(value = "/signup", method = RequestMethod.GET)
    public String signup(Model model) {
        User user = new User();

        model.addAttribute("user", user);

        return "signup";
    }
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
<<<<<<< HEAD
    public String signupPost(@ModelAttribute("user") User user,  Model model) {

        if(userService.checkUserExists(user.getUsername(), user.getEmail()))  {

            if (userService.checkEmailExists(user.getEmail())) {
                model.addAttribute("emailExists", true);
            }

            if (userService.checkUsernameExists(user.getUsername())) {
                model.addAttribute("usernameExists", true);
            }

            return "signup";
        } else {
//        	 Set<UserRole> userRoles = new HashSet<>();
//             userRoles.add(new UserRole(user, roleDao.findByName("ROLE_USER")));

            userService.save(user);

            return "redirect:/";
        }
=======
    public void signupPost(@ModelAttribute("user") User user,  Model model) {

//        if(userService.checkUserExists(user.getUsername(), user.getEmail()))  {
//
//            if (userService.checkEmailExists(user.getEmail())) {
//                model.addAttribute("emailExists", true);
//            }
//
//            if (userService.checkUsernameExists(user.getUsername())) {
//                model.addAttribute("usernameExists", true);
//            }
//
//            return "signup";
//        } else {
//        	 Set<UserRole> userRoles = new HashSet<>();
//             userRoles.add(new UserRole(user, roleDao.findByName("ROLE_USER")));
//
//            userService.createUser(user, userRoles);
//
//            return "redirect:/";
//        }
>>>>>>> 9d06e21d25eece3da5d0fc05c563236a79f43443
    }
	
	
}
