package com.github.rudroid.searchandfilter;

import com.github.rudroid.searchandfilter.q;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import t00.z1;

/* loaded from: /home/user/work/p/classes3.dex */
final class l<T> implements y71.j {
    public final /* synthetic */ q r;

    public l(q qVar) {
        this.r = qVar;
    }

    public final Object c(Object obj, a71.c cVar) {
        List list = ((d0) obj).b;
        q qVar = this.r;
        List list2 = qVar.t;
        q.c cVar2 = qVar.v;
        if (k71.k.b(list, list2)) {
            yl.a aVar = cVar2.c;
            oa.j d = cVar2.a.d();
            fk.f fVar = cVar2.e;
            aVar.getClass();
            if (!(fVar instanceof fk.e)) {
                if (!(fVar instanceof com.github.domain.database.serialization.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                v71.b0.z(aVar.b, (a71.h) null, (v71.a0) null, new z1(aVar, d, fVar, null, 29), 3);
            }
        } else {
            yl.d dVar = cVar2.b;
            oa.j d2 = cVar2.a.d();
            fk.f fVar2 = cVar2.e;
            dVar.getClass();
            k71.k.g(list, "filters");
            if (!(fVar2 instanceof fk.e)) {
                if (!(fVar2 instanceof com.github.domain.database.serialization.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                v71.b0.z(dVar.c, (a71.h) null, (v71.a0) null, new m7.x(dVar, d2, fVar2, list, (a71.c) null, 25), 3);
            }
        }
        qVar.X(list);
        return w61.a0.a;
    }
}
