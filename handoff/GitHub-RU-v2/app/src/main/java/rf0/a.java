package rf0;

import aa.m;
import aa.r;
import aa.x;
import gn0.lb;
import gn0.rb;
import gn0.s8;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        s8.Companion.getClass();
        r b = l0.b(s8.s);
        x61.r rVar = x61.r.r;
        m mVar = new m("type", b, (String) null, rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar = tb.a;
        m mVar2 = new m("html", l0.b(xVar), (String) null, rVar, rVar, rVar);
        rb.Companion.getClass();
        x xVar2 = rb.a;
        k.g(xVar2, "type");
        m mVar3 = new m("left", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("right", xVar2, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("text", l0.b(xVar), (String) null, rVar, rVar, rVar);
        lb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("isMissingNewlineAtEnd", l0.b(lb.a), (String) null, rVar, rVar, rVar)});
    }
}
