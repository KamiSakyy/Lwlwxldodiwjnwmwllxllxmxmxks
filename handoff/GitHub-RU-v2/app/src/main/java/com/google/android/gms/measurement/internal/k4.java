package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k4 extends e4 {
    public static final boolean C(String str) {
        String str2 = (String) c0.t.a(null);
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        for (String str3 : str2.split(",")) {
            if (str.equalsIgnoreCase(str3.trim())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x008e, code lost:
    
        if (java.lang.Math.abs(r7.hashCode() % 100) < r9.E().p()) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j4 A(String str) {
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        o4 o4Var = this.t;
        o oVar = o4Var.t;
        i1 i1Var = o4Var.r;
        o4.U(oVar);
        x0 B0 = oVar.B0(str);
        a3 a3Var = a3.s;
        j4 j4Var = null;
        if (B0 == null || !B0.y()) {
            return new j4(B(str), Collections.EMPTY_MAP, a3Var, null);
        }
        com.google.android.gms.internal.measurement.p3 q = com.google.android.gms.internal.measurement.q3.q();
        q.b();
        ((com.google.android.gms.internal.measurement.q3) q.s).v(2);
        int a = com.github.rudroid.copilot.h1.a(B0.t());
        if (a == 0) {
            throw new NullPointerException("null reference");
        }
        q.i(a);
        String E = B0.E();
        o4.U(i1Var);
        com.google.android.gms.internal.measurement.f2 L = i1Var.L(str);
        if (L != null) {
            o oVar2 = o4Var.t;
            o4.U(oVar2);
            x0 B02 = oVar2.B0(str);
            if (B02 != null) {
                if (!L.D() || L.E().p() != 100) {
                    t4 t4Var = o1Var.z;
                    o1.k(t4Var);
                    if (!t4Var.a0(str, B02.C())) {
                        if (!TextUtils.isEmpty(E)) {
                        }
                    }
                }
                String D = B0.D();
                q.b();
                ((com.google.android.gms.internal.measurement.q3) q.s).v(2);
                o4.U(i1Var);
                com.google.android.gms.internal.measurement.f2 L2 = i1Var.L(B0.D());
                if (L2 == null || !L2.D()) {
                    s0 s0Var = o1Var.w;
                    o1.m(s0Var);
                    s0Var.F.b(D, "[sgtm] Missing sgtm_setting in remote config. appId");
                    q.b();
                    ((com.google.android.gms.internal.measurement.q3) q.s).w(4);
                } else {
                    HashMap hashMap = new HashMap();
                    if (!TextUtils.isEmpty(B0.C())) {
                        hashMap.put("x-gtm-server-preview", B0.C());
                    }
                    String q2 = L2.E().q();
                    int a2 = com.github.rudroid.copilot.h1.a(B0.t());
                    if (a2 != 0 && a2 != 2) {
                        q.i(a2);
                    } else if (C(B0.D())) {
                        q.i(11);
                    } else if (TextUtils.isEmpty(q2)) {
                        q.i(12);
                    } else {
                        s0 s0Var2 = o1Var.w;
                        o1.m(s0Var2);
                        s0Var2.F.b(D, "[sgtm] Eligible for client side upload. appId");
                        q.b();
                        ((com.google.android.gms.internal.measurement.q3) q.s).v(3);
                        q.i(2);
                        j4Var = new j4(q2, hashMap, a3.v, (com.google.android.gms.internal.measurement.q3) q.e());
                    }
                    L2.E().getClass();
                    L2.E().getClass();
                    o1Var.getClass();
                    s0 s0Var3 = o1Var.w;
                    if (TextUtils.isEmpty(q2)) {
                        q.b();
                        ((com.google.android.gms.internal.measurement.q3) q.s).w(6);
                        o1.m(s0Var3);
                        s0Var3.F.b(B0.D(), "[sgtm] Local service, missing sgtm_server_url");
                    } else {
                        o1.m(s0Var3);
                        s0Var3.F.b(D, "[sgtm] Eligible for local service direct upload. appId");
                        q.b();
                        ((com.google.android.gms.internal.measurement.q3) q.s).v(5);
                        q.b();
                        ((com.google.android.gms.internal.measurement.q3) q.s).w(2);
                        j4Var = new j4(q2, hashMap, a3.u, (com.google.android.gms.internal.measurement.q3) q.e());
                    }
                }
                return j4Var != null ? j4Var : new j4(B(str), Collections.EMPTY_MAP, a3Var, (com.google.android.gms.internal.measurement.q3) q.e());
            }
        }
        q.b();
        ((com.google.android.gms.internal.measurement.q3) q.s).w(3);
        return new j4(B(str), Collections.EMPTY_MAP, a3Var, (com.google.android.gms.internal.measurement.q3) q.e());
    }

    public final String B(String str) {
        i1 i1Var = this.t.r;
        o4.U(i1Var);
        String M = i1Var.M(str);
        if (TextUtils.isEmpty(M)) {
            return (String) c0.r.a(null);
        }
        Uri parse = Uri.parse((String) c0.r.a(null));
        Uri.Builder buildUpon = parse.buildUpon();
        String authority = parse.getAuthority();
        StringBuilder sb = new StringBuilder(String.valueOf(M).length() + 1 + String.valueOf(authority).length());
        sb.append(M);
        sb.append(".");
        sb.append(authority);
        buildUpon.authority(sb.toString());
        return buildUpon.build().toString();
    }

    public k4(Object... a) {
    }
}
