package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f3 extends t1 {
    private static final f3 zzb;

    static {
        f3 f3Var = new f3();
        zzb = f3Var;
        t1.f(f3.class, f3Var);
    }

    public static f3 p() {
        return zzb;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new f3();
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
