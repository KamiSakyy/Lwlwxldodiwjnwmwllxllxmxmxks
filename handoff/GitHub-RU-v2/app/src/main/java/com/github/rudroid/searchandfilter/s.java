package com.github.rudroid.searchandfilter;

import java.util.ArrayList;
import java.util.List;

@c71.e(c = "com.github.rudroid.searchandfilter.FilterBarViewModel$model$1", f = "FilterBarViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
class s extends c71.j implements j71.g {
    public /* synthetic */ boolean v;
    public /* synthetic */ List w;
    public /* synthetic */ List x;
    public final /* synthetic */ q y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(a71.c cVar, q qVar) {
        super(4, cVar);
        this.y = qVar;
    }

    public final Object n(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        s sVar = new s((a71.c) obj4, this.y);
        sVar.v = booleanValue;
        sVar.w = (List) obj2;
        sVar.x = (List) obj3;
        return sVar.v(w61.a0.a);
    }

    public final Object v(Object obj) {
        Object obj2;
        boolean z = this.v;
        List list = this.w;
        List list2 = this.x;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            oa.j d = this.y.x.d();
            if (((com.github.domain.searchandfilter.filters.data.d) obj3).h(d.f.d(d, oa.j.p[2]))) {
                arrayList.add(obj3);
            }
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                obj2 = null;
                break;
            }
            obj2 = arrayList.get(i);
            i++;
            if (list2.contains(((com.github.domain.searchandfilter.filters.data.d) obj2).r)) {
                break;
            }
        }
        com.github.domain.searchandfilter.filters.data.d dVar = (com.github.domain.searchandfilter.filters.data.d) obj2;
        return new d0(z, arrayList, dVar != null ? dVar.r : null);
    }
}
