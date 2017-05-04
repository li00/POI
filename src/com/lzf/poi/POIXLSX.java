package com.lzf.poi;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2017/5/4.
 */
public class POIXLSX {
    public static void main(String[] args) {

        //创建工作簿
       // Workbook workbook = new XSSFWorkbook();
        Workbook workbook = new HSSFWorkbook();
        //为工作簿添加工作表
        Sheet sheet = workbook.createSheet();

       /* Sheet sheet1= workbook.createSheet("second");//添加表标签
        Sheet sheet2= workbook.createSheet("thread");*/

        //创建行
        Row row = sheet.createRow(0);

        //创建单元格
        Cell cell = row.createCell(0);

        //为单元格设置内容
        cell.setCellValue(1);
        //使用方法链去创建单元格并设置数据
        row.createCell(1).setCellValue(Calendar.getInstance());
        row.createCell(2).setCellValue("是你么");
        row.createCell(3).setCellValue('否');
        row.createCell(4).setCellValue(100.01);
        row.createCell(5).setCellValue(new Date());

        //创建流
        FileOutputStream fout = null;
        try {
            //实例化流对象
            fout = new FileOutputStream(new File("workbook01.xlsx"));

            //写入Excel
            workbook.write(fout);
            System.out.println("写入成功！");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fout.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
