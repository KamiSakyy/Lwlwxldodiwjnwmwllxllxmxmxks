package fa0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.hb;
import hc0.xa;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        s mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = f30.b.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        s mVar3 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        s mVar4 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        hb.Companion.getClass();
        s mVar5 = new m("bioHTML", l0.b(hb.a), (String) null, rVar, rVar, rVar);
        xa.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, c, mVar3, mVar4, mVar5, new m("viewerIsFollowing", l0.b(xa.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
