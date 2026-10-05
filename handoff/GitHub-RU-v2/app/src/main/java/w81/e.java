package w81;

import com.github.rudroid.copilot.h1;
import h91.h;
import k71.k;
import q81.n;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends a {
    public boolean v;

    @Override // w81.a, h91.k0
    public final long U(h hVar, long j) {
        k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        if (this.v) {
            return -1L;
        }
        long U = super.U(hVar, j);
        if (U != -1) {
            return U;
        }
        this.v = true;
        f(n.s);
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.t) {
            return;
        }
        if (!this.v) {
            f(f.f);
        }
        this.t = true;
    }
}
