package di0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import gn0.lb;
import gn0.pb;
import gn0.tb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        s mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = vd0.b.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        s mVar3 = new m("descriptionHTML", xVar, (String) null, rVar, rVar, rVar);
        s mVar4 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, c, mVar3, mVar4, mVar5, new m("viewerIsFollowing", l0.b(lb.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
