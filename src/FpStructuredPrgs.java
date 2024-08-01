import java.util.List;

public class FpStructuredPrgs {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> integers = List.of(1, 23, 34, 5, 23, 10, 87);
        //printAllNumbers(integers);
        printNumberEvenNumber(integers);
    }

    private static void printAllNumbers(List<Integer> integers) {
        //How to iterate over list
        for(int number:integers)
        {
            System.out.println(number);
        }
        /* for(int i=0;i<=integers.size()-1;i++)
        {
            System.out.println(integers.get(i));
        }*/
    }
    private static void printNumberEvenNumber(List<Integer> numbers)
    {
        for(Integer num:numbers)
        {
            if(num%2==0)
            {
                System.out.println(num);
            }
        }
    }
}
