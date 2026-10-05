package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class r3 extends t1 {
    private static final r3 zzb;
    private int zzd;
    private int zzf;
    private x1 zze = m2.v;
    private String zzg = "";

    static {
        r3 r3Var = new r3();
        zzb = r3Var;
        t1.f(r3.class, r3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002င\u0000\u0003ဈ\u0001", new Object[]{"zzd", "zze", "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new r3();
        }
        if (i2 == 4) {
            return new e3(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
