package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.fd;
import m10.vp;
import m10.zd0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j6 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("title", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        fd.Companion.getClass();
        aa.q0 q0Var = fd.l;
        k71.k.g(q0Var, "type");
        List n = sy.d0.n(new aa.m("discussion", q0Var, (String) null, rVar, rVar, r));
        zd0.Companion.getClass();
        aa.q0 q0Var2 = zd0.a;
        k71.k.g(q0Var2, "type");
        vp.Companion.getClass();
        a = sy.d0.n(new aa.m("updateDiscussion", q0Var2, (String) null, rVar, no.a.s(vp.e1, new aa.u0(x61.x.u(new w61.k[]{new w61.k("discussionId", new aa.t("id")), new w61.k("title", new aa.t("title"))}))), n));
    }
}
