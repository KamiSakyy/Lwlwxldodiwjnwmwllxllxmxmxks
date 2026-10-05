package wo;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.cc0;
import m10.ch;
import m10.eh;
import m10.gh0;
import m10.sa;
import m10.tg0;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class c {
    public static final List a;

    static {
        sa.Companion.getClass();
        x xVar = sa.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("createdAt", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar2 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar3 = eh.a;
        List r = l.r(new m[]{mVar, mVar2, new m("name", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
        m mVar3 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar4 = ch.a;
        k71.k.g(xVar4, "type");
        m mVar4 = new m("billableDurationInSeconds", xVar4, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("runNumber", l0.b(xVar4), (String) null, rVar, rVar, rVar);
        m mVar6 = new m("createdAt", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("updatedAt", l0.b(xVar), (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        x xVar5 = cc0.a;
        m mVar8 = new m("resourcePath", l0.b(xVar5), (String) null, rVar, rVar, rVar);
        gh0.Companion.getClass();
        m mVar9 = new m("eventType", l0.b(gh0.s), (String) null, rVar, rVar, rVar);
        m mVar10 = new m("url", l0.b(xVar5), (String) null, rVar, rVar, rVar);
        tg0.Companion.getClass();
        a = l.r(new m[]{mVar3, mVar4, mVar5, mVar6, mVar7, mVar8, mVar9, mVar10, new m("workflow", l0.b(tg0.e), (String) null, rVar, rVar, r), new m("__typename", l0.b(xVar3), (String) null, rVar, rVar, rVar)});
    }
}
