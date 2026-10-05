package eh;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.d2;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.layout.w1;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import d2.a0;
import f0.o;
import f1.ub;
import g3.q0;
import g3.z;
import java.util.Map;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {
    public static final void a(r rVar, g3.g gVar, String str, String str2, q0 q0Var, q0 q0Var2, q0 q0Var3, String str3, j71.a aVar, d2 d2Var, long j, s sVar, int i, int i2) {
        int i3;
        int i4;
        boolean z;
        boolean z2;
        s sVar2 = sVar;
        k71.k.g(aVar, "onClick");
        sVar2.e0(-315634456);
        if ((i & 6) == 0) {
            i3 = (sVar2.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar2.f(gVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar2.f(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar2.f(str2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar2.f(q0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar2.f(q0Var2) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar2.f(q0Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= sVar2.f(str3) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= sVar2.h(aVar) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= sVar2.f(d2Var) ? 536870912 : 268435456;
        }
        int i5 = i3;
        if ((i2 & 6) == 0) {
            i4 = i2 | (sVar2.e(j) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (sVar2.S(i5 & 1, ((i5 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            sVar2.X();
            if ((i & 1) != 0 && !sVar2.A()) {
                sVar2.V();
            }
            sVar2.r();
            r b = p2.b(rVar, 0.0f, ih.a.F, 1);
            d3.k kVar = new d3.k(0);
            boolean z3 = (i5 & 234881024) == 67108864;
            Object N = sVar2.N();
            if (z3 || N == n.a) {
                N = new com.github.rudroid.uitoolkit.markdown.components.c(9, aVar);
                sVar2.n0(N);
            }
            r e = p2.e(androidx.compose.foundation.layout.b.w(o.f(o.m(b, false, str2, kVar, (j71.a) N, 9), j, a0.b), d2Var), 1.0f);
            l2 a = j2.a(l.g, w1.c.B, sVar2, 54);
            int hashCode = Long.hashCode(sVar2.T);
            v1 l = sVar2.l();
            r c = w1.a.c(sVar2, e);
            v2.h.o.getClass();
            v2.f fVar = v2.g.b;
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            v2.e eVar = v2.g.f;
            t.I(sVar2, eVar, a);
            v2.e eVar2 = v2.g.e;
            t.I(sVar2, eVar2, l);
            Integer valueOf = Integer.valueOf(hashCode);
            v2.e eVar3 = v2.g.g;
            t.w(sVar2, valueOf, eVar3);
            v2.d dVar = v2.g.h;
            t.E(sVar2, dVar);
            v2.e eVar4 = v2.g.d;
            t.I(sVar2, eVar4, c);
            if (2.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            r B = androidx.compose.foundation.layout.b.B(new w1(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true), 0.0f, 0.0f, ih.a.n, 0.0f, 11);
            e0 a2 = c0.a(l.c, w1.c.D, sVar2, 0);
            int hashCode2 = Long.hashCode(sVar2.T);
            v1 l2 = sVar2.l();
            r c2 = w1.a.c(sVar2, B);
            sVar2.g0();
            if (sVar2.S) {
                sVar2.k(fVar);
            } else {
                sVar2.q0();
            }
            t.I(sVar2, eVar, a2);
            t.I(sVar2, eVar2, l2);
            f1.e.t(hashCode2, sVar2, eVar3, sVar2, dVar);
            t.I(sVar2, eVar4, c2);
            int i6 = i5 << 9;
            ub.c(gVar, (r) null, 0L, 0L, (k3.i) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (Map) null, (j71.c) null, q0Var2, sVar2, (i5 >> 3) & 14, i6 & 234881024, 262142);
            s sVar3 = sVar2;
            if (str == null) {
                sVar3.c0(1714989244);
                sVar3.q(false);
                z2 = false;
                z = true;
            } else {
                sVar3.c0(1714989245);
                int i7 = i6 & 29360128;
                z = true;
                z2 = false;
                ub.b(str, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0Var, sVar, 0, i7, 131070);
                sVar3 = sVar;
                sVar3.q(false);
            }
            sVar3.q(z);
            if (1.0f <= 0.0d) {
                l0.a.a("invalid weight; must be greater than zero");
            }
            ub.b(str3, new w1(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, z2), 0L, 0L, (k3.s) null, 0L, new r3.k(6), 0L, 0, false, 0, 0, (j71.c) null, q0Var3, sVar, (i5 >> 21) & 14, (i5 << 3) & 29360128, 130044);
            sVar2 = sVar;
            sVar2.q(z);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new j(rVar, gVar, str, str2, q0Var, q0Var2, q0Var3, str3, aVar, d2Var, j, i, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00e1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(r rVar, String str, String str2, String str3, q0 q0Var, q0 q0Var2, q0 q0Var3, String str4, j71.a aVar, d2 d2Var, long j, s sVar, int i, int i2) {
        String str5;
        int i3;
        String str6;
        q0 q0Var4;
        String str7;
        int i4;
        d2 d2Var2;
        int i5;
        int i6;
        long j2;
        int i7;
        q0 q0Var5;
        q0 q0Var6;
        d2 d2Var3;
        long j3;
        String str8;
        q0 q0Var7;
        r rVar2;
        b2 t;
        int i8;
        long j4;
        int i9;
        String str9;
        q0 q0Var8;
        int i11;
        k71.k.g(str, "text");
        k71.k.g(aVar, "onClick");
        sVar.e0(232677678);
        int i12 = i | 6;
        if ((i & 48) == 0) {
            i12 |= sVar.f(str) ? 32 : 16;
        }
        int i13 = i2 & 4;
        if (i13 != 0) {
            i12 |= 384;
        } else if ((i & 384) == 0) {
            str5 = str2;
            i12 |= sVar.f(str5) ? 256 : 128;
            i3 = i2 & 8;
            if (i3 == 0) {
                i12 |= 3072;
            } else if ((i & 3072) == 0) {
                str6 = str3;
                i12 |= sVar.f(str6) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    if ((i2 & 16) == 0) {
                        q0Var4 = q0Var;
                        if (sVar.f(q0Var4)) {
                            i11 = 16384;
                            i12 |= i11;
                        }
                    } else {
                        q0Var4 = q0Var;
                    }
                    i11 = 8192;
                    i12 |= i11;
                } else {
                    q0Var4 = q0Var;
                }
                if ((196608 & i) == 0) {
                    i12 |= 65536;
                }
                if ((1572864 & i) == 0) {
                    i12 |= 524288;
                }
                if ((12582912 & i) == 0) {
                    str7 = str4;
                    i12 |= sVar.f(str7) ? 8388608 : 4194304;
                } else {
                    str7 = str4;
                }
                if ((100663296 & i) == 0) {
                    i12 |= sVar.h(aVar) ? 67108864 : 33554432;
                }
                i4 = i2 & 512;
                if (i4 != 0) {
                    i12 |= 805306368;
                } else if ((805306368 & i) == 0) {
                    d2Var2 = d2Var;
                    i12 |= sVar.f(d2Var2) ? 536870912 : 268435456;
                    i5 = i12;
                    if ((i2 & 1024) != 0) {
                        i6 = i13;
                        j2 = j;
                        if (sVar.e(j2)) {
                            i7 = 4;
                            if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i7 & 3) != 2)) {
                                sVar.X();
                                if ((i & 1) == 0 || sVar.A()) {
                                    if (i6 != 0) {
                                        str5 = null;
                                    }
                                    if (i3 != 0) {
                                        str6 = null;
                                    }
                                    if ((i2 & 16) != 0) {
                                        i8 = i5 & (-57345);
                                        q0Var4 = ih.d.f(sVar).q;
                                    } else {
                                        i8 = i5;
                                    }
                                    q0 q0Var9 = ih.d.f(sVar).l;
                                    q0 a = q0.a(q0Var9, ih.d.b(sVar).F, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214);
                                    int i14 = i8 & (-4128769);
                                    if (i4 != 0) {
                                        float f = ih.a.n;
                                        d2Var2 = new f2(f, f, f, f);
                                    }
                                    int i15 = i2 & 1024;
                                    r rVar3 = w1.o.a;
                                    if (i15 != 0) {
                                        rVar2 = rVar3;
                                        j4 = ih.d.b(sVar).b;
                                        q0Var6 = a;
                                        i9 = i14;
                                        str9 = str6;
                                        q0Var7 = q0Var4;
                                        i7 = 0;
                                    } else {
                                        long j5 = j2;
                                        rVar2 = rVar3;
                                        j4 = j5;
                                        q0Var6 = a;
                                        i9 = i14;
                                        str9 = str6;
                                        q0Var7 = q0Var4;
                                    }
                                    q0Var8 = q0Var9;
                                } else {
                                    sVar.V();
                                    i9 = ((i2 & 16) != 0 ? i5 & (-57345) : i5) & (-4128769);
                                    q0Var6 = q0Var3;
                                    j4 = j2;
                                    if ((i2 & 1024) != 0) {
                                        str9 = str6;
                                        q0Var7 = q0Var4;
                                        i7 = 0;
                                    } else {
                                        str9 = str6;
                                        q0Var7 = q0Var4;
                                    }
                                    rVar2 = rVar;
                                    q0Var8 = q0Var2;
                                }
                                sVar.r();
                                a(rVar2, new g3.g(str), str5, str9, q0Var7, q0Var8, q0Var6, str7, aVar, d2Var2, j4, sVar, i9 & 2147483534, i7 & 14);
                                str8 = str9;
                                q0Var5 = q0Var8;
                                d2Var3 = d2Var2;
                                j3 = j4;
                            } else {
                                sVar.V();
                                q0Var5 = q0Var2;
                                q0Var6 = q0Var3;
                                d2Var3 = d2Var2;
                                j3 = j2;
                                str8 = str6;
                                q0Var7 = q0Var4;
                                rVar2 = rVar;
                            }
                            t = sVar.t();
                            if (t != null) {
                                t.d = new j(rVar2, str, str5, str8, q0Var7, q0Var5, q0Var6, str4, aVar, d2Var3, j3, i, i2);
                                return;
                            }
                            return;
                        }
                    } else {
                        i6 = i13;
                        j2 = j;
                    }
                    i7 = 2;
                    if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i7 & 3) != 2)) {
                    }
                    t = sVar.t();
                    if (t != null) {
                    }
                }
                d2Var2 = d2Var;
                i5 = i12;
                if ((i2 & 1024) != 0) {
                }
                i7 = 2;
                if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i7 & 3) != 2)) {
                }
                t = sVar.t();
                if (t != null) {
                }
            }
            str6 = str3;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if ((1572864 & i) == 0) {
            }
            if ((12582912 & i) == 0) {
            }
            if ((100663296 & i) == 0) {
            }
            i4 = i2 & 512;
            if (i4 != 0) {
            }
            d2Var2 = d2Var;
            i5 = i12;
            if ((i2 & 1024) != 0) {
            }
            i7 = 2;
            if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i7 & 3) != 2)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        str5 = str2;
        i3 = i2 & 8;
        if (i3 == 0) {
        }
        str6 = str3;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if ((1572864 & i) == 0) {
        }
        if ((12582912 & i) == 0) {
        }
        if ((100663296 & i) == 0) {
        }
        i4 = i2 & 512;
        if (i4 != 0) {
        }
        d2Var2 = d2Var;
        i5 = i12;
        if ((i2 & 1024) != 0) {
        }
        i7 = 2;
        if (sVar.S(i5 & 1, (i5 & 306783379) == 306783378 || (i7 & 3) != 2)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }


}
