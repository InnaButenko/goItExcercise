package Map;

import java.util.Objects;

public class StarTrack {
    private Point start;
    private Point finish;

    public Point getFinish() {
        return finish;
    }

    public void setFinish(Point finish) {
        this.finish = finish;
    }

    public Point getStart() {
        return start;
    }

    public void setStart(Point start) {
        this.start = start;
    }
    public StarTrack() {

    }
    public StarTrack(Point start, Point finish) {
        this.start = start;
        this.finish = finish;
}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // если это один и тот же объект — true
        if (obj == null || getClass() != obj.getClass()) return false; // если obj null или другой класс — false

        StarTrack that = (StarTrack) obj; // безопасное приведение типа

        // сравниваем содержимое полей start и finish
        return Objects.equals(start, that.start) &&
                Objects.equals(finish, that.finish);
    }

    @Override
    public int hashCode() {
        // ✅ генерируем хэш-код на основе start и finish
        return Objects.hash(start, finish);
    }
}
