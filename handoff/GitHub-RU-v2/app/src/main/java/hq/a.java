package hq;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
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
        ah.Companion.getClass();
        x xVar2 = ah.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Issue", "PullRequest"});
        List list = b.a;
        a = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0Shadow.n("Issue"), l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Assignable", r, list)})), new n("PullRequest", d0Shadow.n("PullRequest"), l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("Assignable", l.r(new String[]{"Issue", "PullRequest"}), list)}))});
    }
}
