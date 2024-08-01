import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class OptinalPoc {
    public static void main(String[] args) {


        List<String> fruits = List.of("Apple", "Banana", "Orange", "Grapes");
        fruits.stream().forEach(System.out::println);
        Optional<String> optional = fruits.stream().filter(fruit -> fruit.startsWith("C")).findFirst();
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());
        System.out.println(optional.get());
    }
}
