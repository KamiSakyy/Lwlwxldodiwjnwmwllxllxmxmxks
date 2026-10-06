package h91;

import com.github.rudroid.copilot.h1;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n implements k0 {
    public final v r;
    public long s;
    public boolean t;

    public n(v vVar, long j) {
        this.r = vVar;
        this.s = j;
    }

    @Override // h91.k0
    public final long U(h hVar, long j) {
        long j2;
        long j3;
        int i;
        k71.k.g(hVar, "sink");
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.r;
        long j4 = this.s;
        if (j < 0) {
            throw new IllegalArgumentException(h1.m("byteCount < 0: ", j).toString());
        }
        long j5 = j + j4;
        long j6 = j4;
        while (true) {
            if (j6 >= j5) {
                j2 = -1;
                break;
            }
            f0 x0 = hVar.x0(1);
            byte[] bArr = x0.a;
            int i2 = x0.c;
            j2 = -1;
            int min = (int) Math.min(j5 - j6, 8192 - i2);
            synchronized (vVar) {
                k71.k.g(bArr, "array");
                vVar.v.seek(j6);
                i = 0;
                while (true) {
                    if (i >= min) {
                        break;
                    }
                    int read = vVar.v.read(bArr, i2, min - i);
                    if (read != -1) {
                        i += read;
                    } else if (i == 0) {
                        i = -1;
                    }
                }
            }
            if (i == -1) {
                if (x0.b == x0.c) {
                    hVar.r = x0.a();
                    g0.a(x0);
                }
                if (j4 == j6) {
                    j3 = -1;
                }
            } else {
                x0.c += i;
                long j7 = i;
                j6 += j7;
                hVar.s += j7;
            }
        }
        j3 = j6 - j4;
        if (j3 != j2) {
            this.s += j3;
        }
        return j3;
    }

    @Override // h91.k0
    public final m0 b() {
        return m0.d;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        v vVar = this.r;
        if (this.t) {
            return;
        }
        this.t = true;
        ReentrantLock reentrantLock = vVar.u;
        reentrantLock.lock();
        try {
            int i = vVar.t - 1;
            vVar.t = i;
            if (i == 0) {
                if (vVar.s) {
                    synchronized (vVar) {
                        vVar.v.close();
                    }
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }
}
