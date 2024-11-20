public class Register {
    // Attributes for a property (eiendom)
    private int municipalityNumber; 
    private String municipalityName;
    private int lotNumber; 
    private int sectionNumber;
    private String name; 
    private double area; 
    private String ownerName; 

    // Constructor
    public Register(int municipalityNumber, String municipalityName, int lotNumber, int sectionNumber, String name, double area, String ownerName) {
        this.municipalityNumber = municipalityNumber;
        this.municipalityName = municipalityName;
        this.lotNumber = lotNumber;
        this.sectionNumber = sectionNumber;
        this.name = name;
        this.area = area;
        this.ownerName = ownerName;
    }
}