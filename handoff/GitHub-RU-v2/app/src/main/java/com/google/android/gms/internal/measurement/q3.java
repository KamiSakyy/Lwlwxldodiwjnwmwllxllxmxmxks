package com.google.android.gms.internal.measurement;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q3 extends g5 {
    private static final q3 zzg;
    private int zzb;
    private int zzd;
    private int zze;
    private int zzf;

    static {
        q3 q3Var = new q3();
        zzg = q3Var;
        g5.m(q3.class, q3Var);
    }

    public static p3 q() {
        return (p3) zzg.h();
    }

    public static q3 r() {
        return zzg;
    }

    @Override // com.google.android.gms.internal.measurement.g5
    public final Object o(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new f6(zzg, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001\u0003᠌\u0002", new Object[]{"zzb", "zzd", s1.n, "zze", s1.l, "zzf", s1.m});
        }
        if (i2 == 3) {
            return new q3();
        }
        if (i2 == 4) {
            return new p3(zzg);
        }
        if (i2 == 5) {
            return zzg;
        }
        throw null;
    }

    public final int p() {
        int a = com.github.rudroid.copilot.h1.a(this.zze);
        if (a == 0) {
            return 1;
        }
        return a;
    }

    public final void s(int i) {
        this.zze = com.github.rudroid.copilot.h1.d(i);
        this.zzb |= 2;
    }

    public final int t() {
        int i;
        int i2 = this.zzd;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i = i2 != 4 ? 0 : 5;
                    }
                } else {
                    i = 3;
                }
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final int u() {
        int i;
        int i2 = this.zzf;
        if (i2 != 0) {
            i = 2;
            if (i2 != 1) {
                int i3 = 3;
                if (i2 != 2) {
                    i = 4;
                    if (i2 != 3) {
                        i3 = 5;
                        if (i2 != 4) {
                            i = i2 != 5 ? 0 : 6;
                        }
                    }
                }
                i = i3;
            }
        } else {
            i = 1;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public final /* synthetic */ void v(int i) {
        this.zzd = i - 1;
        this.zzb |= 1;
    }

    public final /* synthetic */ void w(int i) {
        this.zzf = i - 1;
        this.zzb |= 4;
    }
}
