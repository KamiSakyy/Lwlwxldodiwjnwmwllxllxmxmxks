package x9;

import a0.s0;
import androidx.compose.runtime.i1;

/* loaded from: /home/user/work/p/classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public int f34005a;

    /* renamed from: b, reason: collision with root package name */
    public int f34006b;

    /* renamed from: c, reason: collision with root package name */
    public String f34007c;

    public static i1 a() {
        i1 i1Var = new i1();
        i1Var.f1676s = 0;
        i1Var.f1677t = "";
        return i1Var;
    }

    public final String toString() {
        int i = this.f34005a;
        int i10 = com.google.android.gms.internal.play_billing.t.a;
        com.google.android.gms.internal.play_billing.a0 a0Var = com.google.android.gms.internal.play_billing.h.t;
        Integer valueOf = Integer.valueOf(i);
        return s0.k("Response Code: ", (!a0Var.containsKey(valueOf) ? com.google.android.gms.internal.play_billing.h.s : (com.google.android.gms.internal.play_billing.h) a0Var.get(valueOf)).toString(), ", Debug Message: ", this.f34007c);
    }
}
