public abstract class Animal {
    private final String name;
    private final int maxDistanceToRun;
    private final int maxDistanceToSwim;
    public static int counter = 0;

    public Animal(String name, int maxDistanceToRun, int maxDistancetoSwim) {
        this.name = name;
        this.maxDistanceToRun = maxDistanceToRun;
        this.maxDistanceToSwim = maxDistancetoSwim;
        counter++;
    }

    public void run(int distanceRun) {
        if (distanceRun > maxDistanceToRun) {
            System.out.println(name + "can't run this distance" + " " + distanceRun);
        } else if (distanceRun < 0) {
            System.out.println("Distance can't be negative");
        } else System.out.println(name + "run" + " " + distanceRun + "m");
    }

    public void swim(int distanceSwim) {
        if (distanceSwim > maxDistanceToSwim) {
            System.out.println(name + "can't swim this distance" + " " + distanceSwim);
        } else if (distanceSwim < 0) {
            System.out.println("Distance can't be negative");
        } else if (maxDistanceToSwim == 0) {
            System.out.println(name + " " + "can't swim");
        } else System.out.println(name + "swim" + " " + distanceSwim + "m");
    }

}

