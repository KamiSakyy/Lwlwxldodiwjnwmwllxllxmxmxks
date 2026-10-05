package com.github.rudroid.shortcuts.activities;

import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import java.util.List;
import y71.y1;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ConfigureShortcutFragment$onViewCreated$4", f = "ConfigureShortcutFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class z extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ConfigureShortcutFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(ConfigureShortcutFragment configureShortcutFragment, a71.c cVar) {
        super(2, cVar);
        this.w = configureShortcutFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        z zVar = new z(this.w, cVar);
        zVar.v = obj;
        return zVar;
    }

    public final Object s(Object obj, Object obj2) {
        z r = r((a71.c) obj2, (com.github.rudroid.searchandfilter.d0) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        com.github.rudroid.searchandfilter.d0 d0Var = (com.github.rudroid.searchandfilter.d0) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        com.github.rudroid.shortcuts.e E4 = this.w.E4();
        List list = d0Var.b;
        k71.k.g(list, "filters");
        y1 y1Var = E4.A;
        y1Var.k((Object) null, ShortcutConfigurationModel.c((ShortcutConfigurationModel) y1Var.getValue(), list, null, null, null, null, null, 125));
        return w61.a0.a;
    }
}
