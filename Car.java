

public class Car {
	String color;
	int horsePwr;
	int engine;
	String make;


	public Car(){
		this.color = "";
		this.horsePwr = 0;
		this.engine = 0;
		this.make = "";
	}
	public Car(String color){
		this.color = "";
		this.horsePwr = 0;
		this.engine = 0;
		this.make = "";
	}
	public Car(String color, int horsePwr){
		this.color = "";
		this.horsePwr = 0;
		this.engine = 0;
		this.make = "";
	}
	public Car(String color, int horsePwr, int engine){
		this.color = "";
		this.horsePwr = 0;
		this.engine = 0;
		this.make = "";
	}
	public Car(String color, int horsePwr, int engine, String make){
		this.color = "Red";
		this.horsePwr = 250;
		this.engine = 4;
		this.make = "Toyota";
	}	
	
	public String getColor(){
		return this.color;
	}
	
	public void setColor(String color){
		this.color = color;
	}
	public int getHorsePwr(){
		return this.horsePwr;
	}
	public void setHorsePwr(int horsePwr){
		this.horsePwr = horsePwr;
	}
	public int setEngine(){
		return this.engine;
	}
	public void setEngine(int engine){
		this.engine = engine;
	}
	public String getMake(){
		return this.make;
	}
	public void setMake(String make){
		this.make = make;
	}
	public String toString(){
		return " characteristics are: color " + this.color + ", horse power " + this.horsePwr + ", engine size " + this.engine + ", make " + this.make + "."; 
	}
}
