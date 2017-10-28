package mohit;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;

public class ReadTextFromImage {

	public static void main(String[] args) {
		File imageFile=new File ("/Users/mohit/Downloads/ROHIT_AGARWAL_BIO.pdf");
		ITesseract instance = new Tesseract();
		instance.setDatapath("/Users/mohit/Documents/work/trainingworkspace/ReadTextFromPDFImage/tessdata");
		try {
			String text = instance.doOCR(imageFile);
			System.out.println(text);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
