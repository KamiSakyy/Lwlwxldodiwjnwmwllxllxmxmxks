package un0;

import aa.m;
import aa.x;
import java.util.List;
import k71.k;
import pz0.h50;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class c {
    public static final List a;

    static {
        h50.Companion.getClass();
        x xVar = h50.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        m mVar = new m("mobileUpdatesUrl", xVar, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
