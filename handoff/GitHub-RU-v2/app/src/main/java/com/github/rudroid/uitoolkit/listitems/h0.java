package com.github.rudroid.uitoolkit.listitems;

import a0.a2;
import a0.f2;
import a0.g2;
import a0.h2;
import a0.u1;
import a0.w0;
import a0.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import f1.p5;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h0 {
    /* JADX WARN: Removed duplicated region for block: B:100:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final boolean z, float f, float f2, String str, long j, int i, androidx.compose.runtime.s sVar, final int i2, final int i3) {
        Object f14 = null;
        Object f13 = null;
        w1.r rVar2;
        int i4;
        float f3;
        float f4;
        int i5;
        String str2;
        long j2;
        int i6;
        final w1.r rVar3;
        final float f5;
        final float f6;
        final String str3;
        final long j3;
        final int i7;
        b2 t;
        String str4;
        int i8;
        int i9;
        long j4;
        Object N;
        androidx.compose.runtime.i iVar;
        a2 d;
        boolean z2;
        Object c;
        boolean f7;
        Object N2;
        boolean f8;
        Object N3;
        String str5;
        int i11;
        int i12;
        int i13;
        sVar.e0(293222321);
        int i14 = i3 & 1;
        if (i14 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.g(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            if ((i3 & 4) == 0) {
                f3 = f;
                if (sVar.c(f3)) {
                    i13 = 256;
                    i4 |= i13;
                }
            } else {
                f3 = f;
            }
            i13 = 128;
            i4 |= i13;
        } else {
            f3 = f;
        }
        int i15 = i3 & 8;
        if (i15 != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            f4 = f2;
            i4 |= sVar.c(f4) ? 2048 : 1024;
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else if ((i2 & 24576) == 0) {
                str2 = str;
                i4 |= sVar.f(str2) ? 16384 : 8192;
                if ((196608 & i2) == 0) {
                    if ((i3 & 32) == 0) {
                        j2 = j;
                        if (sVar.e(j2)) {
                            i12 = 131072;
                            i4 |= i12;
                        }
                    } else {
                        j2 = j;
                    }
                    i12 = 65536;
                    i4 |= i12;
                } else {
                    j2 = j;
                }
                if ((1572864 & i2) == 0) {
                    if ((i3 & 64) == 0) {
                        i6 = i;
                        if (sVar.d(i6)) {
                            i11 = 1048576;
                            i4 |= i11;
                        }
                    } else {
                        i6 = i;
                    }
                    i11 = 524288;
                    i4 |= i11;
                } else {
                    i6 = i;
                }
                if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
                    sVar.X();
                    if ((i2 & 1) == 0 || sVar.A()) {
                        rVar3 = i14 != 0 ? w1.o.a : rVar2;
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                            f3 = -180.0f;
                        }
                        if (i15 != 0) {
                            f4 = 0.0f;
                        }
                        if (i5 != 0) {
                            str2 = "";
                        }
                        if ((i3 & 32) != 0) {
                            j2 = ih.d.b(sVar).A;
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i9 = i4 & (-3670017);
                            str4 = str2;
                            j4 = j2;
                            i8 = 2131231173;
                            float f9 = f3;
                            float f11 = f4;
                            sVar.r();
                            N = sVar.N();
                            iVar = androidx.compose.runtime.n.a;
                            Object obj = N;
                            if (N == iVar) {
                                w0 w0Var = new w0(Boolean.valueOf(z));
                                w0Var.a(Boolean.valueOf(!z));
                                sVar.n0(w0Var);
                                obj = w0Var;
                            }
                            d = f2.d((w0) obj, "chevronStateTransition", sVar, 48);
                            h2 h2Var = a0.f.j;
                            if (d.g()) {
                                sVar.c0(1666573488);
                                boolean f12 = sVar.f(d);
                                c = sVar.N();
                                if (f12 || c == iVar) {
                                    v1.g e = v1.r.e();
                                    j71.c e2 = e != null ? e.e() : null;
                                    v1.g h = v1.r.h(e);
                                    try {
                                        Object c2 = d.c();
                                        v1.r.k(e, h, e2);
                                        sVar.n0(c2);
                                        c = c2;
                                    } catch (Throwable th2) {
                                        v1.r.k(e, h, e2);
                                        throw th2;
                                    }
                                }
                                z2 = false;
                                sVar.q(false);
                            } else {
                                z2 = false;
                                sVar.c0(1666827533);
                                sVar.q(false);
                                c = d.c();
                            }
                            ((Boolean) c).getClass();
                            sVar.c0(1767829178);
                            float f13 = !z ? f11 : f9;
                            sVar.q(z2);
                            Float valueOf = Float.valueOf(f13);
                            f7 = sVar.f(d);
                            N2 = sVar.N();
                            if (!f7 || N2 == iVar) {
                                N2 = androidx.compose.runtime.t.s(new f0(d));
                                sVar.n0(N2);
                            }
                            ((Boolean) ((i3) N2).getValue()).getClass();
                            sVar.c0(1767829178);
                            float f14 = !z ? f11 : f9;
                            sVar.q(false);
                            Float valueOf2 = Float.valueOf(f14);
                            f8 = sVar.f(d);
                            N3 = sVar.N();
                            if (!f8 || N3 == iVar) {
                                N3 = androidx.compose.runtime.t.s(new g0(d));
                                sVar.n0(N3);
                            }
                            k71.k.g((u1) ((i3) N3).getValue(), "$this$animateFloat");
                            sVar.c0(1614091711);
                            g2 s = a0.f.s(250, 6, (a0.a0) null);
                            sVar.q(false);
                            w1 c3 = f2.c(d, valueOf, valueOf2, s, h2Var, sVar, 196608);
                            int i16 = !z ? 2131954159 : 2131954158;
                            w1.r h2 = a2.i.h(rVar3, ((Number) c3.y.getValue()).floatValue());
                            i2.b C = z3.C(i8, (i9 >> 18) & 14, sVar);
                            if (str4 != null) {
                                sVar.c0(-576154450);
                                sVar.q(false);
                                str5 = null;
                            } else {
                                sVar.c0(-576154449);
                                String p0 = str4.length() == 0 ? i4.p0(i16, sVar) : str4;
                                sVar.q(false);
                                str5 = p0;
                            }
                            j3 = j4;
                            p5.a(C, str5, h2, j3, sVar, 8 | ((i9 >> 6) & 7168), 0);
                            i7 = i8;
                            f5 = f9;
                            f6 = f11;
                            str3 = str4;
                        } else {
                            int i17 = i6;
                            str4 = str2;
                            i8 = i17;
                        }
                    } else {
                        sVar.V();
                        if ((i3 & 4) != 0) {
                            i4 &= -897;
                        }
                        if ((i3 & 32) != 0) {
                            i4 &= -458753;
                        }
                        if ((i3 & 64) != 0) {
                            i4 &= -3670017;
                        }
                        int i18 = i6;
                        str4 = str2;
                        i8 = i18;
                        rVar3 = rVar2;
                    }
                    i9 = i4;
                    j4 = j2;
                    float f92 = f3;
                    float f112 = f4;
                    sVar.r();
                    N = sVar.N();
                    iVar = androidx.compose.runtime.n.a;
                    Object obj2 = N;
                    if (N == iVar) {
                    }
                    d = f2.d((w0) obj2, "chevronStateTransition", sVar, 48);
                    h2 h2Var2 = a0.f.j;
                    if (d.g()) {
                    }
                    ((Boolean) c).getClass();
                    sVar.c0(1767829178);
                    if (!z) {
                    }
                    sVar.q(z2);
                    Float valueOf3 = Float.valueOf(f13);
                    f7 = sVar.f(d);
                    N2 = sVar.N();
                    if (!f7) {
                    }
                    N2 = androidx.compose.runtime.t.s(new f0(d));
                    sVar.n0(N2);
                    ((Boolean) ((i3) N2).getValue()).getClass();
                    sVar.c0(1767829178);
                    if (!z) {
                    }
                    sVar.q(false);
                    Float valueOf22 = Float.valueOf(f14);
                    f8 = sVar.f(d);
                    N3 = sVar.N();
                    if (!f8) {
                    }
                    N3 = androidx.compose.runtime.t.s(new g0(d));
                    sVar.n0(N3);
                    k71.k.g((u1) ((i3) N3).getValue(), "$this$animateFloat");
                    sVar.c0(1614091711);
                    g2 s2 = a0.f.s(250, 6, (a0.a0) null);
                    sVar.q(false);
                    w1 c32 = f2.c(d, valueOf3, valueOf22, s2, h2Var2, sVar, 196608);
                    if (!z) {
                    }
                    w1.r h22 = a2.i.h(rVar3, ((Number) c32.y.getValue()).floatValue());
                    i2.b C2 = z3.C(i8, (i9 >> 18) & 14, sVar);
                    if (str4 != null) {
                    }
                    j3 = j4;
                    p5.a(C2, str5, h22, j3, sVar, 8 | ((i9 >> 6) & 7168), 0);
                    i7 = i8;
                    f5 = f92;
                    f6 = f112;
                    str3 = str4;
                } else {
                    sVar.V();
                    rVar3 = rVar2;
                    f5 = f3;
                    f6 = f4;
                    str3 = str2;
                    j3 = j2;
                    i7 = i6;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.listitems.e0
                        public final Object s(Object obj3, Object obj4) {
                            ((Integer) obj4).getClass();
                            h0.a(rVar3, z, f5, f6, str3, j3, i7, (androidx.compose.runtime.s) obj3, androidx.compose.runtime.t.L(i2 | 1), i3);
                            return w61.a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            str2 = str;
            if ((196608 & i2) == 0) {
            }
            if ((1572864 & i2) == 0) {
            }
            if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        f4 = f2;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        str2 = str;
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }
}
