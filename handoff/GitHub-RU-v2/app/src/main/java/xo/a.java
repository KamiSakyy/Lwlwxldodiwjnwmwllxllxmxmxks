package xo;

import com.github.service.models.response.Avatar;
import com.github.service.models.response.CheckConclusionState;
import com.github.service.models.response.CheckStatusState;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.i4;
import java.time.Duration;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import k71.k;
import m10.da0;
import m10.n40;
import mn.b;
import mn.d;
import qo.c;
import qo.f;
import qo.h;
import qo.l;
import qo.m;
import qo.o;
import vo.m1;
import vo.s1;
import x01.i;
import x61.rShadow;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class a {
    public static final mn.a a(m1 m1Var) {
        k.g(m1Var, "<this>");
        mn.k kVar = mn.k.r;
        String str = m1Var.a;
        String str2 = m1Var.b;
        da0 da0Var = m1Var.h;
        return new mn.a(kVar, str, null, str2, d5.a0(da0Var), i4.u0(da0Var), m1Var.b, null, 0, m1Var.f, null, null, m1Var.d, m1Var.i);
    }

    public static final mn.a b(s1 s1Var, String str) {
        return new mn.a(str != null ? mn.k.s : mn.k.t, s1Var.a, s1Var.b, s1Var.c, d5.d0(s1Var.d), i4.w0(s1Var.e), s1Var.g, str, s1Var.f, s1Var.h, s1Var.i, s1Var.j, s1Var.k, s1Var.l);
    }

    public static final b c(vo.a aVar) {
        int seconds;
        String str = aVar.b;
        CheckConclusionState w0 = i4.w0(aVar.c);
        CheckStatusState d0 = d5.d0(aVar.d);
        ZonedDateTime zonedDateTime = aVar.e;
        ZonedDateTime zonedDateTime2 = aVar.f;
        Integer num = aVar.g;
        int i = 0;
        if (zonedDateTime != null && zonedDateTime2 != null && (seconds = (int) Duration.between(zonedDateTime, zonedDateTime2).getSeconds()) >= 0) {
            i = seconds;
        }
        return new b(str, w0, d0, zonedDateTime, zonedDateTime2, num, i, aVar.h);
    }

    public static final d d(h hVar, String str) {
        ArrayList arrayList;
        String str2;
        qo.k kVar;
        List<f> list;
        vo.a aVar;
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
                b c = (fVar == null || (aVar = fVar.b) == null) ? null : c(aVar);
                if (c != null) {
                    arrayList.add(c);
                }
            }
        }
        ArrayList arrayList2 = arrayList;
        i iVar = (mVar == null || (kVar = mVar.b) == null) ? new i((String) null, false, true) : new i(kVar.b, kVar.a, !kVar.c);
        qo.a aVar2 = cVar.f;
        Avatar avatar = (aVar2 == null || (str2 = aVar2.b) == null) ? null : new Avatar(str2, Avatar.Type.Organization);
        o oVar = cVar.e;
        Integer valueOf = oVar != null ? Integer.valueOf(oVar.b) : null;
        n40 n40Var = cVar.d.d;
        int i = n40Var == null ? -1 : kz.a.a[n40Var.ordinal()];
        boolean z = i == 1 || i == 2 || i == 3;
        boolean z2 = cVar.c;
        l lVar = cVar.d;
        eq.c cVar2 = lVar.c.b;
        String str4 = cVar2 != null ? cVar2.b : null;
        String str5 = lVar.b;
        qo.b bVar = cVar.b;
        return new d(str3, b, avatar, valueOf, arrayList2, iVar, z, z2, str4, str5, bVar != null ? bVar.b : null);
    }

    public static final d e(qo.i iVar) {
        k.g(iVar, "<this>");
        mn.k kVar = mn.k.u;
        String str = iVar.a;
        String str2 = iVar.b;
        da0 da0Var = iVar.e;
        return new d(new mn.a(kVar, str, null, str2, d5.a0(da0Var), i4.u0(da0Var), str2, null, 0, iVar.c, iVar.d, null, null, Boolean.TRUE), new i((String) null, false, true), null, null, 1792);
    }

    public static final d f(m1 m1Var) {
        k.g(m1Var, "<this>");
        return new d(a(m1Var), new i((String) null, false, true), null, null, 1792);
    }
}
