package sg;

import a0.g2;
import a0.h2;
import androidx.compose.runtime.b2;
import com.github.rudroid.fragments.ui.j1;
import d2.v0;
import java.util.LinkedHashMap;
import z.e1;
import z.g1;
import z.s0;
import z.t0;
import z.u0;
import z.x0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public static final void a(final String str, final int i, final boolean z, final int i2, final j71.a aVar, w1.r rVar, final int i3, androidx.compose.runtime.s sVar, final int i4, final int i5) {
        int i6;
        boolean z2;
        w1.r rVar2;
        int i7;
        final w1.r rVar3;
        k71.k.g(str, "label");
        k71.k.g(aVar, "onClick");
        sVar.e0(-1656725797);
        if ((i4 & 6) == 0) {
            i6 = (sVar.f(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i8 = i6 | (sVar.d(i) ? 32 : 16);
        if ((i4 & 384) == 0) {
            z2 = z;
            i8 |= sVar.g(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i4 & 3072) == 0) {
            i8 |= sVar.d(i2) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i8 |= sVar.h(aVar) ? 16384 : 8192;
        }
        int i9 = i5 & 32;
        if (i9 != 0) {
            i7 = i8 | 196608;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i7 = i8 | (sVar.f(rVar2) ? 131072 : 65536);
        }
        if ((1572864 & i4) == 0) {
            i7 |= sVar.d(i3) ? 1048576 : 524288;
        }
        if (sVar.S(i7 & 1, (599187 & i7) != 599186)) {
            w1.r rVar4 = i9 != 0 ? w1.o.a : rVar2;
            int i11 = (i2 - 1) - i3;
            int i12 = (i11 >= 0 ? i11 : 0) * 50;
            int i13 = i3 * 50;
            a0.w wVar = a0.c0.a;
            g2 g2Var = new g2(250, i12, wVar);
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = androidx.compose.runtime.n.a;
            if (N == iVar) {
                N = new s5.a(13);
                sVar.n0(N);
            }
            h2 h2Var = z.n0.a;
            int i14 = i7;
            s0 a = new s0(new g1((u0) null, new e1(new z.m0(1, (j71.c) N), g2Var), (z.b0) null, (x0) null, (LinkedHashMap) null, 125)).a(z.n0.e(new g2(250, i12, wVar), 2)).a(z.n0.g(new g2(250, i12, wVar), 0.8f));
            g2 g2Var2 = new g2(150, i13, wVar);
            Object N2 = sVar.N();
            if (N2 == iVar) {
                N2 = new s5.a(14);
                sVar.n0(N2);
            }
            z.x.e(z2, (w1.r) null, a, new t0(new g1((u0) null, new e1(new z.m0(3, (j71.c) N2), g2Var2), (z.b0) null, (x0) null, (LinkedHashMap) null, 125)).a(z.n0.f(new g2(150, i13, wVar), 2)).a(new t0(new g1((u0) null, (e1) null, (z.b0) null, new x0(0.8f, v0.b, new g2(150, i13, wVar)), (LinkedHashMap) null, 119))), no.a.k("fab_menu_item_", i3), r1.i.d(-1983364349, new j1(str, aVar, rVar4, i), sVar), sVar, ((i14 >> 6) & 14) | 196608, 2);
            rVar3 = rVar4;
        } else {
            sVar.V();
            rVar3 = rVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: sg.s
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    t.a(str, i, z, i2, aVar, rVar3, i3, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i4 | 1), i5);
                    return w61.a0.a;
                }
            };
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(w1.r rVar, w1.r rVar2, boolean z, j71.c cVar, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar3;
        w1.r rVar4;
        w1.r rVar5;
        b2 t;
        k71.k.g(cVar, "onExpandedChange");
        sVar.e0(224211677);
        int i3 = i | 6;
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 = i | 54;
        } else if ((i & 48) == 0) {
            rVar3 = rVar2;
            i3 |= sVar.f(rVar3) ? 32 : 16;
            if ((i & 384) == 0) {
                i3 |= sVar.g(zShadow) ? 256 : 128;
            }
            if ((i & 3072) == 0) {
                i3 |= sVar.h(cVar) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                i3 |= sVar.h(dVar) ? 16384 : 8192;
            }
            if (sVar.S(i3 & 1, (i3 & 9363) == 9362)) {
                sVar.V();
                rVar4 = rVar;
                rVar5 = rVar3;
            } else {
                rVar4 = w1.o.a;
                w1.r rVar6 = i4 != 0 ? rVar4 : rVar3;
                rVar5 = rVar6;
                ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-1200381041, new bd.p(z, cVar, rVar6, dVar), sVar), sVar, 805306374, 510);
            }
            t = sVar.t();
            if (t == null) {
                t.d = new com.github.rudroid.feed.ui.j(rVar4, rVar5, z, cVar, dVar, i, i2);
                return;
            }
            return;
        }
        rVar3 = rVar2;
        if ((i & 384) == 0) {
        }
        if ((i & 3072) == 0) {
        }
        if ((i & 24576) == 0) {
        }
        if (sVar.S(i3 & 1, (i3 & 9363) == 9362)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
    public static final Object d = null;
    public static final Object j = null;
    public static final Object k = null;
    public Object b(float, long) { return null; }
}
