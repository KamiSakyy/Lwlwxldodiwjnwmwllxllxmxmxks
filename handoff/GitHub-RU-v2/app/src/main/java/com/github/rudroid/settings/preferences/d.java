package com.github.rudroid.settings.preferences;

import ab.n;
import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.agents.sessionevents.ui.q1;
import d2.p0;
import f0.v;
import f1.qa;
import k71.k;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, s sVar, j71.a aVar, r rVar) {
        int i3;
        r rVar2;
        b2 t;
        k.g(aVar, "onBannerClick");
        sVar.e0(1182469599);
        if ((i & 6) == 0) {
            i3 = (sVar.h(aVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            rVar2 = rVar;
            i3 |= sVar.f(rVar2) ? 32 : 16;
            if (sVar.S(i3 & 1, (i3 & 19) == 18)) {
                sVar.V();
            } else {
                r rVar3 = i4 != 0 ? o.a : rVar2;
                qa.a(p2.e(rVar3, 1.0f), (p0) null, ih.d.b(sVar).b, 0L, 0.0f, ih.a.f, (v) null, r1.i.d(2101157818, new q1(5, aVar), sVar), sVar, 12582912, 90);
                rVar2 = rVar3;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new n(aVar, rVar2, i, i2, 8);
                return;
            }
            return;
        }
        rVar2 = rVar;
        if (sVar.S(i3 & 1, (i3 & 19) == 18)) {
        }
        t = sVar.t();
        if (t == null) {
        }
    }
}
