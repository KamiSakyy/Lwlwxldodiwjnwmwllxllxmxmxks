package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Map;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 implements v2 {
    public final /* synthetic */ int r;
    public o1 s;

    public /* synthetic */ e1(o1 o1Var, int i) {
        this.r = i;
        this.s = o1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean a() {
        switch (this.r) {
            case 0:
                o1 o1Var = this.s;
                boolean z = false;
                try {
                    a7.d a = i21.b.a(o1Var.r);
                    if (a == null) {
                        s0 s0Var = o1Var.w;
                        o1.m(s0Var);
                        s0Var.F.a("Failed to get PackageManager for Install Referrer Play Store compatibility check");
                        o1Var = o1Var;
                    } else {
                        int i = a.f("com.android.vending", 128).versionCode;
                        o1Var = i;
                        if (i >= 80837300) {
                            z = true;
                            o1Var = i;
                        }
                    }
                } catch (Exception e) {
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.F.b(e, "Failed to retrieve Play Store version for Install Referrer");
                }
                return z;
            default:
                s0 s0Var3 = this.s.w;
                o1.m(s0Var3);
                return Log.isLoggable(s0Var3.J(), 3);
        }
    }

    @Override // com.google.android.gms.measurement.internal.v2
    public /* synthetic */ void b(String str, int i, Throwable th, byte[] bArr, Map map) {
        this.s.i(i, th, bArr);
    }

    public void c(String str, Bundle bundle) {
        String uri;
        o1 o1Var = this.s;
        m1 m1Var = o1Var.x;
        c1 c1Var = o1Var.v;
        o1.m(m1Var);
        m1Var.z();
        if (o1Var.e()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        o1.k(c1Var);
        c1Var.O.p(uri);
        a1 a1Var = c1Var.P;
        o1Var.B.getClass();
        a1Var.b(System.currentTimeMillis());
    }

    public boolean d() {
        if (!e()) {
            return false;
        }
        o1 o1Var = this.s;
        o1Var.B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        c1 c1Var = o1Var.v;
        o1.k(c1Var);
        return currentTimeMillis - c1Var.P.a() > o1Var.u.G(null, c0.j0);
    }

    public boolean e() {
        c1 c1Var = this.s.v;
        o1.k(c1Var);
        return c1Var.P.a() > 0;
    }

    public e1(o4 o4Var) {
        this.r = 0;
        this.s = o4Var.C;
    }

    public e1(e2 e2Var, o1 o1Var) {
        this.r = 2;
        this.s = o1Var;
    }
}
