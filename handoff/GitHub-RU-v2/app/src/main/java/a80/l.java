package a80;

import hc0.bb;
import hc0.fb;
import hc0.fm;
import java.util.List;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class l {
    public static final List a;

    static {
        bb.Companion.getClass();
        aa.r b = l0.b(bb.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        fm.Companion.getClass();
        aa.m mVar2 = new aa.m("state", l0.b(fm.s), (String) null, rVar, rVar, rVar);
        fb.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(fb.a), (String) null, rVar, rVar, rVar)});
    }
}
