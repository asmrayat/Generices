
package generice;

class TwoGen<T,V>
{
    T obj1;
    V obj2;
    
    TwoGen(T obj1,V obj2){
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    
    T getObj1()
    {
        return obj1;
    }
    V getObj2()
    {
        return obj2;
    }
    
    //void set1( obj)
    
}
        
        
public class twoGenDemo {
    public static void main(String[] args) {
        
        TwoGen<Integer,String> tobj = new TwoGen<Integer,String>(44,"Ok");
        
        int v = tobj.getObj1();
        String s= tobj.getObj2();
        
        System.out.println(s+" "+v);
        
    }
    
}
