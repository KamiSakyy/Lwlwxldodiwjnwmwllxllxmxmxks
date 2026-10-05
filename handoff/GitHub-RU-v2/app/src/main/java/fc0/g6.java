package fc0;

import hc0.ap;
import hc0.bb;
import hc0.fb;
import hc0.pm;
import hc0.xa;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g6 {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = v8.l0.b(bb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        aa.m mVar2 = new aa.m("viewerCanPush", v8.l0.b(xa.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        ap.Companion.getClass();
        aa.q0 q0Var = ap.k0;
        k71.k.g(q0Var, "type");
        pm.Companion.getClass();
        a = sy.d0.n(new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(pm.i, new aa.u0(new aa.t("name"))), new aa.k(pm.j, new aa.u0(new aa.t("owner")))}), r));
    }
}
