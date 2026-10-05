package com.github.rudroid.uitoolkit.menu;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.f1;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.compose.runtime.t;
import com.github.rudroid.fileschanged.ui.h0;
import com.github.rudroid.fragments.onboarding.notifications.ui.p;
import com.github.rudroid.uitoolkit.menu.d;
import com.google.android.gms.internal.measurement.i4;
import java.util.List;
import w1.o;
import w1.r;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m {
    public static final void a(r rVar, j71.c cVar, List list, boolean z, s sVar, int i) {
        r rVar2;
        k71.k.g(cVar, "onMenuItemSelect");
        k71.k.g(list, "dropDownItems");
        sVar.e0(278709732);
        int i2 = i | 6 | (sVar.h(cVar) ? 32 : 16) | (sVar.h(list) ? 256 : 128);
        if ((i & 3072) == 0) {
            i2 |= sVar.g(z) ? 2048 : 1024;
        }
        if (sVar.S(i2 & 1, (i2 & 1171) != 1170)) {
            Object N = sVar.N();
            androidx.compose.runtime.i iVar = n.a;
            if (N == iVar) {
                N = t.B(Boolean.FALSE);
                sVar.n0(N);
            }
            f1 f1Var = (f1) N;
            boolean booleanValue = ((Boolean) f1Var.getValue()).booleanValue();
            boolean z2 = (i2 & 112) == 32;
            Object N2 = sVar.N();
            if (z2 || N2 == iVar) {
                N2 = new com.github.rudroid.copilot.ui.f(cVar, f1Var, 9);
                sVar.n0(N2);
            }
            j71.c cVar2 = (j71.c) N2;
            Object N3 = sVar.N();
            if (N3 == iVar) {
                N3 = new p(f1Var, 23);
                sVar.n0(N3);
            }
            rVar2 = o.a;
            l.a(rVar2, booleanValue, list, null, cVar2, (j71.a) N3, 0L, 0L, false, r1.i.d(-1790508314, new h0(z, f1Var, 1), sVar), sVar, 805502982 | (i2 & 896), 456);
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new bd.k(rVar2, cVar, list, z, i, 10);
        }
    }

    public static final d.C0009d b(s sVar) {
        return new d.C0009d("overflow_menu_refresh_id", i4.p0(2131953223, sVar), (String) null, (com.github.rudroid.uitoolkit.text.o) null, (String) null, ih.d.b(sVar).s, 0L, ih.d.b(sVar).z, false, false, 0, 3932);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
