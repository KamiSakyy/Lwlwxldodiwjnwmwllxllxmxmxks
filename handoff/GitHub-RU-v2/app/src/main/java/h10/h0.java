package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.i9;
import m10.vp;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h0 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.r b = v8.l0.b(eh.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Discussion");
        List list = js.e.a;
        aa.s c = no.a.c(list, "selections", "Discussion", n, list);
        ah.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar)});
        fd.Companion.getClass();
        aa.q0 q0Var = fd.l;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r));
        i9.Companion.getClass();
        aa.q0 q0Var2 = i9.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("createDiscussion", q0Var2, (String) null, rVar, no.a.s(vp.F, new aa.u0(x61.x.u(new w61.k[]{new w61.k("body", new aa.t("body")), new w61.k("categoryId", new aa.t("categoryId")), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("title", new aa.t("title"))}))), n2));
    }
}
