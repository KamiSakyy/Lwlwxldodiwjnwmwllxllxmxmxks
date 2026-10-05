package wo;

import aa.m;
import aa.p;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ah0;
import m10.eh;
import m10.tg0;
import m10.wg;
import m10.yg0;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class i {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        p a2 = l0.a(l0.b(xVar));
        r rVar = r.r;
        m mVar = new m("choices", a2, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("description", xVar, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar3 = new m("required", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        ah0.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("type", l0.b(ah0.s), (String) null, rVar, rVar, rVar), new m("defaultValue", xVar, (String) null, rVar, rVar, rVar), new m("titleId", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        yg0.Companion.getClass();
        p a3 = l0.a(l0.b(yg0.a));
        tg0.Companion.getClass();
        m mVar4 = new m("inputs", a3, (String) null, rVar, no.a.s(tg0.b, new u0(new t("branchRef"))), r);
        ah.Companion.getClass();
        a = l.r(new m[]{mVar4, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
