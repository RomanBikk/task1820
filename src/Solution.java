/*
Округление чисел
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String sourceFile = reader.readLine();
        String storageFile = reader.readLine();
        reader.close();
        FileInputStream fileReader = new FileInputStream(sourceFile);
        FileOutputStream fileWriter = new FileOutputStream(storageFile);
        byte[] buffer = new byte[fileReader.available()];
        while (fileReader.available() > 0) {
            fileReader.read(buffer);
        }
        fileReader.close();
        List<String> rawNumbers = new ArrayList<>(Arrays.asList(new String(buffer).split(" ")));
        StringBuilder srt = new StringBuilder();
        for (String rawNumber : rawNumbers) {
            srt.append((int)Math.round(Double.parseDouble(rawNumber))).append(" ");
        }
        byte[] wData = srt.toString().getBytes();
        fileWriter.write(wData);
        fileWriter.close();

    }
}
