package com.github.rudroid.advancedsearch;

import com.github.rudroid.common.k0;
import java.util.ArrayList;
import yz0.j3;
import yz0.y1;

/* loaded from: /home/user/work/p/classes.dex */
public final class e0 {
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Iterable, java.lang.Object] */
    public static ArrayList a(xz0.g gVar, String str) {
        le.v vVar;
        k71.k.g(gVar, "searchIssueOrPullRequestsPaged");
        k71.k.g(str, "query");
        ?? r72 = gVar.a;
        ArrayList arrayList = new ArrayList();
        for (y1 y1Var : r72) {
            if (y1Var instanceof y1) {
                y1 y1Var2 = y1Var;
                vVar = oe.b.a(y1Var2, "search:".concat(y1Var2.a));
            } else if (y1Var instanceof j3) {
                k0 k0Var = k0.f9338s;
                boolean z10 = t71.p.I(str, "user-review-requested:@me", false) || t71.p.I(str, "review-requested:@me", false);
                j3 j3Var = (j3) y1Var;
                he.q a10 = he.r.a(j3Var.v);
                vVar = oe.d.a(j3Var, "search:".concat(j3Var.a), (a10 == he.q.f25628r && z10) ? null : a10);
            } else {
                vVar = null;
            }
            if (vVar != null) {
                arrayList.add(vVar);
            }
        }
        return arrayList;
    }
}
