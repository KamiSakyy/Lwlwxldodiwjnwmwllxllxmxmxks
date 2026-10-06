package r00;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import m10.ah;
import m10.eh;
import m10.f00;
import m10.i30;
import m10.p00;
import v8.l0;
import x61.l;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e {
    public static final List a;

    static {
        eh.Companion.getClass();
        x xVar = eh.a;
        k.g(xVar, "type");
        rShadow rVar = rShadow.r;
        List r = l.r(new m[]{new m("filename", xVar, (String) null, rVar, rVar, rVar), new m("body", xVar, (String) null, rVar, rVar, rVar)});
        ah.Companion.getClass();
        x xVar2 = ah.a;
        m mVar = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        f00.Companion.getClass();
        List r2 = l.r(new m[]{mVar, new m("pullRequestTemplates", l0.a(l0.b(f00.a)), "pullRequestTemplates", rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        i30.Companion.getClass();
        q0 q0Var = i30.w0;
        k.g(q0Var, "type");
        p00.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(p00.l, new u0(new t("repoName"))), new aa.k(p00.m, new u0(new t("ownerName")))}), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
