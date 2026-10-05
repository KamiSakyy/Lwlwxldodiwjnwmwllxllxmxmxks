package com.github.rudroid.searchandfilter.complexfilter;

import java.util.List;

@c71.e(c = "com.github.rudroid.searchandfilter.complexfilter.SearchAndFilterBaseFragment$onViewCreated$2$2", f = "SearchAndFilterBaseFragment.kt", l = {78}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class b0 extends c71.j implements j71.e {
    public int v;
    public final /* synthetic */ SearchAndFilterBaseFragment w;
    public final /* synthetic */ fl.f x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(SearchAndFilterBaseFragment searchAndFilterBaseFragment, fl.f fVar, a71.c cVar) {
        super(2, cVar);
        this.w = searchAndFilterBaseFragment;
        this.x = fVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        return new b0(this.w, this.x, cVar);
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(w61.a0.a);
    }

    public final Object v(Object obj) {
        String str;
        b71.a aVar = b71.a.r;
        int i = this.v;
        if (i == 0) {
            sy.y.j(obj);
            this.v = 1;
            if (v71.b0.l(250L, this) == aVar) {
                return aVar;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sy.y.j(obj);
        }
        SearchAndFilterBaseFragment searchAndFilterBaseFragment = this.w;
        com.github.rudroid.utilities.b bVar = (com.github.rudroid.utilities.b) searchAndFilterBaseFragment.C0.getValue();
        List list = (List) this.x.b;
        if (list != null) {
            int size = list.size();
            str = searchAndFilterBaseFragment.i4().getResources().getQuantityString(2131820630, size, Integer.valueOf(size));
            k71.k.f(str, "getQuantityString(...)");
        } else {
            str = null;
        }
        bVar.b(str);
        return w61.a0.a;
    }
}
