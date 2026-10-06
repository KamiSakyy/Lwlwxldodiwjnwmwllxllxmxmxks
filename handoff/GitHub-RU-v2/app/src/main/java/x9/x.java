package x9;

import com.google.android.gms.internal.play_billing.b3;
import com.google.android.gms.internal.play_billing.c3;
import com.google.android.gms.internal.play_billing.d3;
import com.google.android.gms.internal.play_billing.g3;
import com.google.android.gms.internal.play_billing.s1;
import com.google.android.gms.internal.play_billing.x2;
import com.google.android.gms.internal.play_billing.y2;
import com.google.android.gms.internal.play_billing.z2;

/* loaded from: /home/user/work/p/classes.dex */
public abstract /* synthetic */ class xShadow {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f34048a = 0;

    static {
        int i = y.f34049q;
    }

    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String simpleName = exc.getClass().getSimpleName();
            String message = exc.getMessage();
            if (message == null) {
                message = "";
            }
            String str = simpleName + ":" + message;
            int i = com.google.android.gms.internal.play_billing.t.a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.t.h("BillingLogger");
            return null;
        }
    }

    public static y2 b(int i, int i10, hShadow hVar, String str, g3 g3Var) {
        try {
            c3 q10 = d3.q();
            int i11 = hVar.f34005a;
            q10.c();
            d3.p(((s1) q10).s, i11);
            String str2 = hVar.f34007c;
            q10.c();
            d3.s(((s1) q10).s, str2);
            int i12 = hVar.f34006b;
            if (i12 != 0) {
                q10.c();
                d3.u(((s1) q10).s, i12);
            }
            if (i != 0) {
                q10.c();
                d3.v(((s1) q10).s, i);
            }
            if (str != null) {
                q10.c();
                d3.r(((s1) q10).s, str);
            }
            x2 s2 = y2.s();
            s2.d(q10);
            s2.c();
            y2.r(((s1) s2).s, i10);
            if (!g3Var.equals(g3.s)) {
                s2.c();
                y2.v(((s1) s2).s, g3Var);
            }
            return s2.a();
        } catch (Throwable unused) {
            com.google.android.gms.internal.play_billing.t.h("BillingLogger");
            return null;
        }
    }

    public static b3 c(int i, g3 g3Var) {
        try {
            z2 q10 = b3.q();
            q10.c();
            b3.p(((s1) q10).s, i);
            if (!g3Var.equals(g3.s)) {
                q10.c();
                b3.s(((s1) q10).s, g3Var);
            }
            return q10.a();
        } catch (Exception unused) {
            com.google.android.gms.internal.play_billing.t.h("BillingLogger");
            return null;
        }
    }
}
