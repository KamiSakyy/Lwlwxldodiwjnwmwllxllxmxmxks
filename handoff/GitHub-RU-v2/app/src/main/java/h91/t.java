package h91;

import com.github.rudroid.copilot.h1;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

/* loaded from: /home/user/work/p/classes5.dex */
public final class t implements k0 {
    public final e0 r;
    public final Inflater s;
    public int t;
    public boolean u;

    public t(e0 e0Var, Inflater inflater) {
        this.r = e0Var;
        this.s = inflater;
    }

    @Override // h91.k0
    public final long U(h hVar, long j) {
        k71.k.g(hVar, "sink");
        do {
            long f = f(hVar, j);
            if (f > 0) {
                return f;
            }
            Inflater inflater = this.s;
            if (inflater.finished() || inflater.needsDictionary()) {
                return -1L;
            }
        } while (!this.r.L());
        throw new EOFException("source exhausted prematurely");
    }

    @Override // h91.k0
    public final m0 b() {
        return this.r.r.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.u) {
            return;
        }
        this.s.end();
        this.u = true;
        this.r.close();
    }

    public final long f(h hVar, long j) {
        Inflater inflater = this.s;
        k71.k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (this.u) {
            throw new IllegalStateException("closed");
        }
        if (j != 0) {
            try {
                f0 x0 = hVar.x0(1);
                int min = (int) Math.min(j, 8192 - x0.c);
                boolean needsInput = inflater.needsInput();
                e0 e0Var = this.r;
                if (needsInput && !e0Var.L()) {
                    f0 f0Var = e0Var.s.r;
                    k71.k.d(f0Var);
                    int i = f0Var.c;
                    int i2 = f0Var.b;
                    int i3 = i - i2;
                    this.t = i3;
                    inflater.setInput(f0Var.a, i2, i3);
                }
                int inflate = inflater.inflate(x0.a, x0.c, min);
                int i4 = this.t;
                if (i4 != 0) {
                    int remaining = i4 - inflater.getRemaining();
                    this.t -= remaining;
                    e0Var.skip(remaining);
                }
                if (inflate > 0) {
                    x0.c += inflate;
                    long j2 = inflate;
                    hVar.s += j2;
                    return j2;
                }
                if (x0.b == x0.c) {
                    hVar.r = x0.a();
                    g0.a(x0);
                }
            } catch (DataFormatException e) {
                throw new IOException(e);
            }
        }
        return 0L;
    }
}
