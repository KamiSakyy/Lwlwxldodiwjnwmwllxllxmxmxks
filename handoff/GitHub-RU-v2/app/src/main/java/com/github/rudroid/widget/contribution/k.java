package com.github.rudroid.widget.contribution;

import androidx.compose.runtime.b2;
import com.github.rudroid.uitoolkit.q2;
import com.github.service.models.response.ContributionLevel;
import java.util.ArrayList;
import java.util.List;
import sy.d0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class k {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ContributionLevel.values().length];
            try {
                iArr[ContributionLevel.UNKNOWN__.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ContributionLevel.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ContributionLevel.FIRST_QUARTILE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ContributionLevel.SECOND_QUARTILE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ContributionLevel.THIRD_QUARTILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ContributionLevel.FOURTH_QUARTILE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            a = iArr;
        }
    }

    public static final void a(final n6.a aVar, final float f, final float f2, final boolean z, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(1741931704);
        int i2 = (sVar.h(aVar) ? 4 : 2) | i | (sVar.c(f) ? 32 : 16) | (sVar.c(f2) ? 256 : 128) | (sVar.g(z) ? 2048 : 1024);
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            sVar2 = sVar;
            com.google.common.util.concurrent.a.a((z5.n) null, 0, 0, r1.i.d(-1583687678, new j71.f() { // from class: com.github.rudroid.widget.contribution.j
                public final Object f(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                    ((Integer) obj3).getClass();
                    k71.k.g((i6.g) obj, "$this$Column");
                    b31.b.a(k41.b.M(f).d(new b6.w(new n6.b(2))).d(new z5.c(aVar)), (i6.c) null, b.a, sVar3, 384, 2);
                    if (z) {
                        sVar3.c0(576485625);
                        b31.b.a(k41.b.M(f2), (i6.c) null, b.b, sVar3, 384, 2);
                    } else {
                        sVar3.c0(569514624);
                    }
                    sVar3.q(false);
                    return a0.a;
                }
            }, sVar), sVar2, 3072, 7);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new i(aVar, f, f2, z, i, 1);
        }
    }

    public static final void b(List list, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(-505388419);
        int i2 = (sVar.h(list) ? 4 : 2) | i;
        if (sVar.S(i2 & 1, (i2 & 3) != 2)) {
            long j = ((s3.h) sVar.j(z5.g.a)).a;
            float a2 = s3.h.a(j) / 42;
            float f = 4 * a2;
            int W = m71.a.W((s3.h.b(j) - (8 * a2)) / (f + a2));
            if (W > 15) {
                W = 15;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList H0 = x61.m.H0(list);
            while (W > 0 && !H0.isEmpty()) {
                arrayList.add(0, H0.remove(d0.m(H0)));
                W--;
            }
            sVar2 = sVar;
            k21.f.a(com.github.rudroid.widget.j.a(sVar), 1, 1, r1.i.d(-1073771879, new g(arrayList, a2, f, 0), sVar), sVar2, 3072, 0);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new q2(list, i, 1);
        }
    }

    public static final void c(List list, float f, float f2, boolean z, androidx.compose.runtime.s sVar, int i) {
        androidx.compose.runtime.s sVar2;
        sVar.e0(-775689323);
        int i2 = (sVar.h(list) ? 4 : 2) | i | (sVar.c(f) ? 32 : 16) | (sVar.c(f2) ? 256 : 128) | (sVar.g(z) ? 2048 : 1024);
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            sVar2 = sVar;
            com.google.common.util.concurrent.a.a(i21.a.D(z5.l.a, z ? f : 0, 11), 0, 1, r1.i.d(1337441503, new g(list, f2, f, 1), sVar), sVar2, 3072, 0);
        } else {
            sVar2 = sVar;
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new i(list, f, f2, z, i, 0);
        }
    }
}
