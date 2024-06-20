package BuilderPattern;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }
    
    public Home getMyHome(Builder builder) {
        return this.builder.getMyHome();
    }
    
    public void createHome() {
        this.builder.buildFloor();
        this.builder.buildTerrace();
        this.builder.buildWalls();
    }
}
