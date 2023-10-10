public class Runner {

    public static void main(String[] args) {
        rectangleDemo();
        computerDemo();
        shoppingTrolleyDemo();
    }

    //    PART 1:
    public static void rectangleDemo() {
        System.out.println("----------");
        System.out.println("Running rectangle tasks...");


        // 1. Create a new rectangle object:
        System.out.println("Q1:");
        Rectangle rectangle = new Rectangle(7, 5);
        System.out.println("Length: " + rectangle.getLength() + " Height: " + rectangle.getHeight());


        // 1.5 Change Height using a setter:
        System.out.println("Q1.5:");
        rectangle.setHeight(7);

        System.out.println(rectangle.getHeight());

        // 2. Calculate the rectangle's area and store it in a variable:
        System.out.println("Q2:");
        int area = rectangle.getArea();
        System.out.println("The rectangle has an area of " + area);


        // 3. Check if your rectangle is actually a square:
        System.out.println("Q3:");
        boolean isRectangle = rectangle.isRectangle();
        System.out.println("Object is a square (true/false): " + isRectangle);
    }

    //    PART 2:
    public static void computerDemo() {
        System.out.println("----------");
        System.out.println("Running computer tasks...");


        // 1. Create a new computer object:
        System.out.println("Q1:");
        Computer computer = new Computer(1, "HP");
        System.out.println("Q1 is: Computer computer = new Computer(1, \"HP\"); ");

        // 2. Use a getter to find out how much storage the computer has:
        System.out.println("Q2:");
        int currentStorage = computer.getCurrentStorage();
        System.out.println("Computer has " + currentStorage + "GB storage");


        // 3. Add more storage to the computer:
        System.out.println("Q3:");
        computer.updateStorage(50);
        // Use a getter to check that the amount of storage has been updated:
        int newStorage = computer.getCurrentStorage();
        System.out.println("Computer now has " + newStorage + "GB storage");


        // 4. Use a setter to update the computer's printer property
        System.out.println("Q4:");

//        // Write a getter and use it below to check that the setter worked:

        String currentPrinter = "Canon";
        computer.setPrinter(currentPrinter);
        System.out.println("Computer currently has an " + computer.getPrinter() + " printer connected.");


        //    PART 2b:

        // 5. Write a method to print a message.
        System.out.println("Q5:");
        System.out.println(computer.printMsg());
        // To test this works *without* a printer (.getPrinter) comment out the code for question 4
    }

    //    PART 3:
    public static void shoppingTrolleyDemo() {
        System.out.println("----------");
        System.out.println("Running shopping trolley tasks...");


        // 1. Create a new shopping trolley
        System.out.println("Q1:");
        ShoppingTrolley trolley = new ShoppingTrolley();
        System.out.println("Q1 is: ShoppingTrolley trolley = new ShoppingTrolley();");

        // 2. Add an item to the trolley
        System.out.println("Q2:");
        trolley.addToTrolley("Eggs");
        trolley.addToTrolley("Milk");
        trolley.addToTrolley("Apples");
        trolley.addToTrolley("Toilet paper");
        trolley.addToTrolley("Butter");
        trolley.addToTrolley("Bread");


        for (String item : trolley.getGroceries()) {
            System.out.println(item);
        }

        // 3. Count items in the trolley
        System.out.println("Q3:");
        int itemCount = trolley.groceryCount();
        System.out.println("The trolley contains " + itemCount + " items.");


        // 4. Check if an item is in the trolley
        System.out.println("Q4:");
        boolean itemInTrolley = trolley.isInTrolly("Eggs");
        System.out.println("Object is in Trolley (true/false): " + itemInTrolley);

        
        itemInTrolley = trolley.isInTrolly("Cakes");
        System.out.println("Object is in Trolley (true/false): " + itemInTrolley);
    }


}
