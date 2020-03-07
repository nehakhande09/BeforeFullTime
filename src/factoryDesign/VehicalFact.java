
package factoryDesign;

public class VehicalFact {
	private static VehiclePlan  objectcreate(String vname) {
		if(vname.equals("BIKE")) 
			return new BIKE();
		
		if(vname.equals("AUTO")) 
			return new AUTO();
		
		if(vname.equals("TRAIN")) 
			
			return new TRAIN();
		
		return null;
	}
	public static void main(String[] args) {
		String Vname="BIKE";
		VehiclePlan V=objectcreate(Vname);
		V.size(200);
		
		
		
		
		
		
	}
	

}
