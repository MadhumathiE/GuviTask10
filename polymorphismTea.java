package GuviTask10;


class Tea2 {
    protected boolean isPrepared;
    protected boolean hasMilk;
    protected boolean hasSugar;

    public Tea2() {
        isPrepared = false;
        hasMilk = false;
        hasSugar = false;
    }

    public void prepareTea() {
        System.out.println("Preparing basic tea with hot water and tea leaves.");
        isPrepared = true;
    }

    public void addMilk() {
        if (isPrepared) {
            System.out.println("Adding milk to the tea.");
            hasMilk = true;
        } else {
            System.out.println("Please prepare the tea first.");
        }
    }

    public void addSugar() {
        if (isPrepared) {
            System.out.println("Adding sugar to the tea.");
            hasSugar = true;
        } else {
            System.out.println("Please prepare the tea first.");
        }
    }

    public void serveTea() {
        if (isPrepared) {
            System.out.println("Serving the tea.");
        } else {
            System.out.println("Please prepare the tea first.");
        }
    }
}

class BlackTea1 extends Tea2 {
    @Override
    public void prepareTea() {
        System.out.println("Preparing black tea with hot water and black tea leaves.");
        isPrepared = true;
    }
}

class GreenTea1 extends Tea2 {
    @Override
    public void prepareTea() {
        System.out.println("Preparing green tea with hot water and green tea leaves.");
        isPrepared = true;
    }
}

class HerbalTea1 extends Tea2 {
    @Override
    public void prepareTea() {
        System.out.println("Preparing herbal tea with hot water and herbal ingredients.");
        isPrepared = true;
    }
}

public class polymorphismTea {


    public static void main(String[] args) {
        Tea2[] teas = new Tea2[3];
        teas[0] = new BlackTea1();
        teas[1] = new GreenTea1();
        teas[2] = new HerbalTea1();

        for (Tea2 tea : teas) {
            tea.prepareTea();
            tea.addSugar();
            tea.serveTea();
            System.out.println(); // Separate output for each tea
        }
    }
}