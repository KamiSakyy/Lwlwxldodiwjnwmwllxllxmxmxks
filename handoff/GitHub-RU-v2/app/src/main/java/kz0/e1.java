package kz0;

import java.util.List;
import pz0.j40;
import pz0.l40;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("link", b, (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("linkType", v8.l0.b(l40.s), (String) null, rVar, rVar, rVar)});
        j40.Companion.getClass();
        aa.q0 q0Var = j40.a;
        k71.k.g(q0Var, "type");
        aa.m mVar2 = new aa.m("enterpriseSupportContact", q0Var, (String) null, rVar, rVar, r);
        td.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar2, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
