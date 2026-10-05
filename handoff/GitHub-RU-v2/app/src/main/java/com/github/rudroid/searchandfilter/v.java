package com.github.rudroid.searchandfilter;

import com.github.rudroid.searchandfilter.q;
import com.github.service.models.response.type.MobileEventContext;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$updateFilter$1", f = "FilterBarViewModel.kt", l = {431}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class v extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ q w;
    public final /* synthetic */ com.github.domain.searchandfilter.filters.data.d x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(q qVar, com.github.domain.searchandfilter.filters.data.d dVar, a71.c cVar) {
        super(2, cVar);
        this.w = qVar;
        this.x = dVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new v(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            q qVar = this.w;
            com.github.rudroid.searchandfilter.newflags.k kVar = qVar.C;
            oa.j d = qVar.x.d();
            bm.l lVar = this.x.r;
            q.a aVar2 = qVar.w;
            MobileEventContext mobileEventContext = aVar2 != null ? aVar2.d : null;
            this.v = 1;
            if (kVar.a(d, lVar, mobileEventContext, this) == aVar) {
                return aVar;
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
