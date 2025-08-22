public class Human {
    private String name;
    private String eyeColor;
   
    public Human(String n, String e){
        name = n;
        eyeColor = e;
    }
 
    public void walking(){
        System.out.println("Walking ...");
    }
 
    public void running(){
        System.out.println("Running ...");
    }
 
    //NEW THIS WEEK
    public String name(){
        return name;
    }
    
    public void printState(){
        System.out.println("Name: " + name);
        System.out.println("Eye Color: " + eyeColor);
    }
 }
