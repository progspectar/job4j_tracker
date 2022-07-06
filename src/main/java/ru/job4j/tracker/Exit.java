package ru.job4j.tracker;

public class Exit implements UserAction {
    @Override
    public String name() {
        return "Exit0";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        return false;
    }
}
