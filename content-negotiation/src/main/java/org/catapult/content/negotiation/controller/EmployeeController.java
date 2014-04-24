package org.catapult.content.negotiation.controller;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import org.catapult.content.negotiation.model.Employees;
import org.catapult.content.negotiation.service.EmployeeService;
import org.catapult.content.negotiation.view.PdfView;
import org.catapult.content.negotiation.view.SpreadSheetView;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("/employee/*")
public class EmployeeController {
	private static final EmployeeService service = new EmployeeService();
	
	
	@RequestMapping(value="/list", produces = {"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Employees listWithMarshalling() {
		Employees employees = service.list();
		return employees;
    }
	
	@RequestMapping(value="/list.jsonp", produces = {"application/x-javascript", "application/javascript", "text/javascript"})
    public ResponseEntity<String> listWithJSONP(@RequestParam("callback") String inCallback) throws JsonGenerationException, JsonMappingException, IOException {
		Employees employees = service.list();
		ObjectMapper theObjectMapper = new ObjectMapper();
		ByteArrayOutputStream theJsonOutputStream = new ByteArrayOutputStream();
		theObjectMapper.writeValue(theJsonOutputStream, employees);
		String employeesJSonString = theJsonOutputStream.toString("UTF-8");
		
		StringBuffer theStringBuffer = new StringBuffer();
		theStringBuffer.append(inCallback);
		theStringBuffer.append("(");
		theStringBuffer.append(employeesJSonString);
		theStringBuffer.append(")");
		return new ResponseEntity<String>(theStringBuffer.toString(), new HttpHeaders(), HttpStatus.OK);
    }
	
	@RequestMapping("/list.pdf")
    public PdfView listWithPDF(Model model) {
		Employees employees = service.list();
        model.addAttribute("employees",employees);
        return new PdfView();
    }

    @RequestMapping("/list.xls")
    public SpreadSheetView listWithSpreadSheet(Model model) {
    	Employees employees = service.list();
        model.addAttribute("employees",employees);
        return new SpreadSheetView();
    }
}