package A6_ExcelHandling_Parametarisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg3_getNumericData_As_STRING {

	public static void main (String [] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("E:\\Velocity NOTES\\Parameterization_Practise.xlsx");
		
		String data = WorkbookFactory.create(file).getSheet("Login").getRow(4).getCell(1).getStringCellValue ();
	    System.out.println (data);
	}
}
