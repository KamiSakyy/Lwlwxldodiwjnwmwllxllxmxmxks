package com.github.rudroid.uitoolkit.banner;

import a0.d2Shadow;
import androidx.compose.runtime.b2;
import com.github.rudroid.uitoolkit.y2;
import f1.qa;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final void a(w1.r rVar, r1.d dVar, r1.d dVar2, r1.d dVar3, r1.d dVar4, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        int i2;
        sVar.e0(-1293693750);
        if ((i & 6) == 0) {
            rVar2 = rVar;
            i2 = i | (sVar.f(rVar2) ? 4 : 2);
        } else {
            rVar2 = rVar;
            i2 = i;
        }
        if (sVar.S(i2 & 1, (i2 & 9363) != 9362)) {
            qa.a(rVar2, ih.d.e(sVar).c, ih.d.b(sVar).d, 0L, 0.0f, ih.a.f, f0.o.a(0.0f, ih.d.b(sVar).p), r1.i.d(598030117, new y2(dVar, dVar3, dVar2, dVar4, 1), sVar), sVar, (i2 & 14) | 12779520, 24);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new d2Shadow(rVar, dVar, dVar2, dVar3, dVar4, i, 7);
        }
    }
}
