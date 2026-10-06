package fs;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import m10.ch;
import m10.eh;
import m10.wg;
import m10.xc;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        xc.Companion.getClass();
        r b = l0.b(xc.s);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("type", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        m mVar2 = new m("html", l0.b(xVar), (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar2 = ch.a;
        k.g(xVar2, "type");
        m mVar3 = new m("left", xVar2, (String) null, rVar, rVar, rVar);
        m mVar4 = new m("right", xVar2, (String) null, rVar, rVar, rVar);
        m mVar5 = new m("text", l0.b(xVar), (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, mVar5, new m("isMissingNewlineAtEnd", l0.b(wg.a), (String) null, rVar, rVar, rVar)});
    }
}
