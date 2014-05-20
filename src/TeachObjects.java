/**
 * Created by alexthomas on 5/20/14.
 */
public class TeachObjects {

    public static void main(String[] cookies){
        TestObject testObject = new TestObject();
        testObject.count=4;
        System.out.println(testObject.count);
        changeCount(testObject);
        System.out.println(testObject.count);
    }

    public static void changeCount(TestObject to){
            to.count=5;
    }
}
