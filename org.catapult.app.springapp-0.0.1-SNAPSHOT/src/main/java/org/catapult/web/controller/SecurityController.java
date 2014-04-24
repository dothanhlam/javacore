package org.catapult.web.controller;

import javax.validation.Valid;

import org.catapult.web.model.ChangePassword;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/security")
public class SecurityController {

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public String signin(ModelMap map) {
		map.addAttribute("showError", false);
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			return "dashboard";
		}
		return "signin";
	}

	@RequestMapping(value = "/failure")
	public String signInFailure(ModelMap map) {
		map.addAttribute("showError", true);
		return "signin";
	}

	@RequestMapping(value = "/success")
	public String signInSuccess(ModelMap map) {
		return "dashboard";
	}
	
	@RequestMapping(value="/changePassword", method = RequestMethod.GET)
	public String changePassword(ModelMap map) {
		map.addAttribute("showError", false);
		map.addAttribute("changePassword", new ChangePassword());
		return "changePassword";
	}
	
	@RequestMapping(value="/changePassword",params = "ok", method = RequestMethod.POST)
	public String savePassword(@Valid ChangePassword changePassword, BindingResult result, ModelMap map) {
		if(result.hasErrors()) {
			map.addAttribute("showError", true);
            return "changePassword";
        }
         
		return "changePassword";
	}
	
	
	@RequestMapping(value="/changePassword",params = "cancel", method = RequestMethod.POST)
	@PreAuthorize("hasRole('ROLE_USER')")
	public String cancelPassword() {		
		return "dashboard";
	}
}
