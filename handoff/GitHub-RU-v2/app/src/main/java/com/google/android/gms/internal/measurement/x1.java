package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x1 extends g5 {
    private static final x1 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        x1 x1Var = new x1();
        zzg = x1Var;
        g5.m(x1.class, x1Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", s1.e, "zze", s1.d, "zzf", s1.f});
        }
        if (i2 == 3) {
            return new x1();
        }
        if (i2 == 4) {
            return new r1(zzg);
        }
        if (i2 == 5) {
            return zzg;
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
        int i;
        int i2 = this.zze;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int r() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                i = i2 != 2 ? 0 : 3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }
}
