package fr;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import m10.sg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        x xVar = eh.a;
        m mVar2 = new m("abbreviatedOid", l0.b(xVar), (String) null, rVar, rVar, rVar);
        sg.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("oid", l0.b(sg.a), (String) null, rVar, rVar, rVar), new m("messageHeadline", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("messageBody", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
