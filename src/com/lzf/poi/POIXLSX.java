package com.lzf.poi;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2017/5/4.
 */
public class POIXLSX {
    public static void main(String[] args) {

        //创建工作簿
        Workbook workbook = new XSSFWorkbook();
       // Workbook workbook = new HSSFWorkbook();
        //为工作簿添加工作表
        Sheet sheet = workbook.createSheet();

       /* Sheet sheet1= workbook.createSheet("second");//添加表标签
        Sheet sheet2= workbook.createSheet("thread");*/

       long begin = System.currentTimeMillis();

        for (int j=0;j<900000;j++) {
            //创建行
            Row row = sheet.createRow(j);
            //使用方法链去创建单元格并设置数据
            row.createCell(0).setCellValue(956.7);
            row.createCell(1).setCellValue(new Date());
            row.createCell(2).setCellValue("是你么");
            row.createCell(3).setCellValue('否');
            row.createCell(4).setCellValue(953539965);
            row.createCell(5).setCellValue(new Date());
        }



        //创建流
        FileOutputStream fout = null;
        try {
            //实例化流对象
            fout = new FileOutputStream(new File("workbook01.xlsx"));

            //写入Excel
            workbook.write(fout);
            long end = System.currentTimeMillis();
            System.out.println("写入成功！用时"+(end-begin)/1000);
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
