import java.util.List;
import java.util.stream.Collectors;

public class FunctionalPrgs {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> integers = List.of(1, 23, 34, 5, 23, 10, 87);
        List<String> courses=List.of("Spring","Spring Boot","API","Microservices","AWS","PCF","Azure","Docker","Kubernetes");
        //printAllNumbers(integers);
        //printEvenNumbers(integers);
       // printOddNumbers(integers);
       // printAllCourses(courses);
       // courseContains(courses);
        //courseLength(courses);
        //printSquareOfEvenNumbers(integers);
        //printCubesOfOddNumbers(integers);
        numberOfCharacters(courses);
    }

    private static void printAllNumbers(List<Integer> integers) {

       // integers.forEach(System.out::println);
        //integers.forEach(number-> System.out.println(number));
       // integers.stream().forEach(FunctionalPrgs::printNumber);
        integers.stream().forEach(System.out::println);
    }
  /*  private static boolean evenNumber(int number)
    {
        return number%2==0;
    }*/
   private static void printEvenNumbers(List<Integer> integers)
    {
        integers.stream()
                // .filter(FunctionalPrgs::evenNumber)
                .filter(number ->number%2==0)
                .forEach(System.out::println);
    }
    private static void printOddNumbers(List<Integer> integers)
    {
        integers.stream()
               // .filter(FunctionalPrgs::evenNumber)
                .filter(number ->number%2!=0)
                .forEach(System.out::println);
    }
    private static void course(String course)
    {
        System.out.println("courses are:"+course);
    }
private static void printAllCourses(List<String> courses)
{
    courses.stream()
            .collect(Collectors.joining(","));
    System.out.println("courses are:"+courses);
}
private static void courseContains(List<String> courses){
       courses.stream()
               .filter(course -> course.contains("Spring"))
               .forEach(System.out::println);
}
private static void courseLength(List<String> courses)
{
    courses.stream()
            .filter(course ->course.length()>=4)
            .forEach(System.out::println);
}

private static void printSquareOfEvenNumbers(List<Integer> integers)
{
    integers.stream()
            .filter(number ->number%2==0)
            .map(num->num*num)
            .forEach(System.out::println);
}
private static void printCubesOfOddNumbers(List<Integer> integers)
{
    integers.stream()
            .filter(number ->number%2!=0)
            .map(num->integers+" "+num*num*num)
            .forEach(System.out::println);
}
private static void numberOfCharacters(List<String> courses)
{
    courses.stream()
            .map(course->course+" "+course.length())
            .forEach(System.out::println);
}
}