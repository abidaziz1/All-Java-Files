public class car{
    private String engine;
    private String brand;
    private String color;
    private int mileage;

    // public car(String engine, String brand, String color, int mileage){
    //     this.engine=engine;
    //     this.brand=brand;
    //     this.color=color;
    //     this.mileage=mileage;
    // }

    public void display(){
        System.out.println("Engine: "+ engine);
        System.out.println("Brand: "+ brand);
        System.out.println("color: "+ color);
        System.out.println("Mileage: "+ mileage);
        System.out.println("   ");
    }

    public void change(String attribute, String newValue){
        switch  
           (attribute.toLowerCase()){
            case "engine":
                engine=newValue;
                break;
        
            case "brand":
              brand=newValue;
              break;

            case "color":
              color=newValue;
              break;
            default:
             System.out.println("Invalid Atrribute.");
        }}
        public void changemileage(int newmileage){
            mileage=newmileage;
        }

    

    public static void main(String[] args) {
        car myCar1= new car();
        myCar1.brand="Audi";
        myCar1.engine="V8";
        myCar1.color="White";
        myCar1.mileage=35;
        myCar1.display();
        car myCar2= new car();
        myCar2.display();

        myCar1.change("color","Blue" );
        myCar1.changemileage(30);

        myCar1.display();
    }
}
