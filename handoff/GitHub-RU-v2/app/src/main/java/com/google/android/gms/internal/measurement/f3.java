package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 extends g5 {
    private static final f3 zzg;
    private int zzb;
    private String zzd = "";
    private String zze = "";
    private p2 zzf;

    static {
        f3 f3Var = new f3();
        zzg = f3Var;
        g5.m(f3.class, f3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"zzb", "zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new f3();
        }
        if (i2 == 4) {
            return new r1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }
}
