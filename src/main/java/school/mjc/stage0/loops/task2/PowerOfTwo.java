package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power < 0){
            System.out.println("too much power");
            return;
        }
        if (power == 0){
            System.out.println(1);
            return;
        }
        int counter = 0;
        while (counter < power){
            int result = 2;
            System.out.println(1);
            while(counter < power){
                System.out.println(result);
                result = result *2;
                counter++;
            }

        }

    }
}
