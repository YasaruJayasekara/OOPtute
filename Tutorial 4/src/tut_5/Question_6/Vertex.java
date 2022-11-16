package tut_5.Question_6;

class Vertex implements Node {
    int x; // x coordinate
    int y; // y coordinate
    Vertex(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void print() {
        System.out.println("x: " + x + ", y: " + y);
    }
}

