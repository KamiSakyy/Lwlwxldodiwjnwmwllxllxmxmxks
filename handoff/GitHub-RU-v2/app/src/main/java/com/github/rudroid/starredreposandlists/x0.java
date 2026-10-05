package com.github.rudroid.starredreposandlists;

import androidx.compose.foundation.layout.d2;
import androidx.compose.runtime.i3;
import java.util.Collection;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class x0 implements j71.e {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ x0(androidx.compose.runtime.f1 f1Var, StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment) {
        this.s = f1Var;
        this.t = starredRepositoriesAndListsFragment;
    }

    public final Object s(Object obj, Object obj2) {
        switch (this.r) {
            case 0:
                i3 i3Var = (i3) this.s;
                StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = (StarredRepositoriesAndListsFragment) this.t;
                androidx.compose.runtime.s sVar = (androidx.compose.runtime.s) obj;
                int intValue = ((Integer) obj2).intValue();
                if (sVar.S(intValue & 1, (intValue & 3) != 2)) {
                    Collection collection = (Collection) ((com.github.rudroid.utilities.ui.g1) i3Var.getValue()).getData();
                    if (collection == null || collection.isEmpty()) {
                        sVar.c0(1760815446);
                    } else {
                        sVar.c0(1771065565);
                        boolean h = sVar.h(starredRepositoriesAndListsFragment);
                        Object N = sVar.N();
                        if (h || N == androidx.compose.runtime.n.a) {
                            c1 c1Var = new c1(0, starredRepositoriesAndListsFragment, StarredRepositoriesAndListsFragment.class, "onCopilotBoaClicked", "onCopilotBoaClicked()V", 0, 0);
                            sVar.n0(c1Var);
                            N = c1Var;
                        }
                        com.github.rudroid.copilot.ui.g0.a((w1.r) null, (d2) null, (com.github.rudroid.copilot.boa.n) null, (k71.i) N, (j71.a) null, sVar, 0, 23);
                    }
                    sVar.q(false);
                } else {
                    sVar.V();
                }
                break;
            default:
                j71.a aVar = (j71.a) this.s;
                w1.r rVar = (w1.r) this.t;
                ((Integer) obj2).getClass();
                e.a(androidx.compose.runtime.t.L(1), (androidx.compose.runtime.s) obj, aVar, rVar);
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ x0(j71.a aVar, w1.r rVar, int i) {
        this.s = aVar;
        this.t = rVar;
    }
}
