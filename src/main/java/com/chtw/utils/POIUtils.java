package com.chtw.utils;



import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import com.alibaba.fastjson.JSONArray;


public class POIUtils {
	public static HSSFWorkbook expExcel(String name,JSONArray head, JSONArray body) {
		// 创建一个excel工作簿
		HSSFWorkbook workbook = new HSSFWorkbook();
		// 创建一个sheet工作表
		HSSFSheet sheet = workbook.createSheet(name);

		// 创建第0行表头，再在这行里在创建单元格，并赋值
		HSSFRow row = sheet.createRow(0);
		HSSFCell cell = null;
		if (head != null) {
			for (int i = 0; i < head.size(); i++) {
				cell = row.createCell(i);
				cell.setCellValue(head.getString(i));// 设置值
			}
		}
		// list<pojo>
		// 将主体数据填入Excel中
		//System.out.println(body);
		for (int i = 0, isize = body.size(); i < isize; i++) {
			row = sheet.createRow(i + 1);
			JSONArray stuInfo = body.getJSONArray(i);
			for(int j = 0;j<stuInfo.size();j++) {
				cell =  row.createCell(j);
				cell.setCellValue(stuInfo.getString(j));
			}
		}
		return workbook;
	}
}
