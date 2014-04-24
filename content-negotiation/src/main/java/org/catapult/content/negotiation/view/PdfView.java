package org.catapult.content.negotiation.view;

import java.util.Map;

import org.catapult.content.negotiation.model.Employee;
import org.catapult.content.negotiation.model.Employees;
import org.springframework.web.servlet.view.document.AbstractPdfView;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 1/25/14
 * Time: 10:47 AM
 * To change this template use File | Settings | File Templates.
 */
public class PdfView extends AbstractPdfView {
    @Override
    protected void buildPdfDocument(Map<String, Object> stringObjectMap, Document document, PdfWriter pdfWriter, javax.servlet.http.HttpServletRequest httpServletRequest, javax.servlet.http.HttpServletResponse response) throws Exception {
    	Employees employees = (Employees)stringObjectMap.get("employees");
    	for(Employee employee : employees.getEmployees()) {
    		document.add(new Paragraph(employee.toString()));
    	}
    }
}
