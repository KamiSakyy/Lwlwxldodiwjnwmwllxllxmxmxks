package bp0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class g {
    public static final List a;

    static {
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.x xVar2 = vd.a;
        aa.m mVar2 = new aa.m("upvoteCount", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        aa.x xVar3 = pd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("viewerHasUpvoted", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("upvoteCount", l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("viewerCanUpvote", l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("viewerHasUpvoted", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        xd.Companion.getClass();
        a = x61.l.r(new aa.s[]{new aa.m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar), new aa.n("Discussion", sy.d0.n("Discussion"), r), new aa.n("DiscussionComment", sy.d0.n("DiscussionComment"), r2)});
    }
}
