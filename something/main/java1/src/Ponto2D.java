public class Ponto2D {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    int y;

    public int getY(){
        return y;

    }

    public void setY(int y){
        this.y = y;
    }

    @Override
    public String toString(){
        return getX() + "-" + getY();
    }
}
