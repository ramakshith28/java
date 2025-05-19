package Assignment;

interface Labelable {
    void label();
}

class Book implements Labelable {
    String title;

    Book(String title) {
        this.title = title;
    }

    public void label() {
        System.out.println("This is a book titled: " + title);
    }
}

class StudyBook extends Book {
    String subject;

    StudyBook(String title, String subject) {
        super(title);
        this.subject = subject;
    }

    public void label() {
        System.out.println("This is a study book titled: " + title + ", subject: " + subject);
    }
}

class PremiumStudyBook extends StudyBook {

    PremiumStudyBook(String title, String subject) {
        super(title, subject);
    }

    public void label() {
        System.out.println("This is a premium study book titled: " + title + ", subject: " + subject);
    }
}

public class Library {
	
    public static void main(String[] args) {
        Book b = new Book("Story Book");
        b.label();

        StudyBook s = new StudyBook("Math Guide", "Mathematics");
        s.label();

        PremiumStudyBook p = new PremiumStudyBook("Physics Pro", "Physics");
        p.label();
    }
}
