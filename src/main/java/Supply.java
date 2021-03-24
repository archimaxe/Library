public class Supply extends User implements Supplier{
    public Supply(String name) {
        super(name);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Поставщик " + name + " привез книги библиотекарю " + librarian);
    }
}
