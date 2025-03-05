import java.util.Scanner;

class Main {

  // Static constant variables:
  public static String askString(String question) {
    Scanner kbReader = new Scanner(System.in);
    System.out.print(question + " ");
    String answer = kbReader.nextLine();
    return answer;
  }
  
  // Void method:
  public static void main(String[] args) {

    Calculation sphere = new Calculation(60, 10);
    sphere.calculateVelocity();
    sphere.printVelocity();
    Canvas canvas = new Canvas();
  }
        
}





  //       // Drag force for y direction going down
  //       t2 = 0;
  //       Voy = 0;
  //       for (int k = 0; k >= 0; k++) {
  //           Vf_y[k] = Voy + 9.8 * t2;
  //           newH = ((Voy + Vf_y[k]) / 2) * dt;
  //           h = h - newH;
  //           h_y[k] = h;
  //           Voy = Vf_y[k];
  //           if (h < 0) {
  //             //System.out.println(t);
  //             break;
  //           }
  //           /* System.out.println("Vf_y " + Vf_y[k] + " m/s");
  //           System.out.println("height " + h + " m"); */
  //           t2 = dt + t2;
  //         }
  //       for (int k = 0; k >= 0; k++) {
  //         Fd_y[k] = (A * Cd * p * Math.pow(Vf_y[k], 2)) / 2;
  //         yAccel[k] = ((mass * 9.8) + Fd_y[k]) / mass;
  //         if (h_y[k] < 0) {
  //             //System.out.println(t);
  //             break;
  //           }
  //         /* System.out.println("yAccel " + yAccel[k] + " m/s2");
  //         System.out.println("drag " + Fd_y[k] + "N"); */
          
  //       }
  //       t2 = 0;
  //       for (int k = 0; k >= 0; k++) {
  //         if (h_y[k] < 0) {
  //           break;
  //         }
  //         Vf_y[k] = Vf_y[k] + yAccel[k] * dt;
  //         //System.out.println("new Vf_y " + Vf_y[k]);
  //         t2 = dt + t2;
  //       }
  //       for (int k = 0; k >= 0; k++) {
  //         Fd_y[k] = (A * Cd * p * Math.pow(Vf_y[k], 2)) / 2;
  //         t2 = dt + t;
  //         if (h_y[k] < 0) {
  //           break;
  //         }
  //         t = dt + t;
  //         System.out.println("drag at " + t + " secs: " + (Fd_y[k]) + "N");
  //       }

  //       // Drag force for x direction
  //       System.out.println(" ");
  //       System.out.println("--X Drag Force--");
  //       Vox = Vo * Math.cos(angle);
  //       Vf_x[0] = Vox;
  //       t3 = 0.001;
  //       for (int k = 0; k >= 0; k++) {
  //         Fd_x[k] = A * Cd * p * Math.pow(Vf_x[k], 2) / 2;
  //         xAccel[k] = (Fd_x[k] / mass) * -1;
  //         Vf_x[k + 1] = Vf_x[k]  + xAccel[k] * 0.001;
  //         System.out.println("Drag at " + t3 + " secs: " + Fd_x[k] + "N");
            
  //         if (t3 == t) {
  //           //System.out.println(t);
  //           break;
  //         }
  //         t3 = dt + t3;
  //       }


