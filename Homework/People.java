package Homework;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable {
    String list;
    List<Person> personList= new ArrayList<> ( );

    public void add(Person jb){
          personList.add ( jb );
 }
  public Person findAById(long Id) {
      for (int p = 0; p < personList.size (); p++) {
          if (personList.get ( p ).getId () == Id) {
              return personList.get ( p );
          }


      }

   return null;
  }
  public boolean contains (Person person){

        if (personList.contains ( person )){
        return true;

        }
return false;
}
public void remove(Person person ){
 personList.remove(person);
}
public void removesAll() {
    personList.removeAll ( personList );
}
public int count (){
        return personList.size ();
}
public ArrayList toArray(){
        return new ArrayList (personList);
}

    @NotNull
    @Override
    public Iterator iterator() {
        return personList.iterator ();
    }




    }
