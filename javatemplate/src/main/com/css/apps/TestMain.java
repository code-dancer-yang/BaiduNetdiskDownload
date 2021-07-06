package main.com.css.apps;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class TestMain {
    public static void main(String[] args) {
        ArrayList<String> lst = new ArrayList<>();
        lst.forEach(e -> System.out.println(e));
        Outer.Inner inner = new Outer().new Inner();
//        inner.showOuterProperties();
//        inner.showInnerProperties();
//        ((MyNoNameInner) () -> System.out.println(inner.getCommonProperty())).show();
        show(()->{
            System.out.println("hahhahah");
        });
    }


    public static void show(MyNoNameInner inner){
        inner.show();
    }
}
