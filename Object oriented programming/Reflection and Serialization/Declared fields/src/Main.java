/**
 Get number of fields class declares (the ones inherited should be excluded).
 */
class FieldGetter {

    // Add implementation here
    public int getNumberOfFieldsClassDeclares(Class<?> clazz) {
        return clazz.getDeclaredFields().length;
    }

}
