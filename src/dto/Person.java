package dto;

public class Person implements MedicalWorker{
    private final String name;
    private final int maxWeight;
    public Person(String personInfo){
        String[] data = personInfo.split(" ");
        name = data[0];
        maxWeight = Integer.parseInt(data[1]);
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }
}
