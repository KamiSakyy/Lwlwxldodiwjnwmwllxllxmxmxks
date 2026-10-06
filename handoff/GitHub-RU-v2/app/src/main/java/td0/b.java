package td0;

import aa.m;
import aa.n;
import aa.r;
import aa.s;
import aa.x;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class b {
    public static final List a;

    static {
        pb.Companion.getClass();
        x xVar = pb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar2 = rb.a;
        m mVar2 = new m("upvoteCount", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        x xVar3 = lb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerHasUpvoted", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r2 = l.r(new m[]{new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("upvoteCount", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("viewerHasUpvoted", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        tb.Companion.getClass();
        a = l.r(new s[]{new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar), new n("Discussion", d0Shadow.n("Discussion"), r), new n("DiscussionComment", d0Shadow.n("DiscussionComment"), r2)});
    }
}
