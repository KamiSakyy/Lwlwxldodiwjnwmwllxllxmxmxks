package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class h3 extends t1 {
    private static final h3 zzb;
    private int zzd;
    private int zzf;
    private d3 zzi;
    private boolean zzj;
    private boolean zzk;
    private String zze = "";
    private w1 zzg = u1.v;
    private x1 zzh = m2.v;

    static {
        h3 h3Var = new h3();
        zzb = h3Var;
        t1.f(h3.class, h3Var);
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0002\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ࠬ\u0004\u001b\u0005ဉ\u0002\u0006ဇ\u0003\u0007ဇ\u0004", new Object[]{"zzd", "zze", "zzf", f1.f, "zzg", f1.e, "zzh", r3.class, "zzi", "zzj", "zzk"});
        }
        if (i2 == 3) {
            return new h3();
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
