package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int sumSkip = 0;
        int sumLast = 0;
        if (lastInRow < 0 ){
            System.out.println("last number in row is negative");
        } else if (numberToSkip > lastInRow) {
            System.out.println("number to skip is bugger then the last");
        }else{
            for(int i = 1; i<= lastInRow; i++){
                if(i <= numberToSkip){
                    sumSkip+= i;
                }else{
                    sumLast += i;
                }

            }
            System.out.println( "skipped sum is "+ sumSkip);
            System.out.println( "counted sum is "+ sumLast);
        }

    }
}
