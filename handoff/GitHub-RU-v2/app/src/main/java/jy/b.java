package jy;

import a0.s0;
import aa.t0;
import aa.u0;
import b91.g;
import com.github.rudroid.activities.SearchResultsFragment;
import com.github.rudroid.codesearch.GlobalCodeSearchResultsFragment;
import com.github.rudroid.home.search.GlobalSearchFragment;
import com.github.rudroid.home.search.navigation.GlobalCodeSearchResultsRoute;
import com.github.rudroid.home.search.navigation.GlobalSearchRoute;
import com.github.rudroid.home.search.navigation.SearchResultsRoute;
import com.github.rudroid.m0;
import com.github.rudroid.repository.file.RepositoryFileFragmentContainer;
import com.github.rudroid.repository.file.navigation.RepositoryFileRoute;
import ct.u;
import f1.e;
import g3.f0;
import gn0.rr;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import jo.c40;
import jo.d40;
import jo.e40;
import jo.f40;
import jo.g40;
import jo.h40;
import jo.k40;
import jo.m40;
import jo.n40;
import jo.o40;
import jo.p40;
import jo.r40;
import jo.s40;
import jo.t40;
import jo.u40;
import jo.v40;
import k71.k;
import k71.xShadow;
import kc0.g30;
import l3.v;
import l7.x1;
import l81.l;
import lm0.h;
import m81.t;
import p01.m;
import sy.w;
import u10.cx;
import u10.dx;
import u10.fx;
import u10.gx;
import u10.hx;
import u10.xw;
import u10.zw;
import w61.a0;
import x01.i;
import x6.p0;
import x6.y;
import x61.n;
import x61.rShadow;
import x61.s;
import yz0.a7;
import yz0.e4;
import yz0.m3;
import yz0.o6;
import yz0.s7;
import yz0.x2;
import yz0.y1;
import z70.l2;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class b implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ b(int i) {
        this.r = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:249:0x04eb A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x04c4 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(Object obj) {
        y1 y1Var;
        m40 m40Var;
        p40 p40Var;
        s40 s40Var;
        cx cxVar;
        int i = this.r;
        a0 a0Var = a0.a;
        u0 u0Var = t0.d;
        r<zw> rVar = rShadow.r;
        rShadow rVar2 = null;
        switch (i) {
            case 0:
                c40 c40Var = (c40) obj;
                k.g(c40Var, "data");
                return Boolean.valueOf(c40Var.a.b != null ? !r1.isEmpty() : false);
            case 1:
                c40 c40Var2 = (c40) obj;
                k.g(c40Var2, "data");
                g40 g40Var = c40Var2.a.a;
                boolean z = g40Var.a;
                String str = g40Var.b;
                return new i(str, z, str == null);
            case 2:
                c40 c40Var3 = (c40) obj;
                k.g(c40Var3, "data");
                List list = c40Var3.a.b;
                return list == null ? rVar : list;
            case 3:
                c40 c40Var4 = (c40) obj;
                k.g(c40Var4, "data");
                h40 h40Var = c40Var4.a;
                List<d40> list2 = h40Var.b;
                if (list2 != null) {
                    rShadow arrayList = new ArrayList();
                    for (d40 d40Var : list2) {
                        if (d40Var != null) {
                            e40 e40Var = d40Var.b;
                            if (e40Var != null) {
                                y1Var = g.W(e40Var.c);
                            } else {
                                f40 f40Var = d40Var.c;
                                if (f40Var != null) {
                                    y1Var = m71.a.h0(f40Var.c);
                                }
                            }
                            if (y1Var == null) {
                                arrayList.add(y1Var);
                            }
                        }
                        y1Var = null;
                        if (y1Var == null) {
                        }
                    }
                    rVar2 = arrayList;
                }
                if (rVar2 != null) {
                    rVar = rVar2;
                }
                g40 g40Var2 = h40Var.a;
                boolean z2 = g40Var2.a;
                String str2 = g40Var2.b;
                return new xz0.g(rVar, new i(str2, z2, str2 == null));
            case 4:
                c cVar = (c) obj;
                k.g(cVar, "issueParameters");
                String str3 = cVar.c;
                String g = e.g("type:issue ", cVar.d);
                u0 u0Var2 = new u0((Object) null);
                String str4 = cVar.b;
                u0 u0Var3 = str4 == null ? u0Var : new u0(str4);
                if (str3 != null) {
                    u0Var = new u0(str3);
                }
                u0 u0Var4 = u0Var;
                if (str4 != null && str3 != null) {
                    r13 = true;
                }
                return new v40(g, u0Var2, u0Var3, u0Var4, new u0(Boolean.valueOf(r13)));
            case 5:
                k40 k40Var = (k40) obj;
                k.g(k40Var, "data");
                return Boolean.valueOf(k40Var.b.c != null ? !r1.isEmpty() : false);
            case 6:
                k40 k40Var2 = (k40) obj;
                k.g(k40Var2, "data");
                r40 r40Var = k40Var2.b.b;
                boolean z3 = r40Var.a;
                String str5 = r40Var.b;
                return new i(str5, z3, str5 == null);
            case 7:
                k40 k40Var3 = (k40) obj;
                k.g(k40Var3, "data");
                List list3 = k40Var3.b.c;
                return list3 == null ? rVar : list3;
            case 8:
                k40 k40Var4 = (k40) obj;
                k.g(k40Var4, "data");
                u40 u40Var = k40Var4.b;
                t40 t40Var = k40Var4.a;
                String str6 = t40Var != null ? t40Var.b : null;
                r<o40> rVar3 = (t40Var == null || (s40Var = t40Var.e) == null) ? null : s40Var.a;
                if (rVar3 == null) {
                    rVar3 = rVar;
                }
                ArrayList arrayList2 = new ArrayList();
                for (o40 o40Var : rVar3) {
                    u uVar = o40Var != null ? o40Var.a.c : null;
                    if (uVar != null) {
                        arrayList2.add(uVar);
                    }
                }
                ArrayList arrayList3 = new ArrayList(n.F(arrayList2, 10));
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    arrayList3.add(g.W((u) obj2));
                }
                rShadow rVar4 = u40Var.c;
                if (rVar4 != null) {
                    rVar = rVar4;
                }
                ArrayList arrayList4 = new ArrayList();
                for (n40 n40Var : rVar) {
                    u uVar2 = (n40Var == null || (p40Var = n40Var.b) == null) ? null : p40Var.c;
                    if (uVar2 != null) {
                        arrayList4.add(uVar2);
                    }
                }
                ArrayList arrayList5 = new ArrayList(n.F(arrayList4, 10));
                int size2 = arrayList4.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj3 = arrayList4.get(i3);
                    i3++;
                    arrayList5.add(g.W((u) obj3));
                }
                m mVar = new m(arrayList3, arrayList5, ((t40Var == null || (m40Var = t40Var.d) == null) ? 0 : m40Var.a) > 0);
                r40 r40Var2 = u40Var.b;
                boolean z4 = r40Var2.a;
                String str7 = r40Var2.b;
                return new e4(str6, mVar, new i(str7, z4, str7 == null));
            case 9:
                throw s0.d(obj);
            case 10:
                if (obj != null) {
                    throw new ClassCastException();
                }
                k.g((Object) null, "it");
                throw null;
            case 11:
                y yVar = (y) obj;
                k.g(yVar, "$this$navigation");
                p0 p0Var = yVar.g;
                z6.e r = m0.r(p0Var, z6.e.class);
                k71.e a = xShadow.a(GlobalSearchRoute.class);
                k71.e a2 = xShadow.a(GlobalSearchFragment.class);
                s sVar = s.r;
                z6.i iVar = new z6.i(r, a, sVar, a2);
                ArrayList arrayList6 = yVar.j;
                arrayList6.add(iVar.a());
                arrayList6.add(new z6.i(p0Var.b(w.r(z6.e.class)), xShadow.a(SearchResultsRoute.class), sVar, xShadow.a(SearchResultsFragment.class)).a());
                arrayList6.add(new z6.i(p0Var.b(w.r(z6.e.class)), xShadow.a(GlobalCodeSearchResultsRoute.class), sVar, xShadow.a(GlobalCodeSearchResultsFragment.class)).a());
                ee.b.a(yVar);
                ze.b.a(yVar);
                lf.b.a(yVar);
                rf.g.a(yVar);
                return a0Var;
            case 12:
                o6 o6Var = (s7) obj;
                return o6Var instanceof o6 ? o6.a(o6Var, (yz0.s) null, (List) null, false, (x2) null, false, false, 123) : o6Var instanceof a7 ? a7.a((a7) o6Var, (yz0.s) null, (List) null, false, false, false, 991) : o6Var;
            case 13:
                o6 o6Var2 = (s7) obj;
                return o6Var2 instanceof o6 ? o6.a(o6Var2, (yz0.s) null, (List) null, true, (x2) null, false, false, 123) : o6Var2 instanceof a7 ? a7.a((a7) o6Var2, (yz0.s) null, (List) null, true, false, false, 991) : o6Var2;
            case 14:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 15:
                return Boolean.valueOf(((Character) obj).charValue() == '-');
            case 16:
                char charValue = ((Character) obj).charValue();
                return Boolean.valueOf(charValue == 'T' || charValue == 't');
            case 17:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 18:
                return Boolean.valueOf(((Character) obj).charValue() == ':');
            case 19:
                char charValue2 = ((Character) obj).charValue();
                if ('0' <= charValue2 && charValue2 < ':') {
                    r13 = true;
                }
                return Boolean.valueOf(r13);
            case 20:
                k.e(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list4 = (List) obj;
                Object obj4 = list4.get(0);
                x1 x1Var = f0.a;
                Boolean bool = Boolean.FALSE;
                g3.g gVar = (k.b(obj4, bool) || obj4 == null) ? null : (g3.g) ((j71.c) x1Var.s).k(obj4);
                k.d(gVar);
                Object obj5 = list4.get(1);
                int i4 = g3.p0.c;
                g3.p0 p0Var2 = (k.b(obj5, bool) || obj5 == null) ? null : (g3.p0) ((j71.c) f0.p.s).k(obj5);
                k.d(p0Var2);
                return new v(gVar, p0Var2.a, (g3.p0) null);
            case 21:
                i81.a aVar = (i81.a) obj;
                k.g(aVar, "$this$buildSerialDescriptor");
                i81.a.a(aVar, "JsonPrimitive", new l(new kh.a(10)));
                i81.a.a(aVar, "JsonNull", new l(new kh.a(11)));
                i81.a.a(aVar, "JsonLiteral", new l(new kh.a(12)));
                i81.a.a(aVar, "JsonObject", new l(new kh.a(13)));
                i81.a.a(aVar, "JsonArray", new l(new kh.a(14)));
                return a0Var;
            case 22:
                Map.Entry entry = (Map.Entry) obj;
                k.g(entry, "<destruct>");
                String str8 = (String) entry.getKey();
                kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) entry.getValue();
                StringBuilder sb = new StringBuilder();
                t.a(str8, sb);
                sb.append(':');
                sb.append(bVar);
                return sb.toString();
            case 23:
                lb0.b bVar2 = (lb0.b) obj;
                k.g(bVar2, "pullRequestParameters");
                String str9 = bVar2.c;
                String g2 = e.g("type:pr ", bVar2.d);
                u0 u0Var5 = new u0((Object) null);
                String str10 = bVar2.b;
                u0 u0Var6 = str10 == null ? u0Var : new u0(str10);
                if (str9 != null) {
                    u0Var = new u0(str9);
                }
                u0 u0Var7 = u0Var;
                if (str10 != null && str9 != null) {
                    r13 = true;
                }
                return new hx(g2, u0Var5, u0Var6, u0Var7, new u0(Boolean.valueOf(r13)));
            case 24:
                xw xwVar = (xw) obj;
                k.g(xwVar, "data");
                return Boolean.valueOf(xwVar.b.c != null ? !r1.isEmpty() : false);
            case 25:
                xw xwVar2 = (xw) obj;
                k.g(xwVar2, "data");
                dx dxVar = xwVar2.b.b;
                boolean z5 = dxVar.a;
                String str11 = dxVar.b;
                return new i(str11, z5, str11 == null);
            case 26:
                xw xwVar3 = (xw) obj;
                k.g(xwVar3, "data");
                List list5 = xwVar3.b.c;
                return list5 == null ? rVar : list5;
            case 27:
                xw xwVar4 = (xw) obj;
                k.g(xwVar4, "data");
                gx gxVar = xwVar4.b;
                fx fxVar = xwVar4.a;
                String str12 = fxVar != null ? fxVar.b : null;
                rShadow rVar5 = gxVar.c;
                if (rVar5 != null) {
                    rVar = rVar5;
                }
                ArrayList arrayList7 = new ArrayList();
                for (zw zwVar : rVar) {
                    l2 l2Var = (zwVar == null || (cxVar = zwVar.c) == null) ? null : cxVar.c;
                    if (l2Var != null) {
                        arrayList7.add(l2Var);
                    }
                }
                ArrayList arrayList8 = new ArrayList(n.F(arrayList7, 10));
                int size3 = arrayList7.size();
                int i5 = 0;
                while (i5 < size3) {
                    Object obj6 = arrayList7.get(i5);
                    i5++;
                    arrayList8.add(sy.y.l((l2) obj6));
                }
                dx dxVar2 = gxVar.b;
                boolean z6 = dxVar2.a;
                String str13 = dxVar2.b;
                return new m3(str12, arrayList8, new i(str13, z6, str13 == null));
            case 28:
                y yVar2 = (y) obj;
                k.g(yVar2, "$this$navigation");
                yVar2.j.add(new z6.i(m0.r(yVar2.g, z6.e.class), xShadow.a(RepositoryFileRoute.class), com.github.rudroid.repository.file.navigation.a.a, xShadow.a(RepositoryFileFragmentContainer.class)).a());
                return a0Var;
            default:
                h hVar = (h) obj;
                k.g(hVar, "repositoryOwnerRepositoriesParameters");
                rr M = t.a0.M(hVar.a);
                if (M != null) {
                    u0Var = new u0(M);
                }
                return new g30((aa1.b) null, u0Var, 10);
        }
    }
}
