package singleton;

import java.io.Serializable;

public class BaseSingleton implements Serializable {
  private static final long serialVersionUID = 1L;

  private BaseSingleton() {
    if (BaseSingletonHolder.INSTANCE != null) {
      throw new IllegalStateException("Cannot create second instance of this class");
    }
  }

  private static class BaseSingletonHolder {
    public static final BaseSingleton INSTANCE = new BaseSingleton();
  }

  public static BaseSingleton getInstance() {
    return BaseSingletonHolder.INSTANCE;
  }

  protected Object readResolve() {
    return getInstance();
  }
}
