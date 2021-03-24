public class Administrator extends User implements Admin{
    public Administrator(String name) {
        super(name);
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println("Администратор " + name + " обнаружил просрочку возврата книги у пользователя " + reader);
    }
}
