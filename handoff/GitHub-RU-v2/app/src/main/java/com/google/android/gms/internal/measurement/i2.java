package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i2 extends g5 {
    private static final i2 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        i2 i2Var = new i2();
        zzf = i2Var;
        g5.m(i2.class, i2Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzf, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"zzb", "zzd", "zze"});
        }
        if (i2 == 3) {
            return new i2();
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
