package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y1 extends g5 {
    private static final y1 zzf;
    private int zzb;
    private int zzd;
    private int zze;

    static {
        y1 y1Var = new y1();
        zzf = y1Var;
        g5.m(y1.class, y1Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            s1 s1Var = s1.e;
            return new f6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"zzb", "zzd", s1Var, "zze", s1Var});
        }
        if (i2 == 3) {
            return new y1();
        }
        if (i2 == 4) {
            return new r1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final int p() {
        int a0 = com.google.common.util.concurrent.a.a0(this.zzd);
        if (a0 == 0) {
            return 1;
        }
        return a0;
    }

    public final int q() {
        int a0 = com.google.common.util.concurrent.a.a0(this.zze);
        if (a0 == 0) {
            return 1;
        }
        return a0;
    }
}
