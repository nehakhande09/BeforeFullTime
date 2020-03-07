package Singleton;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;


public class TestUseOfSingTone {
	public static void main(String[] args) {
		
	

Row XX=UseOfSingleTONE.getinstance().getrowfromme( 2);
Cell dd=XX.getCell(1);
System.out.println(dd);


//System.out.println(XX);


Row YY=UseOfSingleTONE.getinstance().getrowfromme(3);
Cell ee=YY.getCell(2);
System.out.println(ee);
}
}