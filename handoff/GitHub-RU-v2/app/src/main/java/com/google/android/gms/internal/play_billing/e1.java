package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e1 extends t1 {
    private static final e1 zzb;
    private int zzd;
    private String zze = "";

    static {
        e1 e1Var = new e1();
        zzb = e1Var;
        t1.f(e1.class, e1Var);
    }

    public static d1 p() {
        return (d1) zzb.k();
    }

    public static /* synthetic */ void q(e1 e1Var, String str) {
        e1Var.zzd |= 1;
        e1Var.zze = str;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"zzd", "zze"});
        }
        if (i2 == 3) {
            return new e1();
        }
        if (i2 == 4) {
            return new d1(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
