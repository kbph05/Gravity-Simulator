
class Calculation {

    // Private variables
    // private double m_mass;
    private double gravity = 9.8;
    private double v_initial = 0;
    private double m_height;
    private double v_final;

    public Calculation(double height) {
        m_height = height;
    }
    public double calculateVelocity() {
        v_final = Math.sqrt(2 * gravity * m_height + Math.pow(v_initial, 2)); // sqrt(2ad * vf^2)
        return v_final;
    };
    public void printVelocity() {
        System.out.println(v_final);
    }


}