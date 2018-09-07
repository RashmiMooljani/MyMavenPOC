package utlities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Utilities {
	
	 public void getProperty() throws IOException
     {
     Properties prp=new Properties();
     String propFilePath = "src/test/resources/Configuration/config.properties";
     String[] tmpArray = propFilePath.split("/");
     String propFileName=tmpArray[tmpArray.length - 1];
     ClassLoader loader = Thread.currentThread().getContextClassLoader();
     InputStream inputStream = loader.getResourceAsStream(propFileName);

                if (inputStream != null)
                    {
                        prp.load(inputStream);
                    } 
     }

}
