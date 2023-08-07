package GuviTask10;


class Tea1 {
    protected boolean isPrepared;
    protected boolean hasMilk;
    protected boolean hasSugar;

    public Tea1() {
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

class BlackTea extends Tea1 {
    @Override
    public void prepareTea() {
        System.out.println("Preparing black tea with hot water and black tea leaves.");
        isPrepared = true;
    }
}

class GreenTea extends Tea1 {
    @Override
    public void prepareTea() {
        System.out.println("Preparing green tea with hot water and green tea leaves.");
        isPrepared = true;
    }
}

class HerbalTea extends Tea1 {
    @Override
    public void prepareTea() {
        System.out.println("Preparing herbal tea with hot water and herbal ingredients.");
        isPrepared = true;
    }
}

public class teaone {

    public static void main(String[] args) {
        BlackTea blackTea = new BlackTea();
        blackTea.prepareTea();
        blackTea.addMilk();
        blackTea.addSugar();
        blackTea.serveTea();

        GreenTea greenTea = new GreenTea();
        greenTea.prepareTea();
        greenTea.addSugar();
        greenTea.serveTea();

        HerbalTea herbalTea = new HerbalTea();
        herbalTea.prepareTea();
        herbalTea.serveTea();
    }
}