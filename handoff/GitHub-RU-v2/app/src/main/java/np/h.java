package np;

import aa.t0;
import aa.u0;
import androidx.datastore.core.CorruptionException;
import b20.q;
import b20.s;
import b20.t;
import b20.u;
import b20.v;
import com.github.rudroid.commit.CommitFragment;
import com.github.rudroid.commit.navigation.CommitRoute;
import com.github.rudroid.commits.CommitsFragment;
import com.github.rudroid.commits.navigation.CommitsRoute;
import com.github.rudroid.discussions.DiscussionDetailFragment;
import com.github.rudroid.discussions.RepositoryDiscussionsFragment;
import com.github.rudroid.discussions.navigation.DiscussionCommentReplyThreadRoute;
import com.github.rudroid.discussions.navigation.DiscussionDetailRoute;
import com.github.rudroid.discussions.navigation.RepositoryDiscussionsRoute;
import com.github.rudroid.discussions.replythread.DiscussionCommentReplyThreadFragment;
import com.github.rudroid.m0;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;
import is.p0;
import is.r;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import jo.bk0;
import jo.ck0;
import jo.ek0;
import jo.fd;
import jo.gd;
import jo.gk0;
import jo.hd;
import jo.id;
import jo.jd;
import jo.kd;
import jo.pp;
import k71.x;
import mn0.g0;
import p01.p;
import sy.c0;
import sy.f0;
import sy.w;
import w61.a0;
import x6.y;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class h implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ h(int i) {
        this.r = i;
    }

    /* JADX WARN: Type inference failed for: r1v36, types: [java.lang.Object, java.util.Map] */
    public final Object k(Object obj) {
        v vVar;
        q qVar;
        List list;
        kn0.f fVar;
        kn0.b bVar;
        List list2;
        kn0.f fVar2;
        kn0.b bVar2;
        kn0.g gVar;
        kn0.f fVar3;
        kn0.b bVar3;
        ArrayList arrayList;
        Iterator it;
        jn.h hVar;
        Iterator it2;
        int i;
        String str;
        Object aVar;
        Object cVar;
        mn0.c cVar2;
        mn0.c cVar3;
        ko.f fVar4;
        ko.b bVar4;
        List list3;
        switch (this.r) {
            case 0:
                pp ppVar = (pp) obj;
                k71.k.g(ppVar, "data");
                r s = m71.a.s(ppVar);
                if (s != null) {
                    return c0.b(s);
                }
                throw new ApiFailure(ApiFailureType.SERVER_ERROR, "Invalid Discussion info 2", (String) null, (Integer) null, (ArrayList) null, (Map) null, (Throwable) null, 120);
            case 1:
                o oVar = (o) obj;
                k71.k.g(oVar, "discussionParameters");
                String str2 = oVar.c;
                String str3 = oVar.a;
                u0 u0Var = new u0((Object) null);
                String str4 = oVar.b;
                u0 u0Var2 = t0.d;
                u0 u0Var3 = str4 == null ? u0Var2 : new u0(str4);
                if (str2 != null) {
                    u0Var2 = new u0(str2);
                }
                return new kd(str3, u0Var, u0Var3, u0Var2, new u0(Boolean.valueOf((str4 == null || str2 == null) ? false : true)));
            case 2:
                fd fdVar = (fd) obj;
                k71.k.g(fdVar, "data");
                return Boolean.valueOf(fdVar.b.c != null ? !r0.isEmpty() : false);
            case 3:
                fd fdVar2 = (fd) obj;
                k71.k.g(fdVar2, "data");
                hd hdVar = fdVar2.b.b;
                boolean z = hdVar.a;
                String str5 = hdVar.b;
                return new x01.i(str5, z, str5 == null);
            case 4:
                fd fdVar3 = (fd) obj;
                k71.k.g(fdVar3, "data");
                List list4 = fdVar3.b.c;
                return list4 == null ? x61.r.r : list4;
            case 5:
                fd fdVar4 = (fd) obj;
                k71.k.g(fdVar4, "data");
                jd jdVar = fdVar4.b;
                id idVar = fdVar4.a;
                String str6 = idVar != null ? idVar.b : null;
                x61.r rVar = jdVar.c;
                if (rVar == null) {
                    rVar = x61.r.r;
                }
                ArrayList S = x61.m.S(rVar);
                ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
                int size = S.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = S.get(i2);
                    i2++;
                    p0 p0Var = ((gd) obj2).c;
                    k71.k.d(p0Var);
                    arrayList2.add(f0.d(p0Var));
                }
                hd hdVar2 = jdVar.b;
                return new b01.o(str6, arrayList2, new x01.i(hdVar2.b, hdVar2.a, false));
            case 6:
                List list5 = (List) obj;
                Object obj3 = list5.get(0);
                k71.k.e(obj3, "null cannot be cast to non-null type kotlin.Int");
                int intValue = ((Integer) obj3).intValue();
                Object obj4 = list5.get(1);
                k71.k.e(obj4, "null cannot be cast to non-null type kotlin.Float");
                return new o0.b(intValue, ((Float) obj4).floatValue(), new g81.f(2, list5));
            case 7:
                o10.a aVar2 = (o10.a) obj;
                k71.k.g(aVar2, "parameters");
                String str7 = aVar2.a;
                aa1.b bVar5 = t0.d;
                return new gk0(bVar5, str7 == null ? bVar5 : new u0(str7));
            case 8:
                bk0 bk0Var = (bk0) obj;
                k71.k.g(bk0Var, "data");
                return Boolean.valueOf(bk0Var.a.a.b != null ? !r0.isEmpty() : false);
            case 9:
                bk0 bk0Var2 = (bk0) obj;
                k71.k.g(bk0Var2, "data");
                xx.a aVar3 = bk0Var2.a.a.a.b;
                return new x01.i(aVar3.a, aVar3.b, !aVar3.c);
            case 10:
                bk0 bk0Var3 = (bk0) obj;
                k71.k.g(bk0Var3, "data");
                List list6 = bk0Var3.a.a.b;
                return list6 == null ? x61.r.r : list6;
            case 11:
                bk0 bk0Var4 = (bk0) obj;
                k71.k.g(bk0Var4, "data");
                ek0 ek0Var = bk0Var4.a.a;
                x61.r rVar2 = ek0Var.b;
                if (rVar2 == null) {
                    rVar2 = x61.r.r;
                }
                ArrayList S2 = x61.m.S(rVar2);
                ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
                int size2 = S2.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj5 = S2.get(i3);
                    i3++;
                    arrayList3.add(sy.n.I(((ck0) obj5).c));
                }
                xx.a aVar4 = ek0Var.a.b;
                return new p(arrayList3, new x01.i(aVar4.a, aVar4.b, !aVar4.c));
            case 12:
                s sVar = (s) obj;
                k71.k.g(sVar, "data");
                u uVar = sVar.a;
                if (uVar == null || (vVar = uVar.c) == null || (qVar = vVar.b) == null || (list = qVar.b) == null) {
                    return null;
                }
                return (t) x61.m.W(x61.m.v0(x61.m.S(list), new androidx.viewpager.widget.b(13)));
            case 13:
                k71.k.g((CorruptionException) obj, "it");
                return b41.b.n();
            case 14:
                y yVar = (y) obj;
                k71.k.g(yVar, "$this$navigation");
                Map map = ob.d.a;
                x6.p0 p0Var2 = yVar.g;
                z6.i iVar = new z6.i(m0.r(p0Var2, z6.e.class), x.a(CommitsRoute.class), map, x.a(CommitsFragment.class));
                ArrayList arrayList4 = yVar.j;
                arrayList4.add(iVar.a());
                arrayList4.add(new z6.i(p0Var2.b(w.r(z6.e.class)), x.a(CommitRoute.class), nb.a.a, x.a(CommitFragment.class)).a());
                return a0.a;
            case 15:
                y yVar2 = (y) obj;
                k71.k.g(yVar2, "$this$navigation");
                yVar2.j.add(new z6.i(m0.r(yVar2.g, z6.e.class), x.a(RepositoryDiscussionsRoute.class), (Map) oc.d.a, x.a(RepositoryDiscussionsFragment.class)).a());
                oc.b.a(yVar2);
                return a0.a;
            case 16:
                y yVar3 = (y) obj;
                k71.k.g(yVar3, "$this$navigation");
                x6.p0 p0Var3 = yVar3.g;
                z6.e r = m0.r(p0Var3, z6.e.class);
                k71.e a = x.a(DiscussionDetailRoute.class);
                k71.e a2 = x.a(DiscussionDetailFragment.class);
                x61.s sVar2 = x61.s.r;
                z6.i iVar2 = new z6.i(r, a, sVar2, a2);
                ArrayList arrayList5 = yVar3.j;
                arrayList5.add(iVar2.a());
                arrayList5.add(new z6.i(p0Var3.b(w.r(z6.e.class)), x.a(DiscussionCommentReplyThreadRoute.class), sVar2, x.a(DiscussionCommentReplyThreadFragment.class)).a());
                return a0.a;
            case 17:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0.a;
            case 18:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0.a;
            case 19:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0.a;
            case 20:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0.a;
            case 21:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0.a;
            case 22:
                k71.k.g((d3.c0) obj, "$this$clearAndSetSemantics");
                return a0.a;
            case 23:
                on0.a aVar5 = (on0.a) obj;
                k71.k.g(aVar5, "userAchievementsParameters");
                return new kn0.l(aVar5.a, new u0(30), t0.d);
            case 24:
                kn0.d dVar = (kn0.d) obj;
                k71.k.g(dVar, "data");
                kn0.k kVar = dVar.a;
                return Boolean.valueOf((kVar == null || (fVar = kVar.c) == null || (bVar = fVar.a) == null || (list2 = bVar.c) == null) ? false : !list2.isEmpty());
            case 25:
                kn0.d dVar2 = (kn0.d) obj;
                k71.k.g(dVar2, "data");
                kn0.k kVar2 = dVar2.a;
                if (kVar2 == null || (fVar2 = kVar2.c) == null || (bVar2 = fVar2.a) == null || (gVar = bVar2.b) == null) {
                    return null;
                }
                return new x01.i(gVar.a, gVar.b, !gVar.c);
            case 26:
                kn0.d dVar3 = (kn0.d) obj;
                k71.k.g(dVar3, "data");
                kn0.k kVar3 = dVar3.a;
                List list7 = (kVar3 == null || (fVar3 = kVar3.c) == null || (bVar3 = fVar3.a) == null) ? null : bVar3.c;
                return list7 == null ? x61.r.r : list7;
            case 27:
                kn0.d dVar4 = (kn0.d) obj;
                k71.k.g(dVar4, "data");
                kn0.k kVar4 = dVar4.a;
                if (kVar4 == null) {
                    return null;
                }
                kn0.b bVar6 = kVar4.c.a;
                List list8 = bVar6.c;
                if (list8 != null) {
                    ArrayList arrayList6 = new ArrayList();
                    Iterator it3 = list8.iterator();
                    while (it3.hasNext()) {
                        kn0.e eVar = (kn0.e) it3.next();
                        if (eVar != null) {
                            String str8 = eVar.b;
                            ZonedDateTime zonedDateTime = eVar.c;
                            kn0.a aVar6 = eVar.e;
                            String str9 = aVar6.a;
                            String str10 = aVar6.b;
                            kn0.i iVar3 = eVar.f;
                            String str11 = iVar3 != null ? iVar3.b : null;
                            if (str11 == null) {
                                str11 = "";
                            }
                            String str12 = iVar3 != null ? iVar3.c : null;
                            if (str12 == null) {
                                str12 = "";
                            }
                            ArrayList arrayList7 = eVar.g;
                            ArrayList arrayList8 = new ArrayList(x61.n.F(arrayList7, 10));
                            int size3 = arrayList7.size();
                            int i4 = 0;
                            while (i4 < size3) {
                                Object obj6 = arrayList7.get(i4);
                                int i5 = i4 + 1;
                                kn0.h hVar2 = (kn0.h) obj6;
                                int i6 = size3;
                                k71.k.g(hVar2, "<this>");
                                String str13 = hVar2.b;
                                kn0.j jVar = hVar2.a;
                                if (jVar != null) {
                                    g0 g0Var = jVar.b;
                                    it2 = it3;
                                    mn0.d dVar5 = g0Var.b;
                                    if (dVar5 != null) {
                                        List list9 = dVar5.a.a;
                                        String str14 = (list9 == null || (cVar3 = (mn0.c) x61.m.W(list9)) == null) ? null : cVar3.b;
                                        if (str14 == null) {
                                            str14 = "";
                                        }
                                        String str15 = (list9 == null || (cVar2 = (mn0.c) x61.m.W(list9)) == null) ? null : cVar2.a;
                                        if (str15 == null) {
                                            str15 = "";
                                        }
                                        i = i5;
                                        aVar = new jn.d(str13, str15, str14);
                                    } else {
                                        i = i5;
                                        mn0.e eVar2 = g0Var.c;
                                        if (eVar2 != null) {
                                            aVar = new jn.d(str13, eVar2.a, eVar2.b.a);
                                        } else {
                                            mn0.f fVar5 = g0Var.d;
                                            if (fVar5 != null) {
                                                str = str12;
                                                cVar = new jn.b(fVar5.b, str13, fVar5.a, fVar5.c.a);
                                            } else {
                                                str = str12;
                                                mn0.g gVar2 = g0Var.e;
                                                if (gVar2 != null) {
                                                    mn0.a aVar7 = gVar2.b;
                                                    String str16 = aVar7 != null ? aVar7.b.a : null;
                                                    if (str16 == null) {
                                                        str16 = "";
                                                    }
                                                    cVar = new jn.b(aVar7 != null ? aVar7.a : 0, str13, gVar2.a, str16);
                                                } else {
                                                    mn0.h hVar3 = g0Var.f;
                                                    if (hVar3 != null) {
                                                        cVar = new jn.c(hVar3.c, str13, hVar3.a, hVar3.b.a);
                                                    } else {
                                                        mn0.i iVar4 = g0Var.g;
                                                        if (iVar4 != null) {
                                                            cVar = new jn.c(iVar4.c.a, str13, iVar4.a, iVar4.b.a);
                                                        } else {
                                                            mn0.j jVar2 = g0Var.h;
                                                            if (jVar2 != null) {
                                                                cVar = new jn.c(jVar2.b, str13, jVar2.c, jVar2.a.a);
                                                            } else {
                                                                mn0.k kVar5 = g0Var.i;
                                                                if (kVar5 != null) {
                                                                    mn0.t tVar = kVar5.b;
                                                                    cVar = new jn.c(tVar.b, str13, kVar5.a, tVar.a.a);
                                                                } else {
                                                                    mn0.l lVar = g0Var.j;
                                                                    if (lVar != null) {
                                                                        mn0.s sVar3 = lVar.b;
                                                                        cVar = new jn.c(sVar3.b, str13, lVar.a, sVar3.a.a);
                                                                    } else {
                                                                        mn0.m mVar = g0Var.k;
                                                                        if (mVar != null) {
                                                                            aVar = new jn.d(str13, mVar.c, mVar.a.a);
                                                                        } else {
                                                                            mn0.n nVar = g0Var.l;
                                                                            if (nVar != null) {
                                                                                aVar = new jn.d(str13, nVar.a, nVar.b);
                                                                            } else {
                                                                                mn0.o oVar2 = g0Var.m;
                                                                                if (oVar2 != null) {
                                                                                    aVar = new jn.a(str13, oVar2.a);
                                                                                } else {
                                                                                    mn0.p pVar = g0Var.n;
                                                                                    if (pVar != null) {
                                                                                        aVar = new jn.d(str13, pVar.a, pVar.b.a);
                                                                                    } else {
                                                                                        mn0.q qVar2 = g0Var.o;
                                                                                        if (qVar2 != null) {
                                                                                            aVar = new jn.f(str13, qVar2.a, qVar2.b.a);
                                                                                        } else {
                                                                                            mn0.r rVar3 = g0Var.p;
                                                                                            aVar = rVar3 != null ? new jn.a(str13, rVar3.a) : new jn.a(str13, "");
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            aVar = cVar;
                                        }
                                    }
                                    str = str12;
                                } else {
                                    it2 = it3;
                                    i = i5;
                                    str = str12;
                                    aVar = new jn.a(str13, "");
                                }
                                arrayList8.add(aVar);
                                size3 = i6;
                                it3 = it2;
                                i4 = i;
                                str12 = str;
                            }
                            it = it3;
                            hVar = new jn.h(str8, zonedDateTime, str9, str10, str11, str12, arrayList8, eVar.d);
                        } else {
                            it = it3;
                            hVar = null;
                        }
                        if (hVar != null) {
                            arrayList6.add(hVar);
                        }
                        it3 = it;
                    }
                    arrayList = new ArrayList();
                    int size4 = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size4) {
                        Object obj7 = arrayList6.get(i7);
                        i7++;
                        jn.h hVar4 = (jn.h) obj7;
                        if (!t71.p.T(hVar4.f) && !t71.p.T(hVar4.e)) {
                            arrayList.add(obj7);
                        }
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList == null) {
                    arrayList = x61.r.r;
                }
                kn0.g gVar3 = bVar6.b;
                return new jn.i(arrayList.size(), arrayList, new x01.i(gVar3.a, gVar3.b, gVar3.c));
            case 28:
                oo.b bVar7 = (oo.b) obj;
                k71.k.g(bVar7, "userAchievementsParameters");
                return new ko.l(bVar7.a, new u0(30), t0.d);
            default:
                ko.d dVar6 = (ko.d) obj;
                k71.k.g(dVar6, "data");
                ko.k kVar6 = dVar6.a;
                return Boolean.valueOf((kVar6 == null || (fVar4 = kVar6.c) == null || (bVar4 = fVar4.a) == null || (list3 = bVar4.c) == null) ? false : !list3.isEmpty());
        }
    }
}
