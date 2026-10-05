package com.github.rudroid.starredreposandlists.listdetails;

import androidx.compose.runtime.f1;
import com.github.rudroid.starredreposandlists.listdetails.b0;
import com.github.rudroid.utilities.ui.g1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import yz0.p2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class f0 implements j71.c {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ f0(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    public final Object k(Object obj) {
        switch (this.r) {
            case 0:
                j71.c cVar = (j71.c) this.s;
                f1 f1Var = (f1) this.t;
                String str = (String) obj;
                k71.k.g(str, "it");
                cVar.k(str);
                f1Var.setValue(Boolean.valueOf(!((Boolean) f1Var.getValue()).booleanValue()));
                return w61.a0.a;
            default:
                g1 g1Var = (g1) this.s;
                s0 s0Var = (s0) this.t;
                List list = (List) obj;
                p2 p2Var = (p2) g1Var.getData();
                if (p2Var == null) {
                    return x61.r.r;
                }
                s0Var.v.getClass();
                k71.k.g(list, "repos");
                y61.b i = sy.d0.i();
                i.add(new b0.a(new y0(p2Var.e, p2Var.b, p2Var.c, p2Var.d)));
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(new b0.b((p01.n) it.next()));
                }
                i.addAll(arrayList);
                return sy.d0.h(i);
        }
    }
}
