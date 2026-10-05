package wx;

import aa.m;
import aa.r;
import java.util.List;
import m10.ah;
import m10.eh;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        ah.Companion.getClass();
        r b = l0.b(ah.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = l.r(new m[]{mVar, new m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
