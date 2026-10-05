package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 extends g5 {
    private static final k3 zzf;
    private int zzb;
    private int zzd = 1;
    private m5 zze = e6.v;

    static {
        k3 k3Var = new k3();
        zzf = k3Var;
        g5.m(k3.class, k3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001b", new Object[]{"zzb", "zzd", s1.k, "zze", c3.class});
        }
        if (i2 == 3) {
            return new k3();
        }
        if (i2 == 4) {
            return new r1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }
}
