package gw0;

import aa.m;
import aa.q0;
import aa.r;
import aa.x;
import java.util.List;
import k71.k;
import pz0.il;
import pz0.pd;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class j {
    public static final List a;

    static {
        pd.Companion.getClass();
        x xVar = pd.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = l.r(new m[]{new m("getsParticipatingWeb", b, (String) null, rVar, rVar, rVar), new m("getsWatchingWeb", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        il.Companion.getClass();
        q0 q0Var = il.a;
        k.g(q0Var, "type");
        m mVar = new m("notificationSettings", q0Var, (String) null, rVar, rVar, r);
        td.Companion.getClass();
        m mVar2 = new m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        a = l.r(new m[]{mVar, mVar2, new m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
