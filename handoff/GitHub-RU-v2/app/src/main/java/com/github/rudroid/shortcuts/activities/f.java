package com.github.rudroid.shortcuts.activities;

import com.github.rudroid.agents.w6;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h1;
import com.github.rudroid.utilities.ui.t1;
import com.github.rudroid.views.refreshableviews.SwipeRefreshUiStateRecyclerView;
import java.util.Collection;
import java.util.List;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ChooseShortcutRepositoryFragment$onViewCreated$3", f = "ChooseShortcutRepositoryFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ChooseShortcutRepositoryFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ChooseShortcutRepositoryFragment chooseShortcutRepositoryFragment, a71.c cVar) {
        super(2, cVar);
        this.w = chooseShortcutRepositoryFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        f fVar = new f(this.w, cVar);
        fVar.v = obj;
        return fVar;
    }

    public final Object s(Object obj, Object obj2) {
        f r = r((a71.c) obj2, (w6.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        w6.b bVar = (w6.b) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        g1 g1Var = bVar.c;
        boolean z = g1Var instanceof t1;
        ChooseShortcutRepositoryFragment chooseShortcutRepositoryFragment = this.w;
        if (z) {
            xa.a aVar2 = chooseShortcutRepositoryFragment.H0;
            if (aVar2 == null) {
                k71.k.m("dataAdapter");
                throw null;
            }
            aVar2.G((List) g1Var.getData());
        } else {
            Collection collection = (Collection) g1Var.getData();
            if (collection == null || collection.isEmpty()) {
                xa.a aVar3 = chooseShortcutRepositoryFragment.H0;
                if (aVar3 == null) {
                    k71.k.m("dataAdapter");
                    throw null;
                }
                aVar3.F();
            }
        }
        SwipeRefreshUiStateRecyclerView swipeRefreshUiStateRecyclerView = chooseShortcutRepositoryFragment.B4().Q;
        k71.k.f(swipeRefreshUiStateRecyclerView, "swipeableContent");
        xh.d.p(swipeRefreshUiStateRecyclerView, h1.i(g1Var), chooseShortcutRepositoryFragment.g4(), new c(chooseShortcutRepositoryFragment, 0));
        return w61.a0.a;
    }
}
