package com.github.rudroid.shortcuts.activities;

import androidx.appcompat.widget.SearchView;

@c71.e(c = "com.github.rudroid.shortcuts.activities.ShortcutViewFragment$menuProvider$1$onCreateMenu$3", f = "ShortcutViewFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class q0 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ ShortcutViewFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(ShortcutViewFragment shortcutViewFragment, a71.c cVar) {
        super(2, cVar);
        this.w = shortcutViewFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        q0 q0Var = new q0(this.w, cVar);
        q0Var.v = obj;
        return q0Var;
    }

    public final Object s(Object obj, Object obj2) {
        q0 r = r((a71.c) obj2, (com.github.rudroid.viewmodels.search.a) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        SearchView searchView;
        com.github.rudroid.viewmodels.search.a aVar = (com.github.rudroid.viewmodels.search.a) this.v;
        b71.a aVar2 = b71.a.r;
        sy.y.j(obj);
        ShortcutViewFragment shortcutViewFragment = this.w;
        SearchView searchView2 = shortcutViewFragment.J0;
        if (!String.valueOf(searchView2 != null ? searchView2.getQuery() : null).equals(aVar.a) && (searchView = shortcutViewFragment.J0) != null) {
            searchView.r(aVar.a);
        }
        return w61.a0.a;
    }
}
