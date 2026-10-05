package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.i30;
import m10.p00;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k7 {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.m mVar2 = new aa.m("viewerCanPush", v8.l0.b(wg.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar2 = eh.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        aa.q0 q0Var = i30.w0;
        k71.k.g(q0Var, "type");
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("repository", q0Var, (String) null, rVar, x61.l.r(new aa.k[]{new aa.k(p00.l, new aa.u0(new aa.t("name"))), new aa.k(p00.m, new aa.u0(new aa.t("owner")))}), r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
