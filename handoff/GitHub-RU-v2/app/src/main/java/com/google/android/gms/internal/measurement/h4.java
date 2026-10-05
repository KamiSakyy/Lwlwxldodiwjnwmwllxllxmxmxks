package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Binder;
import android.os.Parcel;
import android.os.UserManager;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h4 implements d1.k {
    public static h4 d;
    public boolean a;
    public Object b;
    public Object c;

    public h4(int i) {
        switch (i) {
            case 6:
                this.b = new Object();
                break;
            default:
                this.a = false;
                this.b = null;
                this.c = null;
                break;
        }
    }

    public static h4 h(Context context) {
        h4 h4Var;
        h4 h4Var2;
        synchronized (h4.class) {
            try {
                if (d == null) {
                    if (o4.b.b(context, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0) {
                        h4Var2 = new h4();
                        h4Var2.a = false;
                        h4Var2.b = context;
                        h4Var2.c = new g4(null);
                    } else {
                        h4Var2 = new h4(0);
                    }
                    d = h4Var2;
                }
                h4 h4Var3 = d;
                if (h4Var3 != null && ((g4) h4Var3.c) != null && !h4Var3.a) {
                    try {
                        context.getContentResolver().registerContentObserver(y3.a, true, (g4) d.c);
                        h4 h4Var4 = d;
                        h4Var4.getClass();
                        h4Var4.a = true;
                    } catch (SecurityException unused) {
                    }
                }
                h4Var = d;
                h4Var.getClass();
            } catch (Throwable th) {
                throw th;
            }
        }
        return h4Var;
    }

    public boolean a(long j) {
        Object obj;
        List list = (List) ((l7.x1) this.c).r;
        int size = list.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj = null;
                break;
            }
            obj = list.get(i);
            if (q2.t.e(((q2.w) obj).a, j)) {
                break;
            }
            i++;
        }
        q2.w wVar = (q2.w) obj;
        if (wVar != null) {
            return wVar.h;
        }
        return false;
    }

    public void b(a21.a aVar, w21.g gVar) {
        com.google.android.gms.measurement.internal.x3 x3Var = (com.google.android.gms.measurement.internal.x3) ((y51.c) this.c).s;
        x3Var.getClass();
        e21.a aVar2 = (e21.a) ((e21.d) aVar).u();
        c21.l lVar = (c21.l) x3Var.s;
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken(aVar2.g);
        int i = m21.a.a;
        if (lVar == null) {
            obtain.writeInt(0);
        } else {
            obtain.writeInt(1);
            lVar.writeToParcel(obtain, 0);
        }
        try {
            aVar2.f.transact(1, obtain, null, 1);
            obtain.recycle();
            gVar.a(null);
        } catch (Throwable th) {
            obtain.recycle();
            throw th;
        }
    }

    public boolean c(long j, d1.y yVar) {
        s0.o0 o0Var;
        d1.z1 z1Var = (d1.z1) this.c;
        if (!z1Var.k() || z1Var.n().a.s.length() == 0 || (o0Var = z1Var.d) == null || o0Var.d() == null) {
            return false;
        }
        g(z1Var.n(), j, false, yVar);
        return true;
    }

    public Set d(Object obj, r71.e eVar) {
        Set set;
        com.github.rudroid.common.a aVar;
        k71.k.g(eVar, "property");
        if (!this.a) {
            Set<String> stringSet = ((SharedPreferences) this.b).getStringSet("capabilities", null);
            if (stringSet != null) {
                ArrayList arrayList = new ArrayList();
                for (String str : stringSet) {
                    try {
                        k71.k.d(str);
                        aVar = com.github.rudroid.common.a.valueOf(str);
                    } catch (IllegalArgumentException unused) {
                        aVar = null;
                    }
                    if (aVar != null) {
                        arrayList.add(aVar);
                    }
                }
                set = x61.m.K0(arrayList);
            } else {
                set = pa.g.a;
            }
            this.c = set;
            this.a = true;
        }
        return (Set) this.c;
    }

    public boolean e(long j) {
        s0.o0 o0Var;
        d1.z1 z1Var = (d1.z1) this.c;
        if (!z1Var.k() || z1Var.n().a.s.length() == 0 || (o0Var = z1Var.d) == null || o0Var.d() == null) {
            return false;
        }
        g(z1Var.n(), j, false, d1.z.d);
        return true;
    }

    public boolean f(long j, d1.y yVar, int i) {
        s0.o0 o0Var;
        d1.z1 z1Var = (d1.z1) this.c;
        if (!z1Var.k() || z1Var.n().a.s.length() == 0 || (o0Var = z1Var.d) == null || o0Var.d() == null) {
            return false;
        }
        b2.a0 a0Var = z1Var.k;
        if (a0Var != null) {
            b2.a0.a(a0Var);
        }
        z1Var.n = j;
        z1Var.s = -1;
        z1Var.h(true);
        long g = g(z1Var.n(), z1Var.n, true, yVar);
        if (i >= 2) {
            this.a = true;
            this.b = new g3.p0(g);
        }
        return true;
    }

    public long g(l3.v vVar, long j, boolean z, d1.y yVar) {
        d1.z1 z1Var = (d1.z1) this.c;
        long c = d1.z1.c(z1Var, vVar, j, z, false, yVar, false);
        if (!g3.p0.a(c, (g3.p0) this.b)) {
            this.a = false;
        }
        z1Var.q(g3.p0.c(c) ? s0.d0.t : s0.d0.s);
        return c;
    }

    public void i() {
        if (this.a) {
            d1.z1.b((d1.z1) this.c, (g3.p0) this.b);
        }
    }

    public void j(w21.n nVar) {
        synchronized (this.b) {
            try {
                if (((ArrayDeque) this.c) == null) {
                    this.c = new ArrayDeque();
                }
                ((ArrayDeque) this.c).add(nVar);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r5.isUserRunning(android.os.Process.myUserHandle()) == false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0041, code lost:
    
        r6 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public String k(String str) {
        Object a;
        int i;
        boolean z;
        Context context = (Context) this.b;
        if (context != null) {
            boolean z2 = true;
            if (!b4.s) {
                synchronized (b4.class) {
                    try {
                        if (!b4.s) {
                            i = 1;
                            while (true) {
                                z = false;
                                if (i <= 2) {
                                    if (b4.r == null) {
                                        b4.r = (UserManager) context.getSystemService(UserManager.class);
                                    }
                                    UserManager userManager = b4.r;
                                    if (userManager != null) {
                                        if (userManager.isUserUnlocked()) {
                                            break;
                                        }
                                    } else {
                                        z = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z) {
                                b4.r = null;
                            }
                            if (z) {
                                b4.s = true;
                            }
                            z2 = z;
                        }
                    } catch (NullPointerException unused) {
                        b4.r = null;
                        i++;
                    } finally {
                    }
                }
            }
            if (z2) {
                try {
                    t tVar = new t(this, str);
                    try {
                        a = tVar.a();
                    } catch (SecurityException unused2) {
                        long clearCallingIdentity = Binder.clearCallingIdentity();
                        try {
                            a = tVar.a();
                        } finally {
                            Binder.restoreCallingIdentity(clearCallingIdentity);
                        }
                    }
                    return (String) a;
                } catch (IllegalStateException | NullPointerException | SecurityException unused3) {
                    "Unable to read GServices for: ".concat(str);
                    return null;
                }
            }
        }
        return null;
    }

    public boolean l(long j) {
        d1.z1 z1Var = (d1.z1) this.c;
        s0.o0 o0Var = z1Var.d;
        if (o0Var == null || o0Var.d() == null || !z1Var.k()) {
            return false;
        }
        z1Var.s = -1;
        b2.a0 a0Var = z1Var.k;
        if (a0Var != null) {
            b2.a0.a(a0Var);
        }
        g(z1Var.n(), j, false, d1.z.d);
        return true;
    }

    public void m(w21.o oVar) {
        w21.n nVar;
        synchronized (this.b) {
            if (((ArrayDeque) this.c) != null && !this.a) {
                this.a = true;
                while (true) {
                    synchronized (this.b) {
                        try {
                            nVar = (w21.n) ((ArrayDeque) this.c).poll();
                            if (nVar == null) {
                                this.a = false;
                                return;
                            }
                        } finally {
                        }
                    }
                    nVar.b(oVar);
                }
            }
        }
    }

    public h4(SharedPreferences sharedPreferences, int i) {
        switch (i) {
            case 4:
                this.b = sharedPreferences;
                break;
            default:
                this.b = sharedPreferences;
                this.c = new LinkedHashSet();
                break;
        }
    }
}
