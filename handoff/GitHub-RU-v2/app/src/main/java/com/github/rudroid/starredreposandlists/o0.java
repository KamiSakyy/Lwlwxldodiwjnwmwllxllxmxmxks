package com.github.rudroid.starredreposandlists;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o0 implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ StarredRepositoriesAndListsFragment s;

    public /* synthetic */ o0(StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, int i) {
        this.r = i;
        this.s = starredRepositoriesAndListsFragment;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                break;
            case 1:
                this.s.g4().m().c();
                break;
            case 2:
                StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = this.s;
                starredRepositoriesAndListsFragment.E4();
                StarredRepositoriesAndListsFragment.F4(starredRepositoriesAndListsFragment, MobileAppElement.VIEWER_PULL_TO_REFRESH, MobileAppAction.SWIPE);
                break;
            default:
                this.s.I0.setValue(Boolean.FALSE);
                break;
        }
        return w61.a0.a;
    }
}
