package Assignment;

interface GameTypes {
    void gameCategory();
}

interface Skills {
    void skillType();
}

interface Team extends GameTypes, Skills {
    void teamInfo();
}

class City {
    void cityName() {
        System.out.println("Based in New York City");
    }
}

class SportsTeam extends City implements Team {
    public void gameCategory() {
        System.out.println("This team plays multiple sports");
    }
    public void skillType() {
        System.out.println("Known for excellent teamwork and strategy");
    }
    public void teamInfo() {
        System.out.println("The team consists of diverse players");
    }
    public void championship() {
        System.out.println("Won the national championship 3 times");
    }
}

public class demo46 {
    public static void main(String[] args) {
        SportsTeam team = new SportsTeam();
        team.gameCategory();
        team.skillType();
        team.teamInfo();
        team.cityName();
        team.championship();
    }
}
