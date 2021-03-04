class Predicate {

    @FunctionalInterface
    public interface TernaryIntPredicate {
        // Write a method here
        boolean test(int a, int b, int c);
    }

    public static final TernaryIntPredicate allValuesAreDifferentPredicate = // Write a lambda expression here
        (a, b, c) -> { return  a != b && b != c && a != c; };

}
