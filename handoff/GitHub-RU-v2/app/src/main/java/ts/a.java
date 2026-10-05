package ts;

import aa.m;
import aa.r;
import java.util.List;
import m10.eh;
import m10.ka;
import m10.wg;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        eh.Companion.getClass();
        r b = l0.b(eh.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("name", b, (String) null, rVar, rVar, rVar);
        wg.Companion.getClass();
        m mVar2 = new m("isEnabled", l0.b(wg.a), (String) null, rVar, rVar, rVar);
        ka.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("filterGroup", l0.b(ka.s), (String) null, rVar, rVar, rVar)});
    }
}
