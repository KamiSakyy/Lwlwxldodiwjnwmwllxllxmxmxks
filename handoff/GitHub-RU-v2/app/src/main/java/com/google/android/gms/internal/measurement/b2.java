package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b2 extends g5 {
    private static final b2 zzg;
    private int zzb;
    private String zzd = "";
    private m5 zze = e6.v;
    private boolean zzf;

    static {
        b2 b2Var = new b2();
        zzg = b2Var;
        g5.m(b2.class, b2Var);
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"zzb", "zzd", "zze", i2.class, "zzf"});
        }
        if (i2 == 3) {
            return new b2();
        }
        if (i2 == 4) {
            return new r1(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class a0<T1,T2,T3,T4> {
        public a0() {
        }
    }
}
