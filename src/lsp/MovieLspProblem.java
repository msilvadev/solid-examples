package lsp;

public class MovieLspProblem {

    public void play() {
        // play movie
    }

    public void increaseVolume() {
        // increase movie volume
    }
}

class TheLionKing extends MovieLspProblem {

}

/**
 * This class represent the Modern Times a muted movie by Charles Chaplin.
 *
 * As this movie is a muted movie, we cannot increase volume, then we breach of the Liskov Substitution Principle.
 */
class ModernTimes extends MovieLspProblem {

}