package x81;

import h91.d0;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: /home/user/work/p/classes5.dex */
public final class x implements Closeable {
    public static final Logger w = Logger.getLogger(g.class.getName());
    public h91.i r;
    public h91.h s;
    public int t;
    public boolean u;
    public e v;

    public x(d0 d0Var) {
        k71.k.g(d0Var, "sink");
        this.r = d0Var;
        h91.h hVar = new h91.h();
        this.s = hVar;
        this.t = 16384;
        this.v = new e(hVar);
    }

    public final void A(boolean z, int i, ArrayList arrayList) {
        synchronized (this) {
            if (this.u) {
                throw new IOException("closed");
            }
            this.v.d(arrayList);
            long j = this.s.s;
            long min = Math.min(this.t, j);
            int i2 = j == min ? 4 : 0;
            if (z) {
                i2 |= 1;
            }
            r(i, (int) min, 1, i2);
            this.r.I0(this.s, min);
            if (j > min) {
                long j2 = j - min;
                while (j2 > 0) {
                    long min2 = Math.min(this.t, j2);
                    j2 -= min2;
                    r(i, (int) min2, 9, j2 == 0 ? 4 : 0);
                    this.r.I0(this.s, min2);
                }
            }
        }
    }

    public final void E(int i, int i2, boolean z) {
        synchronized (this) {
            if (this.u) {
                throw new IOException("closed");
            }
            r(0, 8, 6, z ? 1 : 0);
            this.r.writeInt(i);
            this.r.writeInt(i2);
            this.r.flush();
        }
    }

    public final void F(int i, a aVar) {
        synchronized (this) {
            if (this.u) {
                throw new IOException("closed");
            }
            if (aVar.r == -1) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            r(i, 4, 3, 0);
            this.r.writeInt(aVar.r);
            this.r.flush();
        }
    }

    public final void K(int i, long j) {
        synchronized (this) {
            try {
                if (this.u) {
                    throw new IOException("closed");
                }
                if (j == 0 || j > 2147483647L) {
                    throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j).toString());
                }
                Logger logger = w;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(g.c(false, i, 4, j));
                }
                r(i, 4, 8, 0);
                this.r.writeInt((int) j);
                this.r.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            this.u = true;
            this.r.close();
        }
    }

    public final void f(a0 a0Var) {
        k71.k.g(a0Var, "peerSettings");
        synchronized (this) {
            try {
                if (this.u) {
                    throw new IOException("closed");
                }
                int i = this.t;
                int i2 = a0Var.a;
                if ((i2 & 32) != 0) {
                    i = a0Var.b[5];
                }
                this.t = i;
                if (((i2 & 2) != 0 ? a0Var.b[1] : -1) != -1) {
                    e eVar = this.v;
                    int i3 = (i2 & 2) != 0 ? a0Var.b[1] : -1;
                    eVar.getClass();
                    int min = Math.min(i3, 16384);
                    int i4 = eVar.d;
                    if (i4 != min) {
                        if (min < i4) {
                            eVar.b = Math.min(eVar.b, min);
                        }
                        eVar.c = true;
                        eVar.d = min;
                        int i5 = eVar.h;
                        if (min < i5) {
                            if (min == 0) {
                                cShadow[] cVarArr = eVar.e;
                                x61.l.G(0, cVarArr.length, (Object) null, cVarArr);
                                eVar.f = eVar.e.length - 1;
                                eVar.g = 0;
                                eVar.h = 0;
                            } else {
                                eVar.a(i5 - min);
                            }
                        }
                    }
                }
                r(0, 0, 4, 1);
                this.r.flush();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void flush() {
        synchronized (this) {
            if (this.u) {
                throw new IOException("closed");
            }
            this.r.flush();
        }
    }

    public final void m(boolean z, int i, h91.h hVar, int i2) {
        synchronized (this) {
            if (this.u) {
                throw new IOException("closed");
            }
            r(i, i2, 0, z ? 1 : 0);
            if (i2 > 0) {
                h91.i iVar = this.r;
                k71.k.d(hVar);
                iVar.I0(hVar, i2);
            }
        }
    }

    public final void r(int i, int i2, int i3, int i4) {
        if (i3 != 8) {
            Level level = Level.FINE;
            Logger logger = w;
            if (logger.isLoggable(level)) {
                logger.fine(g.b(false, i, i2, i3, i4));
            }
        }
        if (i2 > this.t) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.t + ": " + i2).toString());
        }
        if ((Integer.MIN_VALUE & i) != 0) {
            throw new IllegalArgumentException(no.a.k("reserved bit set: ", i).toString());
        }
        byte[] bArr = r81.e.a;
        h91.i iVar = this.r;
        k71.k.g(iVar, "<this>");
        iVar.writeByte((i2 >>> 16) & 255);
        iVar.writeByte((i2 >>> 8) & 255);
        iVar.writeByte(i2 & 255);
        iVar.writeByte(i3 & 255);
        iVar.writeByte(i4 & 255);
        iVar.writeInt(i & Integer.MAX_VALUE);
    }

    public final void t(int i, a aVar, byte[] bArr) {
        synchronized (this) {
            if (this.u) {
                throw new IOException("closed");
            }
            if (aVar.r == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            r(0, bArr.length + 8, 7, 0);
            this.r.writeInt(i);
            this.r.writeInt(aVar.r);
            if (bArr.length != 0) {
                this.r.write(bArr);
            }
            this.r.flush();
        }
    }
}
