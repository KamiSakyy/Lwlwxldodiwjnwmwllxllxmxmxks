package com.github.rudroid.utilities.viewmodel;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import androidx.fragment.app.l1;
import com.github.rudroid.profile.status.ui.x;
import f1.ca;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    public static final void a(ca caVar, g gVar, j71.c cVar, s sVar, int i) {
        k.g(caVar, "hostState");
        k.g(gVar, "withStatefulErrorFlow");
        k.g(cVar, "message");
        sVar.e0(2089050023);
        int i2 = i | (sVar.f(gVar) ? 32 : 16) | (sVar.h(cVar) ? 256 : 128);
        if (sVar.S(i2 & 1, (i2 & 147) != 146)) {
            Object value = k41.b.l(gVar.J(), (l1) null, sVar, 7).getValue();
            boolean z = (i2 & 112) == 32;
            Object N = sVar.N();
            if (z || N == n.a) {
                N = new h(1, gVar, g.class, "errorHandled", "errorHandled(Lcom/github/domain/model/ExecutionError;)V", 0, 0);
                sVar.n0(N);
            }
            com.github.rudroid.uitoolkit.snackbar.d.a(value, caVar, cVar, (k71.i) N, null, null, null, sVar, (i2 & 896) | 48);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new x(caVar, gVar, cVar, i, 19);
        }
    }

}
