package x81;

import h91.k0;
import h91.m0;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r implements k0 {
    public h91.j r;
    public int s;
    public int t;
    public int u;
    public int v;
    public int w;

    public r(h91.j jVar) {
        k71.k.g(jVar, "source");
        this.r = jVar;
    }

    @Override // h91.k0
    public final long U(h91.h hVar, long j) {
        int i;
        int readInt;
        k71.k.g(hVar, "sink");
        do {
            int i2 = this.v;
            h91.j jVar = this.r;
            if (i2 == 0) {
                jVar.skip(this.w);
                this.w = 0;
                if ((this.t & 4) == 0) {
                    i = this.u;
                    int m = r81.e.m(jVar);
                    this.v = m;
                    this.s = m;
                    int readByte = jVar.readByte() & 255;
                    this.t = jVar.readByte() & 255;
                    Logger logger = s.u;
                    if (logger.isLoggable(Level.FINE)) {
                        h91.k kVar = g.a;
                        logger.fine(g.b(true, this.u, this.s, readByte, this.t));
                    }
                    readInt = jVar.readInt() & Integer.MAX_VALUE;
                    this.u = readInt;
                    if (readByte != 9) {
                        throw new IOException(readByte + " != TYPE_CONTINUATION");
                    }
                }
            } else {
                long U = jVar.U(hVar, Math.min(j, i2));
                if (U != -1) {
                    this.v -= (int) U;
                    return U;
                }
            }
            return -1L;
        } while (readInt == i);
        throw new IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // h91.k0
    public final m0 b() {
        return this.r.b();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
