public class UserLibrarianAdministrator extends User implements Librarian, Admin{
    public UserLibrarianAdministrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Библтотекарь " + name + " обнаружил просрочку книги " + reader);
    }

    @Override
    public void orderBook(Supplier supplier) {
        System.out.println("Библиотекарь " + name + " заказал книги у поставщика " + supplier);
    }

    @Override
    public void receivebook(Supplier supplier) {
        System.out.println("Библиотекарь " + name + " получил книги у поставщика " + supplier);
    }

}
