package src.com.ls.annotation;

public class AnnotationDemoTest {

    private AnnotationDemo demo = new AnnotationDemo();

    @MyTest
    public void testAdd() {
        demo.save();
    }

    @MyTest
    public void testUpdate() {
        demo.update();
    }
}
