package com.github.rudroid.starredreposandlists.listdetails;

import androidx.lifecycle.d1;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class l implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ ListDetailFragment s;

    public /* synthetic */ l(ListDetailFragment listDetailFragment, int i) {
        this.r = i;
        this.s = listDetailFragment;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                ListDetailFragment listDetailFragment = this.s;
                s0 C4 = listDetailFragment.C4();
                v71.b0.z(d1.k(C4), (a71.h) null, (v71.a0Shadow) null, new o0(null, C4, true), 3);
                com.github.rudroid.utilities.e eVar = listDetailFragment.F0;
                if (eVar == null) {
                    k71.k.m("analytics");
                    throw null;
                }
                com.github.rudroid.activities.util.c cVar = listDetailFragment.D0;
                if (cVar != null) {
                    eVar.a(cVar.d(), new wj.e(MobileAppElement.VIEWER_PULL_TO_REFRESH, MobileAppAction.SWIPE, null, null, 12));
                    return w61.a0.a;
                }
                k71.k.m("accountHolder");
                throw null;
            case 1:
                return new com.github.rudroid.utilities.b(this.s.i4());
            default:
                this.s.g4().m().c();
                return w61.a0.a;
        }
    }
}
