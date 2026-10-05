package en0;

import gn0.ld;
import gn0.tb;
import gn0.wh;
import gn0.wu;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class r4 {
    public static final List a;

    static {
        tb.Companion.getClass();
        aa.r b = v8.l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.s mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = x61.l.r(new String[]{"Discussion", "Issue", "PullRequest"});
        List list = tg0.a.a;
        List r2 = x61.l.r(new aa.s[]{mVar, no.a.c(list, "selections", "Labelable", r, list)});
        ld.Companion.getClass();
        aa.j0 j0Var = ld.a;
        k71.k.g(j0Var, "type");
        List n = sy.d0.n(new aa.m("labelableRecord", j0Var, (String) null, rVar, rVar, r2));
        wu.Companion.getClass();
        aa.q0 q0Var = wu.a;
        k71.k.g(q0Var, "type");
        wh.Companion.getClass();
        a = sy.d0.n(new aa.m("setLabelsForLabelable", q0Var, (String) null, rVar, no.a.s(wh.z0, new aa.u0(x61.x.u(new w61.k("labelIds", new aa.t("labelIds")), new w61.k("labelableId", new aa.t("labelableId"))))), n));
    }
}
