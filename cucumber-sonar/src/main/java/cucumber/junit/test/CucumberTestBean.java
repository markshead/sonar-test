package cucumber.junit.test;

public class CucumberTestBean<T> {

  private String name;

  private T value;

  /**
   * @return the name
   */
  public final String getName() {
    return this.name;
  }

  /**
   * @param name
   *          the name to set
   */
  public final void setName(String name) {
    this.name = name;
  }

  /**
   * @return the value
   */
  public final T getValue() {
    return this.value;
  }

  /**
   * @param value
   *          the value to set
   */
  public final void setValue(T value) {
    this.value = value;
  }

}
