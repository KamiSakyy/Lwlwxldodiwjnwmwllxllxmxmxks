package g00;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import aa.x0;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.wu;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0Shadow.n("Issue");
        List list = c.a;
        s c = no.a.c(list, "selections", "Issue", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n2 = d0Shadow.n("PullRequest");
        List list2 = d.a;
        List r2 = l.r(new s[]{mVar2, no.a.c(list2, "selections", "PullRequest", n2, list2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        s mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        List n3 = d0Shadow.n("DraftIssue");
        List list3 = b.a;
        List r3 = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), r), new n("PullRequest", d0Shadow.n("PullRequest"), r2), new n("DraftIssue", d0Shadow.n("DraftIssue"), l.r(new s[]{mVar3, no.a.c(list3, "selections", "DraftIssue", n3, list3), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)}))});
        s mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n4 = d0Shadow.n("ProjectV2Item");
        List list4 = j.a;
        s c2 = no.a.c(list4, "selections", "ProjectV2Item", n4, list4);
        wu.Companion.getClass();
        x0 x0Var = wu.a;
        k.g(x0Var, "type");
        a = l.r(new s[]{mVar4, mVar5, c2, new m("content", x0Var, (String) null, rVar, rVar, r3)});
    }
}
