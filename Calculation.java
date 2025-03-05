import java.util.Vector;

class NetForce {

    // Private variables
    private double m_mass;
    private int n;
    private double gravity = 9.8;
    private double v_final;
    private double force;
    private double v_initial = 0;
    private double m_height;
    private Vector<Double> velocity = new Vector<Double>(1,1);
    public static double vol = 0;

    public NetForce(double mass, double height) {
        m_mass = mass;
        m_height = height;
    }
    public Vector<Double> calculation() {
        do {
            v_final = Math.sqrt(2 * gravity * m_height + Math.pow(v_initial, 2)); // sqrt(2ad * vf^2)
            System.out.println(v_final);
            velocity.addElement(v_final); // adds the final velocity at the end of the (current) velocities vector
            v_initial = v_final; // set the initial velocity as the previous velocity
            force = m_mass * gravity;
            n++;
            break;
        }  while (v_final != 0);
        return velocity;
    };

    public int size() {
        return n;
    }

    public boolean empty() {
        if (n == 0) {
            return true;
        }
        return false;
    }
    public void printVelocities() {
        for (int i = 0; i < n; i ++) {
            // System.out.println(velocity.get(i));
        }
    }


}