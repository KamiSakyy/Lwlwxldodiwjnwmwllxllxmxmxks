package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class v3 extends g5 {
    private static final v3 zzf;
    private int zzb;
    private m5 zzd = e6.v;
    private t3 zze;

    static {
        v3 v3Var = new v3();
        zzf = v3Var;
        g5.m(v3.class, v3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000", new Object[]{"zzb", "zzd", w3.class, "zze"});
        }
        if (i2 == 3) {
            return new v3();
        }
        if (i2 == 4) {
            return new r1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final List p() {
        return this.zzd;
    }

    public final t3 q() {
        t3 t3Var = this.zze;
        return t3Var == null ? t3.r() : t3Var;
    }
}
