package h10;

import java.util.List;
import m10.ah;
import m10.ak;
import m10.eh;
import m10.p00;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class b2 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("name", b, (String) null, rVar, rVar, rVar);
        aa.m mVar2 = new aa.m("color", xVar, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        aa.x xVar2 = ah.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        ak.Companion.getClass();
        aa.r b2 = v8.l0.b(v8.l0.a(ak.a));
        p00.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("programmingLanguages", b2, (String) null, rVar, no.a.s(p00.k, new aa.u0(Boolean.TRUE)), r), new aa.m("id", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
