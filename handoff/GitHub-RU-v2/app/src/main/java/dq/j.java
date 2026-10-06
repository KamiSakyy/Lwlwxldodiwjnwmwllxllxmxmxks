package dq;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.wg;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.x xVar = ah.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.x xVar2 = ch.a;
        aa.m mVar2 = new aa.m("upvoteCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        aa.x xVar3 = wg.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("viewerCanUpvote", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("viewerHasUpvoted", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        List r2 = x61.l.r(new aa.m[]{new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("upvoteCount", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("viewerCanUpvote", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar), new aa.m("viewerHasUpvoted", v8.l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        eh.Companion.getClass();
        a = x61.l.r(new aa.s[]{new aa.m("__typename", v8.l0.b(eh.a), (String) null, rVar, rVar, rVar), new aa.n("Discussion", sy.d0Shadow.n("Discussion"), r), new aa.n("DiscussionComment", sy.d0Shadow.n("DiscussionComment"), r2)});
    }
}
