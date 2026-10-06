package lr0;

import aa.m;
import aa.r;
import java.util.List;
import pz0.g7;
import pz0.pd;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        xd.Companion.getClass();
        r b = l0.b(xd.a);
        x61.rShadow rVar = x61.rShadow.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        m mVar2 = new m("isEnabled", l0.b(pd.a), (String) null, rVar, rVar, rVar);
        g7.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("filterGroup", l0.b(g7.s), (String) null, rVar, rVar, rVar)});
    }
}
