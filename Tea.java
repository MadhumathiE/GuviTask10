package GuviTask10;


public class Tea {
    private boolean isPrepared;
    private boolean hasMilk;
    private boolean hasSugar;

    public Tea() {
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

    public static void main(String[] args) {
        Tea tea = new Tea();
        tea.prepareTea();
        tea.addMilk();
        tea.addSugar();
        tea.serveTea();
    }
}