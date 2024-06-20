package BuilderPattern;

public class FloodResistantBuilder implements Builder {

    private Home home = new Home();

    @Override
    public void buildFloor() {
        this.home.floor = "Floor for FloodResistantBuilder";
        // System.out.println("Floor for FloodResistantBuilder");
    }

    @Override
    public void buildTerrace() {
        this.home.terrace = "Terrace for FloodResistantBuilder";
        // System.out.println("Terrace for FloodResistantBuilder");
    }

    @Override
    public void buildWalls() {
        this.home.walls = "Walls for FloodResistantBuilder";
        // System.out.println("Walls for FloodResistantBuilder");
    }

    @Override
    public Home getMyHome() {
        return home;
    }
    
}
