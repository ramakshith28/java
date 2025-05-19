package Assignment;

interface StringInstrument {
    void playChord();
    void playNote();
}

class Guitarist implements StringInstrument {
    public void playChord() {
        System.out.println("Alex strums a beautiful chord.");
    }
    public void playNote() {
        System.out.println("Alex plays a soft note.");
    }
    public void solo() {
        System.out.println("Alex performs an amazing guitar solo!");
    }
}

interface WindInstrument {
    void blowHighNote();
    void blowLowNote();
}

class Flautist implements WindInstrument {
    public void blowHighNote() {
        System.out.println("Maria plays a clear high note.");
    }
    public void blowLowNote() {
        System.out.println("Maria blows a deep low note.");
    }
}

interface PercussionInstrument {
    void hitDrum();
    void playCymbal();
}

class Drummer implements PercussionInstrument {
    public void hitDrum() {
        System.out.println("John hits the drum with perfect rhythm.");
    }
    public void playCymbal() {
        System.out.println("John crashes the cymbal loudly.");
    }
}

public class MusicConcert {
    public static void main(String[] args) {
        Guitarist guitarist = new Guitarist();
        Flautist flautist = new Flautist();
        Drummer drummer = new Drummer();

        guitarist.playChord();
        guitarist.playNote();
        guitarist.solo();

        flautist.blowHighNote();
        flautist.blowLowNote();

        drummer.hitDrum();
        drummer.playCymbal();
    }
}

