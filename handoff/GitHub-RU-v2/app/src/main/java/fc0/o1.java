package fc0;

import hc0.bb;
import hc0.bd;
import hc0.fb;
import hc0.pm;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o1 {
    public static final List a;

    static {
        fb.Companion.getClass();
        aa.x xVar = fb.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("color", xVar, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("id", v8.l0.b(bb.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        bd.Companion.getClass();
        aa.r b2 = v8.l0.b(v8.l0.a(bd.a));
        pm.Companion.getClass();
        a = sy.d0Shadow.n(new aa.m("programmingLanguages", b2, (String) null, rVar, no.a.s(pm.h, new aa.u0(Boolean.TRUE)), r));
    }
}
