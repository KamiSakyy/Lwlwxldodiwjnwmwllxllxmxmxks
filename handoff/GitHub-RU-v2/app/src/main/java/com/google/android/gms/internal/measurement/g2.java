package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g2 extends g5 {
    private static final g2 zzd;
    private m5 zzb = e6.v;

    static {
        g2 g2Var = new g2();
        zzd = g2Var;
        g5.m(g2.class, g2Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzd, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"zzb"});
        }
        if (i2 == 3) {
            return new g2();
        }
        if (i2 == 4) {
            return new r1(zzd);
        }
        if (i2 == 5) {
            return zzd;
        }
        throw null;
    }
}
