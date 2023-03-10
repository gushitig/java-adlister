package DAO;

public class PersonDAOFactory {
    //this factory protects oir program from breaking later on should we need to make changes
    //we dont make the person list anymore, we askthe factory to do it for us
    //this ensures that no matter where we ask for the dao we will always get the same one
    //this is so all the traffic is routed through one place so that multiple dbes or array lists are the same whether an item is created, edited or destroyed
    private static PersonListDAO personDAO = null;

    public static PersonListDAO getPersonDAO() {
        if(personDAO == null) {
            personDAO = new PersonListDAO();
        }
        return personDAO;
    }
}
