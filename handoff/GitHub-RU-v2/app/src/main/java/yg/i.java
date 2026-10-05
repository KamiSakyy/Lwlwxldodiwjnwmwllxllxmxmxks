package yg;

import androidx.compose.runtime.b2;
import com.github.rudroid.adapters.viewholders.d2;
import com.google.android.gms.internal.measurement.i4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class i {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(int i, int i2, int i3, androidx.compose.runtime.s sVar, j71.a aVar, w1.r rVar) {
        int i4;
        w1.r rVar2;
        b2 t;
        k71.k.g(aVar, "onClick");
        sVar.e0(-1836057655);
        if ((i2 & 6) == 0) {
            i4 = (sVar.d(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 4;
        if (i5 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            rVar2 = rVar;
            i4 |= sVar.f(rVar2) ? 256 : 128;
            if (sVar.S(i4 & 1, (i4 & 147) == 146)) {
                sVar.V();
            } else {
                if (i5 != 0) {
                    rVar2 = w1.o.a;
                }
                n.a(rVar2, null, false, aVar, i4.p0(2131954236, sVar), new d3.k(0), null, null, 0.0f, a.a, r1.i.d(-1578363456, new d2(i, 14), sVar), false, sVar, ((i4 >> 6) & 14) | 805309872, 6, 2496);
            }
            w1.r rVar3 = rVar2;
            t = sVar.t();
            if (t == null) {
                t.d = new h(aVar, rVar3, i, i2, i3);
                return;
            }
            return;
        }
        rVar2 = rVar;
        if (sVar.S(i4 & 1, (i4 & 147) == 146)) {
        }
        w1.r rVar32 = rVar2;
        t = sVar.t();
        if (t == null) {
        }
    }
}
