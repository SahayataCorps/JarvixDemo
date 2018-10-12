
package WeatherWidget;

import com.teknikindustries.yahooweather.WeatherDisplay;
import com.teknikindustries.yahooweather.WeatherDoc;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class setIcon {
String cityid;
  public  setIcon(String woeid)
{
    cityid = woeid;
    
}public String icIm = "";
    
    
   
    public void Icon(JLabel imageLB)
    {  try{
         WeatherDoc docc = new WeatherDoc(cityid,"c"); 
    WeatherDisplay display = new WeatherDisplay();
    String con = display.getCondition().toLowerCase();
        
    
    switch(con)
    {case "tornado": icIm = "0";
        break;
     case "tropical storm": icIm = "1";
        break;
      case "hurricane": icIm = "2";
        break;
      case "severe thunderstorms": icIm = "3";
        break;
      case "thunderstorms": icIm = "4";
        break;
      case "mixed rain and snow": icIm = "5";
        break;
      case "mixed rain and sleet": icIm = "6";
        break;
      case "mixed snow and sleet": icIm = "7";
        break;
      case "freezing drizzle": icIm = "8";
        break;
      case "drizzle": icIm = "9";
        break;
      case "freezing rain": icIm = "10";
        break;
      case "showers": icIm = "11";
        break;
      case "snow flurries": icIm = "13";
        break;
      case "light snow showers": icIm = "14";
        break;
      case "blowing snow": icIm = "15";
        break;
      case "snow": icIm = "16";
        break;
      case "hail": icIm = "17";
        break;
      case "sleet": icIm = "18";
        break;
      case "dust": icIm = "19";
        break;
      case "foggy": icIm = "20";
        break;
      case "haze": icIm = "21";
        break;
      case "smoke": icIm = "22";
        break;
      case "blustery": icIm = "23";
        break;
      case "windy": icIm = "24";
        break;
      case "cold": icIm = "25";
        break;
      case "cloudy": icIm = "26";
        break;
      case "mostly cloudy (night)": icIm = "27";
        break;
      case "mostly cloudy (day)": icIm = "28";
        break;
      case "partly cloudy (night)": icIm = "29";
        break;
      case "partly cloudy (day)": icIm = "30";
        break;
      case "clear (night)": icIm = "31";
        break;
      case "sunny": icIm = "32";
        break;
      case "fair (night)": icIm = "33";
        break;
      case "fair (day)": icIm = "34";
        break;
      case "mixed rain and hail": icIm = "35";
        break;
      case "hot": icIm = "36";
        break;
      case "isolated thunderstorms": icIm = "37";
        break;
      case "scattered thunderstorms": icIm = "38";
        break;
      case "scattered showers": icIm = "40";
        break;
          case "heavy snow": icIm = "41";
        break;
          case "scattered snow showers": icIm = "42";
        break;
          case "partly cloudy": icIm = "44";
        break;
          case "thundershowers": icIm = "45";
        break;
          case "snow showers": icIm = "46";
        break;
          case "isolated thundershowers": icIm = "47";
        break;
          default: icIm="na";
          
              
       }
    
    
    }
    catch(Exception e)
    {JOptionPane.showMessageDialog(null, e);
    
    
    }}
}
