package ka0;

import aa.m;
import aa.r;
import hc0.bb;
import hc0.fb;
import java.util.List;
import v8.l0;
import x61.l;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final List a;

    static {
        bb.Companion.getClass();
        r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        m mVar = new m("id", b, (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = l.r(new m[]{mVar, new m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }

    public static List a() {
        return a;
    }
}
