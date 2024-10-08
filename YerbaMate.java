public class YerbaMate extends Tea 
{
    int numPasses;

    public YerbaMate(String name, int ounces, double price, int brewTemp, int numPasses)
    {
        super(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }
    
    public YerbaMate()
    {
        super();
        this.numPasses = 0;
    }

    public YerbaMate(YerbaMate other)
    {
        if (other == null)
        {
            System.out.println("Error");
            System.exit(0);
        } else {
            super.setAll(getName(), getOunces(), getPrice(), getBrewTemp());
            this.numPasses = other.numPasses;
        }
    }

    public int getNumPasses()
    {
        return numPasses;
    }

    public void setNumPasses(int numPasses)
    {
        this.numPasses = numPasses;

    }

    public void setAll(String name, int ounces, double price, int brewTemp, int numPasses)
    {
        super.setAll(name, ounces, price, brewTemp);
        this.numPasses = numPasses;
    }
    
    @Override
    public boolean equals(Object o) {
        
        if (o == null || this.getClass() != o.getClass())
            return false;
        YerbaMate that = (YerbaMate) o;
        return this.ounces == that.ounces &&
                Double.compare(this.price, that.price) == 0 &&
                this.name.equals(that.name) && this.brewTemp == that.brewTemp && this.numPasses == that.numPasses;
    }
    @Override
    public String toString()
    {

        return String.format("Yerba Mate: %S, %d ounces, brewed @ %d\u00B0C, $%.2f, %d passes so far", name, ounces, brewTemp, price, numPasses);
    }
    
    public void refill(int refillWater) 
    {
        ounces += refillWater;
    }

    public void passMate()
    {
        numPasses++;
        System.out.printf("The number of passes as been increased by one. Currennt count is %d%n%n", numPasses);

    }
}

