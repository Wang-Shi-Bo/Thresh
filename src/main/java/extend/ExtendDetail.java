package extend;

public class ExtendDetail {
    public static void main(String[] args) {


    //    new ChildClass().getFatherAge();// 匿名对象表达式（Anonymous Object Expression）
/**
    2. 适用场景
    仅需调用一次方法：当对象仅需执行一个方法且无需后续操作时，可以简化代码。
    测试或示例代码：如你的main方法中直接调用，快速验证功能。
    方法链（Method Chaining）：在需要连续调用多个方法时（需支持链式调用的设计）。

    3. 注意事项
    对象生命周期：匿名对象在方法调用结束后会被垃圾回收，无法再次访问。
    可读性：若方法调用复杂或需多次使用对象，建议先声明变量：

*/

        //-------

        //ChildClass childClass = new ChildClass();
        new ChildClass().makeMoney("100");




    }



}

