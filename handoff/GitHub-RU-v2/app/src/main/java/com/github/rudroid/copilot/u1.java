package com.github.rudroid.copilot;

import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final /* synthetic */ class u1 implements j71.c {

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ int f10050r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f10051s;

    public /* synthetic */ u1(String str, int i) {
        this.f10050r = i;
        this.f10051s = str;
    }

    public final Object k(Object obj) {
        xn.s0 s0Var = (xn.s0) obj;
        switch (this.f10050r) {
            case k5.f.J /* 0 */:
                k71.k.g(s0Var, "chatThread");
                return xn.s0.a(s0Var, this.f10051s, (String) null, x61.r.r, 46);
            case 1:
                k71.k.g(s0Var, "chatThread");
                return xn.s0.a(s0Var, (String) null, this.f10051s, (List) null, 61);
            default:
                k71.k.g(s0Var, "chatThread");
                List<xn.x> list = s0Var.e;
                ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
                for (xn.x xVar : list) {
                    if (k71.k.b(xVar.getId(), this.f10051s) && (xVar instanceof xn.x)) {
                        xVar = xn.x.a(xVar, (String) null, (String) null, (ArrayList) null, (ArrayList) null, (xn.w) null, 12287);
                    }
                    arrayList.add(xVar);
                }
                return xn.s0.a(s0Var, (String) null, (String) null, arrayList, 47);
        }
    }
}
