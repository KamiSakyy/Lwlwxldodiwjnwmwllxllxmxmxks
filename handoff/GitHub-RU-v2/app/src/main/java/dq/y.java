package dq;

import java.util.List;
import m10.eh;
import m10.m8;
import m10.ro;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class y {
    public static final List a;

    static {
        m8.Companion.getClass();
        aa.r b = v8.l0.b(m8.s);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("copilotLicenseType", b, (String) null, rVar, rVar, rVar);
        ro.Companion.getClass();
        aa.m mVar2 = new aa.m("icon", v8.l0.b(ro.s), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("planTitle", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("subtitle", xVar, (String) null, rVar, rVar, rVar)});
    }
}
