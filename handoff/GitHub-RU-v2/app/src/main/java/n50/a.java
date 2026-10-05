package n50;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.xa;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        x xVar = fb.a;
        m mVar2 = new m("option", l0.b(xVar), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        m mVar3 = new m("viewerHasVoted", l0.b(xa.a), (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("totalVoteCount", l0.b(db.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
