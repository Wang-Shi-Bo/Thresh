package controlStatement;

import java.util.Collection;

public class ReturnTypeBoolean {

/**
* 1.<E>：声明该方法使用了一个泛型类型参数 E。
*
* 2.不写 return 语句报错是因为，当Collection<E> c 中没有元素时，不会进入for循环，方法需要return 一个值。
*   那么为什么可以返回是null ，而不是false/true ，null也属于Boolean吗？
 *
 *   boolean 是基本类型，只能是false / true
 *   Boolean 是一个类（引用类型）可以返回null false true
 *   但是可能会导致 NullPonitException
 *
 *   Boolean result = contains(someCollection, someObject);
 *   if (result) { ... } // 如果 result 是 null，这里会抛出 NPE
*
* */
    public static <E> boolean contains (Collection<E> c, Object obj){
        for (E e : c){
            if(e.equals(obj)){
                return true;
            }else {
                return false;
            }
        }
        return false;

        // 如果返回类型是Boolean ,可以返回return null;
    }
}
