package com.github.rudroid.starredreposandlists;

import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileSubjectType;

@c71.e(c = "com.github.rudroid.starredreposandlists.StarredRepositoriesAndListsFragment$sendAnalyticsEvent$1", f = "StarredRepositoriesAndListsFragment.kt", l = {415}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class i1 extends c71.j implements j71.e {
    public final /* synthetic */ MobileSubjectType A;
    public com.github.rudroid.utilities.e v;
    public int w;
    public final /* synthetic */ StarredRepositoriesAndListsFragment x;
    public final /* synthetic */ MobileAppElement y;
    public final /* synthetic */ MobileAppAction z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment, MobileAppElement mobileAppElement, MobileAppAction mobileAppAction, MobileSubjectType mobileSubjectType, a71.c cVar) {
        super(2, cVar);
        this.x = starredRepositoriesAndListsFragment;
        this.y = mobileAppElement;
        this.z = mobileAppAction;
        this.A = mobileSubjectType;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new i1(this.x, this.y, this.z, this.A, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        com.github.rudroid.utilities.e eVar;
        b71.a aVar = b71.a.r;
        int i = this.w;
        if (i == 0) {
            sy.y.j(obj);
            StarredRepositoriesAndListsFragment starredRepositoriesAndListsFragment = this.x;
            com.github.rudroid.utilities.e eVar2 = starredRepositoriesAndListsFragment.F0;
            if (eVar2 == null) {
                k71.k.m("analytics");
                throw null;
            }
            com.github.rudroid.activities.util.c cVar = starredRepositoriesAndListsFragment.D0;
            if (cVar == null) {
                k71.k.m("accountHolder");
                throw null;
            }
            this.v = eVar2;
            this.w = 1;
            obj = com.github.rudroid.activities.util.a.c(cVar, this);
            if (obj == aVar) {
                return aVar;
            }
            eVar = eVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar = this.v;
            sy.y.j(obj);
        }
        eVar.a((oa.j) obj, new wj.e(this.y, this.z, this.A, null, 8));
        return w61.a0.a;
    }
}
