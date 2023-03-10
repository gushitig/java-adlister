package DAO;


import models.Person;

import java.util.ArrayList;
import java.util.List;

public class PersonListDAO {
        private final ArrayList<Person> people;

    public PersonListDAO () {
        people = new ArrayList<>();
        // plug some starter people into the db
        initData();
    }

        public List<Person> all() {
            return people;
        }

        //insert given persin into the array list (in memory db)
        public void insert(Person person) {
            people.add(person);

        }

        private void initData() {
            Person person = new Person();
            person.setName("bob");
            person.setAge(20);
            people.add(person);

            person.setName("bob");
            person.setAge(20);
            people.add(person);

            person.setName("bob");
            person.setAge(20);
            people.add(person);

        }






    }

