package hu0;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.cv;
import pz0.ev;
import pz0.gv;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(vd.a), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        m mVar3 = new m("viewerHasReacted", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        gv.Companion.getClass();
        r b2 = l0.b(gv.a);
        ev.Companion.getClass();
        m mVar4 = new m("reactors", b2, (String) null, rVar, no.a.s(ev.a, new u0(1)), r);
        cv.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("content", l0.b(cv.s), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("reactionGroups", l0.a(l0.b(ev.b)), (String) null, rVar, rVar, r2)});
    }
}
