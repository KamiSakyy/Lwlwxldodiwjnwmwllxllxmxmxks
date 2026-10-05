package kz0;

import java.util.List;
import pz0.pd;
import pz0.td;
import pz0.w80;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class d7 {
    public static final List a;

    static {
        pd.Companion.getClass();
        aa.r b = v8.l0.b(pd.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("isEmployee", b, (String) null, rVar, rVar, rVar);
        td.Companion.getClass();
        aa.x xVar = td.a;
        aa.m mVar2 = new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        aa.x xVar2 = xd.a;
        List r = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        a = x61.l.r(new aa.m[]{new aa.m("viewer", v8.l0.b(w80.W), (String) null, rVar, rVar, r), new aa.m("id", v8.l0.b(xVar), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
