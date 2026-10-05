package j50;

import aa.m;
import aa.r;
import aa.s;
import aa.t;
import aa.u0;
import aa.x;
import hc0.bb;
import hc0.db;
import hc0.fb;
import hc0.w8;
import hc0.y8;
import java.util.List;
import sy.d0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List n = d0.n("DiscussionComment");
        List list = d.a;
        s c = no.a.c(list, "selections", "DiscussionComment", n, list);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new s[]{mVar, c, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        db.Companion.getClass();
        m mVar2 = new m("totalCount", l0.b(db.a), (String) null, rVar, rVar, rVar);
        w8.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, new m("nodes", l0.a(w8.c), (String) null, rVar, rVar, r)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        y8.Companion.getClass();
        a = l.r(new m[]{mVar3, new m("replies", l0.b(y8.a), (String) null, rVar, no.a.s(w8.b, new u0(new t("previewCount"))), r2), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
