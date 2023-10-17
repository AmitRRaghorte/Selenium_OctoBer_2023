package A6_ExcelHandling_Parametarisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg5_getDataByVerifyingCellType {
	
	public static void main (String [] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("E:\\Velocity NOTES\\Parameterization_Practise.xlsx");
		
		Cell data = WorkbookFactory.create(file).getSheet("Login").getRow(7).getCell(2);
		
		CellType type =data.getCellType();
		
		 if(type==CellType.STRING)
			{
				String value = data.getStringCellValue();
				System.out.println(value);
			}
			else if (type==CellType.NUMERIC) 
			{
				double value = data.getNumericCellValue();
				System.out.println(value);
			} 
			else if(type==CellType.BOOLEAN)
			{
					boolean value = data.getBooleanCellValue();
					System.out.println(value);
			}
		 
	}

}


//As we know exceel sheet only contain 3 type of data i.e String ,Numeric ,Boolean
	// if we knew type of data then we can directly get then by using getSting/Boolean/NumericCellValue()
// But here we know only index and we want to print data 
// so 1st we will find out type of data by using getCellType ();
	// then used if_else_if
	