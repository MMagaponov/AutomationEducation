package homeWork8;

import java.io.*;
import java.util.Map;
import java.util.TreeMap;

public class MyCustomFileReader {
    public static void main(String[] args) {

        try {
            File file = new File("/Users/maxymagaponov/IdeaProjects/projects/AutomationEducation/src/main/java/homeWork8/Test");
            Reader reader = new FileReader(file);
            LineNumberReader numberReader = new LineNumberReader(reader);
            String insideData = numberReader.readLine();
            Map<String, Integer> map = new TreeMap<String, Integer>();
            while (insideData != null) {

                String[] arr = insideData.split("[,.!:? ]");

                for (String ss : arr) {
                    ss = ss.toLowerCase();
                    Integer counter = map.get(ss);
                    if (counter == null) {
                        map.put(ss, 1);
                    } else {
                        counter++;
                        map.put(ss, counter);
                    }
                }
                insideData = numberReader.readLine();

            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }


        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден!!!");
        } catch (IOException e) {
            System.out.println("Доступ к файлу запрещен!!!");
        }
    }
}