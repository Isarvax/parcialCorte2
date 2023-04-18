package Problema2;

public enum State {AVAILABLE("Available"),NOAVAILABLE("No available");

    private String state;

    State(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
