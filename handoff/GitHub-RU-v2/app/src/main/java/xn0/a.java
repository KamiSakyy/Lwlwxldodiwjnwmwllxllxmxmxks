package xn0;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import k21.f;
import k71.k;
import mn.b;
import mn.d;
import pz0.n30;
import pz0.py;
import qn0.c;
import qn0.h;
import qn0.l;
import qn0.m;
import qn0.o;
import vn0.m1;
import vn0.s1;
import x01.i;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class a {
    public static final mn.a a(m1 m1Var) {
        k.g(m1Var, "<this>");
        mn.k kVar = mn.k.r;
        String str = m1Var.a;
        String str2 = m1Var.b;
        n30 n30Var = m1Var.h;
        return new mn.a(kVar, str, (String) null, str2, f.I(n30Var), i21.a.H(n30Var), m1Var.b, (String) null, 0, m1Var.f, (ZonedDateTime) null, (ZonedDateTime) null, m1Var.d, m1Var.i);
    }

    public static final mn.a b(s1 s1Var, String str) {
        return new mn.a(str != null ? mn.k.s : mn.k.t, s1Var.a, s1Var.b, s1Var.c, f.K(s1Var.d), i21.a.N(s1Var.e), s1Var.g, str, s1Var.f, s1Var.h, s1Var.i, s1Var.j, s1Var.k, s1Var.l);
    }

    public static final b c(vn0.a aVar) {
        int seconds;
        String str = aVar.b;
        CheckConclusionState N = i21.a.N(aVar.c);
        CheckStatusState K = f.K(aVar.d);
        ZonedDateTime zonedDateTime = aVar.e;
        ZonedDateTime zonedDateTime2 = aVar.f;
        Integer num = aVar.g;
        int i = 0;
        if (zonedDateTime != null && zonedDateTime2 != null && (seconds = (int) Duration.between(zonedDateTime, zonedDateTime2).getSeconds()) >= 0) {
            i = seconds;
        }
        return new b(str, N, K, zonedDateTime, zonedDateTime2, num, i, aVar.h);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [x61.rShadow] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.util.ArrayList] */
    public static final d d(h hVar, String str) {
        java.util.ArrayList r4;
        String str2;
        qn0.k kVar;
        List<qn0.f> list;
        vn0.a aVar;
        k.g(hVar, "<this>");
        c cVar = hVar.b;
        String str3 = cVar.a;
        mn.a b = b(hVar.d, str);
        m mVar = hVar.c;
        if (mVar == null || (list = mVar.c) == null) {
            r4 = rShadow.r;
        } else {
            r4 = new ArrayList();
            for (qn0.f fVar : list) {
                b c = (fVar == null || (aVar = fVar.b) == null) ? null : c(aVar);
                if (c != null) {
                    r4.add(c);
                }
            }
        }
        List list2 = r4;
        i iVar = (mVar == null || (kVar = mVar.b) == null) ? new i(null, false, true) : new i(kVar.b, kVar.a, !kVar.c);
        qn0.a aVar2 = cVar.f;
        Avatar avatar = (aVar2 == null || (str2 = aVar2.b) == null) ? null : new Avatar(str2, Avatar.Type.Organization);
        o oVar = cVar.e;
        Integer valueOf = oVar != null ? Integer.valueOf(oVar.b) : null;
        py pyVar = cVar.d.d;
        int i = pyVar == null ? -1 : nx0.a.a[pyVar.ordinal()];
        boolean z = i == 1 || i == 2 || i == 3;
        boolean z2 = cVar.c;
        l lVar = cVar.d;
        cp0.c cVar2 = lVar.c.b;
        String str4 = cVar2 != null ? cVar2.b : null;
        String str5 = lVar.b;
        qn0.b bVar = cVar.b;
        return new d(str3, b, avatar, valueOf, list2, iVar, z, z2, str4, str5, bVar != null ? bVar.b : null);
    }

    public static final d e(qn0.i iVar) {
        k.g(iVar, "<this>");
        mn.k kVar = mn.k.u;
        String str = iVar.a;
        String str2 = iVar.b;
        n30 n30Var = iVar.e;
        return new d(new mn.a(kVar, str, (String) null, str2, f.I(n30Var), i21.a.H(n30Var), str2, (String) null, 0, iVar.c, iVar.d, (ZonedDateTime) null, (String) null, Boolean.TRUE), new i(null, false, true), (String) null, (String) null, 1792);
    }

    public static final d f(m1 m1Var) {
        k.g(m1Var, "<this>");
        return new d(a(m1Var), new i(null, false, true), (String) null, (String) null, 1792);
    }
}
