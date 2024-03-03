public class AdapterClient {
    public static void main(String[] args) {
        HeightInCm heightInCmClass = new HeightInCmImplClassAdapter();
        HeightInCm heightInCmObject = new HeightInCmImplObjectAdapter();

        System.out.println(heightInCmClass.getHeightInCm());
        System.out.println(heightInCmObject.getHeightInCm());
    }
}
