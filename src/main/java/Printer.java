public class Printer {

    private int numberOfSheets;
    private int tonerVolume;

    public Printer(int numberOfSheets) {
        this.numberOfSheets = numberOfSheets;

    }

    public int getNumberofSheets(){
        return numberOfSheets;
    }

   public void print(int pages, int copies){
        if (pages * copies<= this.numberOfSheets){this.numberOfSheets -=(pages*copies);
        }
   }
}
