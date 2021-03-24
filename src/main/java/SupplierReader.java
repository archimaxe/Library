public class SupplierReader extends User implements Supplier, Reader{
    public SupplierReader(String name) {
        super(name);
    }

    @Override
    public void takeBook(Admin administrator) {
        System.out.println("Администратор " + name + " взял почитать книгу у администратора " + administrator);
    }

    @Override
    public void returnbook(Admin administrator) {
        System.out.println("Поставщик " + name + " вернул книгу " + administrator);
    }

    @Override
    public void bringBook(Librarian librarian) {
        System.out.println("Поставщик " + name + " привез книги библиотекарю " + librarian);
    }
}
