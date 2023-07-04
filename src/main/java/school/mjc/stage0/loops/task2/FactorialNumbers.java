package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int multi = 1;
        while (multi <= printToInclusive + 1){
            System.out.println(counter);
            counter = counter * multi;
            multi++;
        }

    }
}
