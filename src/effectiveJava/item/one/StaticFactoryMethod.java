package effectiveJava.item.one;

/**
 * 静态工厂方法 </br>
 * 1.命名优势，区别于其他构造器方法 </br>
 * 2.无需多次创建对象 (单例模式)</br>
 * 3.返回当前类的子类的实例化对象 </br>
 * 4.根据参数不同返回对象不同 </br>
 * 5.
 * @author huanghao
 *
 */
public class StaticFactoryMethod {
    private StaticFactoryMethod instance;

    public StaticFactoryMethod getInstance() {
        if (instance == null) {
            return new StaticFactoryMethod();
        } else {
            return instance;
        }
    }
}
