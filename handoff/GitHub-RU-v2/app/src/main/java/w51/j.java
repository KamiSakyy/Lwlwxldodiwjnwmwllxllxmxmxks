package w51;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Base64;
import android.util.Log;
import d1.e0;
import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;
import v8.j0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class j {
    public static final Object c = new Object();
    public static d0 d;
    public final Object a;
    public final Object b;

    public j(ExecutorService executorService) {
        this.b = new x.e(0);
        this.a = executorService;
    }

    public static w21.o a(Context context, Intent intent, boolean z) {
        d0 d0Var;
        Log.isLoggable("FirebaseMessaging", 3);
        synchronized (c) {
            try {
                if (d == null) {
                    d = new d0(context);
                }
                d0Var = d;
            } finally {
            }
        }
        if (!z) {
            return d0Var.b(intent).e(new i7.c(0), new m11.r(20));
        }
        if (r.C().G(context)) {
            synchronized (z.b) {
                try {
                    z.a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        z.c.a(z.a);
                    }
                    d0Var.b(intent).b(new c5.b(29, intent));
                } finally {
                }
            }
        } else {
            d0Var.b(intent);
        }
        return t.q.k(-1);
    }

    public w21.o b(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.a;
        Executor executor = (i7.c) this.b;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        if (z && !z2) {
            return a(context, intent, z2);
        }
        final int i = 0;
        return t.q.f(executor, new Callable() { // from class: w51.h
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String str;
                ServiceInfo serviceInfo;
                String str2;
                int i2;
                boolean z3 = false;
                switch (i) {
                    case 0:
                        Context context2 = (Context) context;
                        Intent intent2 = (Intent) intent;
                        r C = r.C();
                        C.getClass();
                        Log.isLoggable("FirebaseMessaging", 3);
                        ((ArrayDeque) C.v).offer(intent2);
                        Intent intent3 = new Intent("com.google.firebase.MESSAGING_EVENT");
                        intent3.setPackage(context2.getPackageName());
                        synchronized (C) {
                            try {
                                str = (String) C.s;
                                if (str == null) {
                                    ResolveInfo resolveService = context2.getPackageManager().resolveService(intent3, 0);
                                    str = null;
                                    if (resolveService != null && (serviceInfo = resolveService.serviceInfo) != null) {
                                        if (context2.getPackageName().equals(serviceInfo.packageName) && (str2 = serviceInfo.name) != null) {
                                            if (str2.startsWith(".")) {
                                                C.s = context2.getPackageName() + serviceInfo.name;
                                            } else {
                                                C.s = serviceInfo.name;
                                            }
                                            str = (String) C.s;
                                        }
                                    }
                                }
                            } finally {
                            }
                        }
                        if (str != null) {
                            Log.isLoggable("FirebaseMessaging", 3);
                            intent3.setClassName(context2.getPackageName(), str);
                        }
                        try {
                            i2 = (C.G(context2) ? z.c(context2, intent3) : context2.startService(intent3)) == null ? 404 : -1;
                        } catch (IllegalStateException e) {
                            e.toString();
                            i2 = 402;
                        } catch (SecurityException unused) {
                            i2 = 401;
                        }
                        return Integer.valueOf(i2);
                    default:
                        w8.v vVar = (w8.x) context;
                        w8.a0 a0Var = (w8.a0) intent;
                        d9.q qVar = a0Var.a;
                        String str3 = a0Var.c;
                        d9.t tVar = a0Var.i;
                        if (!(vVar instanceof w8.v)) {
                            if (vVar instanceof w8.u) {
                                a0Var.d(((w8.u) vVar).a);
                            } else {
                                if (!(vVar instanceof w8.w)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                int i3 = ((w8.w) vVar).a;
                                if (k71.k.b(qVar.y, Boolean.TRUE)) {
                                    int i4 = w8.b0.a;
                                    v8.x.a().getClass();
                                    a0Var.b(i3);
                                } else {
                                    j0 d2 = tVar.d(str3);
                                    if (d2 == null || d2.a()) {
                                        int i5 = w8.b0.a;
                                        v8.x a = v8.x.a();
                                        Objects.toString(d2);
                                        a.getClass();
                                    } else {
                                        int i6 = w8.b0.a;
                                        v8.x a2 = v8.x.a();
                                        d2.toString();
                                        a2.getClass();
                                        tVar.j(j0.r, str3);
                                        tVar.k(str3, i3);
                                        tVar.g(str3, -1L);
                                    }
                                }
                                z3 = true;
                            }
                            return Boolean.valueOf(z3);
                        }
                        v8.u uVar = vVar.a;
                        j0 d3 = tVar.d(str3);
                        d9.n x = a0Var.h.x();
                        x.getClass();
                        m71.a.L(x.a, false, true, new d9.m(str3, 0));
                        if (d3 != null) {
                            if (d3 == j0.s) {
                                if (uVar instanceof v8.u) {
                                    int i7 = w8.b0.a;
                                    v8.x.a().getClass();
                                    if (qVar.b()) {
                                        a0Var.c();
                                    } else {
                                        tVar.j(j0.t, str3);
                                        v8.i iVar = uVar.a;
                                        k71.k.f(iVar, "getOutputData(...)");
                                        m71.a.L(tVar.a, false, true, new e0(10, iVar, str3));
                                        a0Var.f.getClass();
                                        long currentTimeMillis = System.currentTimeMillis();
                                        d9.b bVar = a0Var.j;
                                        for (String str4 : bVar.a(str3)) {
                                            if (tVar.d(str4) == j0.v && ((Boolean) m71.a.L(bVar.a, true, false, new com.github.rudroid.uitoolkit.listitems.z(str4, 26))).booleanValue()) {
                                                int i8 = w8.b0.a;
                                                v8.x.a().getClass();
                                                tVar.j(j0.r, str4);
                                                tVar.i(str4, currentTimeMillis);
                                            }
                                        }
                                    }
                                } else if (uVar instanceof v8.t) {
                                    int i9 = w8.b0.a;
                                    v8.x.a().getClass();
                                    a0Var.b(-256);
                                    z3 = true;
                                } else {
                                    int i10 = w8.b0.a;
                                    v8.x.a().getClass();
                                    if (qVar.b()) {
                                        a0Var.c();
                                    } else {
                                        a0Var.d(uVar);
                                    }
                                }
                            } else if (!d3.a()) {
                                a0Var.b(-512);
                                z3 = true;
                            }
                        }
                        return Boolean.valueOf(z3);
                }
            }
        }).f(executor, new w21.a() { // from class: w51.i
            @Override // w21.a
            public final Object c(w21.o oVar) {
                return ((Integer) oVar.h()).intValue() != 402 ? oVar : j.a(context, intent, z2).e(new i7.c(0), new m11.r(19));
            }
        });
    }

    public j(Context context) {
        this.a = context;
        this.b = new i7.c(0);
    }
}
