package practiceFrameWork;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class LoginDataProvider 
{
		public static String getData(String sh,int r,int c)
	{
		FileInputStream fis;
		Workbook book=null;
		try {
			fis=new FileInputStream("./excel/loginData.xlsx");
			book=WorkbookFactory.create(fis);
		}catch (Exception e)
		{
			e.printStackTrace();
		}
		Sheet sheet = book.getSheet(sh);
		Row row = sheet.getRow(r);
		Cell cell = row.getCell(c);
		String data = cell.toString();
		return data;
		
	}

}
