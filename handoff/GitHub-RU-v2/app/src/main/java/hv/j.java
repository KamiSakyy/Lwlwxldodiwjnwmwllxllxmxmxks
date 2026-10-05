package hv;

import java.util.List;
import m10.ah;
import m10.ch;
import m10.eh;
import v8.l0;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class j {
    public static final List a;

    static {
        ah.Companion.getClass();
        aa.r b = l0.b(ah.a);
        x61.r rVar = x61.r.r;
        aa.m mVar = new aa.m("id", b, (String) null, rVar, rVar, rVar);
        ch.Companion.getClass();
        aa.m mVar2 = new aa.m("number", l0.b(ch.a), (String) null, rVar, rVar, rVar);
        eh.Companion.getClass();
        a = x61.l.r(new aa.m[]{mVar, mVar2, new aa.m("__typename", l0.b(eh.a), (String) null, rVar, rVar, rVar)});
    }
}
