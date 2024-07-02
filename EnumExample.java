// Define the enum with fields, methods, and a constructor
enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e+26, 2.4746e7);

    private final double mass;   // in kilograms
    private final double radius; // in meters

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double mass() { return mass; }
    public double radius() { return radius; }

    // universal gravitational constant (m^3 kg^-1 s^-2)
    public static final double G = 6.67300E-11;

    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }

    public double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
}

// Define an enum with abstract methods
enum Operation {
    PLUS {
        double apply(double x, double y) { return x + y; }
    },
    MINUS {
        double apply(double x, double y) { return x - y; }
    },
    TIMES {
        double apply(double x, double y) { return x * y; }
    },
    DIVIDE {
        double apply(double x, double y) { return x / y; }
    };

    abstract double apply(double x, double y);
}

public class EnumExample {
    public static void main(String[] args) {
        // Using the Planet enum
        System.out.println("Planets and their surface weights for a mass of 75 kg:");
        for (Planet planet : Planet.values()) {
            System.out.printf("Your weight on %s is %f%n", planet, planet.surfaceWeight(75));
        }

        System.out.println("\nPlanet details:");
        for (Planet planet : Planet.values()) {
            System.out.printf("%s: Mass = %e, Radius = %e, Surface Gravity = %f%n", 
                planet, planet.mass(), planet.radius(), planet.surfaceGravity());
        }

        // Using the Operation enum
        double x = 5;
        double y = 3;
        System.out.println("\nOperations:");
        for (Operation op : Operation.values()) {
            System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));
        }

        // Demonstrate common enum methods
        System.out.println("\nEnum Methods:");
        Planet p = Planet.valueOf("EARTH");
        System.out.println("Planet p: " + p);
        System.out.println("Ordinal of EARTH: " + p.ordinal());
        System.out.println("Name of the planet: " + p.name());
// returns the position of the enum constant in its enum declaration.
        // Switch statement with enums
        switch (p) {
            case EARTH:
                System.out.println("Earth is a planet.");
                break;
            default:
                System.out.println("Unknown planet.");
                break;
        }
    }
}
