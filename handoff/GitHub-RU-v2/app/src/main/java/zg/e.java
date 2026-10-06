package zg;

import androidx.compose.runtime.b2;
import com.github.rudroid.agents.sessionevents.ui.m2;
import f1.ub;
import g3.q0;

/* loaded from: /home/user/work/p/classes3.dex */
public class e {
    /* JADX WARN: Removed duplicated region for block: B:10:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, androidx.compose.runtime.s sVar, String str, w1.r rVar) {
        w1.r rVar2;
        b2 t;
        k71.k.g(str, "title");
        sVar.e0(-1862201149);
        int i3 = i | (sVar.f(str) ? 4 : 2);
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            rVar2 = rVar;
            i3 |= sVar.f(rVar2) ? 32 : 16;
            if (sVar.S(i3 & 1, (i3 & 19) == 18)) {
                sVar.V();
            } else {
                w1.r rVar3 = i4 != 0 ? w1.o.a : rVar2;
                Object N = sVar.N();
                if (N == androidx.compose.runtime.n.a) {
                    N = new ze.a(1);
                    sVar.n0(N);
                }
                ub.b(str, androidx.compose.foundation.layout.b.z(d3.q.b(rVar3, false, (j71.c) N), 0.0f, ih.a.n, 1), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).y, 0L, 0L, k3.s.y, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777211), sVar, i3 & 14, 0, 131068);
                rVar2 = rVar3;
            }
            t = sVar.t();
            if (t == null) {
                t.d = new m2(str, rVar2, i, i2, 6);
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
    public static final Object a = null;
}
