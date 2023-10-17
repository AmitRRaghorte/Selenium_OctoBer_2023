package A6_ExcelHandling_Parametarisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1_getNumericCellValue {
	
	public static void main (String [] args) throws EncryptedDocumentException, IOException {
		
	FileInputStream file = new FileInputStream ("E:\\Velocity NOTES\\Parameterization_Practise.xlsx");
	
	double value = WorkbookFactory.create(file).getSheet("Login").getRow(1).getCell(2).getNumericCellValue();
		System.out.println (value);
	}

}
