package kz0;

import java.util.List;
import pz0.ag;
import pz0.su;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y1 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("color", xVar, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar2 = td.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ag.Companion.getClass();
        aa.r b2 = v8.l0.b(v8.l0.a(ag.a));
        su.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("programmingLanguages", b2, (String) null, rVar, no.a.s(su.k, new aa.u0(Boolean.TRUE)), r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
