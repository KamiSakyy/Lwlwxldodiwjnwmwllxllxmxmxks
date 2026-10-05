package com.github.rudroid.starredreposandlists;

import com.github.rudroid.starredreposandlists.bottomsheet.ListSelectionBottomSheet;

/* loaded from: /home/user/work/p/classes3.dex */
final /* synthetic */ class g1 extends k71.i implements j71.c {
    public final Object k(Object obj) {
        com.github.rudroid.repositories.k kVar = (com.github.rudroid.repositories.k) obj;
        k71.k.g(kVar, "p0");
        StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = (StarredRepositoriesAndListsFragment) ((k71.c) this).s;
        starredRepositoriesAndListsFragment.getClass();
        ListSelectionBottomSheet.a aVar = ListSelectionBottomSheet.Companion;
        String id = kVar.getId();
        String name = kVar.getName();
        String str = kVar.a().x;
        aVar.getClass();
        ListSelectionBottomSheet.a.a(id, name, str).z4(starredRepositoriesAndListsFragment.x3(), "ListSelectionBottomSheet");
        return w61.a0.a;
    }
}
