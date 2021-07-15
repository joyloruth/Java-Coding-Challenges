package codeWars;

public class TrafficLights {

	public static void main(String[] args) {
		
		String current = "red";
	
		System.out.println(updateLightRefactored(current));
		
		

	}
	
	public static String updateLight(String current) {
		if(current == "green") return "yellow";
		if(current == "yellow") return "red";
		return "green";
		
	}
	
	public static String updateLightRefactored(String current) {
		return current.equals("green")? "yellow":current.equals("yellow")? "red":"green";
	}
	

}
