package com.github.rudroid.uitoolkit.menu;

import androidx.compose.foundation.layout.f0;
import androidx.compose.foundation.layout.t;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.v0;
import b2.a0;
import com.github.rudroid.support.u;
import d2.p0;
import f0.z1;
import f1.p;
import java.util.List;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    /* JADX WARN: Removed duplicated region for block: B:108:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00ce  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, final boolean z, final List list, String str, final j71.c cVar, final j71.a aVar, long j, long j2, boolean z2, final r1.d dVar, s sVar, final int i, final int i2) {
        r rVar2;
        int i3;
        String str2;
        int i4;
        long j3;
        int i5;
        int i6;
        final long j4;
        final boolean z3;
        final r rVar3;
        final String str3;
        final long j5;
        b2 t;
        r rVar4;
        boolean z4;
        int i7;
        long j6;
        long j7;
        String str4;
        int i8;
        k71.k.g(list, "items");
        k71.k.g(cVar, "onSelect");
        k71.k.g(aVar, "onDismissRequest");
        sVar.e0(-1172855350);
        int i9 = i2 & 1;
        if (i9 != 0) {
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
            i3 |= sVar.g(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(list) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            str2 = str;
            i3 |= sVar.f(str2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= sVar.h(cVar) ? 16384 : 8192;
            }
            if ((196608 & i) == 0) {
                i3 |= sVar.h(aVar) ? 131072 : 65536;
            }
            i4 = i3 | 1572864;
            if ((12582912 & i) != 0) {
                if ((i2 & 128) == 0) {
                    j3 = j2;
                    if (sVar.e(j3)) {
                        i8 = 8388608;
                        i4 |= i8;
                    }
                } else {
                    j3 = j2;
                }
                i8 = 4194304;
                i4 |= i8;
            } else {
                j3 = j2;
            }
            i5 = i2 & 256;
            if (i5 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i6 = i9;
                i4 |= sVar.g(z2) ? 67108864 : 33554432;
                if ((i & 805306368) == 0) {
                    i4 |= sVar.h(dVar) ? 536870912 : 268435456;
                }
                if (sVar.S(i4 & 1, (i4 & 306783379) != 306783378)) {
                    sVar.X();
                    int i12 = i & 1;
                    r rVar5 = o.a;
                    if (i12 == 0 || sVar.A()) {
                        if (i6 != 0) {
                            rVar2 = rVar5;
                        }
                        if (i11 != 0) {
                            str2 = null;
                        }
                        r rVar6 = rVar2;
                        long floatToRawIntBits = (Float.floatToRawIntBits(0) << 32) | (Float.floatToRawIntBits(10) & 4294967295L);
                        if ((i2 & 128) != 0) {
                            j3 = ih.d.b(sVar).d;
                            i4 &= -29360129;
                        }
                        rVar4 = rVar6;
                        if (i5 != 0) {
                            i7 = i4;
                            j6 = j3;
                            z4 = true;
                        } else {
                            z4 = z2;
                            i7 = i4;
                            j6 = j3;
                        }
                        j7 = floatToRawIntBits;
                        str4 = str2;
                    } else {
                        sVar.V();
                        if ((i2 & 128) != 0) {
                            i4 &= -29360129;
                        }
                        z4 = z2;
                        rVar4 = rVar2;
                        i7 = i4;
                        str4 = str2;
                        j6 = j3;
                        j7 = j;
                    }
                    sVar.r();
                    Object N = sVar.N();
                    Object obj = n.a;
                    if (N == obj) {
                        N = no.a.f(sVar);
                    }
                    final a0 a0Var = (a0) N;
                    final String str5 = str4;
                    v0 d = t.d(w1.c.r, false);
                    int i13 = i7;
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    r c = w1.a.c(sVar, rVar4);
                    v2.h.o.getClass();
                    v2.f fVar = v2.g.b;
                    sVar.g0();
                    r rVar7 = rVar4;
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    androidx.compose.runtime.t.I(sVar, v2.g.f, d);
                    androidx.compose.runtime.t.I(sVar, v2.g.e, l);
                    androidx.compose.runtime.t.w(sVar, Integer.valueOf(hashCode), v2.g.g);
                    androidx.compose.runtime.t.E(sVar, v2.g.h);
                    androidx.compose.runtime.t.I(sVar, v2.g.d, c);
                    dVar.s(sVar, Integer.valueOf((i13 >> 27) & 14));
                    r f = f0.o.f(rVar5, j6, d2.a0.b);
                    Object N2 = sVar.N();
                    if (N2 == obj) {
                        N2 = new u(4, a0Var);
                        sVar.n0(N2);
                    }
                    long j8 = j6;
                    final boolean z5 = z4;
                    long j9 = j7;
                    p.a(z, aVar, com.github.rudroid.uitoolkit.extensions.d.a(f, z4, (j71.c) N2), j9, (z1) null, new w3.a0(z4, 14), (p0) null, 0L, 0.0f, ih.a.h, r1.i.d(45827007, new j71.f() { // from class: com.github.rudroid.uitoolkit.menu.i
                        public final Object f(Object obj2, Object obj3, Object obj4) {
                            s sVar2 = (s) obj3;
                            int intValue = ((Integer) obj4).intValue();
                            k71.k.g((f0) obj2, "$this$DropdownMenu");
                            if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                                h.a(list, cVar, str5, null, null, sVar2, 0);
                                if (z5) {
                                    sVar2.c0(-567045985);
                                    Object N3 = sVar2.N();
                                    androidx.compose.runtime.i iVar = n.a;
                                    a0 a0Var2 = a0Var;
                                    if (N3 == iVar) {
                                        N3 = new k(a0Var2, null);
                                        sVar2.n0(N3);
                                    }
                                    androidx.compose.runtime.t.f(sVar2, (j71.e) N3, a0Var2);
                                } else {
                                    sVar2.c0(-569079709);
                                }
                                sVar2.q(false);
                            } else {
                                sVar2.V();
                            }
                            return w61.a0.a;
                        }
                    }, sVar), sVar, ((i13 >> 3) & 14) | 805306368 | ((i13 >> 12) & 112) | ((i13 >> 9) & 7168), 1488);
                    sVar.q(true);
                    j4 = j9;
                    rVar3 = rVar7;
                    z3 = z5;
                    str3 = str5;
                    j5 = j8;
                } else {
                    sVar.V();
                    j4 = j;
                    z3 = z2;
                    rVar3 = rVar2;
                    str3 = str2;
                    j5 = j3;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new j71.e() { // from class: com.github.rudroid.uitoolkit.menu.j
                        public final Object s(Object obj2, Object obj3) {
                            ((Integer) obj3).getClass();
                            int L = androidx.compose.runtime.t.L(i | 1);
                            l.a(rVar3, z, list, str3, cVar, aVar, j4, j5, z3, dVar, (s) obj2, L, i2);
                            return w61.a0.a;
                        }
                    };
                    return;
                }
                return;
            }
            i6 = i9;
            if ((i & 805306368) == 0) {
            }
            if (sVar.S(i4 & 1, (i4 & 306783379) != 306783378)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        str2 = str;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        i4 = i3 | 1572864;
        if ((12582912 & i) != 0) {
        }
        i5 = i2 & 256;
        if (i5 == 0) {
        }
        i6 = i9;
        if ((i & 805306368) == 0) {
        }
        if (sVar.S(i4 & 1, (i4 & 306783379) != 306783378)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

}
