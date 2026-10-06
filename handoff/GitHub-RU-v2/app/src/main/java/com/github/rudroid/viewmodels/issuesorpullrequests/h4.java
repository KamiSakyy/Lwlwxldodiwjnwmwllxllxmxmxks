package com.github.rudroid.viewmodels.issuesorpullrequests;

import com.github.rudroid.viewmodels.issuesorpullrequests.w2;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileEventContext;
import com.github.service.models.response.type.MobileSubjectType;

@c71.e(c = "com.github.rudroid.viewmodels.issuesorpullrequests.LegacyIssueOrPullRequestViewModel$observeBannerDisplayState$1", f = "LegacyIssueOrPullRequestViewModel.kt", l = {1365, 1368}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class h4 extends c71.j implements j71.e {
    public w2 v;
    public MobileAppElement w;
    public com.github.rudroid.utilities.e x;
    public int y;
    public final /* synthetic */ w2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h4(w2 w2Var, a71.c cVar) {
        super(2, cVar);
        this.z = w2Var;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new h4(this.z, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
    
        if (r9 == r0) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        MobileAppElement mobileAppElement;
        com.github.rudroid.utilities.e eVar;
        b71.a aVar = b71.a.r;
        int i = this.y;
        w2 w2Var = this.z;
        if (i == 0) {
            sy.y.j(obj);
            y00.l lVar = new y00.l(new c00.g(w2Var.j0, w2Var.m0, new g4(3, null), 27), 10);
            this.y = 1;
            obj = y71.n1Shadow.v(lVar, this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = this.x;
                mobileAppElement = this.w;
                w2Var = this.v;
                sy.y.j(obj);
                oa.j jVar = (oa.j) obj;
                MobileAppAction mobileAppAction = MobileAppAction.PRESS;
                yz0.i2 i2Var = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) w2Var.j0.getValue()).getData();
                eVar.a(jVar, new wj.e(mobileAppAction, mobileAppElement, MobileEventContext.DISPLAYED, (i2Var == null && i2Var.a0) ? MobileSubjectType.PULL_REQUEST : MobileSubjectType.ISSUE));
                return w61.a0.a;
            }
            sy.y.j(obj);
        }
        w2.b bVar = (w2.b) obj;
        if (bVar != null && (mobileAppElement = bVar.r) != null) {
            com.github.rudroid.utilities.e eVar2 = w2Var.d0;
            com.github.rudroid.activities.util.c cVar = w2Var.e0;
            this.v = w2Var;
            this.w = mobileAppElement;
            this.x = eVar2;
            this.y = 2;
            cVar.getClass();
            Object c = com.github.rudroid.activities.util.a.c(cVar, this);
            if (c != aVar) {
                eVar = eVar2;
                obj = c;
                oa.j jVar2 = (oa.j) obj;
                MobileAppAction mobileAppAction2 = MobileAppAction.PRESS;
                yz0.i2 i2Var2 = (yz0.i2) ((com.github.rudroid.utilities.ui.g1) w2Var.j0.getValue()).getData();
                eVar.a(jVar2, new wj.e(mobileAppAction2, mobileAppElement, MobileEventContext.DISPLAYED, (i2Var2 == null && i2Var2.a0) ? MobileSubjectType.PULL_REQUEST : MobileSubjectType.ISSUE));
            }
            return aVar;
        }
        return w61.a0.a;
    }
}
