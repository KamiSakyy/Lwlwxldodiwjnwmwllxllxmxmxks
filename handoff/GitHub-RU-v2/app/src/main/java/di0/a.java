package di0;

import aa.m;
import aa.r;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        pb.Companion.getClass();
        r b = l0.b(pb.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        m mVar2 = new m("viewerIsFollowing", l0.b(lb.a), (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(tb.a), (String) null, rVar, rVar, rVar)});
    }
}
