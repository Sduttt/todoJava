import java.util.ArrayList;

public class TodoFunction {
    private ArrayList<String> todolist= new ArrayList<String>();

    //add list item
    public void addItem(String item){
        todolist.add(item);
    }

    //remove list items
    public  void removeItem (int index) {
        todolist.remove(index);
    }

    //Print todi items
    public void printTodolist(){
        System.out.println("Total number of todo items is " + todolist.size());

        for (String s : todolist) {
            int index = todolist.indexOf(s) + 1;
            System.out.print(index + ". " + s + "; ");
        }
        System.out.println();
    }

    //Update todolist
    public void updateItem(int index, String item) {
        todolist.set(index, item);
        int newIndex = index+1;
        System.out.println("Item at position " + newIndex + " is updated");
    }

//search from todolist
    public String findItem (String myItem) {
        int index = todolist.indexOf(myItem);

        if(index == -1){
            return null;
        } else return todolist.get(index-1);
    }

}














