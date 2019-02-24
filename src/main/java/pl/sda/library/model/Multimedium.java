package pl.sda.library.model;

import java.util.Objects;

public abstract class Multimedium {
    protected String title;
    protected MediumState state;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType(){
        return getClass().getSimpleName();
    }

    public MediumState getState() {
        return state;
    }

    public void setState(MediumState state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Multimedium that = (Multimedium) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(state, that.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, state);
    }
}
