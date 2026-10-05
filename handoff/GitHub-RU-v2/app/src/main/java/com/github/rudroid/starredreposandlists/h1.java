package com.github.rudroid.starredreposandlists;

import android.view.ViewGroup;
import com.github.rudroid.activities.m0;
import com.github.rudroid.fragments.GitHubFragment;

@c71.e(c = "com.github.rudroid.starredreposandlists.StarredRepositoriesAndListsFragment$onViewCreated$1", f = "StarredRepositoriesAndListsFragment.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class h1 extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ StarredRepositoriesAndListsFragment w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, a71.c cVar) {
        super(2, cVar);
        this.w = starredRepositoriesAndListsFragment;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        h1 h1Var = new h1(this.w, cVar);
        h1Var.v = obj;
        return h1Var;
    }

    public final Object s(Object obj, Object obj2) {
        h1 r = r((a71.c) obj2, (fl.b) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        fl.b bVar = (fl.b) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = this.w;
        com.github.rudroid.activities.h0 u4 = starredRepositoriesAndListsFragment.u4(bVar);
        if (u4 != null) {
            GitHubFragment.x4(starredRepositoriesAndListsFragment, u4, (m0.b) null, (ViewGroup) null, 14);
        }
        return w61.a0.a;
    }
}
