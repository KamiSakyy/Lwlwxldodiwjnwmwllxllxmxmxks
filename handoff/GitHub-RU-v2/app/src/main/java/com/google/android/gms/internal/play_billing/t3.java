package com.google.android.gms.internal.play_billing;

/* loaded from: /home/user/work/p/classes4.dex */
public final class t3 extends t1 {
    private static final t3 zzb;
    private int zzd;
    private d3 zze;
    private long zzf;

    static {
        t3 t3Var = new t3();
        zzb = t3Var;
        t1.f(t3.class, t3Var);
    }

    public static s3 p() {
        return (s3) zzb.k();
    }

    public static /* synthetic */ void q(t3 t3Var, d3 d3Var) {
        t3Var.zze = d3Var;
        t3Var.zzd |= 1;
    }

    public static /* synthetic */ void r(t3 t3Var, long j) {
        t3Var.zzd |= 2;
        t3Var.zzf = j;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001", new Object[]{"zzd", "zze", "zzf"});
        }
        if (i2 == 3) {
            return new t3();
        }
        if (i2 == 4) {
            return new s3(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }
}
