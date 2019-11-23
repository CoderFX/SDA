package lt.sdacademy.fundamentalscoding.practicalexercisses.triangles;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TrianglesMain {
    public static final String INPUT_FILE_LOCATION ="C:/Users/Ina/IdeaProjects/Pradinis/src/main/java/lt/sdacademy/fundamentalscoding/practicalexercisses/triangles/trianglesData.txt";
    public static final String OUTPUT_FILE_LOCATION ="C:/Users/Ina/IdeaProjects/Pradinis/src/main/java/lt/sdacademy/fundamentalscoding/practicalexercisses/triangles/trianglesResult.txt";

    public static void main(String[] args){
        List<Triangle> triangles = getTrianglesFromFile();
        calculateTrianglesPerimeters(triangles);
        writeDataToFile(triangles);
    }

    public static List<Triangle> getTrianglesFromFile(){
        List<Triangle> triangles = new ArrayList<Triangle>();
        try(BufferedReader br = new BufferedReader(new FileReader(INPUT_FILE_LOCATION))){
            String line = br.readLine();
            while (line != null){
                triangles.add(mapInfoToTriangle(line));
                line = br.readLine();
            }
        }catch (FileNotFoundException e){
            System.out.println("Skaitymo Failas nerastas");
        }catch (IOException e){
            System.out.println("Kazkas nuskaitant failą negerai");
        }
        return triangles;
    }

    public static Triangle mapInfoToTriangle(String line){
        String[] lineArray = line.split(",");
        return new Triangle(
                Integer.parseInt(lineArray[0]),
                Integer.parseInt(lineArray[1]),
                Integer.parseInt(lineArray[2]),
                TriangleType.valueOf(lineArray[3])
                );
    }

    public static void calculateTrianglesPerimeters(List<Triangle> triangles){
        for(Triangle t:triangles){
            int sum = t.getA()+t.getB()+t.getC();
            t.setPerimeter(sum);
        }
    }

    public static void writeDataToFile(List<Triangle> triangles){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(OUTPUT_FILE_LOCATION))){
            for(Triangle t : triangles) {
                bw.write(t.getTriangleType().getTriangleDescription() + " perimetras: " + t.getPerimeter()+"\r\n");
            }

        }catch (FileNotFoundException e){
            System.out.println("Neranda failo įrašymui");
        }catch (IOException e){
            System.out.println("Kažkas su failo įrašymu negerai");
        }
    }
}
