public class Day20Assignment{
    public static void main(String[] args){

       Engine harleEngine1 = new Engine("8.9:1", "1745-CC");
       Engine harleEngine2 = new Engine("10.5:1", "1868-CC");


       HarleyDevidson harD1=new HarleyDevidson("HarleyDevidson","Fat Boy",20.5f,"18.25 Lakh",harleEngine1, 2020);
       HarleyDevidson harD2=new HarleyDevidson("HarleyDevidson","Low Rider S",15.0f,"14.69 Lakh",harleEngine2, 2019);

       System.out.println(harD1.getSpecification());
       System.out.println(harD2.getSpecification());
 
       System.out.println(MotorBike.getVehicleCount());

    }
    }

interface vehicle{ 
    public abstract String getSpecification();
    }

class MotorBike implements vehicle{
    private static int totalVehicleCount;
    String name, model, price;
    float mileage;
    Engine engine;

    public MotorBike(){

    }

    public MotorBike(String name, String model, float mileage, String price, Engine engine){

              this.name=name;
              this.model=model;
              this.mileage=mileage;
              this.price=price;
              this.engine=engine;

              totalVehicleCount++;
            }
            
    public static int getVehicleCount(){
        return totalVehicleCount;
    }
    
    @Override
    public String getSpecification(){
        return "The specification will be provided based on model";
    }
    
}
class HarleyDevidson extends MotorBike{

    private int manufacturedYear;

    public HarleyDevidson(String name, String model, float mileage, String price, Engine engine, int manufacturedYear){
        super(name, model, mileage, price, engine);
        this.manufacturedYear=manufacturedYear;
    }

    public String getName(){
        return "Bike Name is "+this.name;
    }

    @Override
    public String toString(){
        return String.format("Name: "+this.name+", Model: "+this.model+", Mileage: "+this.mileage
        +", Engine CC: "+this.engine.getEngineCC()+", Manufacture Year: "+this.manufacturedYear+", Price: "+this.price);
    }
    @Override
    public String getSpecification(){
        return this.toString();
    }
}


class Engine{
    private String compressionRatio, engineCC;

    public Engine(String compressionRatio, String engineCC){
        this.compressionRatio=compressionRatio;
        this.engineCC=engineCC;
    }
    public String getEngineCC(){
        return this.engineCC;
    }
    public String getCompressionRatio(){
        return this.compressionRatio;
    }

}








