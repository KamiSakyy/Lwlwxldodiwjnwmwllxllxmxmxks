package yc0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import gn0.jr;
import gn0.yv;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import mn.b;
import mn.d;
import rc0.c;
import rc0.f;
import rc0.h;
import rc0.l;
import rc0.m;
import rc0.o;
import sy.t;
import sy.u;
import wc0.m1;
import wc0.s1;
import x01.i;
import x61.r;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final mn.a a(m1 m1Var) {
        k.g(m1Var, "<this>");
        mn.k kVar = mn.k.r;
        String str = m1Var.a;
        String str2 = m1Var.b;
        yv yvVar = m1Var.h;
        return new mn.a(kVar, str, (String) null, str2, u.l(yvVar), t.t(yvVar), m1Var.b, (String) null, 0, m1Var.f, (ZonedDateTime) null, (ZonedDateTime) null, m1Var.d, m1Var.i);
    }

    public static final mn.a b(s1 s1Var, String str) {
        return new mn.a(str != null ? mn.k.s : mn.k.t, s1Var.a, s1Var.b, s1Var.c, u.n(s1Var.d), t.u(s1Var.e), s1Var.g, str, s1Var.f, s1Var.h, s1Var.i, s1Var.j, s1Var.k, s1Var.l);
    }

    public static final b c(wc0.a aVar) {
        int seconds;
        String str = aVar.b;
        CheckConclusionState u = t.u(aVar.c);
        CheckStatusState n = u.n(aVar.d);
        ZonedDateTime zonedDateTime = aVar.e;
        ZonedDateTime zonedDateTime2 = aVar.f;
        Integer num = aVar.g;
        int i = 0;
        if (zonedDateTime != null && zonedDateTime2 != null && (seconds = (int) Duration.between(zonedDateTime, zonedDateTime2).getSeconds()) >= 0) {
            i = seconds;
        }
        return new b(str, u, n, zonedDateTime, zonedDateTime2, num, i, aVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public static final d d(h hVar, String str) {
        ?? r4;
        String str2;
        rc0.k kVar;
        List<f> list;
        wc0.a aVar;
        k.g(hVar, "<this>");
        c cVar = hVar.b;
        String str3 = cVar.a;
        mn.a b = b(hVar.d, str);
        m mVar = hVar.c;
        if (mVar == null || (list = mVar.c) == null) {
            r4 = r.r;
        } else {
            r4 = new ArrayList();
            for (f fVar : list) {
                b c = (fVar == null || (aVar = fVar.b) == null) ? null : c(aVar);
                if (c != null) {
                    r4.add(c);
                }
            }
        }
        List list2 = r4;
        i iVar = (mVar == null || (kVar = mVar.b) == null) ? new i(null, false, true) : new i(kVar.b, kVar.a, !kVar.c);
        rc0.a aVar2 = cVar.f;
        Avatar avatar = (aVar2 == null || (str2 = aVar2.b) == null) ? null : new Avatar(str2, Avatar.Type.Organization);
        o oVar = cVar.e;
        Integer valueOf = oVar != null ? Integer.valueOf(oVar.b) : null;
        jr jrVar = cVar.d.d;
        int i = jrVar == null ? -1 : zl0.a.a[jrVar.ordinal()];
        boolean z = i == 1 || i == 2 || i == 3;
        boolean z2 = cVar.c;
        l lVar = cVar.d;
        ud0.a aVar3 = lVar.c.b;
        String str4 = aVar3 != null ? aVar3.b : null;
        String str5 = lVar.b;
        rc0.b bVar = cVar.b;
        return new d(str3, b, avatar, valueOf, list2, iVar, z, z2, str4, str5, bVar != null ? bVar.b : null);
    }

    public static final d e(rc0.i iVar) {
        k.g(iVar, "<this>");
        mn.k kVar = mn.k.u;
        String str = iVar.a;
        String str2 = iVar.b;
        yv yvVar = iVar.e;
        return new d(new mn.a(kVar, str, (String) null, str2, u.l(yvVar), t.t(yvVar), str2, (String) null, 0, iVar.c, iVar.d, (ZonedDateTime) null, (String) null, Boolean.TRUE), new i(null, false, true), (String) null, (String) null, 1792);
    }

    public static final d f(m1 m1Var) {
        k.g(m1Var, "<this>");
        return new d(a(m1Var), new i(null, false, true), (String) null, (String) null, 1792);
    }
}
