package ocp;

/**
 * In this always class that we need to implement a new calculation
 * to a new type we need implement a new if changing this class implementation.
 *
 * To see the correct form following Open-Close see class {@link ocp.VideoOcpSolve}
 */
public class VideoOcpProblem {

    private String type;

    public void calculationOfInteresting() {
        if (this.type.equalsIgnoreCase("Movie")) {

        } else if (this.type.equalsIgnoreCase("TVShow")) {

        }
    }
}
