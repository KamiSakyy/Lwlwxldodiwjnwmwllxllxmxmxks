package xq0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.pd;
import pz0.t9;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        t9.Companion.getClass();
        r b = l0.b(t9.s);
        x61.r rVar = x61.r.r;
        m mVar = new m("type", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        m mVar2 = new m("html", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar2 = vd.a;
        k.g(xVar2, "type");
        m mVar3 = new m("left", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("right", xVar2, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("text", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("isMissingNewlineAtEnd", l0.b(pd.a), (String) null, rVar, rVar, rVar)});
    }
}
