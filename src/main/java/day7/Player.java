package day7;

public class Player {
    private int stamina;
    public static final int MAX_STAMINA = 100;
    public static final int MIN_STAMINA = 0;
    public static int countPlayers = 0;

    public Player (int stamina){
        this.stamina = stamina;
        countPlayers++;
    }

    public int getStamina() {
        return stamina;
    }

    public static int getCountPlayers() {
        return countPlayers;
    }
    void run(){
        stamina--;
        if(stamina == MIN_STAMINA){countPlayers--;}
        System.out.println("Стамина игрока равна " + stamina);
        }
    void info(){
        if(countPlayers >= 0 && countPlayers < 6) {
            System.out.println("Команды неполные. На поле еще есть " + (6 - countPlayers) + " свободных мест");
        }else {
            System.out.println("На поле свободных мест нет");
        }
    }
}
