public class Tank {

    private int positionX;
    private int positionY;
    private int direction;
    private int fuel;

    private int n;
    static final String MODEL = "T34";
    static int nomOfTank;


    public Tank() {
        this.positionX = 0;
        this.positionY = 0;
        this.fuel = 100;
        this.n = ++nomOfTank;
    }

    public Tank(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fuel = 100;
        this.n = ++nomOfTank;
    }

    public Tank(int positionX, int positionY, int fuel) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.fuel = fuel;
        this.n = ++nomOfTank;

    }

    public void turnRight() {
        direction++;
        if (direction == 4) direction = 0;
    }

    public void turnLeft() {
        direction--;
        if(direction == -1) direction = 3;
    }
    public void goForward(int position1) {
        if (position1 < 0 && -position1 > fuel) position1 = -fuel;
        else if (position1 > fuel) position1 = fuel;
        if (direction == 0) positionX += position1;
        else if (direction == 1) positionY += position1;
        else if (direction == 2)  positionX -= position1;
        else positionY -= position1;
        fuel -= Math.abs(position1);
    }
    public void printPosition() {

        System.out.println("The Tank " + MODEL + "-" + n + " is at " + positionX + ", " + positionY + " now.");

    }

    public void goBackward(int position2) {

        goForward(-position2);

    }
}