import java.util.List;

class QualityControl {

    public static boolean check(List<Box<?>> boxes) {
        boolean check = false;

        if (boxes.isEmpty()) {
            return true;
        }

        try {
            for (Box<?> box : boxes) {
                if (box.get() != null) {
                    Class<?> clazz = box.get().getClass();
                    //  System.out.println(clazz.getGenericSuperclass().getTypeName());
                    if (clazz.getGenericSuperclass().getTypeName().equals("Bakery")) {
                        check = true;
                    } else {
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            return false;
        }

        return check;
    }

}

// Don't change the code below
class Bakery { }

class Cake extends Bakery { }

class Pie extends Bakery { }

class Tart extends Bakery { }

class Paper { }

class Box<T> {

    private T item;

    public void put(T item) {
        this.item = item;
    }

    public T get() {
        return this.item;
    }
}
