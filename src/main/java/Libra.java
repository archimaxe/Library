public class Libra extends User implements Librarian{
    public Libra(String name) {
        super(name);
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
