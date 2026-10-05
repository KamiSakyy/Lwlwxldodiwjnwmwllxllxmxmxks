package com.github.rudroid.widget;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.profile.status.ui.x;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final void a(int i, s sVar, j71.a aVar, String str, m6.e eVar, z5.n nVar) {
        s sVar2;
        k71.k.g(aVar, "clickAction");
        sVar.e0(330648007);
        int i2 = (sVar.f(eVar) ? 4 : 2) | i | (sVar.h(aVar) ? 32 : 16) | (sVar.f(str) ? 256 : 128) | 3072;
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            z5.n a = j.a(sVar);
            z5.n nVar2 = z5.l.a;
            sVar2 = sVar;
            b31.b.a(a.d(nVar2), i6.c.e, r1.i.d(1942095913, new x(str, eVar, aVar), sVar), sVar2, 384, 0);
            nVar = nVar2;
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new h(eVar, aVar, str, nVar, i);
        }
    }

}
