package baseline.functions;

public class Verify {
    public Boolean DueDateRegex(String DueDate) {
        if (DueDate.matches("((19|2[0-9])[0-9]{2})-(0[1-9]|1[012])-(0[1-9]|[12][0-9]|3[01])") || DueDate.isEmpty()) {
           System.out.printf("test\n");
            return true;
        } else {
            return false;
        }
    }
    public boolean DescriptionLength(String Description){
        if (Description.length() > 0 && Description.length() < 257)
        {
            System.out.printf("haha xd\n");
            return  true;
        }
        else
        {
            return false;
        }

    }
}
