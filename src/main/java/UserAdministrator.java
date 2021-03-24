public class UserAdministrator extends User implements Admin, Reader{
    public UserAdministrator(String name) {
        super(name);
    }


    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " обнаружил просрочку возврата книги у пользователя " + reader);
    }

    @Override
    public void takeBook(Admin administrator) {
        System.out.println("Администратор " + name + " взял почитать книгу " + administrator);
    }

    @Override
    public void returnbook(Admin administrator) {
        System.out.println("Читатель " + name + " вернул книгу " + administrator);
    }
}
