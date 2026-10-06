package bh;

import androidx.compose.foundation.layout.c0;
import androidx.compose.foundation.layout.e0;
import androidx.compose.foundation.layout.l;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import androidx.compose.runtime.v1;
import c21.h0;
import com.github.rudroid.uitoolkit.k0;
import com.github.rudroid.uitoolkit.markdown.components.i;
import com.github.rudroid.uitoolkit.markdown.components.j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import k71.k;
import sy.d0Shadow;
import v2.f;
import v2.g;
import v2.h;
import w1.o;
import w1.r;
import w61.a0;
import x61.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:70:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(r rVar, String str, k91.a aVar, List list, j71.c cVar, Map map, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        List list2;
        int i4;
        Map map2;
        int i5;
        r rVar3;
        List list3;
        Map map3;
        b2 t;
        k91.a aVar2;
        boolean z;
        String str2 = str;
        j71.c cVar2 = cVar;
        k.g(str2, "content");
        k.g(aVar, "rootNode");
        k.g(cVar2, "onCopyCode");
        sVar.e0(487060653);
        int i6 = i2 & 1;
        if (i6 != 0) {
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
            i3 |= sVar.f(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        int i7 = i2 & 8;
        if (i7 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            list2 = list;
            i3 |= sVar.h(list2) ? 2048 : 1024;
            if ((i & 24576) == 0) {
                i3 |= sVar.h(cVar2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else if ((196608 & i) == 0) {
                map2 = map;
                i3 |= sVar.h(map2) ? 131072 : 65536;
                i5 = i3;
                if (sVar.S(i5 & 1, (74899 & i5) != 74898)) {
                    r rVar4 = i6 != 0 ? o.a : rVar2;
                    List list4 = i7 != 0 ? x61.rShadow.r : list2;
                    Map map4 = i4 != 0 ? x61.s.r : map2;
                    e0 a = c0.a(l.c, w1.c.D, sVar, 0);
                    int hashCode = Long.hashCode(sVar.T);
                    v1 l = sVar.l();
                    r c = w1.a.c(sVar, rVar4);
                    h.o.getClass();
                    f fVar = g.b;
                    sVar.g0();
                    if (sVar.S) {
                        sVar.k(fVar);
                    } else {
                        sVar.q0();
                    }
                    t.I(sVar, g.f, a);
                    t.I(sVar, g.e, l);
                    t.w(sVar, Integer.valueOf(hashCode), g.g);
                    t.E(sVar, g.h);
                    t.I(sVar, g.d, c);
                    sVar.c0(-1026051073);
                    List a2 = aVar.a();
                    ArrayList arrayList = new ArrayList(n.F(a2, 10));
                    int i8 = 0;
                    for (Object obj : a2) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            d0Shadow.x();
                            throw null;
                        }
                        k91.a aVar3 = (k91.a) obj;
                        if (i8 == d0Shadow.m(aVar.a())) {
                            aVar2 = aVar3;
                            z = true;
                        } else {
                            aVar2 = aVar3;
                            z = false;
                        }
                        b(str2, aVar2, list4, z, cVar2, map4, sVar, ((i5 >> 3) & 910) | (i5 & 57344) | (i5 & 458752));
                        arrayList.add(a0.a);
                        str2 = str;
                        cVar2 = cVar;
                        i8 = i9;
                    }
                    sVar.q(false);
                    sVar.q(true);
                    list3 = list4;
                    map3 = map4;
                    rVar3 = rVar4;
                } else {
                    sVar.V();
                    rVar3 = rVar2;
                    list3 = list2;
                    map3 = map2;
                }
                t = sVar.t();
                if (t != null) {
                    t.d = new ab.g(rVar3, str, aVar, list3, cVar, map3, i, i2);
                    return;
                }
                return;
            }
            map2 = map;
            i5 = i3;
            if (sVar.S(i5 & 1, (74899 & i5) != 74898)) {
            }
            t = sVar.t();
            if (t != null) {
            }
        }
        list2 = list;
        if ((i & 24576) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        map2 = map;
        i5 = i3;
        if (sVar.S(i5 & 1, (74899 & i5) != 74898)) {
        }
        t = sVar.t();
        if (t != null) {
        }
    }

    public static final void b(String str, k91.a aVar, List list, boolean z, j71.c cVar, Map map, s sVar, int i) {
        int i2;
        Map map2;
        s sVar2 = sVar;
        sVar2.e0(1958526314);
        if ((i & 6) == 0) {
            i2 = (sVar2.f(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= sVar2.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar2.h(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar2.g(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar2.h(cVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            map2 = map;
            i2 |= sVar2.h(map2) ? 131072 : 65536;
        } else {
            map2 = map;
        }
        if (sVar2.S(i2 & 1, (74899 & i2) != 74898)) {
            boolean z2 = !z;
            Object N = sVar2.N();
            if (N == androidx.compose.runtime.n.a) {
                N = new bf.c(4);
                sVar2.n0(N);
            }
            r a = com.github.rudroid.uitoolkit.extensions.d.a(o.a, z2, (j71.c) N);
            h0 h0Var = aVar.a;
            if (k.b(h0Var, j91.a.w) || k.b(h0Var, j91.a.x) || k.b(h0Var, j91.a.y) || k.b(h0Var, j91.a.z) || k.b(h0Var, j91.a.A) || k.b(h0Var, j91.a.B) || k.b(h0Var, j91.a.C) || k.b(h0Var, j91.a.D)) {
                int i3 = i2;
                sVar2.c0(-672583373);
                com.github.rudroid.uitoolkit.markdown.components.f.a(a, str, aVar, 0L, sVar, (i3 << 3) & 1008);
                sVar2 = sVar;
                sVar2.q(false);
            } else if (k.b(h0Var, j91.a.c) || k.b(h0Var, j91.a.b)) {
                int i4 = i2;
                sVar2.c0(-672307659);
                i.a(a, str, aVar, 0, sVar2, (i4 << 3) & 1008, 8);
                sVar2.q(false);
            } else if (k.b(h0Var, j91.a.g) || k.b(h0Var, j91.a.h) || k.b(h0Var, j91.a.f)) {
                int i5 = i2;
                sVar2.c0(-671997008);
                com.github.rudroid.uitoolkit.markdown.components.d.b(a, str, aVar, cVar, list, sVar2, ((i5 << 3) & 1008) | ((i5 >> 3) & 7168) | ((i5 << 6) & 57344));
                sVar2 = sVar2;
                sVar2.q(false);
            } else if (k.b(h0Var, j91.a.j)) {
                sVar2.c0(-671666579);
                j.a(a, str, aVar, map2, sVar2, ((i2 >> 6) & 7168) | ((i2 << 3) & 1008), 0);
                sVar2.q(false);
            } else if (k.b(h0Var, j91.a.T)) {
                sVar2.c0(948174766);
                sVar2.q(false);
            } else if (k.b(h0Var, j91.a.f0)) {
                sVar2.c0(-671300655);
                k0.a(a, 0L, 0L, 0.0f, false, sVar2, 0, 30);
                sVar2.q(false);
            } else if (k.b(h0Var, n91.b.b)) {
                sVar2.c0(-671168719);
                com.github.rudroid.uitoolkit.markdown.components.s.a(a, str, aVar, map, sVar2, ((i2 << 3) & 1008) | ((i2 >> 6) & 7168));
                sVar2.q(false);
            } else {
                sVar2.c0(-670870096);
                j.a(a, str, aVar, null, sVar2, (i2 << 3) & 1008, 8);
                sVar2.q(false);
            }
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new b(str, aVar, list, z, cVar, map, i, 0);
        }
    }

}
