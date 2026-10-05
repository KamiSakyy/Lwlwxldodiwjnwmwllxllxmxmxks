package rx;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.gh;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        s mVar2 = new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.b.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        s mVar3 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        s mVar4 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        gh.Companion.getClass();
        s mVar5 = new m("bioHTML", l0.b(gh.a), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, c, mVar3, mVar4, mVar5, new m("viewerIsFollowing", l0.b(wg.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
