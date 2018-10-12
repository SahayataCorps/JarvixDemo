
package widgetlauncher;

import Mp3Widget.MP3PlayerGUI;
import WeatherWidget.WeatherWidget;




public class Main {
     public void runGoogleSearch() {
        new Thread(){
            public void run()
            {
         GoogleSearch GIF = new GoogleSearch(new javax.swing.JFrame(),false);
         
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
   public void runSaveLinks() {
        new Thread(){
            public void run()
            {
         SavingLink GIF = new SavingLink(new javax.swing.JFrame(),false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
    public void runWidgetGUI() {
        new Thread(){
            public void run()
            {
         WidgetGUI1 GIF = new WidgetGUI1(new javax.swing.JFrame(),false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
      public void runClock() {
        new Thread(){
            public void run()
            {
       ClockWidget GIF = new ClockWidget(new javax.swing.JFrame(), false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
        public void runLoadLink() {
        new Thread(){
            public void run()
            {
       LoadingLink GIF = new LoadingLink(new javax.swing.JFrame(), false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
        public void runMP3Player() {
        new Thread(){
            public void run()
            {
       MP3PlayerGUI GIF = new MP3PlayerGUI(new javax.swing.JFrame(), false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
         public void runWeather() {
        new Thread(){
            public void run()
            {
       WeatherWidget GIF = new WeatherWidget(new javax.swing.JFrame(), false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
         public void runQuickPannel() {
        new Thread(){
            public void run()
            {
       QuickAccessPanel GIF = new QuickAccessPanel(new javax.swing.JFrame(), false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
         public void runSettings() {
        new Thread(){
            public void run()
            {
       Settings GIF = new Settings(new javax.swing.JFrame(), false);
              GIF.show();
              GIF.notifyAll();
              
                }}.start();
       }
         
}
