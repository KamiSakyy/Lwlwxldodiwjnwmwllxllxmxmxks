package h91;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class q implements k0 {
    public k0 r;

    public q(k0 k0Var) {
        k71.k.g(k0Var, "delegate");
        this.r = k0Var;
    }

    @Override // h91.k0
    public long U(h hVar, long j) {
        k71.k.g(hVar, "sink");
        return this.r.U(hVar, j);
    }

    @Override // h91.k0
    public final m0 b() {
        return this.r.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.r.close();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.r + ')';
    }
}
