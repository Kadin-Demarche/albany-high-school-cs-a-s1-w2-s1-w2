zpublic class Animal {
    private String type;
    private int numLimbs;
    private boolean isMammal;
    private boolean isMostlyLand;
    private double weight;


    public Animal(String t){
        t = type;
    }

    public Animal(String t, double w){
        type = t;
        w = weight;
    }

    public Animal(boolean mammal, double w){
        isMammal = mammal;
        weight = w;
        numLimbs = 4;
    }

    public String isMostlyLand(){
        return isMostlyLand;
    }
    
    public int isMammal(){
        return isMammal;
    }

    public boolean getType(){
        return type;
    }

    public String setLimbs(int n){
        numLimbs = n;
    }

    public boolean limbs(){
        return numLimbs;
    }
}
