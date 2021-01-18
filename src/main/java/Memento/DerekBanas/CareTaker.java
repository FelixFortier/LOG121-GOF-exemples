package Memento.DerekBanas;

// Memento Design Pattern Tutorial

import java.util.ArrayList;

/**
 * Caretaker object is responsible to restore object state from Memento.
 */
class Caretaker {

    // Where all mementos are saved
    private ArrayList<Memento> savedArticles = new ArrayList<Memento>();

    // Adds memento to the ArrayList
    public void addMemento(Memento m) { savedArticles.add(m); }

    // Gets the memento requested from the ArrayList
    public Memento getMemento(int index) { return savedArticles.get(index); }
}
