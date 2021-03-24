public class Read extends User implements Reader{

    public Read(String name) {
        super(name);
    }
    @Override
    public void takeBook(Admin administrator) {
        System.out.println("Читатель " + name + " взял почитать книгу" + administrator);
    }

    @Override
    public void returnbook(Admin administrator) {
        System.out.println("Читатель " + name + " вернул книгу  " + administrator);
    }
}
