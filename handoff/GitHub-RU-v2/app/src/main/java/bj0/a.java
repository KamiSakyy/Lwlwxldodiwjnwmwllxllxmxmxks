package bj0;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import gn0.bo;
import gn0.eo;
import gn0.go;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(rb.a), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar2 = lb.a;
        m mVar3 = new m("viewerHasReacted", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        go.Companion.getClass();
        r b2 = l0.b(go.a);
        eo.Companion.getClass();
        m mVar4 = new m("reactors", b2, (String) null, rVar, no.a.s(eo.a, new u0(1)), r);
        bo.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("content", l0.b(bo.s), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("reactionGroups", l0.a(l0.b(eo.b)), (String) null, rVar, rVar, r2)});
    }
}
