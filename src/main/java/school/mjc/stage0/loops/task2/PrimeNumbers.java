package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter<=printToInclusive){
            if (printToInclusive >=2 && counter == 2){
                System.out.println(2);
                counter++;
            }
            if (printToInclusive >= 3 && counter ==3){
                System.out.println(3);
                counter++;
            }
            if(printToInclusive >=5 && counter == 5){
                System.out.println(5);
                counter++;
            }
            if(printToInclusive > 3 && counter <=printToInclusive && counter%2 != 0 && counter%3 !=0 && counter %5 !=0){
                System.out.println(counter);
            }
            counter++;
        }

    }
}
