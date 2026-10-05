package h10;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.fd;
import m10.nd;
import m10.pd;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        ch.Companion.getClass();
        aa.r b = v8.l0.b(ch.a);
        x61.r rVar = x61.r.r;
        List n = sy.d0.n(new aa.m("totalCount", b, (String) null, rVar, rVar, rVar));
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.m mVar = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.m mVar2 = new aa.m("comments", v8.l0.b(pd.a), (String) null, rVar, rVar, n);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.s mVar3 = new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        List n2 = sy.d0.n("DiscussionComment");
        List list = ns.b.a;
        aa.s c = no.a.c(list, "selections", "DiscussionComment", n2, list);
        fd.Companion.getClass();
        aa.q0 q0Var = fd.l;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.s[]{mVar3, c, new aa.m("discussion", q0Var, (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        nd.Companion.getClass();
        aa.q0 q0Var2 = nd.c;
        k71.k.g(q0Var2, "type");
        List n3 = sy.d0.n(new aa.m("comment", q0Var2, (String) null, rVar, rVar, r2));
        m10.t.Companion.getClass();
        aa.q0 q0Var3 = m10.t.a;
        k71.k.g(q0Var3, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("addDiscussionComment", q0Var3, (String) null, rVar, no.a.s(vp.c, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("discussionId", new aa.t("discussionId"))}))), n3));
    }
}
