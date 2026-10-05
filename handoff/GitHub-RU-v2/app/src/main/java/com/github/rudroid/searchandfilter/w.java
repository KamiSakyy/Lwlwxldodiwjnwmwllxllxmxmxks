package com.github.rudroid.searchandfilter;

import com.github.rudroid.searchandfilter.q;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileSubjectType;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$updateFilter$3", f = "FilterBarViewModel.kt", l = {442}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class w extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ q w;
    public final /* synthetic */ MobileSubjectType x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(q qVar, MobileSubjectType mobileSubjectType, a71.c cVar) {
        super(2, cVar);
        this.w = qVar;
        this.x = mobileSubjectType;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new w(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        q.a aVar = this.w.w;
        b71.a aVar2 = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            kj.j jVar = aVar.b;
            oa.j d = aVar.a.d();
            MobileAppElement mobileAppElement = aVar.c;
            MobileAppAction mobileAppAction = MobileAppAction.PRESS;
            MobileSubjectType mobileSubjectType = this.x;
            if (mobileSubjectType == null) {
                mobileSubjectType = MobileSubjectType.FILTER;
            }
            wj.e eVar = new wj.e(mobileAppAction, mobileAppElement, aVar.d, mobileSubjectType);
            this.v = 1;
            if (jVar.a(d, eVar, this) == aVar2) {
                return aVar2;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        return w61.a0.a;
    }
}
