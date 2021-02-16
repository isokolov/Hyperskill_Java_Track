// do not remove imports
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

class ArrayUtils {
    // define info method here
    static <T> String info(T... array) {
        if (array == null || array.length == 0) {
            return "[]";
        } else {
            return Arrays.toString(array);
        }
    }
}