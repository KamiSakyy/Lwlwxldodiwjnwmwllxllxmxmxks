package lm0;

import aa.t0;
import aa.u0;
import b20.o0;
import b20.p;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.google.android.gms.internal.measurement.z3;
import er.l1;
import g20.m1;
import java.util.ArrayList;
import java.util.List;
import jn0.k20;
import jn0.n20;
import jn0.q20;
import jn0.r20;
import jn0.t20;
import jn0.u20;
import jn0.v20;
import jo.k00;
import jo.m00;
import jo.n00;
import jo.o00;
import jo.p00;
import jo.q00;
import jo.r00;
import jo.s00;
import kc0.b30;
import kc0.c30;
import kc0.d30;
import kc0.e30;
import m0.s;
import m00.o;
import m00.r;
import m00.t;
import m00.u;
import m00.v;
import oj0.u3;
import oj0.v3;
import sy.q;
import w61.a0;
import xt0.p2;
import yz0.j4;
import yz0.m3;
import yz0.t7;
import yz0.w0;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class g implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ g(int i) {
        this.r = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // j71.c
    public final Object k(Object obj) {
        n00 n00Var;
        m00 m00Var;
        k00 k00Var;
        List list;
        n00 n00Var2;
        m00 m00Var2;
        k00 k00Var2;
        q00 q00Var;
        n00 n00Var3;
        m00 m00Var3;
        k00 k00Var3;
        n00 n00Var4;
        m00 m00Var4;
        k00 k00Var4;
        q00 q00Var2;
        l1 l1Var;
        n00 n00Var5;
        m00 m00Var5;
        k00 k00Var5;
        q20 q20Var;
        r rVar;
        List list2;
        r rVar2;
        t tVar;
        r rVar3;
        r rVar4;
        gt.a aVar;
        b20.h hVar;
        b20.m mVar;
        List list3;
        b20.h hVar2;
        b20.m mVar2;
        b20.k kVar;
        b20.h hVar3;
        b20.m mVar3;
        b20.i iVar;
        m1 m1Var;
        b20.h hVar4;
        switch (this.r) {
            case 0:
                b30 b30Var = (b30) obj;
                k71.k.g(b30Var, "data");
                return Boolean.valueOf(b30Var.a.a.b != null ? !r1.isEmpty() : false);
            case 1:
                b30 b30Var2 = (b30) obj;
                k71.k.g(b30Var2, "data");
                d30 d30Var = b30Var2.a.a.a;
                return new x01.i(d30Var.b, d30Var.a, !d30Var.c);
            case 2:
                b30 b30Var3 = (b30) obj;
                k71.k.g(b30Var3, "data");
                List list4 = b30Var3.a.a.b;
                return list4 == null ? x61.r.r : list4;
            case 3:
                b30 b30Var4 = (b30) obj;
                k71.k.g(b30Var4, "data");
                e30 e30Var = b30Var4.a.a;
                Iterable iterable = e30Var.b;
                if (iterable == null) {
                    iterable = x61.r.r;
                }
                ArrayList S = x61.m.S(iterable);
                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                int size = S.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = S.get(i);
                    i++;
                    c30 c30Var = (c30) obj2;
                    v3 v3Var = c30Var.f;
                    u3 u3Var = v3Var.d;
                    arrayList.add(new i(new t7(v3Var.a, v3Var.b, u3Var.c, b41.b.O(u3Var.d), new wl0.j(c30Var.g), v3Var.c), c30Var.d, c30Var.b, c30Var.c));
                }
                d30 d30Var2 = e30Var.a;
                return new f(arrayList, new x01.i(d30Var2.b, d30Var2.a, !d30Var2.c));
            case 4:
                lp.a aVar2 = (lp.a) obj;
                k71.k.g(aVar2, "refComparisonCommitsParameters");
                return new s00(t0.d, aVar2.a, aVar2.b, aVar2.c, aVar2.d);
            case 5:
                o00 o00Var = (o00) obj;
                k71.k.g(o00Var, "data");
                r00 r00Var = o00Var.a;
                return Boolean.valueOf((r00Var == null || (n00Var = r00Var.b) == null || (m00Var = n00Var.b) == null || (k00Var = m00Var.b) == null || (list = k00Var.b) == null) ? false : !list.isEmpty());
            case 6:
                o00 o00Var2 = (o00) obj;
                k71.k.g(o00Var2, "data");
                r00 r00Var2 = o00Var2.a;
                if (r00Var2 == null || (n00Var2 = r00Var2.b) == null || (m00Var2 = n00Var2.b) == null || (k00Var2 = m00Var2.b) == null || (q00Var = k00Var2.a) == null) {
                    return null;
                }
                boolean z = q00Var.a;
                String str = q00Var.b;
                return new x01.i(str, z, str == null);
            case 7:
                o00 o00Var3 = (o00) obj;
                k71.k.g(o00Var3, "data");
                r00 r00Var3 = o00Var3.a;
                List list5 = (r00Var3 == null || (n00Var3 = r00Var3.b) == null || (m00Var3 = n00Var3.b) == null || (k00Var3 = m00Var3.b) == null) ? null : k00Var3.b;
                return list5 == null ? x61.r.r : list5;
            case 8:
                o00 o00Var4 = (o00) obj;
                k71.k.g(o00Var4, "data");
                r00 r00Var4 = o00Var4.a;
                List<p00> list6 = (r00Var4 == null || (n00Var5 = r00Var4.b) == null || (m00Var5 = n00Var5.b) == null || (k00Var5 = m00Var5.b) == null) ? null : k00Var5.b;
                if (list6 == null) {
                    list6 = x61.r.r;
                }
                ArrayList arrayList2 = new ArrayList();
                for (p00 p00Var : list6) {
                    j4 n = (p00Var == null || (l1Var = p00Var.c) == null) ? null : q.n(l1Var);
                    if (n != null) {
                        arrayList2.add(n);
                    }
                }
                return new w0(arrayList2, (r00Var4 == null || (n00Var4 = r00Var4.b) == null || (m00Var4 = n00Var4.b) == null || (k00Var4 = m00Var4.b) == null || (q00Var2 = k00Var4.a) == null) ? new x01.i(null, false, true) : new x01.i(q00Var2.b, q00Var2.a, false));
            case 9:
                kx0.a aVar3 = (kx0.a) obj;
                k71.k.g(aVar3, "it");
                return aVar3.d;
            case 10:
                kx0.a aVar4 = (kx0.a) obj;
                k71.k.g(aVar4, "it");
                return Boolean.valueOf(k71.k.b(aVar4.h, Boolean.FALSE));
            case 11:
                ly0.a aVar5 = (ly0.a) obj;
                k71.k.g(aVar5, "pullRequestParameters");
                String str2 = aVar5.c;
                String g = f1.e.g("type:pr ", aVar5.d);
                u0 u0Var = new u0((Object) null);
                String str3 = aVar5.b;
                u0 u0Var2 = t0.d;
                u0 u0Var3 = str3 == null ? u0Var2 : new u0(str3);
                if (str2 != null) {
                    u0Var2 = new u0(str2);
                }
                return new v20(g, u0Var, u0Var3, u0Var2, new u0(Boolean.valueOf((str3 == null || str2 == null) ? false : true)));
            case 12:
                k20 k20Var = (k20) obj;
                k71.k.g(k20Var, "data");
                return Boolean.valueOf(k20Var.b.c != null ? !r1.isEmpty() : false);
            case 13:
                k20 k20Var2 = (k20) obj;
                k71.k.g(k20Var2, "data");
                r20 r20Var = k20Var2.b.b;
                boolean z2 = r20Var.a;
                String str4 = r20Var.b;
                return new x01.i(str4, z2, str4 == null);
            case 14:
                k20 k20Var3 = (k20) obj;
                k71.k.g(k20Var3, "data");
                List list7 = k20Var3.b.c;
                return list7 == null ? x61.r.r : list7;
            case 15:
                k20 k20Var4 = (k20) obj;
                k71.k.g(k20Var4, "data");
                u20 u20Var = k20Var4.b;
                t20 t20Var = k20Var4.a;
                String str5 = t20Var != null ? t20Var.b : null;
                Iterable<n20> iterable2 = u20Var.c;
                if (iterable2 == null) {
                    iterable2 = x61.r.r;
                }
                ArrayList arrayList3 = new ArrayList();
                for (n20 n20Var : iterable2) {
                    p2 p2Var = (n20Var == null || (q20Var = n20Var.c) == null) ? null : q20Var.c;
                    if (p2Var != null) {
                        arrayList3.add(p2Var);
                    }
                }
                ArrayList arrayList4 = new ArrayList(x61.n.F(arrayList3, 10));
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList3.get(i2);
                    i2++;
                    arrayList4.add(k21.f.J((p2) obj3));
                }
                r20 r20Var2 = u20Var.b;
                boolean z3 = r20Var2.a;
                String str6 = r20Var2.b;
                return new m3(str5, arrayList4, new x01.i(str6, z3, str6 == null));
            case 16:
                ((Integer) obj).getClass();
                return null;
            case 17:
                List list8 = (List) obj;
                return new s(((Number) list8.get(0)).intValue(), ((Number) list8.get(1)).intValue());
            case 18:
                return a0.a;
            case 19:
                o oVar = (o) obj;
                k71.k.g(oVar, "repositoryIssueTypesParameters");
                return new v(new u0(30), t0.d, oVar.a, oVar.b);
            case 20:
                m00.q qVar = (m00.q) obj;
                k71.k.g(qVar, "data");
                u uVar = qVar.a;
                return Boolean.valueOf((uVar == null || (rVar = uVar.a) == null || (list2 = rVar.b) == null) ? false : !list2.isEmpty());
            case 21:
                m00.q qVar2 = (m00.q) obj;
                k71.k.g(qVar2, "data");
                u uVar2 = qVar2.a;
                if (uVar2 == null || (rVar2 = uVar2.a) == null || (tVar = rVar2.a) == null) {
                    return null;
                }
                return new x01.i(tVar.a, tVar.b, !tVar.c);
            case 22:
                m00.q qVar3 = (m00.q) obj;
                k71.k.g(qVar3, "data");
                u uVar3 = qVar3.a;
                List list9 = (uVar3 == null || (rVar3 = uVar3.a) == null) ? null : rVar3.b;
                return list9 == null ? x61.r.r : list9;
            case 23:
                m00.q qVar4 = (m00.q) obj;
                k71.k.g(qVar4, "data");
                u uVar4 = qVar4.a;
                x61.r rVar5 = null;
                if (uVar4 == null || (rVar4 = uVar4.a) == null) {
                    return null;
                }
                t tVar2 = rVar4.a;
                x01.i iVar2 = new x01.i(tVar2.a, tVar2.b, !tVar2.c);
                List<m00.s> list10 = rVar4.b;
                if (list10 != null) {
                    ArrayList arrayList5 = new ArrayList();
                    for (m00.s sVar : list10) {
                        IssueType f = (sVar == null || (aVar = sVar.c) == null) ? null : z3.f(aVar);
                        if (f != null) {
                            arrayList5.add(f);
                        }
                    }
                    rVar5 = arrayList5;
                }
                if (rVar5 == null) {
                    rVar5 = x61.r.r;
                }
                return new u01.a(rVar5, iVar2);
            case 24:
                String str7 = (String) obj;
                k71.k.g(str7, "id");
                return new p(str7, new u0(100), (u0) null, 28);
            case 25:
                b20.e eVar = (b20.e) obj;
                k71.k.g(eVar, "data");
                b20.g gVar = eVar.a;
                return Boolean.valueOf((gVar == null || (hVar = gVar.c) == null || (mVar = hVar.c) == null || (list3 = mVar.c) == null) ? false : !list3.isEmpty());
            case 26:
                b20.e eVar2 = (b20.e) obj;
                k71.k.g(eVar2, "data");
                b20.g gVar2 = eVar2.a;
                if (gVar2 == null || (hVar2 = gVar2.c) == null || (mVar2 = hVar2.c) == null || (kVar = mVar2.b) == null) {
                    return null;
                }
                return new x01.i(kVar.b, kVar.a, !kVar.c);
            case 27:
                b20.e eVar3 = (b20.e) obj;
                k71.k.g(eVar3, "data");
                b20.g gVar3 = eVar3.a;
                List list11 = (gVar3 == null || (hVar3 = gVar3.c) == null || (mVar3 = hVar3.c) == null) ? null : mVar3.c;
                return list11 == null ? x61.r.r : list11;
            case 28:
                b20.e eVar4 = (b20.e) obj;
                k71.k.g(eVar4, "data");
                b20.g gVar4 = eVar4.a;
                if (gVar4 != null && (hVar4 = gVar4.c) != null) {
                    b20.o oVar2 = hVar4.b.e;
                    return i20.a.d(hVar4, oVar2 != null ? oVar2.c.b : null);
                }
                if (gVar4 != null && (m1Var = gVar4.e) != null) {
                    return i20.a.f(m1Var);
                }
                if (gVar4 == null || (iVar = gVar4.d) == null) {
                    return null;
                }
                return i20.a.e(iVar);
            default:
                m20.b bVar = (m20.b) obj;
                k71.k.g(bVar, "id");
                String str8 = bVar.a;
                u0 u0Var4 = new u0(100);
                String str9 = bVar.b;
                aa1.b bVar2 = t0.d;
                return new o0(str8, u0Var4, bVar2, str9 == null ? bVar2 : new u0(str9), new u0(Boolean.valueOf(str9 != null)));
        }
    }
}
