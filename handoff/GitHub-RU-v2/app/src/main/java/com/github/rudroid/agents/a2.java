package com.github.rudroid.agents;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class a2 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f6395r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ b2 f6396s;

    public /* synthetic */ a2(b2 b2Var, int i) {
        this.f6395r = i;
        this.f6396s = b2Var;
    }

    public final Object k(Object obj) {
        switch (this.f6395r) {
            case k5.f.J:
                com.github.rudroid.utilities.ui.g1 g1Var = (com.github.rudroid.utilities.ui.g1) obj;
                k71.k.g(g1Var, "model");
                break;
            case 1:
                List<on.l> list = (List) obj;
                k71.k.g(list, "list");
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                for (on.l lVar : list) {
                    arrayList.add(new v6(lVar, k71.k.b(lVar.r, (String) this.f6396s.f6600u.a("EXTRA_SELECTED_SUBAGENT_NAME"))));
                }
                break;
            case 2:
                com.github.rudroid.utilities.w0.m(this.f6396s.f6602w, (fl.b) obj);
                break;
            default:
                com.github.rudroid.utilities.w0.m(this.f6396s.f6602w, (fl.b) obj);
                break;
        }
        return w61.a0.a;
    }
}
