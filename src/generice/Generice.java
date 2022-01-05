
package generice;

class Gen<T>
{
    T obj;
    Gen(T obj)
    {
        this.obj=obj;
    }
    
   T getObj()
    {
        return this.obj;
    }
    
    void showType()
    {
        System.out.println(obj.getClass().getName());
    }

}







public class Generice {

    
    public static void main(String[] args) {
        
        Gen<Integer>iobj = new Gen <Integer>(44);//autoboxing
        
        iobj.showType();
        int n =iobj.getObj();//unboxing
        System.out.println(n);
        
        Gen<String>sobj=new Gen<String>("OK");
        sobj.showType();
        String s = sobj.getObj();
        System.out.println(s);
        
        //iobj=sobj;
        
    }
    
}
