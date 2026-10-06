package xx0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.ko;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d {
    public static final List a;

    static {
        td.Companion.getClass();
        r b = l0.b(td.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        x xVar = vd.a;
        k71.k.g(xVar, "type");
        m mVar2 = new m("databaseId", xVar, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        m mVar3 = new m("name", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        ko.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, mVar3, new m("dataType", l0.b(ko.s), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
