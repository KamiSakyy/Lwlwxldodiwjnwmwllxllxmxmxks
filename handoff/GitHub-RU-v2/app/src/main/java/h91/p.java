package h91;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class p implements i0Shadow {
    public i0Shadow r;

    public p(i0Shadow i0Var) {
        k71.k.g(i0Var, "delegate");
        this.r = i0Var;
    }

    @Override // h91.i0Shadow
    public void I0(h hVar, long j) {
        this.r.I0(hVar, j);
    }

    @Override // h91.i0Shadow
    public final m0 b() {
        return this.r.b();
    }

    @Override // h91.i0Shadow, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public void close() {
        this.r.close();
    }

    @Override // h91.i0Shadow, java.io.Flushable
    public void flush() {
        this.r.flush();
    }

    public final String toString() {
        return getClass().getSimpleName() + '(' + this.r + ')';
    }
}
