package Tesseract;

import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class TextRecognizer {

    private final Tesseract tesseract = new Tesseract();

    public String getTextFromImg(String imgPath) {
        File image = new File(imgPath);
        tesseract.setDatapath("src/main/resources/tessdata");
        tesseract.setLanguage("eng");
        tesseract.setPageSegMode(1);
        tesseract.setOcrEngineMode(1);
        try {
            String result = tesseract.doOCR(image);
            return result;
        } catch (TesseractException e) {
            e.printStackTrace();
        }
        return null; // It is very bad practise. Change it
    }
}
