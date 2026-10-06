package ma0;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.xa;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        bb.Companion.getClass();
        x xVar = bb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        db.Companion.getClass();
        x xVar2 = db.a;
        m mVar2 = new m("upvoteCount", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        x xVar3 = xa.a;
        List r = l.r(new m[]{mVar, mVar2, new m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerHasUpvoted", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("upvoteCount", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerHasUpvoted", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        fb.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar), new n("Discussion", d0Shadow.n("Discussion"), r), new n("DiscussionComment", d0Shadow.n("DiscussionComment"), r2)});
    }
}
