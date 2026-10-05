package vu0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.vd;
import pz0.xd;
import v8.l0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class o {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.r b = l0.b(xd.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("__typename", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.m mVar2 = new aa.m("id", l0.b(td.a), (String) null, rVar, rVar, rVar);
        vd.Companion.getClass();
        aa.m mVar3 = new aa.m("stargazerCount", l0.b(vd.a), (String) null, rVar, rVar, rVar);
        pd.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, mVar3, new aa.m("viewerHasStarred", l0.b(pd.a), (String) null, rVar, rVar, rVar)});
    }
}
