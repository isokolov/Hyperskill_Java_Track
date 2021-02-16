// Do not remove imports
import java.util.Scanner;
import java.lang.reflect.*;

class TypeVariablesInspector {
    public void printTypeVariablesCount(TestClass obj, String methodName) throws Exception {
        try {
            Class clazz = obj.getClass();
            Method method = clazz.getDeclaredMethod(methodName);
            TypeVariable<Method>[] typeVariables = method.getTypeParameters();
            System.out.println(typeVariables.length);

        } catch (Exception e) {
            System.out.println(0);
        }

    }
}
