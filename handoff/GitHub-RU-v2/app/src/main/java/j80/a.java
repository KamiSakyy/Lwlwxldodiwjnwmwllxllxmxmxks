package j80;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.bn;
import hc0.db;
import hc0.dn;
import hc0.fb;
import hc0.xa;
import hc0.zm;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar2 = xa.a;
        m mVar3 = new m("viewerHasReacted", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        dn.Companion.getClass();
        r b2 = l0.b(dn.a);
        bn.Companion.getClass();
        m mVar4 = new m("reactors", b2, (String) null, rVar, no.a.s(bn.a, new u0(1)), r);
        zm.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("content", l0.b(zm.s), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("reactionGroups", l0.a(l0.b(bn.b)), (String) null, rVar, rVar, r2)});
    }
}
