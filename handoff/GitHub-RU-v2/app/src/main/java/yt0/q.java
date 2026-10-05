package yt0;

import aa.q0;
import aa.x;
import java.util.List;
import pz0.h50;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;
import pz0.zz;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class q {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = l0.b(pd.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("isViewer", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        aa.m mVar2 = new aa.m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.m mVar3 = new aa.m("avatarUrl", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        x xVar2 = td.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        w80.Companion.getClass();
        q0 q0Var = w80.W;
        k71.k.g(q0Var, "type");
        List r2 = x61.l.r(new aa.m[]{mVar4, new aa.m("requestedBy", q0Var, (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        aa.m mVar5 = new aa.m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        zz.Companion.getClass();
        q0 q0Var2 = zz.a;
        k71.k.g(q0Var2, "type");
        a = x61.l.r(new aa.m[]{mVar5, new aa.m("viewerLatestReviewRequest", q0Var2, (String) null, rVar, rVar, r2), new aa.m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
