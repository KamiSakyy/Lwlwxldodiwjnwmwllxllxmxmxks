package oh;

import androidx.compose.runtime.b2;
import com.github.rudroid.actions.checkdetail.j;
import com.github.rudroid.uitoolkit.j1;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.s1;
import com.github.rudroid.utilities.ui.y0;
import k71.k;
import m0.s;
import r1.i;
import w1.r;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final void a(r rVar, final g1 g1Var, j71.a aVar, final j71.c cVar, final s sVar, androidx.compose.runtime.s sVar2, int i) {
        k.g(g1Var, "stateEvent");
        k.g(aVar, "onSwipeRefresh");
        k.g(cVar, "onUserClick");
        k.g(sVar, "listState");
        sVar2.e0(1061880145);
        int i2 = i | (sVar2.f(rVar) ? 4 : 2) | (sVar2.f(g1Var) ? 32 : 16) | (sVar2.h(aVar) ? 256 : 128) | (sVar2.h(cVar) ? 2048 : 1024) | (sVar2.f(sVar) ? 16384 : 8192);
        if (sVar2.S(i2 & 1, (i2 & 9363) != 9362)) {
            final int i3 = 0;
            j1.a(rVar, g1Var instanceof y0, false, 0L, aVar, i.d(1272872734, new j71.e() { // from class: oh.c
                /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
                
                    if (r4 == androidx.compose.runtime.n.a) goto L14;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:27:0x0092, code lost:
                
                    if (r4 == androidx.compose.runtime.n.a) goto L29;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object s(Object obj, Object obj2) {
                    Object obj3;
                    Object obj4;
                    switch (i3) {
                        case 0:
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj;
                            int intValue = ((Integer) obj2).intValue();
                            if (sVar3.S(intValue & 1, (intValue & 3) != 2)) {
                                j71.c cVar2 = cVar;
                                boolean f = sVar3.f(cVar2);
                                Object N = sVar3.N();
                                if (!f) {
                                    obj3 = N;
                                    break;
                                }
                                com.github.rudroid.actions.checkssummary.ui.dShadow dVar = new com.github.rudroid.actions.checkssummary.ui.dShadow(10, cVar2);
                                sVar3.n0(dVar);
                                obj3 = dVar;
                                s1.c(null, g1Var, null, null, null, null, null, null, null, sVar, null, null, null, null, null, (j71.f) obj3, sVar3, 0, 0, 65021);
                            } else {
                                sVar3.V();
                            }
                            break;
                        default:
                            androidx.compose.runtime.s sVar4 = (androidx.compose.runtime.s) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            if (sVar4.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                                j71.c cVar3 = cVar;
                                boolean f2 = sVar4.f(cVar3);
                                Object N2 = sVar4.N();
                                if (!f2) {
                                    obj4 = N2;
                                    break;
                                }
                                com.github.rudroid.actions.checkssummary.ui.dShadow dVar2 = new com.github.rudroid.actions.checkssummary.ui.dShadow(11, cVar3);
                                sVar4.n0(dVar2);
                                obj4 = dVar2;
                                s1.c(null, g1Var, null, null, null, null, null, null, null, sVar, null, null, null, null, null, (j71.f) obj4, sVar4, 0, 0, 65021);
                            } else {
                                sVar4.V();
                            }
                            break;
                    }
                    return a0.a;
                }
            }, sVar2), sVar2, (i2 & 14) | 196608 | ((i2 << 6) & 57344), 12);
        } else {
            sVar2.V();
        }
        b2 t = sVar2.t();
        if (t != null) {
            t.d = new j(rVar, g1Var, aVar, cVar, sVar, i, 22);
        }
    }
    public static final Object o = null;
}
