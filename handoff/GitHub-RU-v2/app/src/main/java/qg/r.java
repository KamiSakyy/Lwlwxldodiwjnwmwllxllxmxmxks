package qg;

import androidx.compose.runtime.b2;
import com.github.rudroid.agents.copilothome.ui.w;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public static final void a(w1.r rVar, final String str, final String str2, long j, final j71.a aVar, float f, float f2, int i, int i2, final r1.d dVar, androidx.compose.runtime.s sVar, final int i3, final int i4) {
        float f3;
        int i5;
        float f4;
        int i6;
        int i7;
        int i8;
        int i9;
        final w1.r rVar2;
        final int i11;
        final float f5;
        final int i12;
        int i13;
        float f6;
        float f7;
        w1.r rVar3;
        long j2;
        int i14;
        int i15;
        k71.k.g(str, "title");
        sVar.e0(1620125225);
        int i16 = i3 | 6;
        if ((i3 & 48) == 0) {
            i16 |= sVar.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i16 |= sVar.f(str2) ? 256 : 128;
        }
        final long j3 = j;
        int i17 = i16 | (((i4 & 8) == 0 && sVar.e(j3)) ? 2048 : 1024);
        if ((i3 & 24576) == 0) {
            i17 |= sVar.h(aVar) ? 16384 : 8192;
        }
        int i18 = i4 & 32;
        if (i18 != 0) {
            i5 = i17 | 196608;
            f3 = f;
        } else {
            f3 = f;
            i5 = i17 | (sVar.c(f3) ? 131072 : 65536);
        }
        int i19 = i4 & 64;
        if (i19 != 0) {
            i6 = i5 | 1572864;
            f4 = f2;
        } else {
            f4 = f2;
            i6 = i5 | (sVar.c(f4) ? 1048576 : 524288);
        }
        int i21 = i4 & 128;
        if (i21 != 0) {
            i8 = i6 | 12582912;
            i7 = i;
        } else {
            i7 = i;
            i8 = i6 | (sVar.d(i7) ? 8388608 : 4194304);
        }
        int i22 = i4 & 256;
        if (i22 != 0) {
            i9 = i8 | 100663296;
        } else {
            i9 = i8 | (sVar.d(i2) ? 67108864 : 33554432);
        }
        if ((i3 & 805306368) == 0) {
            i9 |= sVar.h(dVar) ? 536870912 : 268435456;
        }
        int i23 = i9;
        if (sVar.S(i23 & 1, (i23 & 306783379) != 306783378)) {
            sVar.X();
            if ((i3 & 1) == 0 || sVar.A()) {
                if ((i4 & 8) != 0) {
                    i23 &= -7169;
                    j3 = ih.d.b(sVar).b;
                }
                if (i18 != 0) {
                    f3 = p.a;
                }
                if (i19 != 0) {
                    f4 = 0;
                }
                if (i21 != 0) {
                    i7 = 1;
                }
                i13 = i22 != 0 ? 2 : i2;
                f6 = f3;
                f7 = f4;
                rVar3 = w1.o.a;
                j2 = j3;
                i14 = i7;
                i15 = i23;
            } else {
                sVar.V();
                if ((i4 & 8) != 0) {
                    i23 &= -7169;
                }
                i13 = i2;
                f6 = f3;
                f7 = f4;
                i14 = i7;
                rVar3 = rVar;
                i15 = i23;
                j2 = j3;
            }
            sVar.r();
            int i24 = i13;
            w1.r rVar4 = rVar3;
            r1.d d = r1.i.d(786155471, new w(i13, i14, 4, str2, str, rVar3), sVar);
            int i25 = i15 >> 6;
            int i26 = (i25 & 29360128) | (i25 & 112) | 100663296 | (i25 & 896) | (458752 & i15) | (3670016 & i15);
            f3 = f6;
            long j4 = j2;
            p.b(null, j4, aVar, 0, 0, f3, f7, dVar, d, sVar, i26, 25);
            j3 = j4;
            f5 = f7;
            rVar2 = rVar4;
            i12 = i14;
            i11 = i24;
        } else {
            sVar.V();
            rVar2 = rVar;
            i11 = i2;
            f5 = f4;
            i12 = i7;
        }
        final float f8 = f3;
        b2 t = sVar.t();
        if (t != null) {
            t.d = new j71.e() { // from class: qg.q
                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    r.a(rVar2, str, str2, j3, aVar, f8, f5, i12, i11, dVar, (androidx.compose.runtime.s) obj, androidx.compose.runtime.t.L(i3 | 1), i4);
                    return a0.a;
                }
            };
        }
    }
}
