package h91;

import com.github.rudroid.copilot.h1;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: /home/user/work/p/classes5.dex */
public final class u implements k0 {
    public InputStream r;
    public m0 s;

    public u(InputStream inputStream, m0 m0Var) {
        k71.k.g(inputStream, "input");
        this.r = inputStream;
        this.s = m0Var;
    }

    @Override // h91.k0
    public final long U(h hVar, long j) {
        k71.k.g(hVar, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        try {
            this.s.f();
            f0 x0 = hVar.x0(1);
            int read = this.r.read(x0.a, x0.c, (int) Math.min(j, 8192 - x0.c));
            if (read != -1) {
                x0.c += read;
                long j2 = read;
                hVar.s += j2;
                return j2;
            }
            if (x0.b != x0.c) {
                return -1L;
            }
            hVar.r = x0.a();
            g0.a(x0);
            return -1L;
        } catch (AssertionError e) {
            if (i91.l.a(e)) {
                throw new IOException(e);
            }
            throw e;
        }
    }

    @Override // h91.k0
    public final m0 b() {
        return this.s;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.r.close();
    }

    public final String toString() {
        return "source(" + this.r + ')';
    }
}
