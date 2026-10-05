package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o3 extends t1 {
    private static final o3 zzb;
    private int zzd;
    private x1 zze = m2.v;
    private String zzf = "";
    private boolean zzg;

    static {
        o3 o3Var = new o3();
        zzb = o3Var;
        t1.f(o3.class, o3Var);
    }

    public static o3 p() {
        return zzb;
    }

    public static /* synthetic */ void q(o3 o3Var, boolean z) {
        o3Var.zzd |= 2;
        o3Var.zzg = z;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဈ\u0000\u0003ဇ\u0001", new Object[]{"zzd", "zze", n3.class, "zzf", "zzg"});
        }
        if (i2 == 3) {
            return new o3();
        }
        if (i2 == 4) {
            return new m3(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
