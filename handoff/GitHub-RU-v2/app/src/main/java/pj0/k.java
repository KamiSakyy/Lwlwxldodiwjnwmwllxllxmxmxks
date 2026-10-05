package pj0;

import aa.r;
import gn0.lb;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class k {
    public static final List a;

    static {
        tb.Companion.getClass();
        r b = l0.b(tb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        aa.m mVar2 = new aa.m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        aa.m mVar3 = new aa.m("stargazerCount", l0.b(rb.a), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("viewerHasStarred", l0.b(lb.a), (String) null, rVar, rVar, rVar)});
    }
}
