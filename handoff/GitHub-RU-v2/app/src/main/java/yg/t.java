package yg;

import androidx.compose.runtime.b2;
import com.github.rudroid.m0;
import g3.q0;
import g3.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public static final void a(w1.r rVar, String str, boolean z, boolean z2, j71.a aVar, String str2, androidx.compose.runtime.s sVar, int i, int i2) {
        w1.r rVar2;
        int i3;
        w1.r rVar3;
        k71.k.g(str, "label");
        k71.k.g(aVar, "onClick");
        sVar.e0(1374233886);
        int i4 = i2 & 1;
        if (i4 != 0) {
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
            i3 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.g(z2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.f(str2) ? 131072 : 65536;
        }
        if (sVar.S(i3 & 1, (74899 & i3) != 74898)) {
            if (i4 != 0) {
                rVar2 = w1.o.a;
            }
            w1.r rVar4 = rVar2;
            int i5 = i3 & 1022;
            int i6 = i3 >> 3;
            n.a(rVar4, str, z, aVar, str2, new d3.k(2), null, z ? m0.d(sVar, 173641389, 2131953795, sVar, false) : m0.d(sVar, 173733676, 2131953794, sVar, false), z2 ? ih.a.k : ih.a.l, null, r1.i.d(592643221, new bg.a(z2, 8), sVar), false, sVar, i5 | (i6 & 7168) | (i6 & 57344), 6, 2624);
            rVar3 = rVar4;
        } else {
            sVar.V();
            rVar3 = rVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new ag.a(rVar3, str, z, z2, aVar, str2, i, i2, 5);
        }
    }

    public static final void b(String str, androidx.compose.runtime.s sVar, int i) {
        sVar.e0(-1275013340);
        int i2 = i | (sVar.f(str) ? 4 : 2);
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            int i3 = (i2 << 6) & 896;
            com.github.rudroid.uitoolkit.j.b(androidx.compose.foundation.layout.b.y(w1.o.a, ih.a.k, ih.a.j), null, str, 0.0f, q0.a(ih.d.f(sVar).t, ih.d.b(sVar).q0, 0L, (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (z) null, (r3.i) null, 16777214), ih.d.e(sVar).f, 0, ih.d.b(sVar).o0, ih.d.b(sVar).p0, 0.0f, null, 0L, str, sVar, i3 | 805306374, i3, 3146);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new bd.m(i, str, 16);
        }
    }
    public static Object L(Object p1) { return null; }
    public Object a(Object, Object, int) { return null; }
}
