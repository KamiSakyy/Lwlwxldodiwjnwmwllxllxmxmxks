package com.github.rudroid.settings.codeoptions;

import androidx.compose.foundation.layout.p2;
import androidx.compose.foundation.lazy.layout.w0;
import androidx.compose.runtime.b2;
import com.github.service.models.response.type.DiffLineType;
import com.google.android.gms.internal.measurement.b4;
import f1.ub;
import g3.q0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public static final void a(int i, f fVar, w1.r rVar, DiffLineType diffLineType, androidx.compose.runtime.s sVar, int i2, int i3) {
        w1.r rVar2;
        int i4;
        int i5;
        DiffLineType diffLineType2;
        w1.r rVar3;
        k71.k.g(fVar, "codeOptions");
        sVar.e0(2020183595);
        int i6 = i2 | (sVar.d(i) ? 4 : 2) | (sVar.f(fVar) ? 32 : 16);
        int i7 = i3 & 4;
        if (i7 != 0) {
            i4 = i6 | 384;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i4 = i6 | (sVar.f(rVar2) ? 256 : 128);
        }
        int i8 = i3 & 8;
        if (i8 != 0) {
            i5 = i4 | 3072;
        } else {
            i5 = i4 | (sVar.d(diffLineType == null ? -1 : diffLineType.ordinal()) ? 2048 : 1024);
        }
        if (sVar.S(i5 & 1, (i5 & 1171) != 1170)) {
            w1.r rVar4 = i7 != 0 ? w1.o.a : rVar2;
            DiffLineType diffLineType3 = i8 != 0 ? DiffLineType.CONTEXT : diffLineType;
            long j = ih.d.b(sVar).l;
            w1.r f = f0.o.f(p2.b(rVar4, 32, 0.0f, 2), ih.d.b(sVar).k, d2.a0.b);
            boolean e = sVar.e(j);
            Object N = sVar.N();
            if (e || N == androidx.compose.runtime.n.a) {
                N = new androidx.compose.runtime.e(4, j);
                sVar.n0(N);
            }
            ub.b(String.valueOf(i), androidx.compose.foundation.layout.b.B(a2.i.d(f, (j71.c) N), ih.a.l, 2, ih.a.k, 0.0f, 8), 0L, 0L, (k3.s) null, 0L, new r3.k(6), 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).E, b91.g.l(ad.b.c(diffLineType3, fVar), sVar), t1.E(b4.H(u.a(fVar), sVar), 4294967296L), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777212), sVar, 0, 0, 130044);
            diffLineType2 = diffLineType3;
            rVar3 = rVar4;
        } else {
            sVar.V();
            diffLineType2 = diffLineType;
            rVar3 = rVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new w0(i, fVar, rVar3, diffLineType2, i2, i3);
        }
    }
}
