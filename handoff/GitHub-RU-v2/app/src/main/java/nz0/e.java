package nz0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.pd;
import pz0.qj;
import pz0.sj;
import pz0.td;
import pz0.uj;
import pz0.vd;
import pz0.w80;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        vd.Companion.getClass();
        r b = l0.b(vd.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar = xd.a;
        m mVar2 = new m("payload", l0.b(xVar), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar2 = pd.a;
        m mVar3 = new m("challengeRequired", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        sj.Companion.getClass();
        List r = l.r(new m[]{mVar, mVar2, mVar3, new m("type", l0.b(sj.s), (String) null, rVar, rVar, rVar)});
        m mVar4 = new m("hasValidDeviceAuthKey", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        m mVar5 = new m("hasExpiredAuthRequest", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        qj.Companion.getClass();
        q0 q0Var = qj.a;
        k.g(q0Var, "type");
        List r2 = l.r(new m[]{mVar4, mVar5, new m("activeAuthRequest", q0Var, (String) null, rVar, rVar, r)});
        m mVar6 = new m("email", l0.b(xVar), (String) null, rVar, rVar, rVar);
        m mVar7 = new m("primaryEmail", xVar, (String) null, rVar, rVar, rVar);
        m mVar8 = new m("login", l0.b(xVar), (String) null, rVar, rVar, rVar);
        uj.Companion.getClass();
        q0 q0Var2 = uj.a;
        k.g(q0Var2, "type");
        m mVar9 = new m("mobileAuthStatus", q0Var2, (String) null, rVar, rVar, r2);
        td.Companion.getClass();
        x xVar3 = td.a;
        List r3 = l.r(new m[]{mVar6, mVar7, mVar8, mVar9, new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(w80.W), (String) null, rVar, rVar, r3), new m("id", l0.b(xVar3), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
