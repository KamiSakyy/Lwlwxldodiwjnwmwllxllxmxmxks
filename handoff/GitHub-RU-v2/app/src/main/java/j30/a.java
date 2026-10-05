package j30;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.fb;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        s mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Issue", "PullRequest"});
        List list = b.a;
        a = l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new n("Issue", d0.n("Issue"), l.r(new s[]{mVar, mVar2, no.a.c(list, "selections", "Assignable", r, list)})), new n("PullRequest", d0.n("PullRequest"), l.r(new s[]{new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new n("Assignable", l.r(new String[]{"Issue", "PullRequest"}), list)}))});
    }
}
