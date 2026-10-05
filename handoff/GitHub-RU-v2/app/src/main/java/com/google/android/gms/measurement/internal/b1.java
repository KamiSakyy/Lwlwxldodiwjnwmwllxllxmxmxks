package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Handler;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 {
    public long a;
    public Object b;
    public Object c;
    public Object d;
    public final Object e;

    public b1(s21.a aVar, v2.t tVar) {
        k71.k.g(aVar, "runnableScheduler");
        long millis = TimeUnit.MINUTES.toMillis(90L);
        this.b = aVar;
        this.c = tVar;
        this.a = millis;
        this.d = new Object();
        this.e = new LinkedHashMap();
    }

    public void a(w8.g gVar) {
        Runnable runnable;
        k71.k.g(gVar, "token");
        synchronized (this.d) {
            runnable = (Runnable) ((LinkedHashMap) this.e).remove(gVar);
        }
        if (runnable != null) {
            ((Handler) ((s21.a) this.b).s).removeCallbacks(runnable);
        }
    }

    public void b(w8.g gVar) {
        k71.k.g(gVar, "token");
        Runnable fVar = new b9.f(22, this, gVar);
        synchronized (this.d) {
        }
        s21.a aVar = (s21.a) this.b;
        ((Handler) aVar.s).postDelayed(fVar, this.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007e, code lost:
    
        if (r2 < java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.c0.j.a(null)).intValue())) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
    
        if (r2 >= java.lang.Math.max(0, ((java.lang.Integer) com.google.android.gms.measurement.internal.c0.j.a(null)).intValue())) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean c(long j, com.google.android.gms.internal.measurement.b3 b3Var) {
        if (((ArrayList) this.d) == null) {
            this.d = new ArrayList();
        }
        if (((ArrayList) this.c) == null) {
            this.c = new ArrayList();
        }
        if (((ArrayList) this.d).isEmpty() || ((((com.google.android.gms.internal.measurement.b3) ((ArrayList) this.d).get(0)).u() / 1000) / 60) / 60 == ((b3Var.u() / 1000) / 60) / 60) {
            long k = this.a + b3Var.k();
            o4 o4Var = (o4) this.e;
            if (o4Var.e0().J(null, c0.d1)) {
                if (!((ArrayList) this.d).isEmpty()) {
                    o4Var.e0();
                }
                this.a = k;
                ((ArrayList) this.d).add(b3Var);
                ((ArrayList) this.c).add(Long.valueOf(j));
                int size = ((ArrayList) this.d).size();
                o4Var.e0();
                if (size < Math.max(1, ((Integer) c0.k.a(null)).intValue())) {
                    return true;
                }
            } else {
                o4Var.e0();
            }
        }
        return false;
    }

    public void d() {
        c1 c1Var = (c1) this.e;
        c1Var.z();
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) c1Var).s).B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = c1Var.D().edit();
        edit.remove((String) this.c);
        edit.remove((String) this.d);
        edit.putLong((String) this.b, currentTimeMillis);
        edit.apply();
    }

    public /* synthetic */ b1(c1 c1Var, long j) {
        this.e = c1Var;
        c21.u.d("health_monitor");
        c21.u.b(j > 0);
        this.b = "health_monitor:start";
        this.c = "health_monitor:count";
        this.d = "health_monitor:value";
        this.a = j;
    }

    public /* synthetic */ b1(o4 o4Var) {
        this.e = o4Var;
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class m<T1,T2,T3,T4> {
        public m() {
        }
    }
}
