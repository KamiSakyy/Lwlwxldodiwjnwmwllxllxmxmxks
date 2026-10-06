package fa1;

import androidx.lifecycle.l1;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes5.dex */
public final class z implements e {
    public p0 r;
    public Object s;
    public Object[] t;
    public q81.d u;
    public n v;
    public volatile boolean w;
    public u81.m x;
    public Throwable y;
    public boolean z;

    public z(p0 p0Var, Object obj, Object[] objArr, q81.d dVar, n nVar) {
        this.r = p0Var;
        this.s = obj;
        this.t = objArr;
        this.u = dVar;
        this.v = nVar;
    }

    public final u81.m a() {
        q81.o c;
        p0 p0Var = this.r;
        x0[] x0VarArr = p0Var.k;
        Object[] objArr = this.t;
        int length = objArr.length;
        if (length != x0VarArr.length) {
            throw new IllegalArgumentException(a0.s0.l(x.i.o("Argument count (", length, ") doesn't match expected count ("), x0VarArr.length, ")"));
        }
        n0 n0Var = new n0(p0Var.d, p0Var.c, p0Var.e, p0Var.f, p0Var.g, p0Var.h, p0Var.i, p0Var.j);
        if (p0Var.l) {
            length--;
        }
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            arrayList.add(objArr[i]);
            x0VarArr[i].a(n0Var, objArr[i]);
        }
        l7.e eVar = n0Var.d;
        if (eVar != null) {
            c = eVar.c();
        } else {
            String str = n0Var.c;
            q81.o oVar = n0Var.b;
            oVar.getClass();
            k71.k.g(str, "link");
            l7.e f = oVar.f(str);
            c = f != null ? f.c() : null;
            if (c == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + oVar + ", Relative: " + n0Var.c);
            }
        }
        q81.y yVar = n0Var.k;
        if (yVar == null) {
            q81.k kVar = n0Var.j;
            if (kVar != null) {
                yVar = new q81.l(kVar.a, kVar.b);
            } else {
                l51.h hVar = n0Var.i;
                if (hVar != null) {
                    ArrayList arrayList2 = (ArrayList) hVar.u;
                    if (arrayList2.isEmpty()) {
                        throw new IllegalStateException("Multipart body must have at least one part.");
                    }
                    yVar = new q81.s((h91.k) hVar.s, (q81.q) hVar.t, r81.g.j(arrayList2));
                } else if (n0Var.h) {
                    q81.y.Companion.getClass();
                    long j = 0;
                    r81.e.a(j, j, j);
                    yVar = new q81.w(null, 0, new byte[0]);
                }
            }
        }
        q81.q qVar = n0Var.g;
        ia.d dVar = n0Var.f;
        if (qVar != null) {
            if (yVar != null) {
                yVar = new m0(yVar, qVar);
            } else {
                dVar.a("Content-Type", qVar.a);
            }
        }
        l1 l1Var = n0Var.e;
        l1Var.getClass();
        l1Var.r = c;
        l1Var.t = dVar.e().d();
        l1Var.z(n0Var.a, yVar);
        l1Var.G(t.class, new t(p0Var.a, this.s, p0Var.b, arrayList));
        return ((q81.u) this.u).b(new androidx.lifecycle.b(l1Var));
    }

    public final u81.m b() {
        u81.m mVar = this.x;
        if (mVar != null) {
            return mVar;
        }
        Throwable th = this.y;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            u81.m a = a();
            this.x = a;
            return a;
        } catch (IOException | Error | RuntimeException e) {
            x0.r(e);
            this.y = e;
            throw e;
        }
    }

    public final q0 c(q81.a0 a0Var) {
        q81.c0 c0Var = a0Var.x;
        q81.z f = a0Var.f();
        f.g = new y(c0Var.m(), c0Var.f());
        q81.a0 a = f.a();
        boolean z = a.H;
        int i = a.u;
        if (i < 200 || i >= 300) {
            try {
                h91.h hVar = new h91.h();
                c0Var.r().s(hVar);
                q81.q m = c0Var.m();
                long f2 = c0Var.f();
                q81.b0 b0Var = q81.c0.r;
                q81.b0 b0Var2 = new q81.b0(m, f2, hVar);
                if (z) {
                    throw new IllegalArgumentException("rawResponse should not be successful response");
                }
                return new q0(a, null, b0Var2);
            } finally {
                c0Var.close();
            }
        }
        if (i == 204 || i == 205) {
            if (z) {
                return new q0(a, null, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        }
        x xVar = new x(c0Var);
        try {
            Object d = this.v.d(xVar);
            if (z) {
                return new q0(a, d, null);
            }
            throw new IllegalArgumentException("rawResponse must be successful response");
        } catch (RuntimeException e) {
            IOException iOException = xVar.u;
            if (iOException == null) {
                throw e;
            }
            throw iOException;
        }
    }

    @Override // fa1.e
    public final void cancel() {
        u81.m mVar;
        this.w = true;
        synchronized (this) {
            mVar = this.x;
        }
        if (mVar != null) {
            mVar.cancel();
        }
    }

    @Override // fa1.e
    /* renamed from: clone */
    public final e m0clone() {
        return new z(this.r, this.s, this.t, this.u, this.v);
    }

    @Override // fa1.e
    public final boolean f() {
        boolean z = true;
        if (this.w) {
            return true;
        }
        synchronized (this) {
            try {
                u81.m mVar = this.x;
                if (mVar == null || !mVar.H) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // fa1.e
    public final void m(h hVar) {
        u81.m mVar;
        Throwable th;
        synchronized (this) {
            try {
                if (this.z) {
                    throw new IllegalStateException("Already executed.");
                }
                this.z = true;
                mVar = this.x;
                th = this.y;
                if (mVar == null && th == null) {
                    try {
                        u81.m a = a();
                        this.x = a;
                        mVar = a;
                    } catch (Throwable th2) {
                        th = th2;
                        x0.r(th);
                        this.y = th;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        if (th != null) {
            hVar.s(this, th);
            return;
        }
        if (this.w) {
            mVar.cancel();
        }
        mVar.d(new e51.a(5, this, hVar));
    }

    @Override // fa1.e
    public final synchronized androidx.lifecycle.b t() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return b().s;
    }

    /* renamed from: clone, reason: collision with other method in class */
    public final Object m1clone() {
        return new z(this.r, this.s, this.t, this.u, this.v);
    }
    public Object C = null;
    public Object L = null;
    public Object M = null;
    public Object N = null;
    public Object O = null;
    public Object P = null;
    public Object R = null;
    public Object N() { return null; }
    public Object c(Object p1) { return null; }
}
