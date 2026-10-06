package zg;

import androidx.compose.foundation.layout.p2;
import androidx.compose.runtime.b2;
import com.github.rudroid.uitoolkit.text.p0;
import com.google.android.gms.internal.measurement.i4;
import g3.q0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a0Shadow {
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, w1.r rVar) {
        int i3;
        w1.r rVar2;
        sVar.e0(730746884);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (sVar.f(rVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if (sVar.S(i3 & 1, (i3 & 3) != 2)) {
            w1.r rVar3 = w1.o.a;
            rVar2 = i4 != 0 ? rVar3 : rVar;
            p0.a(rVar2, i4.p0(2131952993, sVar), 0, q0.a(ih.d.f(sVar).d, ih.d.a(sVar).k0, t1.C(14), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777212), ih.d.e(sVar).f, com.github.rudroid.uitoolkit.text.m.b(2131231352, null, p2.o(rVar3, 14), 10), ih.d.a(sVar).k0, ih.d.a(sVar).j0, ih.d.a(sVar).l0, null, 0.0f, sVar, i3 & 14, 0, 1540);
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new com.github.rudroid.agents.agenttasks.c(rVar2, i, i2, 9);
        }
    }
}
