package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class o implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ SearchAndFilterBaseFragment s;

    public /* synthetic */ o(SearchAndFilterBaseFragment searchAndFilterBaseFragment, int i) {
        this.r = i;
        this.s = searchAndFilterBaseFragment;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                return ((SelectableNotificationFilterFragment) this.s).j4();
            default:
                return ((SelectableNotificationRepositoryFilterFragment) this.s).j4();
        }
    }
}
