package com.github.rudroid.settings.applock;

import androidx.compose.foundation.layout.p2;
import com.google.android.gms.internal.measurement.i4;
import f1.ub;
import g3.q0;
import y41.t1;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class n implements j71.e {
    public final /* synthetic */ int r;
    public final /* synthetic */ AppLockFragment s;

    public /* synthetic */ n(AppLockFragment appLockFragment, int i) {
        this.r = i;
        this.s = appLockFragment;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                boolean S = sVar.S(intValue & 1, (intValue & 3) != 2);
                w61.a0 a0Var = w61.a0.a;
                if (!S) {
                    sVar.V();
                    return a0Var;
                }
                AppLockFragment appLockFragment = this.s;
                if (appLockFragment.D0 == null) {
                    k71.k.m("appLockStore");
                    throw null;
                }
                int ordinal = v.b(appLockFragment.i4()).ordinal();
                w1.o oVar = w1.o.a;
                Object obj3 = androidx.compose.runtime.n.a;
                if (ordinal == 2) {
                    sVar.c0(-1100480789);
                    w1.r a = com.github.rudroid.utilities.c0.a(ih.d.b(sVar).b, oVar);
                    boolean h = sVar.h(appLockFragment);
                    Object N = sVar.N();
                    if (h || N == obj3) {
                        N = new x(2, appLockFragment);
                        sVar.n0(N);
                    }
                    com.github.rudroid.utilities.ui.f.b(a, null, null, 2131951787, null, 2131951788, (j71.a) N, sVar, 0, 22);
                    sVar.q(false);
                    return a0Var;
                }
                if (ordinal != 3) {
                    sVar.c0(-1098850468);
                    ub.b(i4.p0(2131951789, sVar), com.github.rudroid.utilities.c0.a(ih.d.b(sVar).b, p2.d(oVar, 1.0f)), 0L, 0L, (k3.s) null, 0L, new r3.k(3), 0L, 0, false, 0, 0, (j71.c) null, q0.a(ih.d.f(sVar).a, 0L, t1.C(20), (k3.s) null, (k3.o) null, (k3.i) null, 0L, 0, 0L, (g3.z) null, (r3.i) null, 16777213), sVar, 0, 0, 130044);
                    sVar.q(false);
                    return a0Var;
                }
                sVar.c0(-1099712051);
                w1.r a2 = com.github.rudroid.utilities.c0.a(ih.d.b(sVar).b, p2.d(oVar, 1.0f));
                if (appLockFragment.D0 == null) {
                    k71.k.m("appLockStore");
                    throw null;
                }
                boolean c = v.c(appLockFragment.i4());
                boolean h2 = sVar.h(appLockFragment);
                Object N2 = sVar.N();
                if (h2 || N2 == obj3) {
                    o oVar2 = new o(0, appLockFragment, AppLockFragment.class, "onUnlockClick", "onUnlockClick()V", 0, 0);
                    sVar.n0(oVar2);
                    N2 = oVar2;
                }
                bg.c.a(0, sVar, (k71.i) N2, a2, c);
                boolean h3 = sVar.h(appLockFragment);
                Object N3 = sVar.N();
                if (h3 || N3 == obj3) {
                    N3 = new p(appLockFragment, null);
                    sVar.n0(N3);
                }
                androidx.compose.runtime.t.f(sVar, (j71.e) N3, a0Var);
                sVar.q(false);
                return a0Var;
            default:
                androidx.compose.runtime.s sVar2 = (androidx.compose.runtime.s) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (sVar2.S(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AppLockFragment appLockFragment2 = this.s;
                    sVar2.Z(1349704266, androidx.compose.runtime.t.n(appLockFragment2.F0, sVar2).getValue());
                    ih.e.a(false, null, null, null, null, null, null, null, null, r1.i.d(-1489024299, new n(appLockFragment2, 0), sVar2), sVar2, 805306368, 511);
                    sVar2.q(false);
                } else {
                    sVar2.V();
                }
                return w61.a0.a;
        }
    }
}
