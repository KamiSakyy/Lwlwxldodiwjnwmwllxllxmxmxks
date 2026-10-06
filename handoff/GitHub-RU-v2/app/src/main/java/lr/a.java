package lr;

import aa.j0;
import aa.m;
import aa.q0;
import aa.r;
import aa.s;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.fd;
import m10.i30;
import m10.l40;
import m10.sa;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        s mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        List r = l.r(new String[]{"Bot", "EnterpriseUserAccount", "Mannequin", "Organization", "User"});
        List list = fq.a.a;
        List r2 = l.r(new s[]{mVar, no.a.c(list, "selections", "Actor", r, list)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        List r3 = l.r(new m[]{new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        l40.Companion.getClass();
        List r4 = l.r(new m[]{new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r3), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ch.Companion.getClass();
        m mVar2 = new m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        m mVar3 = new m("title", l0.b(xVar), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        List r5 = l.r(new m[]{mVar2, mVar3, new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r4), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m10.l.Companion.getClass();
        j0 j0Var = m10.l.a;
        k.g(j0Var, "type");
        m mVar6 = new m("actor", j0Var, (String) null, rVar, rVar, r2);
        fd.Companion.getClass();
        q0 q0Var = fd.l;
        k.g(q0Var, "type");
        m mVar7 = new m("discussion", q0Var, (String) null, rVar, rVar, r5);
        sa.Companion.getClass();
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, new m("createdAt", l0.b(sa.a), (String) null, rVar, rVar, rVar)});
    }
}
