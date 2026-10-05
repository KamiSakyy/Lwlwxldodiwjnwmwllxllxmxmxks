package com.github.rudroid.searchandfilter.filterbar;

import com.github.domain.searchandfilter.filters.data.NotificationIsUnreadFilter;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Done;
import com.github.domain.searchandfilter.filters.data.StatusFilter$Saved;
import com.github.rudroid.searchandfilter.complexfilter.explore.a0;
import d3.c0;
import d3.z;
import java.util.ArrayList;
import java.util.List;
import le.s;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class j implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ List s;

    public /* synthetic */ j(int i, List list) {
        this.r = i;
        this.s = list;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                m0.f fVar = (m0.f) obj;
                k71.k.g(fVar, "$this$FadingEdgeHorizontalBar");
                a0 a0Var = new a0(14);
                List list = this.s;
                fVar.r(list.size(), (j71.c) null, new n(a0Var, list), new r1.d(new o(list), true, 802480018));
                break;
            case 1:
                c0 c0Var = (c0) obj;
                k71.k.g(c0Var, "$this$semantics");
                z.h(c0Var, this.s);
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (List) obj) {
                    s sVar = (s) obj2;
                    StatusFilter$Done statusFilter$Done = StatusFilter$Done.INSTANCE;
                    List list2 = this.s;
                    if (!com.github.rudroid.viewmodels.notifications.s.W(list2, statusFilter$Done) || sVar.f) {
                        ArrayList arrayList2 = new ArrayList();
                        for (Object obj3 : list2) {
                            if (obj3 instanceof NotificationIsUnreadFilter) {
                                arrayList2.add(obj3);
                            }
                        }
                        NotificationIsUnreadFilter notificationIsUnreadFilter = (NotificationIsUnreadFilter) x61.m.W(arrayList2);
                        if (notificationIsUnreadFilter == null || !notificationIsUnreadFilter.v || sVar.d) {
                            if (!com.github.rudroid.viewmodels.notifications.s.W(list2, StatusFilter$Saved.INSTANCE) || sVar.e) {
                                if (com.github.rudroid.viewmodels.notifications.s.W(list2, StatusFilter$Done.INSTANCE) || !sVar.f) {
                                    arrayList.add(obj2);
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                c0 c0Var2 = (c0) obj;
                k71.k.g(c0Var2, "$this$semantics");
                z.h(c0Var2, this.s);
                break;
            case 12:
                c0 c0Var3 = (c0) obj;
                k71.k.g(c0Var3, "$this$semantics");
                z.h(c0Var3, this.s);
                break;
            case 13:
                c0 c0Var4 = (c0) obj;
                k71.k.g(c0Var4, "$this$semantics");
                z.h(c0Var4, this.s);
                break;
            case 14:
                c0 c0Var5 = (c0) obj;
                k71.k.g(c0Var5, "$this$semantics");
                z.h(c0Var5, this.s);
                break;
            case 15:
                c0 c0Var6 = (c0) obj;
                k71.k.g(c0Var6, "$this$semantics");
                z.h(c0Var6, this.s);
                break;
            default:
                c0 c0Var7 = (c0) obj;
                k71.k.g(c0Var7, "$this$semantics");
                z.h(c0Var7, this.s);
                break;
        }
        return w61.a0.a;
    }

    public /* synthetic */ j(com.github.rudroid.viewmodels.notifications.s sVar, List list) {
        this.r = 10;
        this.s = list;
    }
}
