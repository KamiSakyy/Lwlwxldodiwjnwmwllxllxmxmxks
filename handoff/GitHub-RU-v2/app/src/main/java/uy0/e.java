package uy0;

import aa.m;
import aa.q0;
import aa.t;
import aa.u0;
import aa.x;
import java.util.List;
import k71.k;
import pz0.iu;
import pz0.jx;
import pz0.su;
import pz0.td;
import pz0.xd;
import v8.l0;
import x61.l;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class e {
    public static final List a;

    static {
        xd.Companion.getClass();
        x xVar = xd.a;
        k.g(xVar, "type");
        r rVar = r.r;
        List r = l.r(new m[]{new m("filename", xVar, (String) null, rVar, rVar, rVar), new m("body", xVar, (String) null, rVar, rVar, rVar)});
        td.Companion.getClass();
        x xVar2 = td.a;
        m mVar = new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar);
        iu.Companion.getClass();
        List r2 = l.r(new m[]{mVar, new m("pullRequestTemplates", l0.a(l0.b(iu.a)), "pullRequestTemplates", rVar, rVar, r), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
        jx.Companion.getClass();
        q0 q0Var = jx.t0;
        k.g(q0Var, "type");
        su.Companion.getClass();
        a = l.r(new m[]{new m("repository", q0Var, (String) null, rVar, l.r(new aa.k[]{new aa.k(su.l, new u0(new t("repoName"))), new aa.k(su.m, new u0(new t("ownerName")))}), r2), new m("id", l0.b(xVar2), (String) null, rVar, rVar, rVar), new m("__typename", l0.b(xVar), (String) null, rVar, rVar, rVar)});
    }
}
