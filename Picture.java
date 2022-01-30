/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class is eddited for assignment.
 * 
 * @author  Ahmed Abdelrahman
 * @version 2022.01.29
 */
public class Picture
{
    private Square grass1;
    private Square road;
    private Square grass2;
    private Square sky;
    private Person person;
    
    //Road Chalking
    private Square rc[][];
    
    //Bus
    private Square bus1;
    private Square bus2;
    private Square bus3;
    
    private Circle tyre11;
    private Circle tyre12;
    
    private Circle tyre21;
    private Circle tyre22;
    
    private Square busHead1;
    private Square busHead2;
    
    private Circle headLight;
    
    private Square door1;
    private Square door2;
    
    private Triangle window1;
    private Triangle window2;
    private Triangle window3;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        sky = new Square();    
        grass1 = new Square();    
        road = new Square();
        grass2 = new Square();        
        person = new Person();    
        
        rc=new Square[7][3];
        for(int i=0;i<7;i++){
            rc[i][0]=new Square();
            rc[i][1]=new Square();
            rc[i][2]=new Square();
        }
        
        bus1=new Square();
        bus2=new Square();
        bus3=new Square();
        
        tyre11=new Circle();
        tyre12=new Circle();
        tyre21=new Circle();
        tyre22=new Circle();
        
        busHead1=new Square();
        busHead2=new Square();
        
        headLight=new Circle();
        
        door1=new Square();
        door2=new Square();
        
        window1 = new Triangle();
        window2 = new Triangle();
        window3 = new Triangle();
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {  
    
        sky.changeColor("skyblue");
        sky.moveHorizontal(-310);
        sky.moveVertical(-540);
        sky.changeSize(550);
        sky.makeVisible();

        grass1.changeColor("green");
        grass1.moveHorizontal(-350);
        grass1.moveVertical(10);
        grass1.changeSize(550);
        grass1.makeVisible();
        
        road.changeColor("grey");
        road.moveHorizontal(-310);
        road.moveVertical(81);
        road.changeSize(550);
        road.makeVisible();

        grass2.changeColor("green");
        grass2.moveHorizontal(-310);
        grass2.moveVertical(138);
        grass2.changeSize(550);
        grass2.makeVisible();
        
        //setting values of road chalking squares
        int rcX=-288;
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                rc[i][j].changeColor("white");
                rc[i][j].moveHorizontal(rcX);
                rc[i][j].moveVertical(104);
                rc[i][j].changeSize(13);
                rc[i][j].makeVisible();
                rcX+=13;
            }
            rcX+=39;
        }
        
        bus1.changeColor("red");
        bus1.moveHorizontal(-71);
        bus1.moveVertical(38);
        bus1.changeSize(56);
        bus1.makeVisible();
        
        bus2.changeColor("red");
        bus2.moveHorizontal(-15);
        bus2.moveVertical(38);
        bus2.changeSize(56);
        bus2.makeVisible();
        
        bus3.changeColor("red");
        bus3.moveHorizontal(41);
        bus3.moveVertical(38);
        bus3.changeSize(56);
        bus3.makeVisible();
        
        tyre11.changeColor("black");
        tyre11.moveHorizontal(39);
        tyre11.moveVertical(124);
        tyre11.changeSize(26);
        tyre11.makeVisible();
        
        tyre12.changeColor("white");
        tyre12.moveHorizontal(45);
        tyre12.moveVertical(130);
        tyre12.changeSize(14);
        tyre12.makeVisible();
        
        tyre21.changeColor("black");
        tyre21.moveHorizontal(164);
        tyre21.moveVertical(124);
        tyre21.changeSize(26);
        tyre21.makeVisible();
        
        tyre22.changeColor("white");
        tyre22.moveHorizontal(170);
        tyre22.moveVertical(130);
        tyre22.changeSize(14);
        tyre22.makeVisible();
        
        busHead1.changeColor("red");
        busHead1.moveHorizontal(97);
        busHead1.moveVertical(64);
        busHead1.changeSize(15);
        busHead1.makeVisible();
        
        busHead2.changeColor("red");
        busHead2.moveHorizontal(97);
        busHead2.moveVertical(79);
        busHead2.changeSize(15);
        busHead2.makeVisible();
        
        headLight.changeColor("white");
        headLight.moveHorizontal(172);
        headLight.moveVertical(100);
        headLight.changeSize(14);
        headLight.makeVisible();
        
        door1.changeColor("magenta");
        door1.moveHorizontal(41);
        door1.moveVertical(64);
        door1.changeSize(15);
        door1.makeVisible();
        
        door2.changeColor("magenta");
        door2.moveHorizontal(41);
        door2.moveVertical(79);
        door2.changeSize(15);
        door2.makeVisible();
        
        window1.changeColor("magenta");
        window1.changeSize(16,16);
        window1.moveHorizontal(60);
        window1.moveVertical(25);
        window1.makeVisible();
        
        window2.changeColor("magenta");
        window2.changeSize(16,16);
        window2.moveHorizontal(110);
        window2.moveVertical(25);
        window2.makeVisible();
        
        window3.changeColor("magenta");
        window3.changeSize(16,16);
        window3.moveHorizontal(171);
        window3.moveVertical(25);
        window3.makeVisible();
        
        person.changeSize(44,15);
        person.moveHorizontal(76);
        person.moveVertical(15);
        person.makeVisible();
    }

    /**
     * Change this picture2 to black/white display
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("grey");
        
        grass1.changeColor("black");
        road.changeColor("grey");
        grass2.changeColor("black");
        
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                rc[i][j].changeColor("white");
            }
        }
        
        bus1.changeColor("white");
        bus2.changeColor("white");
        bus3.changeColor("white");
        
        tyre11.changeColor("black");
        tyre12.changeColor("white");
        
        tyre21.changeColor("black");
        tyre22.changeColor("white");
        
        busHead1.changeColor("white");
        busHead2.changeColor("white");
        
        headLight.changeColor("grey");
        
        door1.changeColor("grey");
        door2.changeColor("grey");
        
        window1.changeColor("black");
        window2.changeColor("black");
        window3.changeColor("black");
        
        person.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        sky.changeColor("skyblue");
        
        grass1.changeColor("green");
        road.changeColor("grey");
        grass2.changeColor("green");
        
        for(int i=0;i<7;i++){
            for(int j=0;j<3;j++){
                rc[i][j].changeColor("white");
            }
        }
        
        bus1.changeColor("red");
        bus2.changeColor("red");
        bus3.changeColor("red");
        
        tyre11.changeColor("black");
        tyre12.changeColor("white");
        
        tyre21.changeColor("black");
        tyre22.changeColor("white");
        
        busHead1.changeColor("red");
        busHead2.changeColor("red");
        
        headLight.changeColor("white");
        
        door1.changeColor("magenta");
        door2.changeColor("magenta");
        
        window1.changeColor("magenta");
        window2.changeColor("magenta");
        window3.changeColor("magenta"); 
        
        person.changeColor("black");
    }
}
