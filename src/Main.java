//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Домашняя работа 4");

        System.out.println("Задача 1");

        byte age = 17;

        if (age >= 18){
            System.out.println("Если возраст человека равен " + age + " , то он совершеннолетний");
        }

        if (age < 18){
            System.out.println("Если возраст человека равен " + age + " то, он не достиг совершеннолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");

        byte temperature = 4;

        if (temperature < 5){
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        }

        if (temperature > 5){
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        System.out.println("Задача 3");

        byte speed = 65;

        if (speed < 60){
            System.out.println("Если скорость " + speed + " , то можно ездить спокойно");
        }

        if (speed >= 60){
            System.out.println("Если скорость " + speed + " , то придется заплатить штраф");
        }

        System.out.println("Задача 4");
        byte ageWork = 20;

        if (ageWork >= 2 && ageWork <= 6) {
            System.out.println("Если возраст человека равен " + ageWork + ",  то ему нужно ходить в детский сад");
        }

        if (ageWork >= 7 && ageWork <= 17) {
            System.out.println("Если возраст человека равен " + ageWork + ",  то ему нужно ходить в школу");
        }

        if (ageWork >= 18 && ageWork <= 24) {
            System.out.println("Если возраст человека равен " + ageWork + ",  то его место в университете");            }

        if (ageWork > 24) {
            System.out.println("Если возраст человека равен " + ageWork + ",  то ему пора ходить на работу");
        }

        System.out.println("Задача 5");

        byte ageAttraction = 15;

        if (ageAttraction < 5) {
            System.out.println("Если возраст ребенка равен " + ageAttraction + ", то ему нельзя кататься на аттракционе");
        }

        if (ageAttraction > 5 && ageAttraction <= 14) {
            System.out.println("Если возраст ребенка равен " + ageAttraction + ", то ему можно кататься на аттракционе в сопровождении");
        }

        if (ageAttraction > 14) {
            System.out.println("Если возраст ребенка равен " + ageAttraction + ", то он может кататься без сопровождения взрослого");
        }

        System.out.println("Задача 6");

        byte standingFullness = 35;
        byte sittingFullness = 58;
        byte vagonСapacity = 102;
        byte sittingPositions = 60;
        int standingPositions = vagonСapacity - sittingPositions;

        if (standingFullness < standingPositions || sittingFullness < sittingPositions) {

            if (sittingFullness < sittingPositions && standingFullness < standingPositions) {
                System.out.println("В вагоне осталось " + (sittingPositions - sittingFullness) + " сидячих и " + (standingPositions - standingFullness) + " стоячих мест");
            }

            if (sittingFullness < sittingPositions && standingFullness == standingPositions) {
                System.out.println("В вагоне осталось " + (sittingPositions - sittingFullness) + " сидячих мест, все  стоячие места заняты");
            }

            if (sittingFullness == sittingPositions && standingFullness <standingPositions) {
                System.out.println("В вагоне осталось " + (standingPositions - standingFullness) + " стоячих мест, все сидячие места заняты");
            }
        }else {
            System.out.println("Свободных мест нет, вагон заполнен");
        }

        System.out.println("Задача 7");

        int one = 119;
        int two = 200;
        int three = 30;

        if (one > two && one > three) {
            System.out.println(one + " больше чем " + two + " и больше чем " + three);
        } else{
            if (two > one && two > three){
                System.out.println(two + " больше чем " + one + " и больше чем " + three);
            }else{
                System.out.println(three + " больше чем " + one + " и больше чем " + two);
            }

        }


    }
}