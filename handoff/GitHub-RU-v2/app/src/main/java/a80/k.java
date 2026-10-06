package a80;

import aa.a0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.nl;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class k {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = l0.b(bb.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        nl.Companion.getClass();
        a0 a0Var = nl.s;
        k71.k.g(a0Var, "type");
        aa.m mVar2 = new aa.m("reviewDecision", a0Var, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar = db.a;
        k71.k.g(xVar, "type");
        aa.m mVar3 = new aa.m("totalCommentsCount", xVar, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
