package kt;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import m10.ah;
import m10.eh;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("__typename", b, (String) null, rVar, rVar, rVar);
        ah.Companion.getClass();
        a = l.r(new m[]{mVar, new m("id", l0.b(ah.a), (String) null, rVar, rVar, rVar), new m("name", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("color", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
