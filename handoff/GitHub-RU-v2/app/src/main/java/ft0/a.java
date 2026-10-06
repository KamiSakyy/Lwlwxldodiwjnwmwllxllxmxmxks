package ft0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        m mVar2 = new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        m mVar3 = new m("unreadCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        m mVar4 = new m("queryString", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, mVar4, new m("isDefaultFilter", l0.b(pd.a), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
