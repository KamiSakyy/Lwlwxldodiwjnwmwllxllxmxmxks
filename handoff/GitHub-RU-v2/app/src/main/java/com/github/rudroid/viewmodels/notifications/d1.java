package com.github.rudroid.viewmodels.notifications;

import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.t1;
import java.util.Collection;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d1<T> implements y71.j {
    public final /* synthetic */ y71.j r;
    public final /* synthetic */ s s;

    public d1(y71.j jVar, s sVar) {
        this.r = jVar;
        this.s = sVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        c1 c1Var;
        int i;
        Object h;
        Collection collection;
        if (cVar instanceof c1) {
            c1Var = (c1) cVar;
            int i2 = c1Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                c1Var.v = i2 - Integer.MIN_VALUE;
                Object obj2 = c1Var.u;
                b71.a aVar = b71.a.r;
                i = c1Var.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    a aVar2 = (a) obj;
                    dd.a aVar3 = aVar2.a;
                    com.github.rudroid.utilities.ui.g1 g1Var = aVar2.b;
                    boolean z = aVar2.c;
                    if ((g1Var instanceof t1) && ((collection = (Collection) g1Var.getData()) == null || collection.isEmpty())) {
                        s sVar = this.s;
                        if (sVar.a()) {
                            sVar.D();
                            g1.a aVar4 = com.github.rudroid.utilities.ui.g1.Companion;
                            x61.r rVar = (List) g1Var.getData();
                            if (rVar == null) {
                                rVar = x61.r.r;
                            }
                            i iVar = new i(aVar3, rVar, false, false);
                            aVar4.getClass();
                            h = new com.github.rudroid.utilities.ui.t0(iVar);
                        } else {
                            g1.a aVar5 = com.github.rudroid.utilities.ui.g1.Companion;
                            i iVar2 = new i(aVar3, (List) g1Var.getData(), false, true);
                            aVar5.getClass();
                            h = new com.github.rudroid.utilities.ui.h0(iVar2);
                        }
                    } else {
                        h = com.github.rudroid.utilities.ui.h1.h(g1Var, new t0(aVar3, z));
                    }
                    c1Var.v = 1;
                    if (this.r.c(h, c1Var) == aVar) {
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
        c1Var = new c1(this, cVar);
        Object obj22 = c1Var.u;
        b71.a aVar6 = b71.a.r;
        i = c1Var.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
    public Object k(Object p1) { return null; }
}
