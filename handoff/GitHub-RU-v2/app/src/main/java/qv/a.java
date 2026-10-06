package qv;

import aa.m;
import aa.r;
import aa.u0;
import aa.x;
import java.util.List;
import m10.ah;
import m10.b10;
import m10.ch;
import m10.d10;
import m10.eh;
import m10.wg;
import m10.z00;
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
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        List r = l.r(new m[]{mVar, new m("totalCount", l0.b(ch.a), (String) null, rVar, rVar, rVar)});
        m mVar2 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        x xVar2 = wg.a;
        m mVar3 = new m("viewerHasReacted", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        d10.Companion.getClass();
        r b2 = l0.b(d10.a);
        b10.Companion.getClass();
        m mVar4 = new m("reactors", b2, (String) null, rVar, no.a.s(b10.a, new u0(1)), r);
        z00.Companion.getClass();
        List r2 = l.r(new m[]{mVar2, mVar3, mVar4, new m("content", l0.b(z00.s), (String) null, rVar, rVar, rVar)});
        m mVar5 = new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        a = l.r(new m[]{mVar5, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar), new m("viewerCanReact", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("reactionGroups", l0.a(l0.b(b10.b)), (String) null, rVar, rVar, r2)});
    }
}
