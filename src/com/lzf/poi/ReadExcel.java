package com.lzf.poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2017/5/26.
 */
public class ReadExcel {
    public static void main(String[] args) throws IOException {
        //读取文件
        InputStream in = new FileInputStream("workbook01.xls");
        //创建HSSFWorkbook实例
        Workbook workbook = new XSSFWorkbook(in);
        //创建并获取工作表
        Sheet sheet = workbook.getSheet("Sheet0");
        //获取行
        Row row = sheet.getRow(0);
        //获取单元格
        Cell cell = row.getCell(0);

        System.out.println(cell.getNumericCellValue()+"========");
        in.close();

    }
}
