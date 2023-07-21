public class Foot {
    public void draw(int x){
        switch(x) {
            case 1:
                FootShape footShape = new FootShape();
                footShape.drawAsEllipse();
                break;
            case 2:
                FootShape footShape2 = new FootShape();
                footShape2.drawAsRectangle();
                break;
        }
    }
}
