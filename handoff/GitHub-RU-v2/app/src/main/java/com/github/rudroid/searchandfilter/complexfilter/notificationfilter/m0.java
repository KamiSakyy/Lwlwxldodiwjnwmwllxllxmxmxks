package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import com.github.domain.searchandfilter.filters.data.notification.RepositoryNotificationFilter;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class m0<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ s0 s;

    public m0(y71.j jVar, s0 s0Var) {
        this.r = jVar;
        this.s = s0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        l0 l0Var;
        int i;
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i2 = l0Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                l0Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = l0Var.u;
                b71.a aVar = b71.a.r;
                i = l0Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    List<j01.b> list = (List) obj;
                    ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                    for (j01.b bVar : list) {
                        String str = bVar.c;
                        String str2 = bVar.d;
                        arrayList.add(new RepositoryNotificationFilter(str, "repo:".concat(str2), str2, bVar.f, this.s.E ? bVar.a : bVar.b));
                    }
                    l0Var.v = 1;
                    if (this.r.c(arrayList, l0Var) == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sy.y.j(obj2);
                }
                return w61.a0.a;
            }
        }
        l0Var = new l0(this, cVar);
        Object obj22 = l0Var.u;
        b71.a aVar2 = b71.a.r;
        i = l0Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
