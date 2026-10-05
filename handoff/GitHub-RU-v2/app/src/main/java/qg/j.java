package qg;

import androidx.compose.runtime.b2;
import com.github.rudroid.uitoolkit.utils.w;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class j {
    public static final void a(w1.r rVar, final String str, final String str2, final m0.s sVar, long j, final j71.a aVar, final float f, int i, int i2, final r1.d dVar, androidx.compose.runtime.s sVar2, final int i3) {
        final long j2;
        final int i4;
        final int i5;
        final int i6;
        final int i7;
        final long j3;
        k71.k.g(sVar, "lazyListState");
        sVar2.e0(-979733890);
        int i8 = i3 | 6 | (sVar2.f(str) ? 32 : 16) | (sVar2.f(str2) ? 256 : 128) | (sVar2.f(sVar) ? 2048 : 1024) | 8192 | (sVar2.h(aVar) ? 131072 : 65536) | (sVar2.c(f) ? 1048576 : 524288) | 113246208;
        if (sVar2.S(i8 & 1, (306783379 & i8) != 306783378)) {
            sVar2.X();
            if ((i3 & 1) == 0 || sVar2.A()) {
                long j4 = ih.d.b(sVar2).b;
                rVar = w1.o.a;
                i6 = 2;
                i7 = 1;
                j3 = j4;
            } else {
                sVar2.V();
                j3 = j;
                i7 = i;
                i6 = i2;
            }
            sVar2.r();
            w.a(rVar, r1.i.d(1190243521, new j71.f() { // from class: qg.h
                public final Object f(Object obj, Object obj2, Object obj3) {
                    com.github.rudroid.uitoolkit.utils.f fVar = (com.github.rudroid.uitoolkit.utils.f) obj;
                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    k71.k.g(fVar, "$this$MeasureContentDimension");
                    if ((intValue & 6) == 0) {
                        intValue |= (intValue & 8) == 0 ? sVar3.f(fVar) : sVar3.h(fVar) ? 4 : 2;
                    }
                    if (sVar3.S(intValue & 1, (intValue & 19) != 18)) {
                        r.a(null, str, str2, j3, aVar, f, nh.a.a(com.github.rudroid.uitoolkit.utils.lists.t.d(sVar, (int) Float.intBitsToFloat((int) (fVar.a() & 4294967295L)), sVar3), sVar3), i7, i6, dVar, sVar3, 0, 1);
                    } else {
                        sVar3.V();
                    }
                    return a0.a;
                }
            }, sVar2), sVar2, 54);
            j2 = j3;
            i5 = i6;
            i4 = i7;
        } else {
            sVar2.V();
            j2 = j;
            i4 = i;
            i5 = i2;
        }
        final w1.r rVar2 = rVar;
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new j71.e(rVar2, str, str2, sVar, j2, aVar, f, i4, i5, dVar, i3) { // from class: qg.i
                public final /* synthetic */ r1.d A;
                public final /* synthetic */ w1.r r;
                public final /* synthetic */ String s;
                public final /* synthetic */ String t;
                public final /* synthetic */ m0.s u;
                public final /* synthetic */ long v;
                public final /* synthetic */ j71.a w;
                public final /* synthetic */ float x;
                public final /* synthetic */ int y;
                public final /* synthetic */ int z;

                public final Object s(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int L = androidx.compose.runtime.t.L(805306369);
                    j.a(this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, (androidx.compose.runtime.s) obj, L);
                    return a0.a;
                }
            };
        }
    }
}
