
package widgetlauncher;


public class Mains {
     public void runWidgetGUI1()
    { new Thread()
    {public void run(){
    WidgetGUI1 GIF = new WidgetGUI1(new javax.swing.JFrame(), false);
               GIF.show();
               GIF.notifyAll();
             
    }}.start();}
}
