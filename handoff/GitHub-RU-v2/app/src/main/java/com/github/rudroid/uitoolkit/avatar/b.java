package com.github.rudroid.uitoolkit.avatar;

import androidx.compose.ui.layout.l1;
import androidx.compose.ui.layout.u0;
import androidx.compose.ui.layout.v0;
import androidx.compose.ui.layout.w0;
import androidx.compose.ui.layout.x0;
import com.github.rudroid.agents.sessionevents.w1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import k71.k;
import x61.n;
import x61.s;

/* loaded from: /home/user/work/p/classes3.dex */
class b implements v0 {
    public static final b a = new b();

    public final w0 a(x0 x0Var, List list, long j) {
        k.g(x0Var, "$this$Layout");
        k.g(list, "measurables");
        ArrayList arrayList = new ArrayList(n.F(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((u0) it.next()).F(j));
        }
        int i0 = x0Var.i0(1);
        return x0Var.h0((((l1) arrayList.get(1)).j0() / 2) + ((l1) arrayList.get(0)).j0(), ((l1) arrayList.get(0)).g0() + i0, s.r, new w1(arrayList, i0, 2));
    }
    public static Object B(Object p1, Object p2, Object p3, Object p4, Object p5, Object p6) { return null; }
}
