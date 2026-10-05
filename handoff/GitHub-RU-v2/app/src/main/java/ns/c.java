package ns;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.nd;
import m10.pd;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("DiscussionComment");
        List list = d.a;
        s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        m mVar2 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        nd.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(nd.c), (String) null, rVar, rVar, r)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("replies", l0.b(pd.a), (String) null, rVar, no.a.s(nd.b, new u0(new t("previewCount"))), r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
