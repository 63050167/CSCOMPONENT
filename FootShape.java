public class FootShape implements Ellipse,Rectangle {
    Foot FT;
    @Override
    public void draw() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'draw'");
    }
    public void drawAsEllipse(){
        System.out.println("draw ellipse");
    }
    public void drawAsRectangle(){
        System.out.println("draw rectangle");
    }
}
