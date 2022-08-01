package zipcode;

public class Hamming {
    public String original;
    public String mutated;
    public Hamming(String s, String s1) {
        this.original = s;
        this.mutated = s1;
        checkStringLength();
    }

    public int getHammingDistance() {
        int distance = 0;
        for (int i = 0; i < original.length(); i++) {
            if (original.charAt(i) != mutated.charAt(i)) distance++;
        }
        return distance;
    }

    public void checkStringLength() throws IllegalArgumentException {
        if (original.length() != mutated.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }
}
