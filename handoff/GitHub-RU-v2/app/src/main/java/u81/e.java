package u81;

import androidx.compose.foundation.lazy.layout.t1;
import h91.i0Shadow;
import java.io.IOException;
import java.net.ProtocolException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class e extends h91.p {
    public long s;
    public boolean t;
    public boolean u;
    public long v;
    public boolean w;
    public boolean x;
    public final /* synthetic */ t1 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(t1 t1Var, i0Shadow i0Var, long j, boolean z) {
        super(i0Var);
        k71.k.g(i0Var, "delegate");
        this.y = t1Var;
        this.s = j;
        this.t = z;
        this.w = z;
    }

    @Override // h91.p, h91.i0Shadow
    public final void I0(h91.h hVar, long j) {
        if (this.x) {
            throw new IllegalStateException("closed");
        }
        long j2 = this.s;
        if (j2 != -1 && this.v + j > j2) {
            throw new ProtocolException("expected " + j2 + " bytes but received " + (this.v + j));
        }
        try {
            if (this.w) {
                this.w = false;
            }
            super.I0(hVar, j);
            this.v += j;
        } catch (IOException e) {
            IOException f = f(e);
            k71.k.d(f);
            throw f;
        }
    }

    @Override // h91.p, h91.i0Shadow, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
    public final void close() {
        if (this.x) {
            return;
        }
        this.x = true;
        long j = this.s;
        if (j != -1 && this.v != j) {
            throw new ProtocolException("unexpected end of stream");
        }
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
        if (this.u) {
            return iOException;
        }
        this.u = true;
        return t1.a(this.y, this.t, iOException, 4);
    }

    @Override // h91.p, h91.i0Shadow, java.io.Flushable
    public final void flush() {
        try {
            super.flush();
        } catch (IOException e) {
            IOException f = f(e);
            k71.k.d(f);
            throw f;
        }
    }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
