public class Patient implements Comparable<Patient> {
    public int risk = 0;

    Patient(int r) {
        this.risk = r;
    }

    @Override
    public int compareTo(Patient o) {
        return Integer.compare(o.risk, this.risk);
    }
}
