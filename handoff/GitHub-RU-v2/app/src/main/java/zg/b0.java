package zg;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.uitoolkit.text.p0;
import g3.q0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b0 {
    public static final void a(w1.r rVar, String str, int i, String str2, long j, long j2, long j3, androidx.compose.runtime.s sVar, int i2, int i3) {
        w1.r rVar2;
        int i4;
        int i5;
        long j4;
        long j5;
        long j6;
        w1.r rVar3;
        k71.k.g(str, "title");
        k71.k.g(str2, "contentDescription");
        sVar.e0(1303464186);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
            rVar2 = rVar;
        } else if ((i2 & 6) == 0) {
            rVar2 = rVar;
            i4 = (sVar.f(rVar2) ? 4 : 2) | i2;
        } else {
            rVar2 = rVar;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= sVar.f(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i5 = i;
            i4 |= sVar.d(i5) ? 256 : 128;
        } else {
            i5 = i;
        }
        if ((i2 & 3072) == 0) {
            i4 |= sVar.f(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            j4 = j;
            i4 |= sVar.e(j4) ? 16384 : 8192;
        } else {
            j4 = j;
        }
        if ((196608 & i2) == 0) {
            j5 = j2;
            i4 |= sVar.e(j5) ? 131072 : 65536;
        } else {
            j5 = j2;
        }
        if ((1572864 & i2) == 0) {
            j6 = j3;
            i4 |= sVar.e(j6) ? 1048576 : 524288;
        } else {
            j6 = j3;
        }
        if (sVar.S(i4 & 1, (599187 & i4) != 599186)) {
            w1.r rVar4 = w1.o.a;
            w1.r rVar5 = i6 != 0 ? rVar4 : rVar2;
            q0 a = q0.a(ih.d.f(sVar).d, j4, t1.C(14), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777212);
            r0.d dVar = ih.d.e(sVar).f;
            com.github.rudroid.uitoolkit.text.o b = com.github.rudroid.uitoolkit.text.m.b(Integer.valueOf(i5), null, p2.o(rVar4, 14), 10);
            int i7 = i4 << 6;
            p0.a(rVar5, str, 0, a, dVar, b, j, j5, j6, str2, 0.0f, sVar, (i4 & 126) | (3670016 & i7) | (29360128 & i7) | (i7 & 234881024) | ((i4 << 18) & 1879048192), 0, 1028);
            rVar3 = rVar5;
        } else {
            sVar.V();
            rVar3 = rVar2;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new c(rVar3, str, i, str2, j, j2, j3, i2, i3);
        }
    }
}
