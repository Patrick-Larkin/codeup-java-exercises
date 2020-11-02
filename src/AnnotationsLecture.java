public class AnnotationsLecture {
/* ================== Annotations ==================
  Annotations are used to provide metadata for Java code. Annotations don't modify the execution of code;
  however, they can be consumed in order to perform additional logic.

  In its shortest form, looks like this:
    @Entity

  A Java annotation can also have elements for which you can set values.
    @Entity(table = "vehicles")

  An annotation can contain multiple elements.
    @Entity(tableName = "vehicles", primaryKey = "id")

  If an annotation contains a single element, it's convention to name it value.
    @TextTransformation(value = "uppercase")

  If an annotation contains a single element named value, you can omit its name.
    @TextTransformation("uppercase")


  ================== Placement ==================
    You can place Java annotations above:
      classes.
      interfaces.
      fields.
      local variables.


================== Built-In Annotations ==================
  Java annotations are classified in 2 main groups:
    Compile-time annotations.
      @Deprecated
      @Override
      @SuppressWarning
    Run-time annotations.


  @Deprecated
    - Used to indicate that a class, method, or field should no longer be used.
    - If used the compiler will give you a warning when the code is compiled.

  @Override (not necessary, but considered good practice)
    - Are intended to override a method in a superclass.
    - If the method does not match a method in the superclass, the compiler will give you an error

  @SuppressWarnings
    - Makes the compiler suppress warnings for a given method.
    -If you want to suppress more than one type of warning you can use the array initializer notation to specify the value for the annotation element:
    Predefined set of valid value:
      all to suppress all warnings
      unchecked to suppress warnings relative to unchecked operations
      deprecation to suppress warnings relative to deprecation

*/
}

