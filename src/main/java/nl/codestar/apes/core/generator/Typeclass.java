package nl.codestar.apes.core.generator;

import static nl.codestar.apes.core.generator.Constants.BASE_PATH;

public class Typeclass {
  public static Path TYPECLASS_PATH = BASE_PATH.with("typeclass");
  public static Path FUNCTOR_PATH = TYPECLASS_PATH.with("Functor");
  public static Path CONTRAVARIANT_PATH = TYPECLASS_PATH.with("Contravariant");
  public static Path INVARIANT_PATH = TYPECLASS_PATH.with("Invariant");
}
