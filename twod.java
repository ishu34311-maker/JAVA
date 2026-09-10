public class twod {
    public static void main(String[] args){
        //2d array = an array where each element is an array 
        // Useful fo storing a matrix of data 


        //String[] fruits = {"Apple", "Banana", "Kiwi" };
        //String[] vegetables = {"Potato", "Tomato", "Carrot"};
        //String[] meat = {"Pork", "Chicken", "Beef", "fish"};

        //intitialize 2d array by double square bracket [][]
        String[][] groceries = {{"Apple", "Banana", "Kiwi" },
                                {"Potato", "Tomato", "Carrot"},
                                {"Pork", "Chicken", "Beef"}  };

        // for editing in matrix by their index number 
        groceries[1][1] = "Bike";

        for(String[] category : groceries){
            for(String food : category){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    }
}
