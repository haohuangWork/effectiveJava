package effectiveJava.item.one;

/**
 * ��̬�������� </br>
 * 1.�������ƣ��������������������� </br>
 * 2.�����δ������� (����ģʽ)</br>
 * 3.���ص�ǰ��������ʵ�������� </br>
 * 4.���ݲ�����ͬ���ض���ͬ </br>
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
