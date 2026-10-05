package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l3 extends t1 {
    private static final l3 zzb;
    private int zzd;
    private int zze;

    static {
        l3 l3Var = new l3();
        zzb = l3Var;
        t1.f(l3.class, l3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", f1.g});
        }
        if (i2 == 3) {
            return new l3();
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
