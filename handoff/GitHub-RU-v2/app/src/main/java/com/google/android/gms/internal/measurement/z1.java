package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z1 extends g5 {
    private static final z1 zzf;
    private int zzb;
    private String zzd = "";
    private String zze = "";

    static {
        z1 z1Var = new z1();
        zzf = z1Var;
        g5.m(z1.class, z1Var);
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
            return new z1();
        }
        if (i2 == 4) {
            return new r1(zzf);
        }
        if (i2 == 5) {
            return zzf;
        }
        throw null;
    }

    public final String p() {
        return this.zzd;
    }
    public Object b(Object p1, Object p2) { return null; }
    public Object c(Object p1, Object p2, long p3, boolean p4, boolean p5, Object p6, boolean p7) { return null; }
    public Object h(boolean p1) { return null; }
    public Object k() { return null; }
    public Object n() { return null; }
}
