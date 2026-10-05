package xs0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.cj;
import pz0.o7;
import pz0.rd;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cj.Companion.getClass();
        m mVar4 = new m("state", l0.b(cj.s), (String) null, rVar, rVar, rVar);
        rd.Companion.getClass();
        m mVar5 = new m("progressPercentage", l0.b(rd.a), (String) null, rVar, rVar, rVar);
        o7.Companion.getClass();
        x xVar2 = o7.a;
        k.g(xVar2, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("dueOn", xVar2, (String) null, rVar, rVar, rVar)});
    }
}
