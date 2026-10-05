package zg;

import a0.d2;
import androidx.compose.foundation.layout.e1;
import androidx.compose.foundation.layout.j2;
import androidx.compose.foundation.layout.l2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.v1;
import com.github.rudroid.uitoolkit.y1;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k0 {
    /* JADX WARN: Removed duplicated region for block: B:101:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x024d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, final String str, List list, final String str2, final String str3, final String str4, final j71.a aVar, final j71.a aVar2, final j71.a aVar3, final j71.a aVar4, final int i, androidx.compose.runtime.s sVar, final int i2, final int i3, final int i4) {
        List list2;
        int i5;
        int i6;
        final w1.r rVar2;
        final List list3;
        b2 t;
        androidx.compose.runtime.s sVar2 = sVar;
        k71.k.g(str, "avatarUrl");
        k71.k.g(str2, "avatarContentDescription");
        k71.k.g(str3, "repositoryLogin");
        k71.k.g(str4, "repositoryName");
        k71.k.g(aVar, "onAvatarClick");
        k71.k.g(aVar2, "onRepositoryLoginClick");
        k71.k.g(aVar3, "onRepositoryNameClick");
        sVar2.e0(-2067178181);
        int i7 = i2 | 6;
        if ((i2 & 48) == 0) {
            i7 |= sVar2.f(str) ? 32 : 16;
        }
        int i8 = i4 & 4;
        if (i8 != 0) {
            i7 |= 384;
        } else if ((i2 & 384) == 0) {
            list2 = list;
            i7 |= sVar2.h(list2) ? 256 : 128;
            if ((i2 & 3072) == 0) {
                i7 |= sVar2.f(str2) ? 2048 : 1024;
            }
            if ((i2 & 24576) == 0) {
                i7 |= sVar2.f(str3) ? 16384 : 8192;
            }
            if ((196608 & i2) == 0) {
                i7 |= sVar2.f(str4) ? 131072 : 65536;
            }
            if ((1572864 & i2) == 0) {
                i7 |= sVar2.h(aVar) ? 1048576 : 524288;
            }
            if ((12582912 & i2) == 0) {
                i7 |= sVar2.h(aVar2) ? 8388608 : 4194304;
            }
            if ((100663296 & i2) == 0) {
                i7 |= sVar2.h(aVar3) ? 67108864 : 33554432;
            }
            if ((805306368 & i2) == 0) {
                i7 |= sVar2.h(aVar4) ? 536870912 : 268435456;
            }
            if ((i3 & 6) != 0) {
                i5 = i;
                i6 = i3 | (sVar2.d(i5) ? 4 : 2);
            } else {
                i5 = i;
                i6 = i3;
            }
            if (sVar2.S(i7 & 1, (i7 & 306783379) == 306783378 || (i6 & 3) != 2)) {
                sVar2.V();
                rVar2 = rVar;
                list3 = list2;
            } else {
                List list4 = i8 != 0 ? x61.r.r : list2;
                String q0 = i4.q0(2131953412, new Object[]{str3, str4, Integer.valueOf(i5)}, sVar2);
                w1.r rVar3 = w1.o.a;
                w1.r b = p2.b(androidx.compose.foundation.layout.b.z(p2.e(rVar3, 1.0f), ih.a.n, 0.0f, 2), 0.0f, ih.a.K, 1);
                boolean f = sVar2.f(q0);
                Object N = sVar2.N();
                Object obj = androidx.compose.runtime.n.a;
                if (f || N == obj) {
                    N = new tj.b(q0, 24);
                    sVar2.n0(N);
                }
                w1.r b2 = d3.q.b(b, true, (j71.c) N);
                l2 a = j2.a(androidx.compose.foundation.layout.l.a, w1.c.B, sVar2, 48);
                int hashCode = Long.hashCode(sVar2.T);
                v1 l = sVar2.l();
                w1.r c = w1.a.c(sVar2, b2);
                v2.h.o.getClass();
                List list5 = list4;
                v2.f fVar = v2.g.b;
                sVar2.g0();
                if (sVar2.S) {
                    sVar2.k(fVar);
                } else {
                    sVar2.q0();
                }
                androidx.compose.runtime.t.I(sVar2, v2.g.f, a);
                androidx.compose.runtime.t.I(sVar2, v2.g.e, l);
                androidx.compose.runtime.t.w(sVar2, Integer.valueOf(hashCode), v2.g.g);
                androidx.compose.runtime.t.E(sVar2, v2.g.h);
                androidx.compose.runtime.t.I(sVar2, v2.g.d, c);
                w1.r o = p2.o(rVar3, ih.a.u);
                boolean z = (3670016 & i7) == 1048576;
                Object N2 = sVar2.N();
                if (z || N2 == obj) {
                    N2 = new qd.g(21, aVar);
                    sVar2.n0(N2);
                }
                y1.a(f0.o.m(o, false, (String) null, (d3.k) null, (j71.a) N2, 15), str, null, list5, false, str2, null, null, null, true, sVar, (i7 & 112) | ((i7 << 3) & 7168) | (458752 & (i7 << 6)), 6, 980);
                sVar2 = sVar;
                w1.r B = androidx.compose.foundation.layout.b.B(rVar3, ih.a.l, 0.0f, 0.0f, 0.0f, 14);
                float f2 = ih.a.k;
                androidx.compose.foundation.layout.b.c(B, androidx.compose.foundation.layout.l.g(f2), androidx.compose.foundation.layout.l.g(f2), (w1.i) null, 0, 0, r1.i.d(-721700462, new j71.f() { // from class: zg.i0
                    public final Object f(Object obj2, Object obj3, Object obj4) {
                        androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj3;
                        int intValue = ((Integer) obj4).intValue();
                        k71.k.g((e1) obj2, "$this$FlowRow");
                        if (sVar3.S(intValue & 1, (intValue & 17) != 16)) {
                            ub.a(ih.d.f(sVar3).x, r1.i.d(-1424148863, new d2(aVar2, str3, aVar3, str4, aVar4, i, 14), sVar3), sVar3, 48);
                        } else {
                            sVar3.V();
                        }
                        return w61.a0.a;
                    }
                }, sVar2), sVar2, 1573302, 56);
                sVar2.q(true);
                list3 = list5;
                rVar2 = rVar3;
            }
            t = sVar2.t();
            if (t == null) {
                t.d = new j71.e() { // from class: zg.j0
                    public final Object s(Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        int L = androidx.compose.runtime.t.L(i2 | 1);
                        int L2 = androidx.compose.runtime.t.L(i3);
                        k0.a(rVar2, str, list3, str2, str3, str4, aVar, aVar2, aVar3, aVar4, i, (androidx.compose.runtime.s) obj2, L, L2, i4);
                        return w61.a0.a;
                    }
                };
                return;
            }
            return;
        }
        list2 = list;
        if ((i2 & 3072) == 0) {
        }
        if ((i2 & 24576) == 0) {
        }
        if ((196608 & i2) == 0) {
        }
        if ((1572864 & i2) == 0) {
        }
        if ((12582912 & i2) == 0) {
        }
        if ((100663296 & i2) == 0) {
        }
        if ((805306368 & i2) == 0) {
        }
        if ((i3 & 6) != 0) {
        }
        if (sVar2.S(i7 & 1, (i7 & 306783379) == 306783378 || (i6 & 3) != 2)) {
        }
        t = sVar2.t();
        if (t == null) {
        }
    }
}
