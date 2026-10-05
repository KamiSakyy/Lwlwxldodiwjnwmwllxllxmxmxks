package yt0;

import aa.q0;
import aa.x;
import java.util.List;
import pz0.pd;
import pz0.s1;
import pz0.td;
import pz0.xd;
import pz0.zs;
import sy.d0;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        zs.Companion.getClass();
        aa.r b = l0.b(zs.s);
        x61.r rVar = x61.r.r;
        List n = d0.n(new aa.m("mergeMethod", b, (String) null, rVar, rVar, rVar));
        td.Companion.getClass();
        aa.m mVar = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        x xVar = pd.a;
        aa.m mVar2 = new aa.m("viewerCanDisableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        aa.m mVar3 = new aa.m("viewerCanEnableAutoMerge", l0.b(xVar), (String) null, rVar, rVar, rVar);
        s1.Companion.getClass();
        q0 q0Var = s1.a;
        k71.k.g(q0Var, "type");
        aa.m mVar4 = new aa.m("autoMergeRequest", q0Var, (String) null, rVar, rVar, n);
        xd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, mVar4, new aa.m("__typename", l0.b(xd.a), (String) null, rVar, rVar, rVar)});
    }
}
