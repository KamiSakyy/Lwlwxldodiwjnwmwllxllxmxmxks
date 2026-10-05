package x81;

import com.github.rudroid.copilot.h1;
import java.io.IOException;
import java.net.SocketTimeoutException;

/* loaded from: /home/user/work/p/classes5.dex */
public final class v extends h91.d {
    public final /* synthetic */ w n;

    public v(w wVar) {
        this.n = wVar;
    }

    @Override // h91.d
    public final IOException k(IOException iOException) {
        return new SocketTimeoutException("timeout");
    }

    @Override // h91.d
    public final void l() {
        this.n.g(a.y);
        o oVar = this.n.s;
        synchronized (oVar) {
            long j = oVar.F;
            long j2 = oVar.E;
            if (j < j2) {
                return;
            }
            oVar.E = j2 + 1;
            oVar.G = System.nanoTime() + 1000000000;
            t81.c.b(oVar.y, h1.p(new StringBuilder(), oVar.t, " ping"), 0L, new w8.p(8, oVar), 6);
        }
    }

    public final void m() {
        if (j()) {
            throw k(null);
        }
    }
}
