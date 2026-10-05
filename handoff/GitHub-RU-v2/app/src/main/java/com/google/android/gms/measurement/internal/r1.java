package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.Objects;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r1 implements Runnable {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ long u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    public /* synthetic */ r1(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.r = i;
        this.s = str;
        this.t = str2;
        this.v = obj2;
        this.u = j;
        this.w = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.r) {
            case 0:
                String str = (String) this.t;
                v1 v1Var = (v1) this.w;
                String str2 = (String) this.s;
                if (str2 != null) {
                    b3 b3Var = new b3(this.u, (String) this.v, str2);
                    o4 o4Var = v1Var.f;
                    o4Var.b().z();
                    String str3 = o4Var.X;
                    if (str3 != null) {
                        str3.equals(str);
                    }
                    o4Var.X = str;
                    o4Var.W = b3Var;
                    break;
                } else {
                    o4 o4Var2 = v1Var.f;
                    o4Var2.b().z();
                    String str4 = o4Var2.X;
                    if (str4 == null || str4.equals(str)) {
                        o4Var2.X = str;
                        o4Var2.W = null;
                        break;
                    }
                }
                break;
            case 1:
                t2 t2Var = (t2) this.w;
                String str5 = (String) this.s;
                String str6 = (String) this.t;
                t2Var.K(this.u, this.v, str5, str6);
                break;
            default:
                f3 f3Var = (f3) this.w;
                Bundle bundle = (Bundle) this.s;
                b3 b3Var2 = (b3) this.t;
                b3 b3Var3 = (b3) this.v;
                f3Var.getClass();
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                t4 t4Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) f3Var).s).z;
                o1.k(t4Var);
                f3Var.J(b3Var2, b3Var3, this.u, true, t4Var.H("screen_view", bundle, null, false));
                break;
        }
    }

    public r1(f3 f3Var, Bundle bundle, b3 b3Var, b3 b3Var2, long j) {
        this.r = 2;
        this.s = bundle;
        this.t = b3Var;
        this.v = b3Var2;
        this.u = j;
        Objects.requireNonNull(f3Var);
        this.w = f3Var;
    }
}
