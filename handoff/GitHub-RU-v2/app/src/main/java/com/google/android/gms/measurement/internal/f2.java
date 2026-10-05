package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class f2 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ t2 s;

    public /* synthetic */ f2(t2 t2Var, int i) {
        this.r = i;
        this.s = t2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                this.s.W();
                break;
            case 1:
                e1 e1Var = this.s.J;
                o1 o1Var = e1Var.s;
                m1 m1Var = o1Var.x;
                t2 t2Var = o1Var.D;
                c1 c1Var = o1Var.v;
                o1.m(m1Var);
                m1Var.z();
                if (e1Var.e()) {
                    if (e1Var.d()) {
                        o1.k(c1Var);
                        c1Var.O.p((String) null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        o1.l(t2Var);
                        t2Var.G("auto", "_cmpx", bundle);
                    } else {
                        o1.k(c1Var);
                        androidx.compose.foundation.lazy.layout.t1 t1Var = c1Var.O;
                        String o = t1Var.o();
                        if (TextUtils.isEmpty(o)) {
                            s0 s0Var = o1Var.w;
                            o1.m(s0Var);
                            s0Var.y.a("Cache still valid but referrer not found");
                        } else {
                            long a = c1Var.P.a() / 3600000;
                            Uri parse = Uri.parse(o);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str : parse.getQueryParameterNames()) {
                                bundle2.putString(str, parse.getQueryParameter(str));
                            }
                            ((Bundle) pair.second).putLong("_cc", (a - 1) * 3600000);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            o1.l(t2Var);
                            t2Var.G(str2, "_cmp", (Bundle) pair.second);
                        }
                        t1Var.p((String) null);
                    }
                    o1.k(c1Var);
                    c1Var.P.b(0L);
                    break;
                }
                break;
            case 2:
                t2 t2Var2 = this.s;
                t2Var2.z();
                o1 o1Var2 = (o1) ((androidx.compose.foundation.lazy.layout.s0) t2Var2).s;
                c1 c1Var2 = o1Var2.v;
                s0 s0Var2 = o1Var2.w;
                o1.k(c1Var2);
                z0 z0Var = c1Var2.L;
                if (z0Var.b()) {
                    o1.m(s0Var2);
                    s0Var2.E.a("Deferred Deep Link already retrieved. Not fetching again.");
                    break;
                } else {
                    a1 a1Var = c1Var2.M;
                    long a2 = a1Var.a();
                    a1Var.b(1 + a2);
                    if (a2 >= 5) {
                        o1.m(s0Var2);
                        s0Var2.A.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        z0Var.c(true);
                        break;
                    } else {
                        if (t2Var2.L == null) {
                            t2Var2.L = new g2(t2Var2, o1Var2, 3);
                        }
                        t2Var2.L.b(0L);
                        break;
                    }
                }
            default:
                this.s.W();
                break;
        }
    }
}
