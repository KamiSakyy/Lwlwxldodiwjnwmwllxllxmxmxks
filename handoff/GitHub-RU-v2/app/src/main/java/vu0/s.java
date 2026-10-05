package vu0;

import aa.x;
import java.util.List;
import pz0.t30;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class s {
    public static final List a;

    static {
        vd.Companion.getClass();
        x xVar = vd.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = x61.l.r(new aa.m[]{new aa.m("total", b, (String) null, rVar, rVar, rVar), new aa.m("completed", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        t30.Companion.getClass();
        aa.m mVar2 = new aa.m("subIssuesSummary", l0.b(t30.a), (String) null, rVar, rVar, r);
        xd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
