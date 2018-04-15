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

                String[] newArr = insideData.split("[,.!:? ]");

                for (String stream : newArr) {
                    stream = stream.toLowerCase();
                    Integer count = map.get(stream);
                    if (count == null) {
                        map.put(stream, 1);
                    } else {
                        count++;
                        map.put(stream, count);
                    }
                }
                insideData = numberReader.readLine();

            }
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }


        } catch (FileNotFoundException e) {
            System.err.println("No file like this");
        } catch (IOException e) {
            System.out.println("File access is restricted");
        }
    }
}