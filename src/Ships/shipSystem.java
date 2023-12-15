package Ships;

public abstract class shipSystem {
    private String name;
    private int width;
    private int length;
    private int height;
    //Origin is at port stern corner
    private int x;
    private int y;

    public shipSystem(String name, int width, int length, int height, int x, int y) throws RuntimeException{
        if(x<0 || y<0){
            throw new RuntimeException("The module cannot have locations less than zero");
        }
        this.name = name;
        this.width = width;
        this.length = length;
        this.height = height;
        this.x = x;
        this.y = y;
    }
    public boolean fitsInHeight(int height){
        if(this.height <= height){
            return true;
        }
        return false;
    }
    public boolean conflictsWith(shipSystem sys){
        return(conflictsWithX(sys) && conflictsWithY(sys));
    }
    private boolean conflictsWithX(shipSystem sys){
        if(this.x == sys.getX()){
            return true;
        }
        if(this.x < sys.getX()){
            if(this.x + this.width >= sys.getX()){
                return true;
            }
        }   else{
            if(sys.getX() + sys.getWidth() >= this.x){
                return true;
            }
        }
        return false;
    }
    private boolean conflictsWithY(shipSystem sys){
        if(this.y == sys.getY()){
            return true;
        }
        if(this.y < sys.getY()){
            if(this.y + this.length >= sys.getY()){
                return true;
            }
        }   else{
            if(sys.getY() + sys.getLength() >= this.y){
                return true;
            }
        }
        return false;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
