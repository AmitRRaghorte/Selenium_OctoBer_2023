package A6_ExcelHandling_Parametarisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.WorkbookFactory;



public class Eg4_getCellType_ {
	
	// Scenario : find out what kind of data present in index /exelsheet ?
	// here we only know index but we dont know type of data index contain
	// Here we findout whether data is boolean,numeric,sTRING using  " getCellType " method.

	public static void main (String [] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream ("E:\\Velocity NOTES\\Parameterization_Practise.xlsx");
		
		CellType s1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(5).getCell(2).getCellType();
		System.out.println (s1);
	}

}
