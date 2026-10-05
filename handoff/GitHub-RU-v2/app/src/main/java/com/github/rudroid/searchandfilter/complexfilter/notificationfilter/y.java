package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public y(y71.j jVar) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        x xVar;
        int i;
        if (cVar instanceof x) {
            xVar = (x) cVar;
            int i2 = xVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xVar.v = i2 - Integer.MIN_VALUE;
                Object obj2 = xVar.u;
                b71.a aVar = b71.a.r;
                i = xVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    Object obj3 = (com.github.domain.searchandfilter.filters.data.notification.a) x61.m.W((List) obj);
                    if (obj3 == null) {
                        StatusNotificationFilter.Companion.getClass();
                        obj3 = StatusNotificationFilter.x;
                    }
                    xVar.v = 1;
                    if (this.r.c(obj3, xVar) == aVar) {
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
        xVar = new x(this, cVar);
        Object obj22 = xVar.u;
        b71.a aVar2 = b71.a.r;
        i = xVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
}
