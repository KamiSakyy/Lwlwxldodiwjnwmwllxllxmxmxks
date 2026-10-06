package dq;

import java.util.List;
import m10.ah;
import m10.cc0;
import m10.eh;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class w {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = v8.l0.b(ah.a);
        x61.rShadow rVar = x61.rShadow.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.m mVar2 = new aa.m("login", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("name", xVar, (String) null, rVar, rVar, rVar);
        cc0.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("avatarUrl", v8.l0.b(cc0.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
