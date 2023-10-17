package A6_ExcelHandling_Parametarisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg1_getStringCellValue {
	

	public static void main (String [] args ) throws EncryptedDocumentException, IOException {
	
// Step 1 : By using below code we reach to exccel sheet
		FileInputStream file = new FileInputStream ("E:\\Velocity NOTES\\Parameterization_Practise.xlsx");

// Step 2 :
		String value = WorkbookFactory.create(file).getSheet("Login").getRow(0).getCell(0).getStringCellValue();
		System.out.println (value);
	}

}
