package si0;

import aa.x;
import gn0.eq;
import gn0.hn;
import gn0.hr;
import gn0.lb;
import gn0.mx;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        List r = x61.l.r(new aa.m[]{mVar, new aa.m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar2 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        hr.Companion.getClass();
        List r2 = x61.l.r(new aa.m[]{mVar2, mVar3, new aa.m("owner", l0.b(hr.a), (String) null, rVar, rVar, r), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        aa.m mVar4 = new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hn.Companion.getClass();
        aa.m mVar5 = new aa.m("state", l0.b(hn.s), "pullRequestState", rVar, rVar, rVar);
        aa.m mVar6 = new aa.m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        mx.Companion.getClass();
        aa.m mVar7 = new aa.m("url", l0.b(mx.a), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        aa.m mVar8 = new aa.m("number", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar3 = lb.a;
        aa.m mVar9 = new aa.m("isDraft", l0.b(xVar3), (String) null, rVar, rVar, rVar);
        eq.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, new aa.m("repository", l0.b(eq.m0), (String) null, rVar, rVar, r2), new aa.m("isInMergeQueue", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
