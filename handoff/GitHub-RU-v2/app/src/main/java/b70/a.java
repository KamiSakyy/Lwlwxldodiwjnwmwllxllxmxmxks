package b70;

import aa.m;
import aa.r;
import aa.x;
import hc0.bb;
import hc0.fb;
import hc0.j6;
import hc0.pg;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        j6.Companion.getClass();
        r b = l0.b(j6.s);
        x61.r rVar = x61.r.r;
        m mVar = new m("day", b, (String) null, rVar, rVar, rVar);
        bb.Companion.getClass();
        m mVar2 = new m("id", l0.b(bb.a), (String) null, rVar, rVar, rVar);
        pg.Companion.getClass();
        x xVar = pg.a;
        m mVar3 = new m("startTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("endTime", l0.b(xVar), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
