package main.com.css.apps;

public class Outer {

    private String commonProperty ="commonProperty_outer";
    private String primaryProperty_outer ="primaryProperty_outer";


    //inner class
    public  class  Inner{

        private String commonProperty="commonProperty_inner";
        private String primaryProperty_inner="primaryProperty_inner";



        public void showOuterProperties(){
            System.out.println(commonProperty);
            System.out.println(primaryProperty_outer);//直接访问外部类的属性
        }

        public void showInnerProperties(){
            System.out.println(Inner.this.primaryProperty_inner);
            System.out.println(Inner.this.commonProperty);
        }


        //getters and setters
        public String getCommonProperty() {
            return commonProperty;
        }

        public void setCommonProperty(String commonProperty) {
            this.commonProperty = commonProperty;
        }

        public String getPrimaryProperty_inner() {
            return primaryProperty_inner;
        }

        public void setPrimaryProperty_inner(String primaryProperty_inner) {
            this.primaryProperty_inner = primaryProperty_inner;
        }
    }

    public String getCommonProperty() {
        return commonProperty;
    }

    public void setCommonProperty(String commonProperty) {
        this.commonProperty = commonProperty;
    }

    public String getPrimaryProperty_outer() {
        return primaryProperty_outer;
    }

    public void setPrimaryProperty_outer(String primaryProperty_outer) {
        this.primaryProperty_outer = primaryProperty_outer;
    }
}
