package school.mjc.stage0.loops.task4;

public class NumberToBreakOn {
    public void printNumbersUntilWithBreakOn(int toBreakWith, int numberToGoUntil) {
        for(int i = 0;i<=numberToGoUntil;i++){

            if (i > toBreakWith){
                break;
            }else if(numberToGoUntil<toBreakWith && i == 0){
                System.out.println("iterating till the end");
                continue;

            }else{
                if(i>0){
                    System.out.println(i);
                }

            }
        }
    }
}
