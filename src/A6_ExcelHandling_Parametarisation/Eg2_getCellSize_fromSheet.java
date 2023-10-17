package A6_ExcelHandling_Parametarisation;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Eg2_getCellSize_fromSheet {

	public static void main (String [] args) throws EncryptedDocumentException, IOException {
		
	 FileInputStream file = new FileInputStream ("E:\\Velocity NOTES\\Parameterization_Practise.xlsx");
	 
	 int cellsize = WorkbookFactory.create(file).getSheet("Login").getRow(0).getLastCellNum();
	 System.out.println (cellsize);
		
		// if want to find out index of last coloumn then used
	   // .getLastCellNum() - 1 ;
	}
}
