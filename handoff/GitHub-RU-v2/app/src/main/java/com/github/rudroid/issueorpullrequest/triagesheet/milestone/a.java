package com.github.rudroid.issueorpullrequest.triagesheet.milestone;

import java.util.ArrayList;
import java.util.List;
import le.l;
import yz0.v2;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {
    public static c a(v2 v2Var, v2 v2Var2, List list) {
        k71.k.g(list, "selectableList");
        ArrayList arrayList = new ArrayList();
        arrayList.add(new l.d(2131952995));
        if (v2Var2 != null) {
            arrayList.add(new l.f(v2Var2));
        } else {
            arrayList.add(new l.b(2131954852));
        }
        arrayList.add(new l.d(2131954900));
        ArrayList j02 = x61.m.j0(list, v2Var2);
        if (j02.isEmpty()) {
            arrayList.add(new l.b(2131954855));
        } else {
            ArrayList S = x61.m.S(j02);
            ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
            int size = S.size();
            int i = 0;
            while (i < size) {
                Object obj = S.get(i);
                i++;
                arrayList2.add(new l.e((v2) obj));
            }
            arrayList.addAll(arrayList2);
        }
        return new c(arrayList, !k71.k.b(v2Var != null ? v2Var.getId() : null, v2Var2 != null ? v2Var2.getId() : null));
    }
}
