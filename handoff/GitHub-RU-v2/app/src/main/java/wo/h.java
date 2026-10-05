package wo;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.ch0;
import m10.eh;
import m10.eh0;
import m10.ih0;
import m10.sa;
import m10.tg0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class h {
    public static final List a;

    static {
        sa.Companion.getClass();
        r b = l0.b(sa.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("createdAt", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar = ah.a;
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        m mVar3 = new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        ch0.Companion.getClass();
        List r2 = l.r(new m[]{mVar3, new m("nodes", l0.a(ch0.b), (String) null, rVar, rVar, r)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ih0.Companion.getClass();
        m mVar6 = new m("state", l0.b(ih0.s), (String) null, rVar, rVar, rVar);
        eh0.Companion.getClass();
        r b2 = l0.b(eh0.a);
        tg0.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, new m("runs", b2, (String) null, rVar, no.a.s(tg0.d, new u0(1)), r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }

    public h(Object... a) {
    }
}
