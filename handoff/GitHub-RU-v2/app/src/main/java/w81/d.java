package w81;

import com.github.rudroid.copilot.h1;
import h91.h;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k71.k;
import q81.n;
import q81.o;
import r81.g;

/* loaded from: /home/user/work/p/classes5.dex */
public final class d extends a {
    public long v;
    public final /* synthetic */ f w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(f fVar, o oVar, long j) {
        super(fVar, oVar);
        k.g(oVar, "url");
        this.w = fVar;
        this.v = j;
        if (j == 0) {
            f(n.s);
        }
    }

    @Override // w81.a, h91.k0
    public final long U(h hVar, long j) {
        k.g(hVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.v;
        if (j2 == 0) {
            return -1L;
        }
        long U = super.U(hVar, Math.min(j2, j));
        if (U == -1) {
            this.w.b.f();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f(f.f);
            throw protocolException;
        }
        long j3 = this.v - U;
        this.v = j3;
        if (j3 == 0) {
            f(n.s);
        }
        return U;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.t) {
            return;
        }
        if (this.v != 0) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = g.a;
            k.g(timeUnit, "timeUnit");
            try {
                z = g.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.w.b.f();
                f(f.f);
            }
        }
        this.t = true;
    }
}
