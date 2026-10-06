package com.github.rudroid.uitoolkit.markdown.components;

import androidx.compose.runtime.b2;
import com.github.rudroid.achievements.ui.b0;
import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final void a(w1.r rVar, String str, k91.a aVar, Map map, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        Map map2;
        k71.k.g(str, "content");
        k71.k.g(aVar, "node");
        sVar.e0(300884904);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.f(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= sVar.h(map) ? 2048 : 1024;
        }
        if (sVar.S(i3 & 1, (i3 & 1171) != 1170)) {
            if (i4 != 0) {
                rVar = w1.o.a;
            }
            w1.r rVar3 = rVar;
            Map map3 = i5 != 0 ? x61.s.r : map;
            sVar.c0(1387590177);
            g3.d dVar = new g3.d();
            g.b(ih.d.d(sVar), dVar, str, map3, aVar);
            g3.g k = dVar.k();
            sVar.q(false);
            a0.b(rVar3, k, null, sVar, i3 & 14, 4);
            map2 = map3;
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
            map2 = map;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new b0(rVar2, str, aVar, map2, i, i2, 20);
        }
    }
    public static Object c(Object p1, Object p2, Object p3, Object p4) { return null; }
    public static Object l0(Object p1) { return null; }
}
