package com.github.rudroid.viewmodels.notifications;

import com.github.rudroid.settings.g3;
import com.github.service.models.response.NotificationReasonState;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final boolean a(g3 g3Var, le.s sVar) {
        NotificationReasonState notificationReasonState;
        k71.k.g(sVar, "<this>");
        k71.k.g(g3Var, "swipeAction");
        if (g3Var == g3.y) {
            return (!sVar.j.r || (notificationReasonState = sVar.k) == NotificationReasonState.APPROVAL_REQUESTED || notificationReasonState == NotificationReasonState.CI_ACTIVITY) ? false : true;
        }
        return true;
    }

    public static final ArrayList b(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.l)) {
                sVar = le.s.a(sVar, false, false, true, (le.a0) null, 65503);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final ArrayList c(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.l)) {
                sVar = le.s.a(sVar, false, false, false, (le.a0) null, 65527);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final ArrayList d(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.l)) {
                sVar = le.s.a(sVar, false, true, false, (le.a0) null, 65519);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final ArrayList e(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.j.c())) {
                sVar = le.s.a(sVar, false, false, false, le.a0.a(sVar.p, true), 32735);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final ArrayList f(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.l)) {
                sVar = le.s.a(sVar, false, false, false, (le.a0) null, 65503);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final ArrayList g(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.l)) {
                sVar = le.s.a(sVar, true, false, false, (le.a0) null, 65527);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final ArrayList h(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.l)) {
                sVar = le.s.a(sVar, false, false, false, (le.a0) null, 65519);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }

    public static final ArrayList i(List list, Set set) {
        k71.k.g(list, "<this>");
        ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            le.s sVar = (le.s) it.next();
            if (set.contains(sVar.j.c())) {
                sVar = le.s.a(sVar, false, false, true, le.a0.a(sVar.p, false), 32735);
            }
            arrayList.add(sVar);
        }
        return arrayList;
    }
    public Object a(Object p1) { return null; }
}
