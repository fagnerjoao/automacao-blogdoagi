package support;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.Driver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Utils extends Driver {

    public static void waitElementBePresent(By elemnt, int tempo){
        WebDriverWait wait = new WebDriverWait(getDriver(), tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemnt));
    }


    public static String getRandomEmail(){
        String email_init = "fulano_";
        String email_final = "@teste.com.br";

        Random random = new Random();
        int minimo = 0;
        int maximo = 9999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_init + resultado + email_final;
    }

    public static void takesScreenShot(){

        SimpleDateFormat formatoDataHora = new SimpleDateFormat("yyyyMMdd_HHmmss");

        TakesScreenshot capturarTela = (TakesScreenshot) getDriver();
        File screenshot = capturarTela.getScreenshotAs(OutputType.FILE);
        String nomeArquivo = "screenshot_" + formatoDataHora.format(new Date()) + ".png";
        File destino = new File("target/reports/screenshots/" + nomeArquivo);
        try {
            FileUtils.copyFile(screenshot, destino);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
