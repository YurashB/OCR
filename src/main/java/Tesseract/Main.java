package Tesseract;

public class Main {

    public static void main(String[] args) {
        String imgPath = "src/main/resources/images/img.png";

        TextRecognizer textRecognizer = new TextRecognizer();
        String textFromImg = textRecognizer.getTextFromImg(imgPath);

        System.out.println(textFromImg);
    }
}
