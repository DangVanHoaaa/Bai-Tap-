package bai7;

public class ResizableCircle  extends Circle implements Resizable {
    public ResizableCircle(double radius){
        super(radius);
    }
    
    
    public void resize(int percent) {
        System.out.println(percent);
        
    }
    
    
    
    
    
    
}
