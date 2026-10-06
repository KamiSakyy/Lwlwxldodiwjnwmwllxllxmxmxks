package xg;

import androidx.compose.foundation.layout.x0;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.b2;
import d1.d0;
import t.z;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public static final void a(w1.r rVar, j71.a aVar, r1.d dVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        k71.k.g(aVar, "onDialogDismiss");
        sVar.e0(-1290898133);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(dVar) ? 256 : 128;
        }
        if (sVar.S(i3 & 1, (i3 & 147) != 146)) {
            rVar2 = i4 != 0 ? w1.o.a : rVar;
            z.a(aVar, new w3.t(3), r1.i.d(-2112737356, new d0(rVar2, dVar), sVar), sVar, ((i3 >> 3) & 14) | 432);
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new w0(rVar2, aVar, dVar, i, i2, 23);
        }
    }

    public static final void b(w1.r rVar, j71.f fVar, r1.d dVar, r1.d dVar2, j71.a aVar, androidx.compose.runtime.s sVar, int i, int i2) {
        int i3;
        w1.r rVar2;
        j71.a aVar2;
        j71.a aVar3;
        sVar.e0(348417579);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= sVar.h(fVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(dVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(dVar2) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= sVar.h(aVar) ? 16384 : 8192;
        }
        if (sVar.S(i3 & 1, (i3 & 9363) != 9362)) {
            if (i4 != 0) {
                rVar = w1.o.a;
            }
            if (i5 != 0) {
                fVar = j.a;
            }
            if (i6 != 0) {
                Object N = sVar.N();
                if (N == androidx.compose.runtime.n.a) {
                    N = new com.github.rudroid.widget.p(15);
                    sVar.n0(N);
                }
                aVar3 = (j71.a) N;
            } else {
                aVar3 = aVar;
            }
            w1.r rVar3 = rVar;
            a(rVar3, aVar3, r1.i.d(1671523166, new dc.p(fVar, dVar, dVar2, 4), sVar), sVar, (i3 & 14) | 384 | ((i3 >> 9) & 112), 0);
            rVar2 = rVar3;
            aVar2 = aVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
            aVar2 = aVar;
        }
        j71.f fVar2 = fVar;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new x0(rVar2, fVar2, dVar, dVar2, aVar2, i, i2);
        }
    }
    public Object B(Object p1) { return null; }
    public static Object L(Object p1) { return null; }
    public static final Object j = null;
}
