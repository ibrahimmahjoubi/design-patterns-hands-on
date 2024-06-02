package streams;

import java.util.List;
import java.util.stream.Collectors;

/**
    Functional programming relies on lazy evaluation for efficiency
    Lazy evaluation relies on purity of function and immutability for correctness.
**/
public class Sample1 {
    public static void main(String[] args) {
        var numbers = List.of(1, 2, 3, 4);
        var factor = new int[] {5};
        var stringIntermediateStreamOperation = numbers.stream().map( number -> number * factor[0] );
        factor[0] = 3;
        System.out.println(stringIntermediateStreamOperation.collect(Collectors.toList()));
    }
}
