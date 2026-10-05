package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x2 extends g5 {
    private static final x2 zzd;
    private m5 zzb = e6.v;

    static {
        x2 x2Var = new x2();
        zzd = x2Var;
        g5.m(x2.class, x2Var);
    }

    public static u2 q() {
        return (u2) zzd.h();
    }

    public static x2 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", w2.class});
        }
        if (i2 == 3) {
            return new x2();
        }
        if (i2 == 4) {
            return new u2(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final void s(ArrayList arrayList) {
        m5 m5Var = this.zzb;
        if (!((t4) m5Var).r) {
            int size = m5Var.size();
            this.zzb = m5Var.E(size + size);
        }
        s4.c(arrayList, this.zzb);
    }
}
