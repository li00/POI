package com.lzf.poi;

import com.lzf.poi.dao.DBCnn;
import com.lzf.poi.dto.Employee;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.SQLException;

import java.util.List;

/**
 * 从数据库中获取数据生成excel
 */
public class POIExcel {
    public static void export() throws SQLException {
        //创建工作簿
        Workbook workbook = new HSSFWorkbook();

        //创建表
        Sheet sheet = workbook.createSheet();

        //创建行
        Row row = sheet.createRow(0);
        //创建单元格
        row.createCell(0).setCellValue("序号");
        row.createCell(1).setCellValue("姓名");
        row.createCell(2).setCellValue("年龄");
        row.createCell(3).setCellValue("性别");
        row.createCell(4).setCellValue("籍贯");
        row.createCell(5).setCellValue("入职日期");

        List<Employee> list = DBCnn.getEmployee();
        for (int i=1;i<list.size()+1;i++){
            Row rows = sheet.createRow(i);
            Employee employee = list.get(i-1);

            rows.createCell(0).setCellValue(employee.getId());
            rows.createCell(1).setCellValue(employee.getName());
            rows.createCell(2).setCellValue(employee.getAge());
            rows.createCell(3).setCellValue(employee.getSex());
            rows.createCell(4).setCellValue(employee.getNativePlace());
            rows.createCell(5).setCellValue(employee.getEntryDate());

        }

        FileOutputStream fout = null;
        try {
            fout = new FileOutputStream(new File("C:/workbook02.xls"));
            workbook.write(fout);
            System.out.println("写入完成！");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
