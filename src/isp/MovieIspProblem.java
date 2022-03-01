package isp;

public interface MovieIspProblem {
    public void play();
    public void increaseVolume();
}

class TheLionKing implements MovieIspProblem {

    @Override
    public void play() {

    }

    @Override
    public void increaseVolume() {

    }
}

class ModernTimes implements MovieIspProblem {

    @Override
    public void play() {

    }

    @Override
    public void increaseVolume() {
        // Do not, because is a muted movie
    }
}