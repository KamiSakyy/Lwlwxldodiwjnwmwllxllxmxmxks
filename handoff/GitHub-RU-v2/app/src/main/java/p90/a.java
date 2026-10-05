package p90;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.di;
import hc0.fb;
import java.util.List;
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
        m mVar2 = new m("name", xVar, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        x xVar2 = bb.a;
        List r = l.r(new m[]{mVar, mVar2, new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        di.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, new m("organization", l0.b(di.m), (String) null, rVar, rVar, r), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
