package xg;

import a0.d2;
import androidx.compose.runtime.b2;
import com.google.android.gms.internal.measurement.i4;
import w2.g1;
import w2.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008c, code lost:
    
        if (r4 == androidx.compose.runtime.n.a) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(w1.r rVar, j71.a aVar, j71.a aVar2, j71.a aVar3, String str, androidx.compose.runtime.s sVar, int i) {
        w1.r rVar2;
        Object obj;
        k71.k.g(aVar, "onPositiveButtonClick");
        k71.k.g(aVar2, "onNegativeButtonClick");
        k71.k.g(aVar3, "onDialogDismiss");
        k71.k.g(str, "linkUrl");
        sVar.e0(-1803094204);
        int i2 = i | 6;
        if ((i & 24576) == 0) {
            i2 |= sVar.f(str) ? 16384 : 8192;
        }
        if (sVar.S(i2 & 1, (i2 & 9363) != 9362)) {
            q0 q0Var = (q0) sVar.j(g1.r);
            r1.d d = r1.i.d(1666982257, new ab.m(i4.p0(2131952263, sVar), 19), sVar);
            r1.d d2 = r1.i.d(705357042, new ab.m(str, 20), sVar);
            boolean h = sVar.h(q0Var) | ((i2 & 57344) == 16384);
            Object N = sVar.N();
            if (!h) {
                obj = N;
            }
            com.github.rudroid.actions.workflowruns.ui.e eVar = new com.github.rudroid.actions.workflowruns.ui.e(q0Var, str, aVar, 26);
            sVar.n0(eVar);
            obj = eVar;
            w1.r rVar3 = w1.o.a;
            c.b(rVar3, d, d2, 2131952262, 2131951840, (j71.a) obj, aVar2, aVar3, false, sVar, 14156214, 256);
            rVar2 = rVar3;
        } else {
            sVar.V();
            rVar2 = rVar;
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new d2(rVar2, aVar, aVar2, aVar3, str, i, 11);
        }
    }
}
