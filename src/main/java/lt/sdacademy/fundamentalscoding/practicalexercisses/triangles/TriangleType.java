package lt.sdacademy.fundamentalscoding.practicalexercisses.triangles;

public enum TriangleType{
    EQUILATERAL("Lygiakraštis"),
    EQUAL_SIDE("Lygiašonis"),
    OBTUSE("Bukas");

private String triangleDescription;

    TriangleType(String triangleDescription){
        this.triangleDescription = triangleDescription;
    }


    public String getTriangleDescription() {
        return triangleDescription;
    }
}
