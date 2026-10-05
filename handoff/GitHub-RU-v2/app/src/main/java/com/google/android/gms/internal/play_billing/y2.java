package com.google.android.gms.internal.play_billing;

import java.io.IOException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y2 extends t1 {
    private static final y2 zzb;
    private int zzd;
    private int zze = 0;
    private Object zzf;
    private int zzg;
    private d3 zzh;
    private int zzi;

    static {
        y2 y2Var = new y2();
        zzb = y2Var;
        t1.f(y2.class, y2Var);
    }

    public static /* synthetic */ void p(y2 y2Var, o3 o3Var) {
        y2Var.zzf = o3Var;
        y2Var.zze = 7;
    }

    public static /* synthetic */ void q(y2 y2Var, w3 w3Var) {
        y2Var.zzf = w3Var;
        y2Var.zze = 6;
    }

    public static /* synthetic */ void r(y2 y2Var, int i) {
        y2Var.zzg = i - 1;
        y2Var.zzd |= 1;
    }

    public static x2 s() {
        return (x2) zzb.k();
    }

    public static y2 t(byte[] bArr) {
        y2 y2Var = zzb;
        int length = bArr.length;
        o1 o1Var = o1.a;
        int i = i1.a;
        o1 o1Var2 = o1.a;
        if (length != 0) {
            t1 n = y2Var.n();
            try {
                o2 a = l2.c.a(n.getClass());
                androidx.glance.appwidget.protobuf.d dVar = new androidx.glance.appwidget.protobuf.d();
                o1Var2.getClass();
                a.f(n, bArr, 0, length, dVar);
                a.c(n);
                y2Var = n;
            } catch (zzgc e) {
                throw e;
            } catch (zzia e2) {
                throw new zzgc(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof zzgc) {
                    throw ((zzgc) e3.getCause());
                }
                throw new zzgc(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new zzgc("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        if (y2Var == null || t1.i(y2Var, true)) {
            return y2Var;
        }
        throw new zzgc(new zzia().getMessage());
    }

    public static void v(y2 y2Var, g3 g3Var) {
        y2Var.zzi = g3Var.r;
        y2Var.zzd |= 4;
    }

    public static /* synthetic */ void w(y2 y2Var, d3 d3Var) {
        y2Var.zzh = d3Var;
        y2Var.zzd |= 2;
    }

    @Override // com.google.android.gms.internal.play_billing.t1
    public final Object j(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new n2(zzb, "\u0004\u0006\u0001\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0004<\u0000\u0005᠌\u0002\u0006<\u0000\u0007<\u0000", new Object[]{"zzf", "zze", "zzd", "zzg", f1.c, "zzh", l3.class, "zzi", f1.e, w3.class, o3.class});
        }
        if (i2 == 3) {
            return new y2();
        }
        if (i2 == 4) {
            return new x2(zzb);
        }
        if (i2 == 5) {
            return zzb;
        }
        throw null;
    }

    public final o3 u() {
        return this.zze == 7 ? (o3) this.zzf : o3.p();
    }
}
