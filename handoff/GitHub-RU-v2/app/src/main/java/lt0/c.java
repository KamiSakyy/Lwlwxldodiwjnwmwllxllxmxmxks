package lt0;

import aa.m;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        s mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = dp0.b.a;
        s c = no.a.c(list, "selections", "Actor", r, list);
        s mVar3 = new m("descriptionHTML", xVar, (String) null, rVar, rVar, rVar);
        s mVar4 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s mVar5 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        a = l.r(new s[]{mVar, mVar2, c, mVar3, mVar4, mVar5, new m("viewerIsFollowing", l0.b(pd.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
