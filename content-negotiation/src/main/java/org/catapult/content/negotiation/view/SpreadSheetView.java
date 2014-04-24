package org.catapult.content.negotiation.view;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.catapult.content.negotiation.model.Employee;
import org.catapult.content.negotiation.model.Employees;
import org.springframework.web.servlet.view.document.AbstractExcelView;

/**
 * Created with IntelliJ IDEA.
 * User: Lam Do
 * Date: 1/25/14
 * Time: 11:46 AM
 * To change this template use File | Settings | File Templates.
 */
public class SpreadSheetView extends AbstractExcelView {
    public SpreadSheetView() {
        super();    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    protected void buildExcelDocument(Map<String, Object> stringObjectMap, org.apache.poi.hssf.usermodel.HSSFWorkbook hssfWorkbook, HttpServletRequest httpServletRequest, HttpServletResponse response) throws Exception {

        HSSFSheet sheet = hssfWorkbook.createSheet();
    	Employees employees = (Employees)stringObjectMap.get("employees");

    	int r = 0;
    	for(Employee employee : employees.getEmployees()) {
            HSSFRow row = sheet.createRow(r++);
            addStringCell(row, 0, employee.toString());
    	}
    }


    private HSSFCell addStringCell(HSSFRow row, int index, String value) {
        HSSFCell cell = row.createCell(index);
        cell.setCellValue(value);
        return cell;
    }
}
