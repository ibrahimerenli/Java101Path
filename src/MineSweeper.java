import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int rowNumber;
    int colNumber;
    int mineNumber;
    String [][] fieldVisible;
    String [][] fieldHidden;

    MineSweeper( int rowNumber, int colNumber){
        this.rowNumber=rowNumber;
        this.colNumber=colNumber;
        this.fieldVisible = new String [rowNumber][colNumber];
        this.fieldHidden = new String [rowNumber][colNumber];
        this.mineNumber = (rowNumber * colNumber) / 4;
    }
 
    public void setFields(){
        Random rnd = new Random();
        int randRow;
        int randCol;
        for (int i =0; i<mineNumber; i++){
            randRow = rnd.nextInt(rowNumber);
            randCol = rnd.nextInt(colNumber);
            if (fieldHidden[randRow][randCol] != "*"){
                fieldHidden[randRow][randCol] ="*";
            }else{
                i--;
            }
        }
        for (int i=0; i<rowNumber; i++){
            for (int j=0; j<colNumber; j++){
                fieldVisible[i][j] = "-";
                if(fieldHidden[i][j] != "*"){
                    fieldHidden[i][j] = "-";
                }
            }
        }
    }

    void getVisibleField(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                System.out.print(fieldVisible[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");
    }
    
    void getHiddenField(){
        for(int i = 0; i < rowNumber; i++){
            for(int j = 0; j < colNumber; j++){
                System.out.print(fieldHidden[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("===============================");
    }

    void run(){
        Scanner input = new Scanner(System.in);
        int row, col, totalMove = rowNumber * colNumber- mineNumber;
        setFields();
        System.out.println("==================>OYUNA HOŞGELDİN<==================");
        while (totalMove>0){
            System.out.print("Satır Giriniz : ");
            row=input.nextInt();
            System.out.print("Sütun Giriniz : ");
            col=input.nextInt();

            if((row<0 || row>=rowNumber) || (col<0 || col>=colNumber)){
                System.out.println("==================>Hatalı Hamle<==================");
                continue;
            }
            if(fieldHidden[row][col] == "*"){
                System.out.println("==================>Game Over!!<==================");
                getHiddenField();
                break;
            }else{
                if(fieldVisible[row][col] != "-"){
                    System.out.println("==================>Bu Hamleyi Yaptın<==================");
                }else {
                    int counter = 0;
                    if(fieldHidden[row][col] != "*"){
                        if(row!=0){
                            if(fieldHidden[row-1][col] == "*") counter++;
                                if(col!=0)
                                    if(fieldHidden[row-1][col-1] == "*") counter++;
                                
                        }
                        if(row!=rowNumber-1){
                            if(fieldHidden[row+1][col] == "*") counter++;
                                if(col!=colNumber-1)
                                    if(fieldHidden[row+1][col+1] == "*") counter++;
                            
                        }
                        if(col!=0){
                            if(fieldHidden[row][col-1] == "*") counter++;
                                if(row!=rowNumber-1)
                                    if(fieldHidden[row+1][col-1] == "*") counter++;
                                    
                        }
                        if(col!=colNumber-1){
                            if(fieldHidden[row][col+1] == "*") counter++;
                                if(row!=0)
                                    if(fieldHidden[row-1][col+1] == "*") counter++;
                                    
                        }
            
                        fieldVisible[row][col] = Integer.toString(counter);
                    }
                }
            }
            totalMove--;
            getVisibleField();
        }
        if (totalMove==0){
            System.out.println("==================>OYUNU KAZANDIN<==================");
        }
        input.close();
    }

    public static void main(String[] args) {
        int row, col;
        try(var input = new Scanner(System.in)){
            System.out.println("Satır sayısını girin: ");
            row = input.nextInt();
            System.out.println("Sütun sayısını girin: ");
            col = input.nextInt();
            MineSweeper mine = new MineSweeper(row, col);
            mine.run();
        }
    }

}