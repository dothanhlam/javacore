package org.spring.webapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value="/upload")
public class FileUploadController {

	@RequestMapping(value="save", method=RequestMethod.POST)
	@ResponseBody
	public String filesUploadHandler() {
		return "ok";
	}
}
