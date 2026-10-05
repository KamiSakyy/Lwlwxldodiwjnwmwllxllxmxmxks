package v60;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.h6;
import hc0.of;
import hc0.za;
import java.util.List;
import k71.k;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        fb.Companion.getClass();
        x xVar = fb.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        m mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        of.Companion.getClass();
        m mVar4 = new m("state", l0.b(of.s), (String) null, rVar, rVar, rVar);
        za.Companion.getClass();
        m mVar5 = new m("progressPercentage", l0.b(za.a), (String) null, rVar, rVar, rVar);
        h6.Companion.getClass();
        x xVar2 = h6.a;
        k.g(xVar2, "type");
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("dueOn", xVar2, (String) null, rVar, rVar, rVar)});
    }
}
