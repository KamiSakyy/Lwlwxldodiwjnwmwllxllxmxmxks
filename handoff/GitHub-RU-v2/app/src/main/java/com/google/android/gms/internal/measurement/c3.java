package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c3 extends g5 {
    private static final c3 zzf;
    private int zzb;
    private String zzd = "";
    private long zze;

    static {
        c3 c3Var = new c3();
        zzf = c3Var;
        g5.m(c3.class, c3Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new c3();
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
