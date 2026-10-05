package rg;

import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.t;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import com.github.rudroid.m0;
import com.github.rudroid.uitoolkit.i1;
import com.github.rudroid.widget.p;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import d3.q;
import f1.p5;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    /* JADX WARN: Removed duplicated region for block: B:104:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, String str, boolean z, j71.a aVar, long j, boolean z2, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        String str2;
        boolean z3;
        int i4;
        j71.a aVar2;
        long j2;
        int i5;
        boolean z4;
        r rVar3;
        String str3;
        boolean z5;
        j71.a aVar3;
        long j3;
        b2 t;
        String str4;
        boolean z6;
        String str5;
        int i6;
        int i7;
        j71.a aVar4;
        r rVar4;
        int i8;
        int i9;
        sVar.e0(1325896258);
        int i11 = i2 & 1;
        if (i11 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else if ((i & 6) == 0) {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        } else {
            rVar2 = rVar;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str2 = str;
                if (sVar.f(str2)) {
                    i9 = 32;
                    i3 |= i9;
                }
            } else {
                str2 = str;
            }
            i9 = 16;
            i3 |= i9;
        } else {
            str2 = str;
        }
        int i12 = i2 & 4;
        if (i12 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z3 = z;
            i3 |= sVar.g(z3) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                aVar2 = aVar;
                i3 |= sVar.h(aVar2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        j2 = j;
                        if (sVar.e(j2)) {
                            i8 = 16384;
                            i3 |= i8;
                        }
                    } else {
                        j2 = j;
                    }
                    i8 = 8192;
                    i3 |= i8;
                } else {
                    j2 = j;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= sVar.g(z4) ? 131072 : 65536;
                    boolean z7 = false;
                    if (sVar.S(i3 & 1, (i3 & 74899) == 74898)) {
                        sVar.V();
                        rVar3 = rVar2;
                        str3 = str2;
                        z5 = z3;
                        aVar3 = aVar2;
                        j3 = j2;
                    } else {
                        sVar.X();
                        int i13 = i & 1;
                        r rVar5 = o.a;
                        Object obj = n.a;
                        if (i13 == 0 || sVar.A()) {
                            if (i11 != 0) {
                                rVar2 = rVar5;
                            }
                            if ((i2 & 2) != 0) {
                                str4 = i4.p0(2131953655, sVar);
                                i3 &= -113;
                            } else {
                                str4 = str2;
                            }
                            if (i12 != 0) {
                                z3 = false;
                            }
                            if (i4 != 0) {
                                Object N = sVar.N();
                                if (N == obj) {
                                    N = new p(15);
                                    sVar.n0(N);
                                }
                                aVar2 = (j71.a) N;
                            }
                            if ((i2 & 16) != 0) {
                                j2 = ih.d.b(sVar).A;
                                i3 &= -57345;
                            }
                            if (i5 != 0) {
                                z4 = false;
                            }
                            z6 = z3;
                            str5 = str4;
                            i6 = i3;
                        } else {
                            sVar.V();
                            if ((i2 & 2) != 0) {
                                i3 &= -113;
                            }
                            if ((i2 & 16) != 0) {
                                i3 &= -57345;
                            }
                            i6 = i3;
                            z6 = z3;
                            str5 = str2;
                        }
                        long j4 = j2;
                        sVar.r();
                        if (z6) {
                            sVar.c0(-1038375524);
                            String d = z4 ? m0.d(sVar, -1038345485, 2131953659, sVar, false) : m0.d(sVar, -1038231374, 2131953658, sVar, false);
                            r rVar6 = rVar2;
                            j71.a aVar5 = aVar2;
                            r m = f0.o.m(rVar6, false, z4 ? m0.d(sVar, -1038072499, 2131953656, sVar, false) : m0.d(sVar, -1037952529, 2131953657, sVar, false), (d3.k) null, aVar5, 13);
                            rVar4 = rVar6;
                            aVar4 = aVar5;
                            i7 = i6;
                            boolean f = ((((i6 & 112) ^ 48) > 32 && sVar.f(str5)) || (i7 & 48) == 32) | sVar.f(d);
                            Object N2 = sVar.N();
                            if (f || N2 == obj) {
                                N2 = new com.github.rudroid.actions.checkdetail.ui.n(d, 13, str5);
                                sVar.n0(N2);
                            }
                            z7 = false;
                            rVar2 = q.b(m, false, (j71.c) N2);
                            sVar.q(false);
                        } else {
                            i7 = i6;
                            aVar4 = aVar2;
                            rVar4 = rVar2;
                            sVar.c0(-1037442424);
                            sVar.q(false);
                        }
                        r r = f0.o.r(rVar2, z6, 2);
                        v0 d2 = t.d(w1.c.v, z7);
                        int hashCode = Long.hashCode(sVar.T);
                        v1 l = sVar.l();
                        r c = w1.a.c(sVar, r);
                        v2.h.o.getClass();
                        v2.f fVar = v2.g.b;
                        sVar.g0();
                        if (sVar.S) {
                            sVar.k(fVar);
                        } else {
                            sVar.q0();
                        }
                        androidx.compose.runtime.t.I(sVar, v2.g.f, d2);
                        androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                        androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                        androidx.compose.runtime.t.E(sVar, v2.g.h);
                        androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                        p5.a(z3.C(2131231303, 0, sVar), (String) null, p2.e(androidx.compose.foundation.layout.b.z(f0.o.r(rVar5, z6, 2), 0.0f, ih.a.l, 1), 1.0f), j4, sVar, 56 | ((i7 >> 3) & 7168), 0);
                        sVar.q(true);
                        j3 = j4;
                        str3 = str5;
                        z5 = z6;
                        rVar3 = rVar4;
                        aVar3 = aVar4;
                    }
                    boolean z8 = z4;
                    t = sVar.t();
                    if (t == null) {
                        t.d = new i1(rVar3, str3, z5, aVar3, j3, z8, i, i2);
                        return;
                    }
                    return;
                }
                z4 = z2;
                boolean z72 = false;
                if (sVar.S(i3 & 1, (i3 & 74899) == 74898)) {
                }
                boolean z82 = z4;
                t = sVar.t();
                if (t == null) {
                }
            }
            aVar2 = aVar;
            if ((i & 24576) == 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            z4 = z2;
            boolean z722 = false;
            if (sVar.S(i3 & 1, (i3 & 74899) == 74898)) {
            }
            boolean z822 = z4;
            t = sVar.t();
            if (t == null) {
            }
        }
        z3 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        aVar2 = aVar;
        if ((i & 24576) == 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        z4 = z2;
        boolean z7222 = false;
        if (sVar.S(i3 & 1, (i3 & 74899) == 74898)) {
        }
        boolean z8222 = z4;
        t = sVar.t();
        if (t == null) {
        }
    }
}
