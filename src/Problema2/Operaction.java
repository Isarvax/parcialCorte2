package Problema2;

public interface Operaction {
    void create(String name, String description, State state);
    void update(int id,String name, String description, State state);
    void delete(int id);
    void getAll();
    void getOne(int id);
}
