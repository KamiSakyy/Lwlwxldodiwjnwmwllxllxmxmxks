package fa1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class y extends q81.c0 {
    public q81.q s;
    public long t;

    public y(q81.q qVar, long j) {
        this.s = qVar;
        this.t = j;
    }

    @Override // q81.c0
    public final long f() {
        return this.t;
    }

    @Override // q81.c0
    public final q81.q m() {
        return this.s;
    }

    @Override // q81.c0
    public final h91.j r() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
