package com.github.rudroid.users;

import com.github.rudroid.utilities.w0;
import com.github.rudroid.viewmodels.za;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileSubjectType;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class g implements j71.a {
    public final /* synthetic */ int r;
    public final /* synthetic */ UsersFragment s;

    public /* synthetic */ g(UsersFragment usersFragment, int i) {
        this.r = i;
        this.s = usersFragment;
    }

    public final Object a() {
        switch (this.r) {
            case 0:
                UsersFragment usersFragment = this.s;
                com.github.rudroid.utilities.e eVar = usersFragment.G0;
                if (eVar == null) {
                    k71.k.m("analytics");
                    throw null;
                }
                com.github.rudroid.activities.util.c cVar = usersFragment.D0;
                if (cVar == null) {
                    k71.k.m("accountHolder");
                    throw null;
                }
                eVar.a(cVar.d(), new wj.e(MobileAppElement.VIEWER_PULL_TO_REFRESH, MobileAppAction.SWIPE, MobileSubjectType.USERS, null, 8));
                za C4 = usersFragment.C4();
                w0.h(C4.v);
                C4.Q();
                break;
            case 1:
                this.s.g4().m().c();
                break;
            default:
                this.s.H0.setValue(Boolean.FALSE);
                break;
        }
        return a0.a;
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b<T1,T2,T3,T4> {
        public b() {
        }
    }
}
