package bs0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        r b = l0.b(xVar);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        a = l.r(new m[]{mVar, new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("color", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
