import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
    Создайте иерархию "Пользователи библиотеки" со следующими интерфейсами:
    Читатель – берет и возвращает книги.
    Библиотекарь – заказывает книги.
    Поставщик книг – приносит книги в библиотеку.
    Администратор – находит и выдает книги и уведомляет о просрочках времени возврата.
    В методе public static void main создайте 2-3 объекта, реализующих эти интерфейсы.

        Дополнительная информация
    Учтите, что интерфейсов у пользователя (User) может быть несколько.
    Объекты класса User могут взаимодействовать друг с другом (например, библиотекарь заказывает у поставщика).
     */

    public static void main(String[] args) {
        Administrator admin = new Administrator("Администратор");
        Libra librarian = new Libra("Библиотекарь");
        Read reader = new Read("Читатель");
        Supply supplier = new Supply("Поставщик");

        UserAdministrator userAdministrator = new UserAdministrator("Юзерадмин");
        UserLibrarianAdministrator userLibrarianAdministrator = new UserLibrarianAdministrator("Либрадмин");
        SupplierReader supplierReader = new SupplierReader("Постачит");

        userAdministrator.overdueNotification(supplierReader);
        supplierReader.takeBook(userAdministrator);
        userLibrarianAdministrator.orderBook(supplierReader);
        admin.overdueNotification(supplierReader);
        reader.returnbook(admin);
        librarian.orderBook(supplier);
        supplier.bringBook(librarian);





    }
}



