package rm0;

import com.github.domain.database.serialization.ExploreTrendingFilterPersistenceKey;
import com.github.domain.database.serialization.FilterPersistedKey;
import com.github.domain.database.serialization.HomeAgentPullRequestsFilterPersistenceKey;
import com.github.domain.database.serialization.HomeDiscussionsFilterPersistenceKey;
import com.github.domain.database.serialization.HomeIssuesFilterPersistenceKey;
import com.github.domain.database.serialization.HomeProjectsFilterPersistenceKey;
import com.github.domain.database.serialization.HomePullRequestsFilterPersistenceKey;
import com.github.domain.database.serialization.HomeRepositoriesFilterPersistenceKey;
import com.github.domain.database.serialization.NotificationsFilterPersistenceKey;
import com.github.domain.database.serialization.RepoAgentPullRequestsFilterPersistenceKey;
import com.github.domain.database.serialization.RepositoryDiscussionsFilterPersistenceKey;
import com.github.domain.database.serialization.RepositoryIssuesFilterPersistenceKey;
import com.github.domain.database.serialization.RepositoryPullRequestsFilterPersistenceKey;
import com.github.domain.database.serialization.UserAgentSessionsPersistenceKey;
import com.github.domain.database.serialization.UserOrOrgRepositoriesFilterPersistenceKey;
import com.github.domain.shortcuts.model.ShortcutConfigurationModel;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.shortcuts.ShortcutIcon;
import com.github.service.models.response.shortcuts.ShortcutScope$AllRepositories;
import com.github.service.models.response.shortcuts.ShortcutScope$SpecificRepository;
import com.github.service.models.response.shortcuts.ShortcutType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import jn0.a40;
import jn0.aw;
import jn0.e40;
import jn0.ew;
import jn0.hc0;
import jn0.ta0;
import jn0.xv;
import jn0.yv;
import jo.a60;
import jo.e60;
import jo.fy;
import jo.hd0;
import jo.ux;
import jo.ve0;
import jo.vx;
import jo.xx;
import jo.yx;
import kc0.nt;
import kc0.ot;
import kc0.qt;
import kc0.ut;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class u7 implements y71.j {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ u7(int i, Object obj, Object obj2) {
        this.r = i;
        this.s = obj;
        this.t = obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:242:0x0431, code lost:
    
        if (r9 == null) goto L244;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x030e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0353  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0580  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:399:0x0676  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x0684  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x06be  */
    /* JADX WARN: Removed duplicated region for block: B:422:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:433:0x0706  */
    /* JADX WARN: Removed duplicated region for block: B:439:0x0714  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:450:0x0752  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x0761  */
    /* JADX WARN: Removed duplicated region for block: B:524:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x084d  */
    /* JADX WARN: Removed duplicated region for block: B:541:0x0892  */
    /* JADX WARN: Removed duplicated region for block: B:547:0x08a0  */
    /* JADX WARN: Removed duplicated region for block: B:558:0x08da  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x08e8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:613:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:619:0x09af  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01be  */
    /* JADX WARN: Type inference failed for: r8v0, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v50, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r8v51, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r9v10, types: [x61.r] */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v14 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Object obj, a71.c cVar) {
        t7 t7Var;
        int i;
        qt qtVar;
        ot otVar;
        List list;
        ot otVar2;
        List list2;
        t00.d dVar;
        int i2;
        t00.i iVar;
        int i3;
        t00.t tVar;
        int i4;
        t00.y7 y7Var;
        int i5;
        xx xxVar;
        yx yxVar;
        List list3;
        yx yxVar2;
        List list4;
        xx xxVar2;
        vx vxVar;
        List list5;
        vx vxVar2;
        List list6;
        t00.y9 y9Var;
        int i6;
        t00.ca caVar;
        int i7;
        t00.ha haVar;
        int i8;
        tm.f fVar;
        int i9;
        List list7;
        ShortcutType shortcutType;
        ShortcutType shortcutType2;
        com.github.service.models.response.shortcuts.a aVar;
        ShortcutIcon shortcutIcon;
        ShortcutColor shortcutColor;
        String str;
        vb0.l lVar;
        int i10;
        wy0.e eVar;
        int i12;
        wy0.o oVar;
        int i13;
        wy0.y6 y6Var;
        int i14;
        aw awVar;
        yv yvVar;
        List list8;
        yv yvVar2;
        List list9;
        wy0.z8 z8Var;
        int i15;
        wy0.d9 d9Var;
        int i16;
        wy0.g9 g9Var;
        int i17;
        xk.d dVar2;
        int i18;
        y71.d0 d0Var;
        int i19;
        y71.y0 y0Var;
        int i20;
        switch (this.r) {
            case 0:
                if (cVar instanceof t7) {
                    t7Var = (t7) cVar;
                    int i22 = t7Var.v;
                    if ((i22 & Integer.MIN_VALUE) != 0) {
                        t7Var.v = i22 - Integer.MIN_VALUE;
                        Object obj2 = t7Var.u;
                        b71.a aVar2 = b71.a.r;
                        i = t7Var.v;
                        if (i != 0) {
                            sy.y.j(obj2);
                            y71.j jVar = (y71.j) this.s;
                            nt ntVar = (nt) obj;
                            qt qtVar2 = (qt) this.t;
                            ut utVar = null;
                            qt qtVar3 = null;
                            ArrayList S = (qtVar2 == null || (otVar2 = qtVar2.c) == null || (list2 = otVar2.c) == null) ? null : x61.m.S(list2);
                            java.util.List r8 = (java.util.List) (x61.r.r);
                            if (S == null) {
                                S = r8;
                            }
                            ut utVar2 = ntVar.a;
                            ArrayList S2 = (utVar2 == null || (qtVar = utVar2.b) == null || (otVar = qtVar.c) == null || (list = otVar.c) == null) ? null : x61.m.S(list);
                            if (S2 != null) {
                                r8 = S2;
                            }
                            ArrayList l0 = x61.m.l0(S, r8);
                            ut utVar3 = ntVar.a;
                            if (utVar3 != null) {
                                qt qtVar4 = utVar3.b;
                                if (qtVar4 != null) {
                                    ot otVar3 = qtVar4.c;
                                    qtVar3 = new qt(qtVar4.a, qtVar4.b, otVar3 != null ? new ot(otVar3.a, otVar3.b, l0) : null, qtVar4.d);
                                }
                                utVar = new ut(utVar3.a, qtVar3, utVar3.c);
                            }
                            nt ntVar2 = new nt(utVar);
                            t7Var.v = 1;
                            if (jVar.c(ntVar2, t7Var) == aVar2) {
                                return aVar2;
                            }
                        } else {
                            if (i != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj2);
                        }
                        return w61.a0.a;
                    }
                }
                t7Var = new t7(this, cVar);
                Object obj22 = t7Var.u;
                b71.a aVar22 = b71.a.r;
                i = t7Var.v;
                if (i != 0) {
                }
                return w61.a0.a;
            case 1:
                j0.g gVar = (j0.h) obj;
                s0.p0 p0Var = (s0.p0) this.t;
                x.d0 d0Var2 = (x.d0) this.s;
                if ((gVar instanceof j0.f) || (gVar instanceof j0.d) || (gVar instanceof j0.l)) {
                    d0Var2.a(gVar);
                } else if (gVar instanceof j0.g) {
                    d0Var2.j(gVar.a);
                } else if (gVar instanceof j0.e) {
                    d0Var2.j(((j0.e) gVar).a);
                } else if (gVar instanceof j0.m) {
                    d0Var2.j(((j0.m) gVar).a);
                } else if (gVar instanceof j0.k) {
                    d0Var2.j(((j0.k) gVar).a);
                }
                Object[] objArr = d0Var2.a;
                int i23 = d0Var2.b;
                int i24 = 0;
                for (int i25 = 0; i25 < i23; i25++) {
                    j0.h hVar = (j0.h) objArr[i25];
                    if (hVar instanceof j0.f) {
                        p0Var.getClass();
                        i24 |= 2;
                    } else if (hVar instanceof j0.d) {
                        p0Var.getClass();
                        i24 |= 1;
                    } else if (hVar instanceof j0.l) {
                        p0Var.getClass();
                        i24 |= 4;
                    }
                }
                p0Var.b.E(i24);
                return w61.a0.a;
            case 2:
                if (cVar instanceof t00.d) {
                    dVar = (t00.d) cVar;
                    int i26 = dVar.v;
                    if ((i26 & Integer.MIN_VALUE) != 0) {
                        dVar.v = i26 - Integer.MIN_VALUE;
                        Object obj3 = dVar.u;
                        b71.a aVar3 = b71.a.r;
                        i2 = dVar.v;
                        if (i2 != 0) {
                            sy.y.j(obj3);
                            y71.j jVar2 = (y71.j) this.s;
                            jo.d dVar3 = (jo.d) this.t;
                            dVar.v = 1;
                            if (jVar2.c(dVar3, dVar) == aVar3) {
                                return aVar3;
                            }
                        } else {
                            if (i2 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj3);
                        }
                        return w61.a0.a;
                    }
                }
                dVar = new t00.d(this, cVar);
                Object obj32 = dVar.u;
                b71.a aVar32 = b71.a.r;
                i2 = dVar.v;
                if (i2 != 0) {
                }
                return w61.a0.a;
            case 3:
                if (cVar instanceof t00.i) {
                    iVar = (t00.i) cVar;
                    int i27 = iVar.v;
                    if ((i27 & Integer.MIN_VALUE) != 0) {
                        iVar.v = i27 - Integer.MIN_VALUE;
                        Object obj4 = iVar.u;
                        b71.a aVar4 = b71.a.r;
                        i3 = iVar.v;
                        if (i3 != 0) {
                            sy.y.j(obj4);
                            y71.j jVar3 = (y71.j) this.s;
                            a60 a60Var = (a60) this.t;
                            iVar.v = 1;
                            if (jVar3.c(a60Var, iVar) == aVar4) {
                                return aVar4;
                            }
                        } else {
                            if (i3 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj4);
                        }
                        return w61.a0.a;
                    }
                }
                iVar = new t00.i(this, cVar);
                Object obj42 = iVar.u;
                b71.a aVar42 = b71.a.r;
                i3 = iVar.v;
                if (i3 != 0) {
                }
                return w61.a0.a;
            case 4:
                if (cVar instanceof t00.t) {
                    tVar = (t00.t) cVar;
                    int i28 = tVar.v;
                    if ((i28 & Integer.MIN_VALUE) != 0) {
                        tVar.v = i28 - Integer.MIN_VALUE;
                        Object obj5 = tVar.u;
                        b71.a aVar5 = b71.a.r;
                        i4 = tVar.v;
                        if (i4 != 0) {
                            sy.y.j(obj5);
                            y71.j jVar4 = (y71.j) this.s;
                            wn.bShadow bVar = ((q) this.t).u;
                            List list10 = ((jo.d4) obj).a;
                            bVar.getClass();
                            LinkedHashSet a = wn.b.a(list10);
                            tVar.v = 1;
                            if (jVar4.c(a, tVar) == aVar5) {
                                return aVar5;
                            }
                        } else {
                            if (i4 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj5);
                        }
                        return w61.a0.a;
                    }
                }
                tVar = new t00.t(this, cVar);
                Object obj52 = tVar.u;
                b71.a aVar52 = b71.a.r;
                i4 = tVar.v;
                if (i4 != 0) {
                }
                return w61.a0.a;
            case 5:
                xx xxVar3 = (xx) this.t;
                if (cVar instanceof t00.y7) {
                    y7Var = (t00.y7) cVar;
                    int i29 = y7Var.v;
                    if ((i29 & Integer.MIN_VALUE) != 0) {
                        y7Var.v = i29 - Integer.MIN_VALUE;
                        Object obj6 = y7Var.u;
                        b71.a aVar6 = b71.a.r;
                        i5 = y7Var.v;
                        if (i5 != 0) {
                            sy.y.j(obj6);
                            y71.j jVar5 = (y71.j) this.s;
                            ux uxVar = (ux) obj;
                            ArrayList S3 = (xxVar3 == null || (vxVar2 = xxVar3.d) == null || (list6 = vxVar2.c) == null) ? null : x61.m.S(list6);
                            java.util.List r9 = (java.util.List) (x61.r.r);
                            if (S3 == null) {
                                S3 = r9;
                            }
                            fy fyVar = uxVar.a;
                            ArrayList S4 = (fyVar == null || (xxVar2 = fyVar.b) == null || (vxVar = xxVar2.d) == null || (list5 = vxVar.c) == null) ? null : x61.m.S(list5);
                            if (S4 == null) {
                                S4 = r9;
                            }
                            ArrayList l02 = x61.m.l0(S3, S4);
                            ArrayList S5 = (xxVar3 == null || (yxVar2 = xxVar3.b) == null || (list4 = yxVar2.a) == null) ? null : x61.m.S(list4);
                            if (S5 == null) {
                                S5 = r9;
                            }
                            ArrayList S6 = (fyVar == null || (xxVar = fyVar.b) == null || (yxVar = xxVar.b) == null || (list3 = yxVar.a) == null) ? null : x61.m.S(list3);
                            if (S6 != null) {
                                r9 = S6;
                            }
                            ArrayList l03 = x61.m.l0(S5, r9);
                            if (fyVar != null) {
                                xx xxVar4 = fyVar.b;
                                if (xxVar4 != null) {
                                    vx vxVar3 = xxVar4.d;
                                    r6 = new xx(xxVar4.a, xxVar4.b != null ? new yx(l03) : null, xxVar4.c, vxVar3 != null ? new vx(vxVar3.a, vxVar3.b, l02) : null, xxVar4.e);
                                }
                                r6 = new fy(fyVar.a, r6, fyVar.c);
                            }
                            ux uxVar2 = new ux(r6, uxVar.b, uxVar.c);
                            y7Var.v = 1;
                            if (jVar5.c(uxVar2, y7Var) == aVar6) {
                                return aVar6;
                            }
                        } else {
                            if (i5 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj6);
                        }
                        return w61.a0.a;
                    }
                }
                y7Var = new t00.y7(this, cVar);
                Object obj62 = y7Var.u;
                b71.a aVar62 = b71.a.r;
                i5 = y7Var.v;
                if (i5 != 0) {
                }
                return w61.a0.a;
            case 6:
                if (cVar instanceof t00.y9) {
                    y9Var = (t00.y9) cVar;
                    int i30 = y9Var.v;
                    if ((i30 & Integer.MIN_VALUE) != 0) {
                        y9Var.v = i30 - Integer.MIN_VALUE;
                        Object obj7 = y9Var.u;
                        b71.a aVar7 = b71.a.r;
                        i6 = y9Var.v;
                        if (i6 != 0) {
                            sy.y.j(obj7);
                            y71.j jVar6 = (y71.j) this.s;
                            e60 e60Var = (e60) this.t;
                            y9Var.v = 1;
                            if (jVar6.c(e60Var, y9Var) == aVar7) {
                                return aVar7;
                            }
                        } else {
                            if (i6 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj7);
                        }
                        return w61.a0.a;
                    }
                }
                y9Var = new t00.y9(this, cVar);
                Object obj72 = y9Var.u;
                b71.a aVar72 = b71.a.r;
                i6 = y9Var.v;
                if (i6 != 0) {
                }
                return w61.a0.a;
            case 7:
                if (cVar instanceof t00.ca) {
                    caVar = (t00.ca) cVar;
                    int i32 = caVar.v;
                    if ((i32 & Integer.MIN_VALUE) != 0) {
                        caVar.v = i32 - Integer.MIN_VALUE;
                        Object obj8 = caVar.u;
                        b71.a aVar8 = b71.a.r;
                        i7 = caVar.v;
                        if (i7 != 0) {
                            sy.y.j(obj8);
                            y71.j jVar7 = (y71.j) this.s;
                            hd0 hd0Var = (hd0) this.t;
                            caVar.v = 1;
                            if (jVar7.c(hd0Var, caVar) == aVar8) {
                                return aVar8;
                            }
                        } else {
                            if (i7 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj8);
                        }
                        return w61.a0.a;
                    }
                }
                caVar = new t00.ca(this, cVar);
                Object obj82 = caVar.u;
                b71.a aVar82 = b71.a.r;
                i7 = caVar.v;
                if (i7 != 0) {
                }
                return w61.a0.a;
            case 8:
                if (cVar instanceof t00.ha) {
                    haVar = (t00.ha) cVar;
                    int i33 = haVar.v;
                    if ((i33 & Integer.MIN_VALUE) != 0) {
                        haVar.v = i33 - Integer.MIN_VALUE;
                        Object obj9 = haVar.u;
                        b71.a aVar9 = b71.a.r;
                        i8 = haVar.v;
                        if (i8 != 0) {
                            sy.y.j(obj9);
                            y71.j jVar8 = (y71.j) this.s;
                            ve0 ve0Var = (ve0) this.t;
                            haVar.v = 1;
                            if (jVar8.c(ve0Var, haVar) == aVar9) {
                                return aVar9;
                            }
                        } else {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj9);
                        }
                        return w61.a0.a;
                    }
                }
                haVar = new t00.ha(this, cVar);
                Object obj92 = haVar.u;
                b71.a aVar92 = b71.a.r;
                i8 = haVar.v;
                if (i8 != 0) {
                }
                return w61.a0.a;
            case 9:
                if (cVar instanceof tm.f) {
                    fVar = (tm.f) cVar;
                    int i34 = fVar.v;
                    if ((i34 & Integer.MIN_VALUE) != 0) {
                        fVar.v = i34 - Integer.MIN_VALUE;
                        Object obj10 = fVar.u;
                        b71.a aVar10 = b71.a.r;
                        i9 = fVar.v;
                        int i35 = 1;
                        if (i9 != 0) {
                            sy.y.j(obj10);
                            y71.j jVar9 = (y71.j) this.s;
                            tm.g gVar2 = (tm.g) this.t;
                            gVar2.getClass();
                            ArrayList arrayList = new ArrayList();
                            for (xj.e eVar2 : (List) obj) {
                                String str2 = eVar2.b;
                                String str3 = eVar2.c;
                                if (str2 != null) {
                                    gVar2.b.getClass();
                                    list7 = fk.c.a(str2);
                                    break;
                                }
                                list7 = x61.r.r;
                                List list11 = list7;
                                gVar2.c.getClass();
                                List v0 = x61.m.v0(list11, new bm.m(0, list11));
                                ArrayList arrayList2 = new ArrayList(x61.n.F(v0, 10));
                                Iterator it = v0.iterator();
                                while (true) {
                                    int i36 = 0;
                                    if (it.hasNext()) {
                                        com.github.domain.searchandfilter.filters.data.d dVar4 = (com.github.domain.searchandfilter.filters.data.d) it.next();
                                        String str4 = (String) x61.m.e0(t71.p.g0(dVar4.r(list11), new String[]{":"}, 6));
                                        if (str4.length() > 0) {
                                            StringBuilder sb = new StringBuilder();
                                            char charAt = str4.charAt(0);
                                            bm.l lVar2 = dVar4.r;
                                            if (lVar2 == bm.l.I || lVar2 == bm.l.r) {
                                                str = "@" + charAt;
                                            } else {
                                                String valueOf = String.valueOf(charAt);
                                                k71.k.e(valueOf, "null cannot be cast to non-null type java.lang.String");
                                                str = valueOf.toUpperCase(Locale.ROOT);
                                                k71.k.f(str, "toUpperCase(...)");
                                            }
                                            sb.append((Object) str);
                                            String substring = str4.substring(1);
                                            k71.k.f(substring, "substring(...)");
                                            sb.append(substring);
                                            str4 = sb.toString();
                                        }
                                        arrayList2.add(str4);
                                    } else {
                                        ArrayList arrayList3 = new ArrayList();
                                        int size = arrayList2.size();
                                        while (i36 < size) {
                                            Object obj11 = arrayList2.get(i36);
                                            i36++;
                                            if (((String) obj11).length() > 0) {
                                                arrayList3.add(obj11);
                                            }
                                        }
                                        String c0 = x61.m.c0(arrayList3, ", ", null, null, 0, null, 62);
                                        ShortcutConfigurationModel shortcutConfigurationModel = null;
                                        if (!list11.isEmpty() && !t71.p.T(c0) && !t71.p.T(str3)) {
                                            FilterPersistedKey.Companion companion = com.github.domain.database.serialization.b.Companion;
                                            companion.getClass();
                                            l81.bShadow bVar2 = l81.c.d;
                                            bVar2.getClass();
                                            RepositoryDiscussionsFilterPersistenceKey repositoryDiscussionsFilterPersistenceKey = (com.github.domain.database.serialization.b) bVar2.a(str3, companion.serializer());
                                            boolean z = repositoryDiscussionsFilterPersistenceKey instanceof HomeIssuesFilterPersistenceKey;
                                            if (z) {
                                                shortcutType2 = ShortcutType.ISSUE;
                                            } else if (repositoryDiscussionsFilterPersistenceKey instanceof HomeDiscussionsFilterPersistenceKey) {
                                                shortcutType2 = ShortcutType.DISCUSSION;
                                            } else if (repositoryDiscussionsFilterPersistenceKey instanceof HomePullRequestsFilterPersistenceKey) {
                                                shortcutType2 = ShortcutType.PULL_REQUEST;
                                            } else if (repositoryDiscussionsFilterPersistenceKey instanceof RepositoryDiscussionsFilterPersistenceKey) {
                                                shortcutType2 = ShortcutType.DISCUSSION;
                                            } else if (repositoryDiscussionsFilterPersistenceKey instanceof RepositoryIssuesFilterPersistenceKey) {
                                                shortcutType2 = ShortcutType.ISSUE;
                                            } else if (repositoryDiscussionsFilterPersistenceKey instanceof RepositoryPullRequestsFilterPersistenceKey) {
                                                shortcutType2 = ShortcutType.PULL_REQUEST;
                                            } else if (repositoryDiscussionsFilterPersistenceKey instanceof HomeAgentPullRequestsFilterPersistenceKey) {
                                                shortcutType2 = ShortcutType.PULL_REQUEST;
                                            } else if (repositoryDiscussionsFilterPersistenceKey instanceof RepoAgentPullRequestsFilterPersistenceKey) {
                                                shortcutType2 = ShortcutType.PULL_REQUEST;
                                            } else {
                                                if (!(repositoryDiscussionsFilterPersistenceKey instanceof NotificationsFilterPersistenceKey) && !(repositoryDiscussionsFilterPersistenceKey instanceof HomeRepositoriesFilterPersistenceKey) && !(repositoryDiscussionsFilterPersistenceKey instanceof UserOrOrgRepositoriesFilterPersistenceKey) && !(repositoryDiscussionsFilterPersistenceKey instanceof ExploreTrendingFilterPersistenceKey) && !(repositoryDiscussionsFilterPersistenceKey instanceof HomeProjectsFilterPersistenceKey) && !(repositoryDiscussionsFilterPersistenceKey instanceof UserAgentSessionsPersistenceKey)) {
                                                    throw new NoWhenBranchMatchedException();
                                                }
                                                shortcutType = null;
                                                if (shortcutType != null) {
                                                    if (z || (repositoryDiscussionsFilterPersistenceKey instanceof HomeDiscussionsFilterPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof NotificationsFilterPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof HomeRepositoriesFilterPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof ExploreTrendingFilterPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof UserOrOrgRepositoriesFilterPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof HomePullRequestsFilterPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof HomeProjectsFilterPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof UserAgentSessionsPersistenceKey) || (repositoryDiscussionsFilterPersistenceKey instanceof HomeAgentPullRequestsFilterPersistenceKey)) {
                                                        aVar = ShortcutScope$AllRepositories.INSTANCE;
                                                    } else if (repositoryDiscussionsFilterPersistenceKey instanceof RepositoryDiscussionsFilterPersistenceKey) {
                                                        RepositoryDiscussionsFilterPersistenceKey repositoryDiscussionsFilterPersistenceKey2 = repositoryDiscussionsFilterPersistenceKey;
                                                        aVar = new ShortcutScope$SpecificRepository(repositoryDiscussionsFilterPersistenceKey2.t, repositoryDiscussionsFilterPersistenceKey2.u);
                                                    } else if (repositoryDiscussionsFilterPersistenceKey instanceof RepositoryIssuesFilterPersistenceKey) {
                                                        RepositoryIssuesFilterPersistenceKey repositoryIssuesFilterPersistenceKey = (RepositoryIssuesFilterPersistenceKey) repositoryDiscussionsFilterPersistenceKey;
                                                        aVar = new ShortcutScope$SpecificRepository(repositoryIssuesFilterPersistenceKey.t, repositoryIssuesFilterPersistenceKey.u);
                                                    } else if (repositoryDiscussionsFilterPersistenceKey instanceof RepositoryPullRequestsFilterPersistenceKey) {
                                                        RepositoryPullRequestsFilterPersistenceKey repositoryPullRequestsFilterPersistenceKey = (RepositoryPullRequestsFilterPersistenceKey) repositoryDiscussionsFilterPersistenceKey;
                                                        aVar = new ShortcutScope$SpecificRepository(repositoryPullRequestsFilterPersistenceKey.t, repositoryPullRequestsFilterPersistenceKey.u);
                                                    } else {
                                                        if (!(repositoryDiscussionsFilterPersistenceKey instanceof RepoAgentPullRequestsFilterPersistenceKey)) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        RepoAgentPullRequestsFilterPersistenceKey repoAgentPullRequestsFilterPersistenceKey = (RepoAgentPullRequestsFilterPersistenceKey) repositoryDiscussionsFilterPersistenceKey;
                                                        aVar = new ShortcutScope$SpecificRepository(repoAgentPullRequestsFilterPersistenceKey.t, repoAgentPullRequestsFilterPersistenceKey.u);
                                                    }
                                                    com.github.service.models.response.shortcuts.a aVar11 = aVar;
                                                    int[] iArr = um.a.a;
                                                    int i37 = iArr[shortcutType.ordinal()];
                                                    if (i37 == 1) {
                                                        shortcutIcon = ShortcutIcon.ISSUEOPENED;
                                                    } else if (i37 == 2) {
                                                        shortcutIcon = ShortcutIcon.GITPULLREQUEST;
                                                    } else if (i37 == 3) {
                                                        shortcutIcon = ShortcutIcon.COMMENTDISCUSSION;
                                                    } else {
                                                        if (i37 != 4) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        shortcutIcon = ShortcutIcon.ISSUEOPENED;
                                                    }
                                                    ShortcutIcon shortcutIcon2 = shortcutIcon;
                                                    int i38 = iArr[shortcutType.ordinal()];
                                                    if (i38 == 1) {
                                                        shortcutColor = ShortcutColor.GREEN;
                                                    } else if (i38 == 2) {
                                                        shortcutColor = ShortcutColor.BLUE;
                                                    } else if (i38 == 3) {
                                                        shortcutColor = ShortcutColor.PURPLE;
                                                    } else {
                                                        if (i38 != 4) {
                                                            throw new NoWhenBranchMatchedException();
                                                        }
                                                        shortcutColor = ShortcutColor.GREEN;
                                                    }
                                                    shortcutConfigurationModel = new ShortcutConfigurationModel(list11, shortcutColor, shortcutIcon2, aVar11, shortcutType, c0);
                                                }
                                            }
                                            shortcutType = shortcutType2;
                                            if (shortcutType != null) {
                                            }
                                        }
                                        if (shortcutConfigurationModel != null) {
                                            arrayList.add(shortcutConfigurationModel);
                                        }
                                        i35 = 1;
                                    }
                                }
                            }
                            fVar.v = i35;
                            if (jVar9.c(arrayList, fVar) == aVar10) {
                                return aVar10;
                            }
                        } else {
                            if (i9 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj10);
                        }
                        return w61.a0.a;
                    }
                }
                fVar = new tm.f(this, cVar);
                Object obj102 = fVar.u;
                b71.a aVar102 = b71.a.r;
                i9 = fVar.v;
                int i352 = 1;
                if (i9 != 0) {
                }
                return w61.a0.a;
            case 10:
                if (cVar instanceof vb0.l) {
                    lVar = (vb0.l) cVar;
                    int i39 = lVar.v;
                    if ((i39 & Integer.MIN_VALUE) != 0) {
                        lVar.v = i39 - Integer.MIN_VALUE;
                        Object obj12 = lVar.u;
                        b71.a aVar12 = b71.a.r;
                        i10 = lVar.v;
                        if (i10 != 0) {
                            sy.y.j(obj12);
                            y71.j jVar10 = (y71.j) this.s;
                            wn.bShadow bVar3 = ((q) this.t).u;
                            List list12 = ((u10.p3) obj).a;
                            bVar3.getClass();
                            LinkedHashSet a2 = wn.b.a(list12);
                            lVar.v = 1;
                            if (jVar10.c(a2, lVar) == aVar12) {
                                return aVar12;
                            }
                        } else {
                            if (i10 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj12);
                        }
                        return w61.a0.a;
                    }
                }
                lVar = new vb0.l(this, cVar);
                Object obj122 = lVar.u;
                b71.a aVar122 = b71.a.r;
                i10 = lVar.v;
                if (i10 != 0) {
                }
                return w61.a0.a;
            case 11:
                if (cVar instanceof wy0.e) {
                    eVar = (wy0.e) cVar;
                    int i40 = eVar.v;
                    if ((i40 & Integer.MIN_VALUE) != 0) {
                        eVar.v = i40 - Integer.MIN_VALUE;
                        Object obj13 = eVar.u;
                        b71.a aVar13 = b71.a.r;
                        i12 = eVar.v;
                        if (i12 != 0) {
                            sy.y.j(obj13);
                            y71.j jVar11 = (y71.j) this.s;
                            a40 a40Var = (a40) this.t;
                            eVar.v = 1;
                            if (jVar11.c(a40Var, eVar) == aVar13) {
                                return aVar13;
                            }
                        } else {
                            if (i12 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj13);
                        }
                        return w61.a0.a;
                    }
                }
                eVar = new wy0.e(this, cVar);
                Object obj132 = eVar.u;
                b71.a aVar132 = b71.a.r;
                i12 = eVar.v;
                if (i12 != 0) {
                }
                return w61.a0.a;
            case 12:
                if (cVar instanceof wy0.o) {
                    oVar = (wy0.o) cVar;
                    int i42 = oVar.v;
                    if ((i42 & Integer.MIN_VALUE) != 0) {
                        oVar.v = i42 - Integer.MIN_VALUE;
                        Object obj14 = oVar.u;
                        b71.a aVar14 = b71.a.r;
                        i13 = oVar.v;
                        if (i13 != 0) {
                            sy.y.j(obj14);
                            y71.j jVar12 = (y71.j) this.s;
                            wn.bShadow bVar4 = ((q) this.t).u;
                            List list13 = ((jn0.v3) obj).a;
                            bVar4.getClass();
                            LinkedHashSet a3 = wn.b.a(list13);
                            oVar.v = 1;
                            if (jVar12.c(a3, oVar) == aVar14) {
                                return aVar14;
                            }
                        } else {
                            if (i13 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj14);
                        }
                        return w61.a0.a;
                    }
                }
                oVar = new wy0.o(this, cVar);
                Object obj142 = oVar.u;
                b71.a aVar142 = b71.a.r;
                i13 = oVar.v;
                if (i13 != 0) {
                }
                return w61.a0.a;
            case 13:
                if (cVar instanceof wy0.y6) {
                    y6Var = (wy0.y6) cVar;
                    int i43 = y6Var.v;
                    if ((i43 & Integer.MIN_VALUE) != 0) {
                        y6Var.v = i43 - Integer.MIN_VALUE;
                        Object obj15 = y6Var.u;
                        b71.a aVar15 = b71.a.r;
                        i14 = y6Var.v;
                        if (i14 != 0) {
                            sy.y.j(obj15);
                            y71.j jVar13 = (y71.j) this.s;
                            xv xvVar = (xv) obj;
                            aw awVar2 = (aw) this.t;
                            ew ewVar = null;
                            aw awVar3 = null;
                            ArrayList S7 = (awVar2 == null || (yvVar2 = awVar2.c) == null || (list9 = yvVar2.c) == null) ? null : x61.m.S(list9);
                            java.util.List r82 = (java.util.List) (x61.r.r);
                            if (S7 == null) {
                                S7 = r82;
                            }
                            ew ewVar2 = xvVar.a;
                            ArrayList S8 = (ewVar2 == null || (awVar = ewVar2.b) == null || (yvVar = awVar.c) == null || (list8 = yvVar.c) == null) ? null : x61.m.S(list8);
                            if (S8 != null) {
                                r82 = S8;
                            }
                            ArrayList l04 = x61.m.l0(S7, r82);
                            ew ewVar3 = xvVar.a;
                            if (ewVar3 != null) {
                                aw awVar4 = ewVar3.b;
                                if (awVar4 != null) {
                                    yv yvVar3 = awVar4.c;
                                    awVar3 = new aw(awVar4.a, awVar4.b, yvVar3 != null ? new yv(yvVar3.a, yvVar3.b, l04) : null, awVar4.d);
                                }
                                ewVar = new ew(ewVar3.a, awVar3, ewVar3.c);
                            }
                            xv xvVar2 = new xv(ewVar, xvVar.b, xvVar.c);
                            y6Var.v = 1;
                            if (jVar13.c(xvVar2, y6Var) == aVar15) {
                                return aVar15;
                            }
                        } else {
                            if (i14 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj15);
                        }
                        return w61.a0.a;
                    }
                }
                y6Var = new wy0.y6(this, cVar);
                Object obj152 = y6Var.u;
                b71.a aVar152 = b71.a.r;
                i14 = y6Var.v;
                if (i14 != 0) {
                }
                return w61.a0.a;
            case 14:
                if (cVar instanceof wy0.z8) {
                    z8Var = (wy0.z8) cVar;
                    int i44 = z8Var.v;
                    if ((i44 & Integer.MIN_VALUE) != 0) {
                        z8Var.v = i44 - Integer.MIN_VALUE;
                        Object obj16 = z8Var.u;
                        b71.a aVar16 = b71.a.r;
                        i15 = z8Var.v;
                        if (i15 != 0) {
                            sy.y.j(obj16);
                            y71.j jVar14 = (y71.j) this.s;
                            e40 e40Var = (e40) this.t;
                            z8Var.v = 1;
                            if (jVar14.c(e40Var, z8Var) == aVar16) {
                                return aVar16;
                            }
                        } else {
                            if (i15 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj16);
                        }
                        return w61.a0.a;
                    }
                }
                z8Var = new wy0.z8(this, cVar);
                Object obj162 = z8Var.u;
                b71.a aVar162 = b71.a.r;
                i15 = z8Var.v;
                if (i15 != 0) {
                }
                return w61.a0.a;
            case 15:
                if (cVar instanceof wy0.d9) {
                    d9Var = (wy0.d9) cVar;
                    int i45 = d9Var.v;
                    if ((i45 & Integer.MIN_VALUE) != 0) {
                        d9Var.v = i45 - Integer.MIN_VALUE;
                        Object obj17 = d9Var.u;
                        b71.a aVar17 = b71.a.r;
                        i16 = d9Var.v;
                        if (i16 != 0) {
                            sy.y.j(obj17);
                            y71.j jVar15 = (y71.j) this.s;
                            ta0 ta0Var = (ta0) this.t;
                            d9Var.v = 1;
                            if (jVar15.c(ta0Var, d9Var) == aVar17) {
                                return aVar17;
                            }
                        } else {
                            if (i16 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj17);
                        }
                        return w61.a0.a;
                    }
                }
                d9Var = new wy0.d9(this, cVar);
                Object obj172 = d9Var.u;
                b71.a aVar172 = b71.a.r;
                i16 = d9Var.v;
                if (i16 != 0) {
                }
                return w61.a0.a;
            case 16:
                if (cVar instanceof wy0.g9) {
                    g9Var = (wy0.g9) cVar;
                    int i46 = g9Var.v;
                    if ((i46 & Integer.MIN_VALUE) != 0) {
                        g9Var.v = i46 - Integer.MIN_VALUE;
                        Object obj18 = g9Var.u;
                        b71.a aVar18 = b71.a.r;
                        i17 = g9Var.v;
                        if (i17 != 0) {
                            sy.y.j(obj18);
                            y71.j jVar16 = (y71.j) this.s;
                            hc0 hc0Var = (hc0) this.t;
                            g9Var.v = 1;
                            if (jVar16.c(hc0Var, g9Var) == aVar18) {
                                return aVar18;
                            }
                        } else {
                            if (i17 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj18);
                        }
                        return w61.a0.a;
                    }
                }
                g9Var = new wy0.g9(this, cVar);
                Object obj182 = g9Var.u;
                b71.a aVar182 = b71.a.r;
                i17 = g9Var.v;
                if (i17 != 0) {
                }
                return w61.a0.a;
            case 17:
                if (cVar instanceof xk.d) {
                    dVar2 = (xk.d) cVar;
                    int i47 = dVar2.v;
                    if ((i47 & Integer.MIN_VALUE) != 0) {
                        dVar2.v = i47 - Integer.MIN_VALUE;
                        Object obj19 = dVar2.u;
                        b71.a aVar19 = b71.a.r;
                        i18 = dVar2.v;
                        if (i18 != 0) {
                            sy.y.j(obj19);
                            y71.j jVar17 = (y71.j) this.s;
                            List<uj.c> list14 = (List) obj;
                            ((xk.e) this.t).getClass();
                            ArrayList arrayList4 = new ArrayList(x61.n.F(list14, 10));
                            for (uj.c cVar2 : list14) {
                                arrayList4.add(new g01.d(cVar2.a, cVar2.b));
                            }
                            dVar2.v = 1;
                            if (jVar17.c(arrayList4, dVar2) == aVar19) {
                                return aVar19;
                            }
                        } else {
                            if (i18 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj19);
                        }
                        return w61.a0.a;
                    }
                }
                dVar2 = new xk.d(this, cVar);
                Object obj192 = dVar2.u;
                b71.a aVar192 = b71.a.r;
                i18 = dVar2.v;
                if (i18 != 0) {
                }
                return w61.a0.a;
            case 18:
                if (cVar instanceof y71.d0) {
                    d0Var = (y71.d0) cVar;
                    int i48 = d0Var.w;
                    if ((i48 & Integer.MIN_VALUE) != 0) {
                        d0Var.w = i48 - Integer.MIN_VALUE;
                        Object obj20 = d0Var.u;
                        b71.a aVar20 = b71.a.r;
                        i19 = d0Var.w;
                        w61.a0 a0Var = w61.a0.a;
                        if (i19 != 0) {
                            sy.y.j(obj20);
                            k71.u uVar = (k71.u) this.t;
                            int i49 = uVar.r;
                            if (i49 >= 1) {
                                y71.j jVar18 = (y71.j) this.s;
                                d0Var.w = 1;
                                if (jVar18.c(obj, d0Var) == aVar20) {
                                    return aVar20;
                                }
                            } else {
                                uVar.r = i49 + 1;
                            }
                        } else {
                            if (i19 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj20);
                        }
                        return a0Var;
                    }
                }
                d0Var = new y71.d0(this, cVar);
                Object obj202 = d0Var.u;
                b71.a aVar202 = b71.a.r;
                i19 = d0Var.w;
                w61.a0 a0Var2 = w61.a0.a;
                if (i19 != 0) {
                }
                return a0Var2;
            case 19:
                if (cVar instanceof y71.y0) {
                    y0Var = (y71.y0) cVar;
                    int i50 = y0Var.v;
                    if ((i50 & Integer.MIN_VALUE) != 0) {
                        y0Var.v = i50 - Integer.MIN_VALUE;
                        Object obj21 = y0Var.u;
                        b71.a aVar21 = b71.a.r;
                        i20 = y0Var.v;
                        if (i20 != 0) {
                            sy.y.j(obj21);
                            y71.j jVar19 = (y71.j) this.s;
                            if (((k71.e) this.t).d(obj)) {
                                y0Var.v = 1;
                                if (jVar19.c(obj, y0Var) == aVar21) {
                                    return aVar21;
                                }
                            }
                        } else {
                            if (i20 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj21);
                        }
                        return w61.a0.a;
                    }
                }
                y0Var = new y71.y0(this, cVar);
                Object obj212 = y0Var.u;
                b71.a aVar212 = b71.a.r;
                i20 = y0Var.v;
                if (i20 != 0) {
                }
                return w61.a0.a;
            case 20:
                k71.w wVar = (k71.w) this.s;
                Map map = (Map) wVar.r;
                wVar.r = x61.s.r;
                Object l = ((x71.t) this.t).u.l(cVar, x61.m.F0(map.values()));
                return l == b71.a.r ? l : w61.a0.a;
            default:
                ((z8.f) this.s).d((d9.q) this.t, (z8.c) obj);
                return w61.a0.a;
        }
    }

    public u7(k71.u uVar, y71.j jVar) {
        this.r = 18;
        this.t = uVar;
        this.s = jVar;
    }
}
