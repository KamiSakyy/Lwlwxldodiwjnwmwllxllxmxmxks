package fa1;

import java.io.IOException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class x extends q81.c0 {
    public final q81.c0 s;
    public final h91.e0 t;
    public IOException u;

    public x(q81.c0 c0Var) {
        this.s = c0Var;
        this.t = h91.b.c(new w(this, c0Var.r()));
    }

    @Override // q81.c0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.s.close();
    }

    @Override // q81.c0
    public final long f() {
        return this.s.f();
    }

    @Override // q81.c0
    public final q81.q m() {
        return this.s.m();
    }

    @Override // q81.c0
    public final h91.j r() {
        return this.t;
    }
}
