package model;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
public class TestSTB {
public String loadFileXML() {
	System.out.println("in");
	InputStream stream = null;
	String msg = null;
	Resource resource = new DefaultResourceLoader().getResource("classpath:xml/smallSTB.xml");

	ClassLoader classLoader = new TestSTB().getClass().getClassLoader();
	 
    File file = new File(classLoader.getResource(resource.getFilename()).getFile());
     
    //Fichier trouvé
    System.out.println("Fichier Trouvé : " + file.exists());
     
    //Lecture du fichier
    String content = null;
	try {
		msg = new String(Files.readAllBytes(file.toPath()));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	

	
	return msg;
}
}