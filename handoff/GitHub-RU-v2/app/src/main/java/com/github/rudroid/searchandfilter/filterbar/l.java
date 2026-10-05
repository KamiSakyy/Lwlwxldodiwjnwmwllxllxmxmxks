package com.github.rudroid.searchandfilter.filterbar;

import androidx.compose.runtime.s;
import com.github.rudroid.searchandfilter.filterbar.f;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
final class l implements j71.e {
    public final /* synthetic */ f r;
    public final /* synthetic */ r s;

    public l(f fVar, r rVar) {
        this.r = fVar;
        this.s = rVar;
    }

    public final Object s(Object obj, Object obj2) {
        s sVar = (s) obj;
        int intValue = ((Number) obj2).intValue();
        if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
            f fVar = this.r;
            boolean z = fVar instanceof f.c;
            r rVar = this.s;
            if (z) {
                sVar.c0(2147236992);
                p.f(rVar, sVar, 0);
                sVar.q(false);
            } else if (fVar instanceof f.b.a) {
                sVar.c0(2147239562);
                p.a(rVar, (f.b.a) fVar, sVar, 0);
                sVar.q(false);
            } else if (fVar instanceof f.b.e) {
                sVar.c0(2147242442);
                p.g(rVar, (f.b.e) fVar, sVar, 0);
                sVar.q(false);
            } else if (fVar instanceof f.b.c) {
                sVar.c0(2147245652);
                p.c(rVar, (f.b.c) fVar, sVar, 0);
                sVar.q(false);
            } else if (fVar instanceof f.b.C0002b) {
                sVar.c0(2147249004);
                p.b(rVar, (f.b.C0002b) fVar, sVar, 0);
                sVar.q(false);
            } else {
                if (!(fVar instanceof f.b.d)) {
                    throw f1.e.r(2147235763, sVar, false);
                }
                sVar.c0(2147252012);
                p.e(rVar, (f.b.d) fVar, sVar, 0);
                sVar.q(false);
            }
        } else {
            sVar.V();
        }
        return a0.a;
    }
}
