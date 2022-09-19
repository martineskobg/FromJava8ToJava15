package estafet.java17.sealed;

import estafet.java17.sealed.classes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human());
        humans.add(new Man());
        humans.add(new Woman());
        humans.add(new WonderWoman());
        humans.add(new BatMan());
        humans.add(new SuperMan());
        humans.add(new SpiderMan());

        for (Human human : humans)
        {
            System.out.println(human);
        }


    }
}
