package clinic;

public class Surgeon extends Doctor{
    @Override
    void heal() {
        System.out.println("Хирургическое вмешательство");
    }
}
