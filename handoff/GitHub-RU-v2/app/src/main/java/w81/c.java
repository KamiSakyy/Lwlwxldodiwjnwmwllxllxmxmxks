package w81;

import com.github.rudroid.copilot.h1;
import h91.e0;
import h91.h;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k71.k;
import q81.o;
import r81.g;
import t71.p;
import t71.w;

/* loaded from: /home/user/work/p/classes5.dex */
public final class c extends a {
    public long v;
    public boolean w;
    public final /* synthetic */ f x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(f fVar, o oVar) {
        super(fVar, oVar);
        k.g(oVar, "url");
        this.x = fVar;
        this.v = -1L;
        this.w = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x006e, code lost:
    
        if (r13 == 0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d0, code lost:
    
        if (r17.w == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0071, code lost:
    
        sy.r.m(16);
        r2 = java.lang.Integer.toString(r6, 16);
        k71.k.f(r2, "toString(...)");
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x008a, code lost:
    
        throw new java.lang.NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x".concat(r2));
     */
    @Override // w81.a, h91.k0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long U(h hVar, long j) {
        long j2;
        f fVar = this.x;
        l51.h hVar2 = fVar.c;
        k.g(hVar, "sink");
        long j3 = 0;
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        if (this.w) {
            long j4 = this.v;
            if (j4 == 0 || j4 == -1) {
                if (j4 != -1) {
                    ((e0) hVar2.t).p0();
                }
                try {
                    e0 e0Var = (e0) hVar2.t;
                    h hVar3 = e0Var.s;
                    e0Var.C0(1L);
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        j2 = j3;
                        if (!e0Var.request(i2)) {
                            break;
                        }
                        byte F = hVar3.F(i);
                        if ((F < 48 || F > 57) && ((F < 97 || F > 102) && (F < 65 || F > 70))) {
                            break;
                        }
                        i = i2;
                        j3 = j2;
                    }
                    this.v = hVar3.b0();
                    String obj = p.t0(((e0) hVar2.t).P(Long.MAX_VALUE)).toString();
                    if (this.v < j2 || (obj.length() > 0 && !w.F(obj, ";", false))) {
                        throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.v + obj + '\"');
                    }
                    if (this.v == j2) {
                        this.w = false;
                        f(fVar.e.l());
                    }
                } catch (NumberFormatException e) {
                    throw new ProtocolException(e.getMessage());
                }
            }
            long U = super.U(hVar, Math.min(j, this.v));
            if (U != -1) {
                this.v -= U;
                return U;
            }
            fVar.b.f();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            f(f.f);
            throw protocolException;
        }
        return -1L;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        boolean z;
        if (this.t) {
            return;
        }
        if (this.w) {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            TimeZone timeZone = g.a;
            k.g(timeUnit, "timeUnit");
            try {
                z = g.g(this, 100);
            } catch (IOException unused) {
                z = false;
            }
            if (!z) {
                this.x.b.f();
                f(f.f);
            }
        }
        this.t = true;
    }
}
