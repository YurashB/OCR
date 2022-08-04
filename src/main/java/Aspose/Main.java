package Aspose;
import com.aspose.ocr.*;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String imagePath = "src/main/resources/images/img.png";

        AsposeOCR asposeOCR = new AsposeOCR();

        String result = null;
        try {
            result = asposeOCR.RecognizePage(imagePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);

    }
}
