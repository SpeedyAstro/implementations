import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class InfiniteApplet extends Applet implements Runnable{

    Thread t;
    boolean b=true;
    int x=100, y=100;

    public void start()
    {
        setSize(800,600);
        setBackground(Color.yellow);
        
        t=new Thread(this);
        t.start();
    }

    public void paint(Graphics g)
    {
        g.fillOval(x, y, 50, 50);
    }

    @Override
    public void run() {
        while(b){
            try{
                Thread.sleep(1000);
                x++;
                y++;
            }catch(Exception e){
                e.printStackTrace();
            }
        }
        
    }

    
}
