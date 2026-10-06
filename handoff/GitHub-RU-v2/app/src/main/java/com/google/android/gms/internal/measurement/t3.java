package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t3 extends g5 {
    private static final t3 zzd;
    private m5 zzb = e6.v;

    static {
        t3 t3Var = new t3();
        zzd = t3Var;
        g5.m(t3.class, t3Var);
    }

    public static t3 r() {
        return zzd;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzb", u3.class});
        }
        if (i2 == 3) {
            return new t3();
        }
        if (i2 == 4) {
            return new r1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }

    public final List p() {
        return this.zzb;
    }

    public final int q() {
        return this.zzb.size();
    }
    public Object ordinal() { return null; }
}
