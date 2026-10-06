package i20;

import b20.c;
import b20.f;
import b20.h;
import b20.l;
import b20.m;
import b20.o;
import b41.b;
import b91.g;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import g20.i1;
import g20.m1;
import g20.s1;
import hc0.fq;
import hc0.uu;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import mn.d;
import x01.i;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final mn.a a(m1 m1Var) {
        k.g(m1Var, "<this>");
        mn.k kVar = mn.k.r;
        String str = m1Var.a;
        String str2 = m1Var.b;
        uu uuVar = m1Var.h;
        return new mn.a(kVar, str, null, str2, g.U(uuVar), b.P(uuVar), m1Var.b, null, 0, m1Var.f, null, null, m1Var.d, m1Var.i);
    }

    public static final mn.a b(s1 s1Var, String str) {
        return new mn.a(str != null ? mn.k.s : mn.k.t, s1Var.a, s1Var.b, s1Var.c, g.Y(s1Var.d), b.S(s1Var.e), s1Var.g, str, s1Var.f, s1Var.h, s1Var.i, s1Var.j, s1Var.k, s1Var.l);
    }

    public static final mn.b c(g20.a aVar) {
        int seconds;
        String str = aVar.b;
        CheckConclusionState S = b.S(aVar.c);
        CheckStatusState Y = g.Y(aVar.d);
        ZonedDateTime zonedDateTime = aVar.e;
        ZonedDateTime zonedDateTime2 = aVar.f;
        Integer num = aVar.g;
        int i = 0;
        if (zonedDateTime != null && zonedDateTime2 != null && (seconds = (int) Duration.between(zonedDateTime, zonedDateTime2).getSeconds()) >= 0) {
            i = seconds;
        }
        return new mn.b(str, S, Y, zonedDateTime, zonedDateTime2, num, i, aVar.h);
    }

    public static final d d(h hVar, String str) {
        ArrayList arrayList;
        String str2;
        b20.k kVar;
        List<f> list;
        g20.a aVar;
        k.g(hVar, "<this>");
        c cVar = hVar.b;
        String str3 = cVar.a;
        mn.a b = b(hVar.d, str);
        m mVar = hVar.c;
        if (mVar == null || (list = mVar.c) == null) {
            arrayList = rShadow.r;
        } else {
            arrayList = new ArrayList();
            for (f fVar : list) {
                mn.b c = (fVar == null || (aVar = fVar.b) == null) ? null : c(aVar);
                if (c != null) {
                    arrayList.add(c);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        i iVar = (mVar == null || (kVar = mVar.b) == null) ? new i((String) null, false, true) : new i(kVar.b, kVar.a, !kVar.c);
        b20.a aVar2 = cVar.f;
        Avatar avatar = (aVar2 == null || (str2 = aVar2.b) == null) ? null : new Avatar(str2, Avatar.Type.Organization);
        o oVar = cVar.e;
        Integer valueOf = oVar != null ? Integer.valueOf(oVar.b) : null;
        fq fqVar = cVar.d.d;
        int i = fqVar == null ? -1 : eb0.a.a[fqVar.ordinal()];
        boolean z = i == 1 || i == 2 || i == 3;
        boolean z2 = cVar.c;
        l lVar = cVar.d;
        e30.a aVar3 = lVar.c.b;
        String str4 = aVar3 != null ? aVar3.b : null;
        String str5 = lVar.b;
        b20.b bVar = cVar.b;
        return new d(str3, b, avatar, valueOf, arrayList2, iVar, z, z2, str4, str5, bVar != null ? bVar.b : null);
    }

    public static final d e(b20.i iVar) {
        k.g(iVar, "<this>");
        mn.k kVar = mn.k.u;
        String str = iVar.a;
        String str2 = iVar.b;
        uu uuVar = iVar.e;
        return new d(new mn.a(kVar, str, null, str2, g.U(uuVar), b.P(uuVar), str2, null, 0, iVar.c, iVar.d, null, null, Boolean.TRUE), new i((String) null, false, true), null, null, 1792);
    }

    public static final d f(m1 m1Var) {
        k.g(m1Var, "<this>");
        mn.a a = a(m1Var);
        i iVar = new i((String) null, false, true);
        i1 i1Var = m1Var.e;
        return new d(a, iVar, i1Var != null ? i1Var.b.c.b : null, i1Var != null ? i1Var.b.b : null, 1024);
    }
}
