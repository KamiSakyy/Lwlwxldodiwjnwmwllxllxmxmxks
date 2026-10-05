package yt0;

import aa.x;
import java.util.List;
import pz0.gu;
import pz0.h50;
import pz0.jx;
import pz0.ny;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ny.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", l0.b(ny.e), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gu.Companion.getClass();
        aa.m mVar5 = new aa.m("state", l0.b(gu.s), "pullRequestState", rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        h50.Companion.getClass();
        aa.m mVar7 = new aa.m("url", l0.b(h50.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.m mVar8 = new aa.m("number", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar3 = pd.a;
        aa.m mVar9 = new aa.m("isDraft", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        jx.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new aa.m("repository", l0.b(jx.t0), (String) null, rVar, rVar, r2), new aa.m("isInMergeQueue", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
