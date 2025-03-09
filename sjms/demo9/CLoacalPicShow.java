package sjms.demo9;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class CLoacalPicShow {
    private Object target;
    public CLoacalPicShow(Object object){
        super();
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), 
        target.getClass().getInterfaces(),new InvocationHandler(){
           
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // TODO Auto-generated method stub
                throw new UnsupportedOperationException("Unimplemented method 'invoke'");
            }
            return null;
    });
        return null;
    }
}
