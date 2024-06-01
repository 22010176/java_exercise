package BT7.Bai3;

public class Point3D extends Point2D {
    private int z;

    public Point3D() {

    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return String.format("(%d, %d, %d)", x, y, z);
    }
}
