import com.zbcai.headfirst.strategy.*;
/**
 * Created by czb on 2014/6/5.
 */
public class Strategy {
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();

        System.out.println();

        Duck superDuck=new SuperDuck();
        superDuck.display();
        superDuck.performFly();
        superDuck.performQuack();
    }
}
