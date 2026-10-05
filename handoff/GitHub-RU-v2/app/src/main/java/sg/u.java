package sg;

import androidx.compose.foundation.layout.f2;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.i3;
import f1.p0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, j71.a aVar, w1.r rVar, boolean z) {
        w1.r rVar2;
        int i3;
        w1.r rVar3;
        k71.k.g(aVar, "onClick");
        sVar.e0(1487943385);
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
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.g(z) ? 256 : 128;
        }
        int i5 = i3;
        if (sVar.S(i5 & 1, (i5 & 147) != 146)) {
            w1.r rVar4 = i4 != 0 ? w1.o.a : rVar2;
            i3 b = a0.j.b(z ? 1.0f : 0.0f, (a0.o) null, "JumpToBottom opacity animation", sVar, 3072, 22);
            i3 a = a0.j.a(z ? 32 : 0, a0.f.r(1.0f, 200.0f, (Object) null, 4), "JumpToBottom expansion animation", sVar, 432, 8);
            w1.r o = p2.o(a2.i.a(rVar4, ((Number) b.getValue()).floatValue()), ((s3.f) a.getValue()).r);
            long j = ih.d.b(sVar).d;
            f1.o0 d = p0.d(j, ih.d.b(sVar).G, j, d2.t.b(0.38f, ih.d.a(sVar).e), sVar, 0);
            r0.d dVar = ih.d.e(sVar).h;
            float f = ih.a.k;
            b.e(o, aVar, d, null, dVar, false, new f2(f, f, f, f), ((s3.f) a.getValue()).r, f.a, sVar, (i5 & 112) | 102239232, 32);
            rVar3 = rVar4;
        } else {
            sVar.V();
            rVar3 = rVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.feed.ui.h0(rVar3, aVar, z, i, i2, 4);
        }
    }
}
