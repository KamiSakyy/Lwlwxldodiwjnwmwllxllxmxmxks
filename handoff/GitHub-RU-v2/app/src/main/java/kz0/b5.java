package kz0;

import java.util.List;
import pz0.h20;
import pz0.sk;
import pz0.wf;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b5 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = v8.l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Discussion", "Issue", "PullRequest"});
        List list = ds0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Labelable", r, list)});
        wf.Companion.getClass();
        aa.j0 j0Var = wf.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0Shadow.n(new aa.m("labelableRecord", j0Var, (String) null, rVar, rVar, r2));
        h20.Companion.getClass();
        aa.q0 q0Var = h20.a;
        k71.k.g(q0Var, "type");
        sk.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("setLabelsForLabelable", q0Var, (String) null, rVar, no.a.s(sk.L0, new aa.u0(x61.x.u(new w61.k("labelIds", new aa.t("labelIds")), new w61.k("labelableId", new aa.t("labelableId"))))), n));
    }
}
