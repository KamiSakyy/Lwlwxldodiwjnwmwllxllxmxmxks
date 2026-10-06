package dt;

import aa.a0;
import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.i30;
import m10.l40;
import m10.wg;
import m10.wi;
import m10.yi;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        x xVar = ah.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        l40.Companion.getClass();
        m mVar2 = new m("owner", l0.b(l40.e), (String) null, rVar, rVar, r);
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, new m("isPrivate", l0.b(wg.a), (String) null, rVar, rVar, rVar), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("title", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        i30.Companion.getClass();
        m mVar6 = new m("repository", l0.b(i30.w0), (String) null, rVar, rVar, r2);
        ch.Companion.getClass();
        m mVar7 = new m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        wi.Companion.getClass();
        m mVar8 = new m("state", l0.b(wi.s), (String) null, rVar, rVar, rVar);
        yi.Companion.getClass();
        a0 a0Var = yi.s;
        k.g(a0Var, "type");
        a = l.r(new m[]{mVar4, mVar5, mVar6, mVar7, mVar8, new m("stateReason", a0Var, (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
