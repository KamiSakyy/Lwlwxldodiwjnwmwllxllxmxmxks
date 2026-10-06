package ob0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.kz;
import hc0.ng;
import hc0.xa;
import java.util.List;
import k71.k;
import sy.d0Shadow;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        xa.Companion.getClass();
        x xVar = xa.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        List r = l.r(new m[]{new m("scheduledNotifications", b, (String) null, rVar, rVar, rVar), new m("getsDirectMentions", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsAssignments", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsReviewRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsDeploymentRequests", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsPullRequestReviews", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiActivity", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("getsCiFailedOnly", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ng.Companion.getClass();
        q0 q0Var = ng.a;
        k.g(q0Var, "type");
        m mVar = new m("mobilePushNotificationSettings", q0Var, (String) null, rVar, rVar, r);
        bb.Companion.getClass();
        m mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        List r2 = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
        kz.Companion.getClass();
        a = d0Shadow.n(new m("viewer", l0.b(kz.O), (String) null, rVar, rVar, r2));
    }
}
