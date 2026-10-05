package com.google.android.gms.measurement.internal;

import com.google.android.gms.internal.measurement.r5;
import java.util.HashMap;
import java.util.concurrent.Callable;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class g1 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ i1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ g1(i1 i1Var, String str, int i) {
        this.a = i;
        this.b = i1Var;
        this.c = str;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.a) {
            case 0:
                return new com.google.android.gms.internal.measurement.j4(new g1(this.b, this.c, 1));
            case 1:
                i1 i1Var = this.b;
                o oVar = i1Var.t.t;
                o4.U(oVar);
                String str = this.c;
                x0 B0 = oVar.B0(str);
                HashMap hashMap = new HashMap();
                hashMap.put("platform", "android");
                hashMap.put("package_name", str);
                ((o1) ((androidx.compose.foundation.lazy.layout.s0) i1Var).s).u.E();
                hashMap.put("gmp_version", 133005L);
                if (B0 != null) {
                    String N = B0.N();
                    if (N != null) {
                        hashMap.put("app_version", N);
                    }
                    hashMap.put("app_version_int", Long.valueOf(B0.P()));
                    hashMap.put("dynamite_version", Long.valueOf(B0.b()));
                }
                return hashMap;
            default:
                b1.m mVar = new b1.m(this.b, this.c, false, 21);
                r5 r5Var = new r5("internal.remoteConfig", 0);
                r5Var.s.put("getValue", new com.google.android.gms.internal.measurement.j4(r5Var, mVar));
                return r5Var;
        }
    }
}
