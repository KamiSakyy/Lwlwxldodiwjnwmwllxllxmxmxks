package zi0;

import aa.m;
import aa.x;
import gn0.pb;
import gn0.rb;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        rb.Companion.getClass();
        x xVar = rb.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("startLine", xVar, (String) null, rVar, rVar, rVar);
        m mVar2 = new m("line", xVar, "endLine", rVar, rVar, rVar);
        tb.Companion.getClass();
        x xVar2 = tb.a;
        k.g(xVar2, "type");
        m mVar3 = new m("startLineType", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("endLineType", xVar2, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
