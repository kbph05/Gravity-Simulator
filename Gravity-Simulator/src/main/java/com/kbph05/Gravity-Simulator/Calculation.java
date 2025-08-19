
class Calculation {

    // Private variables
    private double gravity = 9.8;
    private double v_initial = 0;
    private double m_height;
    private double m_mass;
    private double v_final;

    public Calculation() {
        m_height = 0;
        m_mass = 0;
        v_final = 0;
    }
    public Calculation(double mass, double height) {
        m_height = height;
        m_mass = mass;
    }

    public double calculateVelocity() {
        v_final = Math.sqrt(2 * gravity * m_height + Math.pow(v_initial, 2)); // sqrt(2ad * vf^2)
        return v_final;
    }
    public void printVelocity() {
        System.out.println(v_final);
    }

    public double calculateForce() {
        double force = m_mass * gravity;
        return force;
    }

    public String getVelocity() {
        return Double.toString(v_final);
    }

}