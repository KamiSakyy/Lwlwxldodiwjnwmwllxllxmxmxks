package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u3 extends t1 {
    private static final u3 zzb;
    private int zzd;
    private int zze;

    static {
        u3 u3Var = new u3();
        zzb = u3Var;
        t1.f(u3.class, u3Var);
    }

    public static u3 p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"zzd", "zze", f1.i});
        }
        if (i2 == 3) {
            return new u3();
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
