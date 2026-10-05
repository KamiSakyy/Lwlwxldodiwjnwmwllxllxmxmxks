package h91;

import java.util.concurrent.locks.ReentrantLock;

/* loaded from: /home/user/work/p/classes5.dex */
public final class m implements i0 {
    public final v r;
    public long s;
    public boolean t;

    public m(v vVar) {
        k71.k.g(vVar, "fileHandle");
        this.r = vVar;
        this.s = 0L;
    }

    @Override // h91.i0
    public final void I0(h hVar, long j) {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.r;
        long j2 = this.s;
        vVar.getClass();
        b.e(hVar.s, 0L, j);
        long j3 = j2 + j;
        while (j2 < j3) {
            f0 f0Var = hVar.r;
            k71.k.d(f0Var);
            int min = (int) Math.min(j3 - j2, f0Var.c - f0Var.b);
            byte[] bArr = f0Var.a;
            int i = f0Var.b;
            synchronized (vVar) {
                k71.k.g(bArr, "array");
                vVar.v.seek(j2);
                vVar.v.write(bArr, i, min);
            }
            int i2 = f0Var.b + min;
            f0Var.b = i2;
            long j4 = min;
            j2 += j4;
            hVar.s -= j4;
            if (i2 == f0Var.c) {
                hVar.r = f0Var.a();
                g0.a(f0Var);
            }
        }
        this.s += j;
    }

    @Override // h91.i0
    public final m0 b() {
        return m0.d;
    }

    @Override // h91.i0, java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel
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

    @Override // h91.i0, java.io.Flushable
    public final void flush() {
        if (this.t) {
            throw new IllegalStateException("closed");
        }
        v vVar = this.r;
        synchronized (vVar) {
            vVar.v.getFD().sync();
        }
    }
}
