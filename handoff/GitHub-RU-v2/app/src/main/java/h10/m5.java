package h10;

import java.util.List;
import m10.ah;
import m10.eh;
import m10.r80;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class m5 {
    public static final List a;

    static {
        eh.Companion.getClass();
        aa.x xVar = eh.a;
        aa.r b = v8.l0.b(xVar);
        x61.r rVar = x61.r.r;
        List r = x61.l.r(new aa.m[]{new aa.m("name", b, (String) null, rVar, rVar, rVar), new aa.m("code", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
        r80.Companion.getClass();
        aa.m mVar = new aa.m("spokenLanguages", v8.l0.b(v8.l0.a(r80.a)), (String) null, rVar, rVar, r);
        ah.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, new aa.m("id", v8.l0.b(ah.a), (String) null, rVar, rVar, rVar), new aa.m("__typename", v8.l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
