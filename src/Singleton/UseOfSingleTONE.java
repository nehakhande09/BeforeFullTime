package Singleton;

import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;//PROPERTY FILE ADD KRO



public class UseOfSingleTONE {
static UseOfSingleTONE aa;
static XSSFSheet sh;
private UseOfSingleTONE() throws Exception {
	
FileInputStream fis=new FileInputStream("C:\\Users\\admin\\eclipse-workspace\\IoStream\\employee1.xlsx");
XSSFWorkbook wk=new XSSFWorkbook(fis);
 sh =wk.getSheetAt(0);

} 
		public static  UseOfSingleTONE getinstance()  {
			
			if(aa==null) {
				
				try{
					aa=new UseOfSingleTONE();
				   } catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				   }
				
			}
			return aa;
		}
			//utility method
			public  static Row getrowfromme(int rowno) {
				
				if (sh!=null) {
			
			  return sh.getRow(rowno);
			}else
			
			{
		      System.out.println("pattern is not correct");
			}
			  return sh.getRow(rowno);				}
	        }
	
	

	

