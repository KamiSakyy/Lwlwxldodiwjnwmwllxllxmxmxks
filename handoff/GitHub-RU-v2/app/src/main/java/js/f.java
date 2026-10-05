package js;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.l40;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class f {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        l40.Companion.getClass();
        m mVar4 = new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r);
        wg.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("isOrganizationDiscussionRepository", l0.b(wg.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        m mVar6 = new m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        a = l.r(new m[]{mVar5, mVar6, new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r2), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
