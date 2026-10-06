package x81;

import f1.b3;
import h91.d0;
import h91.e0;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import k.h0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class o implements Closeable {
    public static final a0 R;
    public t81.c A;
    public z B;
    public long C;
    public long D;
    public long E;
    public long F;
    public long G;
    public b H;
    public a0 I;
    public a0 J;
    public h0 K;
    public long L;
    public long M;
    public l51.h N;
    public x O;
    public n P;
    public LinkedHashSet Q;
    public l r;
    public final LinkedHashMap s = new LinkedHashMap();
    public String t;
    public int u;
    public int v;
    public boolean w;
    public t81.e x;
    public t81.c y;
    public t81.c z;

    static {
        a0 a0Var = new a0();
        a0Var.c(4, 65535);
        a0Var.c(5, 16384);
        R = a0Var;
    }

    public o(l7.b bVar) {
        this.r = (l) bVar.e;
        String str = (String) bVar.d;
        if (str == null) {
            k71.k.m("connectionName");
            throw null;
        }
        this.t = str;
        this.v = 3;
        t81.e eVar = (t81.e) bVar.b;
        this.x = eVar;
        t81.c d = eVar.d();
        this.y = d;
        this.z = eVar.d();
        this.A = eVar.d();
        this.B = z.a;
        this.H = (b) bVar.f;
        a0 a0Var = new a0();
        a0Var.c(4, 16777216);
        this.I = a0Var;
        this.J = R;
        this.K = new h0(0);
        this.M = r2.a();
        l51.h hVar = (l51.h) bVar.c;
        if (hVar == null) {
            k71.k.m("socket");
            throw null;
        }
        this.N = hVar;
        this.O = new x((d0) hVar.u);
        this.P = new n(this, new s((e0) hVar.t));
        this.Q = new LinkedHashSet();
        int i = bVar.a;
        if (i != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(i);
            String concat = str.concat(" ping");
            b3 b3Var = new b3(3, nanos, this);
            k71.k.g(concat, "name");
            d.c(new t81.b(concat, b3Var), nanos);
        }
    }

    public final void A(long j) {
        synchronized (this) {
            try {
                h0.c(this.K, j, 0L, 2);
                long b = this.K.b();
                if (b >= this.I.a() / 2) {
                    K(0, b);
                    h0.c(this.K, 0L, b, 1);
                }
                b bVar = this.H;
                h0 h0Var = this.K;
                bVar.getClass();
                k71.k.g(h0Var, "windowCounter");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.O.t);
        r6 = r2;
        r8.L += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void E(int i, boolean z, h91.h hVar, long j) {
        int min;
        long j2;
        if (j == 0) {
            this.O.m(z, i, hVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j3 = this.L;
                            long j4 = this.M;
                            if (j3 < j4) {
                                break;
                            } else {
                                if (!this.s.containsKey(Integer.valueOf(i))) {
                                    throw new IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                            throw new InterruptedIOException();
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            j -= j2;
            this.O.m(z && j == 0, i, hVar, min);
        }
    }

    public final void F(int i, a aVar) {
        t81.c.b(this.y, this.t + '[' + i + "] writeSynReset", 0L, new com.github.rudroid.repository.file.f(this, i, aVar, 2), 6);
    }

    public final void K(final int i, final long j) {
        t81.c.b(this.y, this.t + '[' + i + "] windowUpdate", 0L, new j71.a() { // from class: x81.h
            public final Object a() {
                o oVar = o.this;
                try {
                    oVar.O.K(i, j);
                } catch (IOException e) {
                    a aVar = a.u;
                    oVar.f(aVar, aVar, e);
                }
                return w61.a0.a;
            }
        }, 6);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        f(a.t, a.y, null);
    }

    public final void f(a aVar, a aVar2, IOException iOException) {
        int i;
        Object[] objArr;
        TimeZone timeZone = r81.g.a;
        try {
            t(aVar);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.s.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.s.values().toArray(new w[0]);
                this.s.clear();
            }
        }
        w[] wVarArr = (w[]) objArr;
        if (wVarArr != null) {
            for (w wVar : wVarArr) {
                try {
                    wVar.e(aVar2, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.O.close();
        } catch (IOException unused3) {
        }
        try {
            this.N.cancel();
        } catch (IOException unused4) {
        }
        this.y.e();
        this.z.e();
        this.A.e();
    }

    public final void flush() {
        this.O.flush();
    }

    public final w m(int i) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.s.get(Integer.valueOf(i));
        }
        return wVar;
    }

    public final w r(int i) {
        w wVar;
        synchronized (this) {
            wVar = (w) this.s.remove(Integer.valueOf(i));
            notifyAll();
        }
        return wVar;
    }

    public final void t(a aVar) {
        synchronized (this.O) {
            synchronized (this) {
                if (this.w) {
                    return;
                }
                this.w = true;
                this.O.t(this.u, aVar, r81.e.a);
            }
        }
    }
    public Object f = null;
    public Object g = null;
    public Object h = null;
    public Object i = null;
}
