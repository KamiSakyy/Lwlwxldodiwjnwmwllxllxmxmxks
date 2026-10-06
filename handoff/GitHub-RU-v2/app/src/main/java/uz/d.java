package uz;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import m10.pt;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class d {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        x xVar = ch.a;
        k71.k.g(xVar, "type");
        m mVar2 = new m("databaseId", xVar, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar2 = eh.a;
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        pt.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("dataType", l0.b(pt.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
