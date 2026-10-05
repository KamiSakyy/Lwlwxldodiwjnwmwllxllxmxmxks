package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k3 extends t1 {
    private static final k3 zzb;
    private int zzd;
    private boolean zze;
    private boolean zzf;

    static {
        k3 k3Var = new k3();
        zzb = k3Var;
        t1.f(k3.class, k3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new k3();
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
