package nh0;

import aa.m;
import aa.r;
import aa.x;
import gn0.nb;
import gn0.og;
import gn0.pb;
import gn0.r6;
import gn0.tb;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        tb.Companion.getClass();
        x xVar = tb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        pb.Companion.getClass();
        m mVar2 = new m("id", l0.b(pb.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        og.Companion.getClass();
        m mVar4 = new m("state", l0.b(og.s), (String) null, rVar, rVar, rVar);
        nb.Companion.getClass();
        m mVar5 = new m("progressPercentage", l0.b(nb.a), (String) null, rVar, rVar, rVar);
        r6.Companion.getClass();
        x xVar2 = r6.a;
        k.g(xVar2, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("dueOn", xVar2, (String) null, rVar, rVar, rVar)});
    }
}
