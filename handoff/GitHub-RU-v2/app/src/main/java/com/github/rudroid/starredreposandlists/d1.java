package com.github.rudroid.starredreposandlists;

import com.github.commonandroid.featureflag.RuntimeFeatureFlag;
import com.github.rudroid.starredreposandlists.navigation.ListDetailRoute;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class d1 extends k71.i implements j71.e {
    public final Object s(Object obj, Object obj2) {
        String str = (String) obj;
        k71.k.g(str, "p0");
        k71.k.g((String) obj2, "p1");
        StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = (StarredRepositoriesAndListsFragment) ((k71.c) this).s;
        starredRepositoriesAndListsFragment.getClass();
        RuntimeFeatureFlag runtimeFeatureFlag = RuntimeFeatureFlag.a;
        ei.c cVar = ei.c.w;
        runtimeFeatureFlag.getClass();
        if (RuntimeFeatureFlag.a(cVar) && com.github.rudroid.main.navigation.f.b(starredRepositoriesAndListsFragment)) {
            x6.a0 i = sy.s.i(starredRepositoriesAndListsFragment);
            String str2 = starredRepositoriesAndListsFragment.D4().w.a;
            k71.k.g(i, "<this>");
            k71.k.g(str2, "login");
            com.github.rudroid.main.navigation.f.c(i, new ListDetailRoute(str2, str), (x6.d0) null, 6);
        } else {
            com.github.rudroid.starredreposandlists.createoreditlist.e1 e1Var = new com.github.rudroid.starredreposandlists.createoreditlist.e1(starredRepositoriesAndListsFragment.D4().w.a, str);
            androidx.fragment.app.t tVar = starredRepositoriesAndListsFragment.J0;
            if (tVar == null) {
                k71.k.m("activityResultLauncher");
                throw null;
            }
            tVar.a(e1Var);
        }
        return w61.a0.a;
    }
}
