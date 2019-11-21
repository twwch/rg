package com.chtw.utils;

import com.chtw.bean.AttractInvestmentTable;
import com.chtw.bean.Yuansou;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author CHTW
 * @date 2019-11-08-14:01
 */

public class UplodaUtil {

    // 去读Excel的方法readExcelAttract，该方法的入口参数为一个File对象
    public static List readExcelAttract(File file,String fileName) {
        InputStream is = null;
        try {
            // 创建输入流，读取Excel
            is = new FileInputStream(file);
            // jxl提供的Workbook类
            Workbook wb = null;
            //is = new FileInputStream(file);
            if (fileName.endsWith("xls")) {
                wb = new HSSFWorkbook(is);
            } else if (fileName.endsWith("xlsx")) {
                wb = new XSSFWorkbook(is);
            }
            //Workbook wb = Workbook.getWorkbook(is);
            // Excel的页签数量
            int sheet_size = wb.getNumberOfSheets();
            //System.out.println("sheet_size="+sheet_size);
            List<List> outerList=new ArrayList<List>();
            for (int index = 0; index < sheet_size; index++) {
                // 每个页签创建一个Sheet对象
                Sheet sheet = wb.getSheetAt(index);
                // sheet.getRows()返回该页的总行数
                System.out.println(sheet.getLastRowNum());
                List<AttractInvestmentTable> innerList = new ArrayList();
                //System.out.println("sheet.getRows()="+sheet.getRows());
                for (int i = 1; i < sheet.getLastRowNum(); i++) {
                    // sheet.getColumns()返回该页的总列数
                    AttractInvestmentTable attract = new AttractInvestmentTable();
                    int col = sheet.getRow(0).getPhysicalNumberOfCells();
                    //System.out.println("col="+col);
                    for (int j = 0; j < col; j++) {
                        //System.out.println("sheet.getRow(i)="+sheet.getRow(i));
                        //System.out.println("sheet.getRow(i).getCell(j)="+i+"行"+j+"列");
                        String cellinfo = sheet.getRow(i).getCell(j).getStringCellValue();
                        //System.out.println("cellinfo="+cellinfo);
                        if (cellinfo.isEmpty()) {
                            continue;
                        }
                        switch (j){
                            case 0:
                                attract.setResourceIndustry(cellinfo);
                                break;
                            case 1:
                                attract.setIndustryInvolved(cellinfo);
                                break;
                            case 2:
                                attract.setEntryName(cellinfo);
                                break;
                            case 3:
                                attract.setEntryType(cellinfo);
                                break;
                            case 4:
                                attract.setPolicyProvisions(cellinfo);
                                break;
                            case 5:
                                attract.setObjectOriented(cellinfo);
                                break;
                            case 6:
                                attract.setKeywords(cellinfo);
                            case 7:
                                attract.setTimeFrame(cellinfo);
                                break;
                            case 8:
                                attract.setResourceProvider(cellinfo);
                                break;
                            case 9:
                                attract.setInfoSources(cellinfo);
                                break;
                            case 10:
                                attract.setBz(cellinfo);
                                break;
                            default:
                                break;
                        }
                    }
//                    System.out.println(attract.toString());
                    innerList.add(attract);
                }
                outerList.add(index, innerList);
            }

            return outerList;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    // 去读Excel的方法readExcelAttract，该方法的入口参数为一个File对象
    public static List readExcelYuanshou(File file,String fileName) {
        InputStream is = null;
        try {
            // 创建输入流，读取Excel
            is = new FileInputStream(file);
            // jxl提供的Workbook类
            Workbook wb = null;
            //is = new FileInputStream(file);
            if (fileName.endsWith("xls")) {
                wb = new HSSFWorkbook(is);
            } else if (fileName.endsWith("xlsx")) {
                wb = new XSSFWorkbook(is);
            }
            //Workbook wb = Workbook.getWorkbook(is);
            // Excel的页签数量
            int sheet_size = wb.getNumberOfSheets();
            //System.out.println("sheet_size="+sheet_size);
            List<List> outerList=new ArrayList<List>();
            for (int index = 0; index < sheet_size; index++) {
                // 每个页签创建一个Sheet对象
                Sheet sheet = wb.getSheetAt(index);
                // sheet.getRows()返回该页的总行数

                List<Yuansou> innerList = new ArrayList();
                //System.out.println("sheet.getRows()="+sheet.getRows());
                for (int i = 1; i < sheet.getLastRowNum(); i++) {
                    // sheet.getColumns()返回该页的总列数
                    Yuansou yuansou = new Yuansou();
                    int col = sheet.getRow(0).getPhysicalNumberOfCells();
                    //System.out.println("col="+col);
                    for (int j = 0; j < col; j++) {
                        //System.out.println("sheet.getRow(i)="+sheet.getRow(i));
                        //System.out.println("sheet.getRow(i).getCell(j)="+i+"行"+j+"列");

                        if(sheet.getRow(i).getCell(j)!=null){
                            sheet.getRow(i).getCell(j).setCellType(Cell.CELL_TYPE_STRING);
                        }
                        String cellinfo = sheet.getRow(i).getCell(j).getStringCellValue();;
                        //System.out.println("cellinfo="+cellinfo);
                        if (cellinfo.isEmpty()) {
                            continue;
                        }
                        switch (j){
                            case 1:
                                yuansou.setTime(cellinfo);
                                break;
                            case 2:
                                yuansou.setAddress(cellinfo);
                                break;
                            case 3:
                                yuansou.setCountry(cellinfo);
                                break;
                            case 4:
                                yuansou.setLeader(cellinfo);
                                break;
                            case 5:
                                yuansou.setFile(cellinfo);
                                break;
                            case 6:
                                yuansou.setNumberOfIssues(cellinfo);
                            case 7:
                                yuansou.setIssueSituation(cellinfo);
                                break;
                            case 8:
                                yuansou.setIssuesIssuesOur(cellinfo);
                                break;
                            case 9:
                                yuansou.setFieldOfOur(cellinfo);
                                break;
                            case 10:
                                yuansou.setXiFieldOfOur(cellinfo);
                                break;
                            case 11:
                                yuansou.setOurCooperation(cellinfo);
                                break;
                            case 12:
                                yuansou.setIssuesIssuesTg(cellinfo);
                                break;
                            case 13:
                                yuansou.setFieldOfTg(cellinfo);
                                break;
                            case 14:
                                yuansou.setXiFieldOfTg(cellinfo);
                                break;
                            case 15:
                                yuansou.setTgCooperation(cellinfo);
                                break;
                            case 16:
                                yuansou.setBz(cellinfo);
                                break;
                            case 17:
                                yuansou.setInfo(cellinfo);
                                break;
                            case 18:
                                yuansou.setPictureName(cellinfo);
                                break;
                            default:
                                break;
                        }
                    }
//                    System.out.println(attract.toString());
                    innerList.add(yuansou);
                }
                outerList.add(index, innerList);
            }

            return outerList;
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                is.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
