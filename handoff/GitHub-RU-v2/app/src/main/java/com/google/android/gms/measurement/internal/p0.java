package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import java.io.IOException;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p0 implements Runnable {
    public final /* synthetic */ int r = 0;
    public int s;
    public String t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;

    public p0(s0 s0Var, int i, String str, Object obj, Object obj2, Object obj3) {
        this.s = i;
        this.t = str;
        this.u = obj;
        this.v = obj2;
        this.w = obj3;
        this.x = s0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                s0 s0Var = (s0) this.x;
                c1 c1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) s0Var).s).v;
                o1.k(c1Var);
                if (!c1Var.t) {
                    Log.println(6, s0Var.J(), "Persisted config not initialized. Not logging error/warn");
                    return;
                }
                if (s0Var.u == 0) {
                    h hVar = ((o1) ((androidx.compose.foundation.lazy.layout.s0) s0Var).s).u;
                    if (hVar.w == null) {
                        synchronized (hVar) {
                            try {
                                if (hVar.w == null) {
                                    o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) hVar).s;
                                    ApplicationInfo applicationInfo = o1Var.r.getApplicationInfo();
                                    String a = g21.c.a();
                                    if (applicationInfo != null) {
                                        String str = applicationInfo.processName;
                                        hVar.w = Boolean.valueOf(str != null && str.equals(a));
                                    }
                                    if (hVar.w == null) {
                                        hVar.w = Boolean.TRUE;
                                        s0 s0Var2 = o1Var.w;
                                        o1.m(s0Var2);
                                        s0Var2.x.a("My process not in the list of running processes");
                                    }
                                }
                            } finally {
                            }
                        }
                    }
                    if (hVar.w.booleanValue()) {
                        s0Var.u = 'C';
                    } else {
                        s0Var.u = 'c';
                    }
                }
                if (s0Var.v < 0) {
                    ((o1) ((androidx.compose.foundation.lazy.layout.s0) s0Var).s).u.E();
                    s0Var.v = 133005L;
                }
                int i = this.s;
                char c = s0Var.u;
                long j = s0Var.v;
                String str2 = this.t;
                Object obj = this.u;
                Object obj2 = this.v;
                Object obj3 = this.w;
                char charAt = "01VDIWEA?".charAt(i);
                String K = s0.K(true, str2, obj, obj2, obj3);
                StringBuilder sb = new StringBuilder(String.valueOf(charAt).length() + 1 + String.valueOf(c).length() + String.valueOf(j).length() + 1 + K.length());
                sb.append("2");
                sb.append(charAt);
                sb.append(c);
                sb.append(j);
                sb.append(":");
                sb.append(K);
                String sb2 = sb.toString();
                if (sb2.length() > 1024) {
                    sb2 = str2.substring(0, 1024);
                }
                b1 b1Var = c1Var.w;
                if (b1Var != null) {
                    String str3 = (String) b1Var.d;
                    c1 c1Var2 = (c1) b1Var.e;
                    c1Var2.z();
                    if (((c1) b1Var.e).D().getLong((String) b1Var.b, 0L) == 0) {
                        b1Var.d();
                    }
                    if (sb2 == null) {
                        sb2 = "";
                    }
                    SharedPreferences D = c1Var2.D();
                    String str4 = (String) b1Var.c;
                    long j2 = D.getLong(str4, 0L);
                    if (j2 <= 0) {
                        SharedPreferences.Editor edit = c1Var2.D().edit();
                        edit.putString(str3, sb2);
                        edit.putLong(str4, 1L);
                        edit.apply();
                        return;
                    }
                    t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) c1Var2).s).z;
                    o1.k(t4Var);
                    long nextLong = t4Var.x0().nextLong() & Long.MAX_VALUE;
                    long j3 = j2 + 1;
                    long j4 = Long.MAX_VALUE / j3;
                    SharedPreferences.Editor edit2 = c1Var2.D().edit();
                    if (nextLong < j4) {
                        edit2.putString(str3, sb2);
                    }
                    edit2.putLong(str4, j3);
                    edit2.apply();
                    return;
                }
                return;
            default:
                ((u0) this.u).b(this.t, this.s, (Throwable) this.v, (byte[]) this.w, (Map) this.x);
                return;
        }
    }

    public /* synthetic */ p0(String str, u0 u0Var, int i, IOException iOException, byte[] bArr, Map map) {
        c21.uShadow.g(u0Var);
        this.u = u0Var;
        this.s = i;
        this.v = iOException;
        this.w = bArr;
        this.t = str;
        this.x = map;
    }
}
