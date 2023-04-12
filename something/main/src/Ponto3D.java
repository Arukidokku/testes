public class Ponto3D extends Ponto2D{
    int z;

    public int getZ(){
        return z;
    }

    public void setZ(int z){
        this.z = z;
    }

    public String toString(){
        return getX() + "-" + getY() + "-" + getZ();
    }
}
