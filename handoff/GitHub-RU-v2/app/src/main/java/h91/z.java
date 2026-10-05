package h91;

import java.io.FileOutputStream;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z implements i0 {
    public final FileOutputStream r;
    public final m0 s;

    public z(FileOutputStream fileOutputStream, m0 m0Var) {
        this.r = fileOutputStream;
        this.s = m0Var;
    }

    @Override // h91.i0
    public final void I0(h hVar, long j) {
        b.e(hVar.s, 0L, j);
        while (j > 0) {
            this.s.f();
            f0 f0Var = hVar.r;
            k71.k.d(f0Var);
            int min = (int) Math.min(j, f0Var.c - f0Var.b);
            this.r.write(f0Var.a, f0Var.b, min);
            int i = f0Var.b + min;
            f0Var.b = i;
            long j2 = min;
            j -= j2;
            hVar.s -= j2;
            if (i == f0Var.c) {
                hVar.r = f0Var.a();
                g0.a(f0Var);
            }
        }
    }

    @Override // h91.i0
    public final m0 b() {
        return this.s;
    }

    @Override // h91.i0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        this.r.close();
    }

    @Override // h91.i0, java.io.Flushable
    public final void flush() {
        this.r.flush();
    }

    public final String toString() {
        return "sink(" + this.r + ')';
    }
}
