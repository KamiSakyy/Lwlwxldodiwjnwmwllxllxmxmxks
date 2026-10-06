package u81;

import androidx.compose.foundation.lazy.layout.t1;
import h91.k0;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class f extends h91.q {
    public long s;
    public boolean t;
    public long u;
    public boolean v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ t1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(t1 t1Var, k0 k0Var, long j, boolean z) {
        super(k0Var);
        k71.k.g(k0Var, "delegate");
        this.y = t1Var;
        this.s = j;
        this.t = z;
        this.v = true;
        if (j == 0) {
            f(null);
        }
    }

    @Override // h91.q, h91.k0
    public final long U(h91.h hVar, long j) {
        t1 t1Var = this.y;
        k71.k.g(hVar, "sink");
        if (this.x) {
            throw new IllegalStateException("closed");
        }
        try {
            long U = this.r.U(hVar, j);
            if (this.v) {
                this.v = false;
            }
            if (U == -1) {
                f(null);
                return -1L;
            }
            long j2 = this.u + U;
            long j3 = this.s;
            if (j3 == -1 || j2 <= j3) {
                this.u = j2;
                if (((v81.e) t1Var.d).b()) {
                    f(null);
                }
                return U;
            }
            throw new ProtocolException("expected " + j3 + " bytes but received " + j2);
        } catch (IOException e) {
            IOException f = f(e);
            k71.k.d(f);
            throw f;
        }
    }

    @Override // h91.q, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.x) {
            return;
        }
        this.x = true;
        try {
            super.close();
            f(null);
        } catch (IOException e) {
            IOException f = f(e);
            k71.k.d(f);
            throw f;
        }
    }

    public final IOException f(IOException iOException) {
        if (this.w) {
            return iOException;
        }
        this.w = true;
        if (iOException == null && this.v) {
            this.v = false;
        }
        return t1.a(this.y, this.t, iOException, 8);
    }
}
