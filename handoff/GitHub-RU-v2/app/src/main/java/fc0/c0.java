package fc0;

import hc0.bb;
import hc0.fb;
import hc0.o8;
import hc0.wg;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c0 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.r b = v8.l0.b(fb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = sy.d0.n("Discussion");
        List list = f50.e.a;
        aa.s c = no.a.c(list, "selections", "Discussion", n, list);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.s[]{mVar, c, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar)});
        o8.Companion.getClass();
        aa.q0 q0Var = o8.l;
        k71.k.g(q0Var, "type");
        List n2 = sy.d0.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r));
        hc0.h5.Companion.getClass();
        aa.q0 q0Var2 = hc0.h5.a;
        k71.k.g(q0Var2, "type");
        wg.Companion.getClass();
        a = sy.d0.n(new aa.m("createDiscussion", q0Var2, (String) null, rVar, no.a.s(wg.y, new aa.u0(x61.x.u(new w61.k("body", new aa.t("body")), new w61.k("categoryId", new aa.t("categoryId")), new w61.k("repositoryId", new aa.t("repositoryId")), new w61.k("title", new aa.t("title"))))), n2));
    }
}
