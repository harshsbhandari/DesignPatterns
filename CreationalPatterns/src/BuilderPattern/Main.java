package BuilderPattern;

public class Main {
    public static void main(String[] args) throws Exception {
        FloodResistantBuilder floodResistantHome = new FloodResistantBuilder();
        Director director = new Director(floodResistantHome);
        director.createHome();

        Home myHome = director.getMyHome(floodResistantHome);
        System.out.println(myHome.terrace);
    }
}
