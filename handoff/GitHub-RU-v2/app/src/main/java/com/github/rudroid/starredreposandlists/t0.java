package com.github.rudroid.starredreposandlists;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class t0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ StarredRepositoriesAndListsFragment s;

    public /* synthetic */ t0(StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, int i) {
        this.r = i;
        this.s = starredRepositoriesAndListsFragment;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                xz0.h hVar = (xz0.h) obj;
                k71.k.g(hVar, "newListData");
                this.s.D4().Q(hVar);
                break;
            default:
                String str = (String) obj;
                k71.k.g(str, "menuId");
                if (str.equals("overflow_menu_refresh_id")) {
                    this.s.E4();
                }
                break;
        }
        return w61.a0.a;
    }
}
