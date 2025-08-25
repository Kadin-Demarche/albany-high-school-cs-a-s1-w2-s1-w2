public class Animal {
    private String type;
    private int numLimbs;
    private boolean isMammal;
    private boolean isMostlyLand;
    private double weight;

    public Animal(String t){
        type = t;
    }

    public Animal(String t, double w){
        type = t;
        weight = w;
    }

    public Animal(boolean mammal, double w){
        isMammal = mammal;
        weight = w;
        numLimbs = 4;
    }

    public boolean isMostlyLand(){
        return isMostlyLand;
    }
    
    public boolean isMammal(){
        return isMammal;
    }

    public String getType(){
        return type;
    }

    public void setLimbs(int n){
        numLimbs = n;
    }

    public int getLimbs(){
        return numLimbs;
    }
}
