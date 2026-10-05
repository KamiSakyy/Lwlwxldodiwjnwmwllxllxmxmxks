package c21;

import android.accounts.Account;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final z11.d[] x = new z11.d[0];
    public h0 b;
    public final Context c;
    public final g0 d;
    public final z11.f e;
    public final w f;
    public q i;
    public d j;
    public IInterface k;
    public y m;
    public final b o;
    public final c p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public z11.b t = null;
    public boolean u = false;
    public volatile b0 v = null;
    public final AtomicInteger w = new AtomicInteger(0);

    public e(Context context, Looper looper, g0 g0Var, z11.f fVar, int i, b bVar, c cVar, String str) {
        u.h(context, "Context must not be null");
        this.c = context;
        u.h(looper, "Looper must not be null");
        u.h(g0Var, "Supervisor must not be null");
        this.d = g0Var;
        u.h(fVar, "API availability must not be null");
        this.e = fVar;
        this.f = new w(this, looper);
        this.q = i;
        this.o = bVar;
        this.p = cVar;
        this.r = str;
    }

    public final void b(String str) {
        this.a = str;
        f();
    }

    public final boolean c() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public final void d() {
        if (!g() || this.b == null) {
            throw new RuntimeException("Failed to connect when checking package");
        }
    }

    public final void e(d dVar) {
        this.j = dVar;
        z(2, null);
    }

    public final void f() {
        this.w.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    p pVar = (p) arrayList.get(i);
                    synchronized (pVar) {
                        pVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        z(1, null);
    }

    public final boolean g() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public abstract int h();

    public final z11.d[] i() {
        b0 b0Var = this.v;
        if (b0Var == null) {
            return null;
        }
        return b0Var.s;
    }

    public final String j() {
        return this.a;
    }

    public final void k(h hVar, Set set) {
        Bundle s = s();
        String str = Build.VERSION.SDK_INT < 31 ? this.s : this.s;
        int i = this.q;
        int i2 = z11.f.a;
        Scope[] scopeArr = g.F;
        Bundle bundle = new Bundle();
        z11.d[] dVarArr = g.G;
        g gVar = new g(6, i, i2, null, null, scopeArr, bundle, null, dVarArr, dVarArr, true, 0, false, str);
        gVar.u = this.c.getPackageName();
        gVar.x = s;
        if (set != null) {
            gVar.w = (Scope[]) set.toArray(new Scope[0]);
        }
        if (l()) {
            Account q = q();
            if (q == null) {
                q = new Account("<<default account>>", "com.google");
            }
            gVar.y = q;
            if (hVar != null) {
                gVar.v = hVar.asBinder();
            }
        }
        gVar.z = x;
        gVar.A = r();
        try {
            try {
                synchronized (this.h) {
                    try {
                        q qVar = this.i;
                        if (qVar != null) {
                            qVar.e(new x(this, this.w.get()), gVar);
                        }
                    } finally {
                    }
                }
            } catch (RemoteException | RuntimeException unused) {
                int i3 = this.w.get();
                z zVar = new z(this, 8, null, null);
                w wVar = this.f;
                wVar.sendMessage(wVar.obtainMessage(1, i3, -1, zVar));
            }
        } catch (DeadObjectException unused2) {
            int i4 = this.w.get();
            w wVar2 = this.f;
            wVar2.sendMessage(wVar2.obtainMessage(6, i4, 3));
        } catch (SecurityException e) {
            throw e;
        }
    }

    public boolean l() {
        return false;
    }

    public final void m(y51.c cVar) {
        ((b21.j) cVar.s).p.D.post(new androidx.fragment.app.o(5, cVar));
    }

    public final void o() {
        int b = this.e.b(this.c, h());
        if (b == 0) {
            e(new y51.c(this));
            return;
        }
        z(1, null);
        this.j = new y51.c(this);
        int i = this.w.get();
        w wVar = this.f;
        wVar.sendMessage(wVar.obtainMessage(3, i, b, null));
    }

    public abstract IInterface p(IBinder iBinder);

    public Account q() {
        return null;
    }

    public z11.d[] r() {
        return x;
    }

    public Bundle s() {
        return new Bundle();
    }

    public Set t() {
        return Collections.EMPTY_SET;
    }

    public final IInterface u() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!g()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                IInterface iInterface2 = this.k;
                u.h(iInterface2, "Client is connected but service is null");
                iInterface = iInterface2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String v();

    public abstract String w();

    public boolean x() {
        return h() >= 211700000;
    }

    public final /* synthetic */ boolean y(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                z(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void z(int i, IInterface iInterface) {
        h0 h0Var;
        u.b((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    y yVar = this.m;
                    if (yVar != null) {
                        g0 g0Var = this.d;
                        String str = this.b.b;
                        u.g(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        g0Var.c(str, yVar, this.b.c);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    y yVar2 = this.m;
                    if (yVar2 != null && (h0Var = this.b) != null) {
                        new StringBuilder(String.valueOf(h0Var.b).length() + 70 + "com.google.android.gms".length());
                        g0 g0Var2 = this.d;
                        String str2 = this.b.b;
                        u.g(str2);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        g0Var2.c(str2, yVar2, this.b.c);
                        this.w.incrementAndGet();
                    }
                    y yVar3 = new y(this, this.w.get());
                    this.m = yVar3;
                    String w = w();
                    boolean x2 = x();
                    this.b = new h0(0, w, x2);
                    if (x2 && h() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.b)));
                    }
                    g0 g0Var3 = this.d;
                    String str3 = this.b.b;
                    u.g(str3);
                    this.b.getClass();
                    String str4 = this.r;
                    if (str4 == null) {
                        str4 = this.c.getClass().getName();
                    }
                    z11.b b = g0Var3.b(new d0(str3, this.b.c), yVar3, str4, null);
                    if (!(b.s == 0)) {
                        new StringBuilder(String.valueOf(this.b.b).length() + 34 + "com.google.android.gms".length());
                        int i2 = b.s;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (b.t != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", b.t);
                        }
                        int i3 = this.w.get();
                        a0 a0Var = new a0(this, i2, bundle);
                        w wVar = this.f;
                        wVar.sendMessage(wVar.obtainMessage(7, i3, -1, a0Var));
                    }
                } else if (i == 4) {
                    u.g(iInterface);
                    IInterface iInterface2 = iInterface;
                    System.currentTimeMillis();
                }
            } finally {
            }
        }
    }
}
