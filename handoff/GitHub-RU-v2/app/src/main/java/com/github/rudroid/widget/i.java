package com.github.rudroid.widget;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final void a(int i, s sVar, j71.a aVar, String str, m6.e eVar, z5.n nVar) {
        s sVar2;
        k71.k.g(aVar, "onClick");
        k71.k.g(str, "text");
        sVar.e0(-998960635);
        int i2 = i | 6 | (sVar.h(aVar) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | (sVar.f(eVar) ? 2048 : 1024);
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            float f = ih.a.n;
            float f2 = ih.a.l;
            i6.o oVar = new i6.o(i21.a.L(f), i21.a.L(f2), i21.a.L(f), i21.a.L(f2));
            sVar.d0(-752811653);
            z5.n d = oVar.d(new a6.b(i21.a.e(aVar, sVar)));
            sVar.q(false);
            sVar2 = sVar;
            b31.b.a(d, i6.c.e, r1.i.d(1583086823, new a(str, eVar, 1), sVar), sVar2, 384, 0);
            nVar = z5.l.a;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        z5.n nVar2 = nVar;
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new h(nVar2, aVar, str, eVar, i);
        }
    }

    public Object d(Object p1, Object p2, Object p3) { return null; }
}
