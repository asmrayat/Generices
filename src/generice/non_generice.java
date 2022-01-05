
package generice;

class NonGen
{
    Object obj;
    
    NonGen(Object obj)
    {
        this.obj =obj;
    }
    
    Object getObj()
    {
        return this.obj;
    }
    void showType()
    {
        System.out.println(obj.getClass().getName());
    }
}

public class non_generice {
    
    public static void main(String[] args) {
        
        NonGen iobj = new NonGen(44);
        NonGen sobj = new NonGen("ok");
        
        iobj.showType();
        sobj.showType();
        int v = (Integer)iobj.getObj();
        System.out.println(v);
        
        iobj =sobj;
       // int w = (Integer)iobj.getObj();
        
        iobj.showType();
    }
    
}
