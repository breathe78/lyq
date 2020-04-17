package Generic.mm;

/**
 * Created by lyq on 2019/10/29.
 */
public class Father{
    private String fatherName;
    private String sonName;

    public String getSonName() {
        return sonName;
    }

    public void setSonName(String sonName) {
        this.sonName = sonName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    @Override
    public String toString() {
        return "Father{" +
                "fatherName='" + fatherName + '\'' +
                '}';
    }
}
