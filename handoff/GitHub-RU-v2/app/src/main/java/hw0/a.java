package hw0;

import aa.m;
import aa.r;
import aa.x;
import java.util.List;
import pz0.td;
import pz0.w80;
import pz0.xd;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final List a;

    static {
        td.Companion.getClass();
        x xVar = td.a;
        r b = l0.b(xVar);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        xd.Companion.getClass();
        x xVar2 = xd.a;
        List r = l.r(new m[]{mVar, new m("login", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
        w80.Companion.getClass();
        a = l.r(new m[]{new m("viewer", l0.b(w80.W), (String) null, rVar, rVar, r), new m("id", l0.b(xVar), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar2), (String) null, rVar, rVar, rVar)});
    }
}
