package lt.sdacademy.fundamentals.enumerators;

public enum EnumClassExample1 {
    AUDI(2,"audi", true),
    VW(2, "volkswagen", false),
    TOYOTA(1, "oyota", true),
    BMV(3, "beemer", false);

    private final int engineSize;
    private final String carName;
    private final boolean runAndDrive;


    EnumClassExample1(int engineSize, String carName, boolean runAndDrive) {
        this.engineSize = engineSize;
        this.carName = carName;
        this.runAndDrive = runAndDrive;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public boolean isRunAndDrive() {
        return runAndDrive;
    }

    public String getCarName() {
        return carName;
    }
}
