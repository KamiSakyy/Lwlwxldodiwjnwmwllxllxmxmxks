package com.github.rudroid.searchandfilter.complexfilter.notificationfilter;

import com.github.domain.searchandfilter.filters.data.StatusFilter$Inbox;
import com.github.domain.searchandfilter.filters.data.notification.CustomNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.SpacerNotificationFilter;
import com.github.domain.searchandfilter.filters.data.notification.StatusNotificationFilter;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import yz0.a3;

/* loaded from: /home/user/work/p/classes3.dex */
public final class s<T> implements y71.j {
    public final /* synthetic */ y71.j r;

    public s(y71.j jVar, a0 a0Var) {
        this.r = jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        r rVar;
        int i;
        int i2;
        if (cVar instanceof r) {
            rVar = (r) cVar;
            int i3 = rVar.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                rVar.v = i3 - Integer.MIN_VALUE;
                Object obj2 = rVar.u;
                b71.a aVar = b71.a.r;
                i = rVar.v;
                if (i != 0) {
                    sy.y.j(obj2);
                    a3 a3Var = (a3) obj;
                    StatusNotificationFilter.Companion companion = StatusNotificationFilter.Companion;
                    int i4 = a3Var.a;
                    companion.getClass();
                    com.github.domain.searchandfilter.filters.data.i.Companion.getClass();
                    StatusFilter$Inbox statusFilter$Inbox = com.github.domain.searchandfilter.filters.data.i.w;
                    StatusNotificationFilter statusNotificationFilter = new StatusNotificationFilter(statusFilter$Inbox.v, "", statusFilter$Inbox, i4);
                    int i5 = 0;
                    List r = x61.l.r(new com.github.domain.searchandfilter.filters.data.notification.a[]{statusNotificationFilter, StatusNotificationFilter.y, StatusNotificationFilter.z, SpacerNotificationFilter.INSTANCE});
                    ArrayList arrayList = a3Var.b;
                    ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
                    int size = arrayList.size();
                    while (i5 < size) {
                        Object obj3 = arrayList.get(i5);
                        i5++;
                        j01.a aVar2 = (j01.a) obj3;
                        arrayList2.add(new CustomNotificationFilter(aVar2.d, aVar2.a, aVar2.b, aVar2.c, aVar2.e));
                    }
                    int i6 = a0.D;
                    ListIterator listIterator = arrayList2.listIterator(arrayList2.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i2 = -1;
                            break;
                        }
                        if (((CustomNotificationFilter) listIterator.previous()).w) {
                            i2 = listIterator.nextIndex();
                            break;
                        }
                    }
                    if (i2 > -1) {
                        arrayList2 = x61.m.H0(arrayList2);
                        arrayList2.add(i2 + 1, SpacerNotificationFilter.INSTANCE);
                    }
                    ArrayList l0 = x61.m.l0(r, arrayList2);
                    rVar.v = 1;
                    if (this.r.c(l0, rVar) == aVar) {
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
        rVar = new r(this, cVar);
        Object obj22 = rVar.u;
        b71.a aVar3 = b71.a.r;
        i = rVar.v;
        if (i != 0) {
        }
        return w61.a0.a;
    }
    public Object A() { return null; }
    public Object N() { return null; }
    public Object S(Object p1, Object p2) { return null; }
    public Object V() { return null; }
    public Object X() { return null; }
    public Object e0(Object p1) { return null; }
    public Object f(Object p1) { return null; }
    public Object g0() { return null; }
    public Object h(Object p1) { return null; }
    public Object k(Object p1) { return null; }
    public Object l() { return null; }
    public Object n0(Object p1) { return null; }
    public Object q(Object p1) { return null; }
    public Object q0() { return null; }
    public Object r() { return null; }
    public Object t() { return null; }
    public Object S = null;
    public Object S(int, boolean) { return null; }
    public Object e0(int) { return null; }
    public Object f(Object) { return null; }
    public Object f(Object) { return null; }
    public Object h(Object) { return null; }
    public Object h(Object) { return null; }
    public Object k(Object) { return null; }
    public Object k(Object) { return null; }
    public Object n0(Object) { return null; }
    public Object n0(Object) { return null; }
    public Object q(boolean) { return null; }
}
