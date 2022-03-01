package isp;

public interface MovieIspSolve {
    public void play();
}

interface AudioControl {
    public void increaseVolume();
}

class TheLionKingSolve implements MovieIspSolve, AudioControl {

    @Override
    public void play() {

    }

    @Override
    public void increaseVolume() {

    }
}

class ModernTimesSolve implements MovieIspSolve {

    @Override
    public void play() {

    }
}