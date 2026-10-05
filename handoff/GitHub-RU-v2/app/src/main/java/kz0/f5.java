package kz0;

import java.util.List;
import pz0.r20;
import pz0.td;
import pz0.xd;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class f5 {
    public static final List a;

    static {
        xd.Companion.getClass();
        aa.x xVar = xd.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = x61.l.r(new aa.m[]{new aa.m("name", b, (String) null, rVar, rVar, rVar), new aa.m("code", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        r20.Companion.getClass();
        aa.m mVar = new aa.m("spokenLanguages", v8.l0.b(v8.l0.a(r20.a)), (String) null, rVar, rVar, r);
        td.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(td.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
