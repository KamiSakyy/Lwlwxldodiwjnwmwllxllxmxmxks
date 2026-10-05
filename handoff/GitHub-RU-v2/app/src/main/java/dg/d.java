package dg;

import android.content.Context;
import androidx.compose.runtime.b2;
import androidx.compose.runtime.s;
import com.github.rudroid.agents.sessionevents.ui.d1;
import com.github.rudroid.settings.codeoptions.g;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import j71.f;
import k71.k;
import r1.i;
import w1.o;
import w1.r;
import xn.e1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final void a(r rVar, j71.a aVar, j71.a aVar2, j71.a aVar3, e1 e1Var, e1 e1Var2, String str, s sVar, int i, int i2) {
        r rVar2;
        int i3;
        final e1 e1Var3;
        e1 e1Var4;
        k.g(aVar, "onPositiveButtonClick");
        k.g(aVar2, "onNegativeButtonClick");
        k.g(aVar3, "onDialogDismiss");
        sVar.e0(-2105977376);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            rVar2 = rVar;
        } else {
            rVar2 = rVar;
            i3 = (sVar.f(rVar2) ? 4 : 2) | i;
        }
        if ((i & 48) == 0) {
            i3 |= sVar.h(aVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= sVar.h(aVar2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= sVar.h(aVar3) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= sVar.d(e1Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= sVar.d(e1Var2.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= sVar.f(str) ? 1048576 : 524288;
        }
        if (sVar.S(i3 & 1, (599187 & i3) != 599186)) {
            r rVar3 = i4 != 0 ? o.a : rVar2;
            final int i5 = 1;
            e1Var3 = e1Var;
            e1Var4 = e1Var2;
            int i6 = (i3 & 14) | 100663728;
            int i7 = i3 << 12;
            xg.c.b(rVar3, i.d(-1592915245, new f() { // from class: com.github.rudroid.settings.copilot.paywall.ui.x
                public final Object f(Object obj, Object obj2, Object obj3) {
                    switch (i5) {
                        case 0:
                            androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            k71.k.g((m0.b) obj, "$this$item");
                            if (sVar2.S(intValue & 1, (intValue & 17) != 16)) {
                                d0.d(null, e1Var3, sVar2, 0);
                            } else {
                                sVar2.V();
                            }
                            break;
                        default:
                            androidx.compose.runtime.s sVar3 = (androidx.compose.runtime.s) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            k71.k.g((androidx.compose.foundation.layout.f0) obj, "$this$BaseActionDialog");
                            if (sVar3.S(intValue2 & 1, (intValue2 & 17) != 16)) {
                                ub.b(i4.q0(2131952488, new Object[]{fg.h.a(e1Var3, (Context) sVar3.j(w2.j0.b))}, sVar3), androidx.compose.foundation.layout.b.x(w1.o.a, ih.a.n), 0L, 0L, (k3.s) null, 0L, (r3.k) null, 0L, 0, false, 0, 0, (j71.c) null, ih.d.f(sVar3).F, sVar3, 0, 0, 131068);
                            } else {
                                sVar3.V();
                            }
                            break;
                    }
                    return w61.a0.a;
                }
            }, sVar), i.d(-1147377934, new g(14, e1Var4, str), sVar), 2131951843, 2131951840, aVar, aVar2, aVar3, true, sVar, i6 | (458752 & i7) | (3670016 & i7) | (i7 & 29360128), 0);
            rVar2 = rVar3;
        } else {
            e1Var3 = e1Var;
            e1Var4 = e1Var2;
            sVar.V();
        }
        b2 t = sVar.t();
        if (t != null) {
            t.d = new d1(rVar2, aVar, aVar2, aVar3, e1Var3, e1Var4, str, i, i2);
        }
    }
}
