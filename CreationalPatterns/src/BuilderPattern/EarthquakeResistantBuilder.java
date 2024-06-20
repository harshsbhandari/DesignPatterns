package BuilderPattern;

public class EarthquakeResistantBuilder implements Builder {

    private Home home = new Home();

    @Override
    public void buildFloor() {
        this.home.floor = "Floor for EarthquakeResistantBuilder";
        // System.out.println("Floor for EarthquakeResistantBuilder");
    }

    @Override
    public void buildTerrace() {
        this.home.terrace = "Terrace for EarthquakeResistantBuilder";
        // System.out.println("Terrace for EarthquakeResistantBuilder");
    }

    @Override
    public void buildWalls() {
        this.home.walls = "Walls for EarthquakeResistantBuilder";
        // System.out.println("Walls for EarthquakeResistantBuilder");
    }

    @Override
    public Home getMyHome() {
        return home;
    }
    
}
