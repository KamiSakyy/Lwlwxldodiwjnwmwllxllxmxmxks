package dg;

import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.adapters.viewholders.s3;
import com.github.rudroid.uitoolkit.swipetodismiss.e0;
import f0.o;
import f0.v;
import java.time.ZonedDateTime;
import k71.k;
import r1.i;
import w1.r;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final void a(r rVar, j71.a aVar, boolean z, e1 e1Var, String str, boolean z2, ZonedDateTime zonedDateTime, s sVar, int i) {
        v a;
        k.g(aVar, "onManageSubscriptionClick");
        k.g(str, "formattedPrice");
        k.g(zonedDateTime, "expirationDate");
        sVar.e0(1040930360);
        int i2 = (sVar.f(rVar) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= sVar.g(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= sVar.d(e1Var.ordinal()) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= sVar.f(str) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= sVar.g(z2) ? 131072 : 65536;
        }
        int i3 = i2 | (sVar.h(zonedDateTime) ? 1048576 : 524288);
        if (sVar.S(i3 & 1, (599187 & i3) != 599186)) {
            if (z) {
                sVar.c0(692846790);
                a = o.a(0.0f, ih.d.b(sVar).F);
                sVar.q(false);
            } else {
                sVar.c0(692953430);
                a = o.a(0.0f, ih.d.b(sVar).p);
                sVar.q(false);
            }
            tg.c.a((i3 & 14) | 196608, 22, sVar, null, a, null, null, i.d(1546020570, new e0(z, z2, aVar, zonedDateTime, e1Var, str), sVar), rVar);
        } else {
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new s3(rVar, aVar, z, e1Var, str, z2, zonedDateTime, i);
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s<T1,T2,T3,T4> {
        public s() {
        }
    }
}
