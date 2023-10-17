package A6_ExcelHandling_Parametarisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2_getRowSize_From_Sheet {
	
	public static void main (String [] args ) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("E:\\Velocity NOTES\\Parameterization_Practise.xlsx");
		
		int rowSize = WorkbookFactory.create(file).getSheet("Login").getLastRowNum() + 1;
		System.out.println (rowSize);
	}

}

// 
