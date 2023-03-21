package uaslp.ingenieria.exams.instruments;

import uaslp.ingenieria.exams.InstrumentPlayer;

public enum Instrumento{
    PIANO(new Piano()),
    GUITARRA(new Guitarra()),
    FLAUTA(new Flauta()),
    VIOLIN(new Violin()),
    SAXOPHONE(new Saxophone());

    public InstrumentPlayer instrumentPlayer;

    Instrumento(InstrumentPlayer instrumentPlayer){
        this.instrumentPlayer = instrumentPlayer;
    }

    public InstrumentPlayer getInstrumentPlayer() {
        return instrumentPlayer;
    }
}
