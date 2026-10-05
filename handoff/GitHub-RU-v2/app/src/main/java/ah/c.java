package ah;

import android.content.Context;
import androidx.compose.runtime.n;
import androidx.compose.runtime.s;
import com.github.rudroid.m0;
import com.github.rudroid.widget.p;
import d1.v;
import f1.ub;
import j2.l0;
import java.util.Locale;
import java.util.Map;
import k71.k;
import r1.i;
import sf.u;
import w1.r;
import w61.a0;
import z.l;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    static {
        final int i = 0;
        new r1.d(new j71.g() { // from class: ah.a
            public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
                int i2;
                int i3;
                switch (i) {
                    case 0:
                        int intValue = ((Integer) obj2).intValue();
                        s sVar = (s) obj3;
                        int intValue2 = ((Integer) obj4).intValue();
                        k.g((m0.b) obj, "$this$items");
                        if ((intValue2 & 48) == 0) {
                            intValue2 |= sVar.d(intValue) ? 32 : 16;
                        }
                        if (sVar.S(intValue2 & 1, (intValue2 & 145) != 144)) {
                            Object N = sVar.N();
                            if (N == n.a) {
                                N = new p(15);
                                sVar.n0(N);
                            }
                            com.github.rudroid.uitoolkit.codesearch.d.a(null, (j71.a) N, i.d(-1943798198, new b(intValue, 0), sVar), false, null, 0L, null, null, sVar, 100663728, 249);
                        } else {
                            sVar.V();
                        }
                        return a0.a;
                    case 1:
                        j2.b.c((l0) obj, (Map) obj2, (s) obj3, ((Integer) obj4).intValue() & 126);
                        break;
                    case 2:
                        return new d1.s((a71.h) obj, (Context) obj2, (v) obj3, (n3.b) obj4);
                    default:
                        u uVar = (u) obj2;
                        s sVar2 = (s) obj3;
                        ((Integer) obj4).getClass();
                        k.g((l) obj, "$this$AnimatedContent");
                        k.g(uVar, "state");
                        int ordinal = uVar.ordinal();
                        if (ordinal == 0) {
                            i2 = 2131953473;
                            i3 = -1549510399;
                        } else {
                            if (ordinal != 1) {
                                throw f1.e.r(-1549511608, sVar2, false);
                            }
                            i2 = 2131953430;
                            i3 = -1549507375;
                        }
                        String upperCase = m0.d(sVar2, i3, i2, sVar2, false).toUpperCase(Locale.ROOT);
                        k.f(upperCase, "toUpperCase(...)");
                        ub.b(upperCase, (r) null, 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar2).h, sVar2, 0, 0, 131070);
                        break;
                }
                return a0.a;
            }
        }, false, -1344335451);
    }
}
