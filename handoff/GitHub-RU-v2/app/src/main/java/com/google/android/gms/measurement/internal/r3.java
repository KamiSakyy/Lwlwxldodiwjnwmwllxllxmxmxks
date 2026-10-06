package com.google.android.gms.measurement.internal;

import android.content.pm.PackageManager;
import android.os.SystemClock;
import android.util.Pair;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r3 extends i4 {
    public final a1 A;
    public final a1 B;
    public final HashMap v;
    public final a1 w;
    public final a1 x;
    public final a1 y;
    public final a1 z;

    public r3(o4 o4Var) {
        super(o4Var);
        this.v = new HashMap();
        c1 c1Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).v;
        o1.k(c1Var);
        this.w = new a1(c1Var, "last_delete_stale", 0L);
        c1 c1Var2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).v;
        o1.k(c1Var2);
        this.x = new a1(c1Var2, "last_delete_stale_batch", 0L);
        c1 c1Var3 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).v;
        o1.k(c1Var3);
        this.y = new a1(c1Var3, "backoff", 0L);
        c1 c1Var4 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).v;
        o1.k(c1Var4);
        this.z = new a1(c1Var4, "last_upload", 0L);
        c1 c1Var5 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).v;
        o1.k(c1Var5);
        this.A = new a1(c1Var5, "last_upload_attempt", 0L);
        c1 c1Var6 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).v;
        o1.k(c1Var6);
        this.B = new a1(c1Var6, "midnight_offset", 0L);
    }

    @Override // com.google.android.gms.measurement.internal.i4
    public final void C() {
    }

    public final Pair D(String str) {
        q3 q3Var;
        c21.h0 h0Var;
        z();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        g21.a aVar = o1Var.B;
        h hVar = o1Var.u;
        aVar.getClass();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        HashMap hashMap = this.v;
        q3 q3Var2 = (q3) hashMap.get(str);
        if (q3Var2 != null && elapsedRealtime < q3Var2.c) {
            return new Pair(q3Var2.a, Boolean.valueOf(q3Var2.b));
        }
        long G = hVar.G(str, c0.b) + elapsedRealtime;
        try {
            try {
                h0Var = x11.a.a(o1Var.r);
            } catch (PackageManager.NameNotFoundException unused) {
                if (q3Var2 != null && elapsedRealtime < q3Var2.c + hVar.G(str, c0.c)) {
                    return new Pair(q3Var2.a, Boolean.valueOf(q3Var2.b));
                }
                h0Var = null;
            }
        } catch (Exception e) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.E.b(e, "Unable to get advertising id");
            q3Var = new q3("", false, G);
        }
        if (h0Var == null) {
            return new Pair("00000000-0000-0000-0000-000000000000", Boolean.FALSE);
        }
        String str2 = h0Var.b;
        q3Var = str2 != null ? new q3(str2, h0Var.c, G) : new q3("", h0Var.c, G);
        hashMap.put(str, q3Var);
        return new Pair(q3Var.a, Boolean.valueOf(q3Var.b));
    }

    public final String E(String str, boolean z) {
        z();
        String str2 = z ? (String) D(str).first : "00000000-0000-0000-0000-000000000000";
        MessageDigest Q = t4.Q();
        if (Q == null) {
            return null;
        }
        return String.format(Locale.US, "%032X", new BigInteger(1, Q.digest(str2.getBytes())));
    }
}
