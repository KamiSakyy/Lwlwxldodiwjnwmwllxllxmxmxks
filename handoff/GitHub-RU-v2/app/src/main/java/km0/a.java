package km0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import gn0.lb;
import gn0.nh;
import gn0.pb;
import gn0.s00;
import gn0.tb;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        lb.Companion.getClass();
        x xVar = lb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List r = l.r(new m[]{new m("scheduledNotifications", b, (String) null, rVar, rVar, rVar), new m("getsDirectMentions", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsAssignments", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsReviewRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsDeploymentRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsPullRequestReviews", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiActivity", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiFailedOnly", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsReleases", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        nh.Companion.getClass();
        q0 q0Var = nh.a;
        k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, r);
        pb.Companion.getClass();
        m mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        List r2 = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
        s00.Companion.getClass();
        a = d0Shadow.n(new m("viewer", l0.b(s00.P), (String) null, rVar, rVar, r2));
    }
}
