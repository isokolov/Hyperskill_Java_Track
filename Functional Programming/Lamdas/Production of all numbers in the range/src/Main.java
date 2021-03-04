import java.util.function.*;


class Operator {

    // Write your code here
    public static LongBinaryOperator binaryOperator = (x, y) -> {
        if (x == y) {
            return x;
        }
        long product = 1L;
        while (x <= y) {
            product *= x;
            x++;
        }
        return product;
    };
}
