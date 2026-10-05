package wn0;

import aa.m;
import aa.p;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import pz0.da0;
import pz0.fa0;
import pz0.pd;
import pz0.td;
import pz0.xd;
import pz0.y90;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class i {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        p a2 = l0.a(l0.b(xVar));
        r rVar = r.r;
        m mVar = new m("choices", a2, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar3 = new m("required", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        fa0.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("type", l0.b(fa0.s), (String) null, rVar, rVar, rVar), new m("defaultValue", xVar, (String) null, rVar, rVar, rVar), new m("titleId", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        da0.Companion.getClass();
        p a3 = l0.a(l0.b(da0.a));
        y90.Companion.getClass();
        m mVar4 = new m("inputs", a3, (String) null, rVar, no.a.s(y90.b, new u0(new t("branchRef"))), r);
        td.Companion.getClass();
        a = l.r(new m[]{mVar4, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
