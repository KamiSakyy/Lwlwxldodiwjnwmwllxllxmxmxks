package com.github.rudroid.utilities.ui.emojipicker;

import aa.t0;
import aa.v0;
import android.content.res.Resources;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.viewmodels.k7;
import com.github.rudroid.widget.contribution.ContributionWidgetWorker;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker;
import com.google.android.gms.internal.measurement.z3;
import d1.k1;
import d1.z0;
import f00.x0;
import fa1.q0;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
import q81.c0;
import retrofit2.HttpException;
import w61.a0;
import y41.t1;
import yz0.h4;

/* loaded from: /home/user/work/p/classes3.dex */
public final /* synthetic */ class e implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ e(int i) {
        this.r = i;
    }

    public final Object k(Object obj) {
        ey.o oVar;
        ey.q qVar;
        ey.r rVar;
        List list;
        ey.o oVar2;
        ey.q qVar2;
        ey.r rVar2;
        ey.o oVar3;
        ey.q qVar3;
        ey.r rVar3;
        ey.o oVar4;
        ey.q qVar4;
        ey.r rVar4;
        ArrayList arrayList;
        boolean z;
        tz0.c cVar;
        String str;
        String str2;
        ZonedDateTime zonedDateTime;
        boolean z2;
        String str3;
        String str4;
        String str5;
        String str6;
        uw.b bVar;
        String str7;
        uw.a aVar;
        c0 c0Var;
        int i = this.r;
        ArrayList arrayList2 = x61.r.r;
        boolean z3 = true;
        a0 a0Var = a0.a;
        switch (i) {
            case 0:
                k71.k.g((n0.u) obj, "$this$item");
                return new n0.d(z3.d(n0.u.b));
            case 1:
                List<h4> list2 = (List) obj;
                k71.k.g(list2, "savedReplies");
                ArrayList arrayList3 = new ArrayList(x61.n.F(list2, 10));
                for (h4 h4Var : list2) {
                    arrayList3.add(new k7.a.b(h4Var.a, h4Var.b));
                }
                return arrayList3;
            case 2:
                k71.k.g((fl.b) obj, "it");
                return a0Var;
            case 3:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 4:
                k71.k.g((fl.b) obj, "it");
                return a0Var;
            case 5:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 6:
                k71.k.g((oa.j) obj, "it");
                return g1.a.c(g1.Companion);
            case 7:
                Objects.toString((fl.b) obj);
                return a0Var;
            case 8:
                k71.k.g((fl.b) obj, "it");
                return a0Var;
            case 9:
                k71.k.g((fl.b) obj, "it");
                return a0Var;
            case 10:
                k71.k.g((fl.b) obj, "it");
                return a0Var;
            case 11:
                fl.b bVar2 = (fl.b) obj;
                ContributionWidgetWorker.a aVar2 = ContributionWidgetWorker.Companion;
                k71.k.g(bVar2, "executionError");
                throw bVar2.f;
            case 12:
                fl.b bVar3 = (fl.b) obj;
                PullRequestsWidgetWorker.a aVar3 = PullRequestsWidgetWorker.Companion;
                k71.k.g(bVar3, "executionError");
                throw bVar3.f;
            case 13:
                k71.k.g((fl.b) obj, "it");
                return a0Var;
            case 14:
                k71.k.g((v0) obj, "<this>");
                return Boolean.TRUE;
            case 15:
                k71.k.g((v0) obj, "<this>");
                return Boolean.TRUE;
            case 16:
                String str8 = (String) obj;
                k71.k.g(str8, "pullRequestId");
                return new ey.u(str8, t0.d);
            case 17:
                ey.l lVar = (ey.l) obj;
                k71.k.g(lVar, "data");
                ey.n nVar = lVar.a;
                return Boolean.valueOf((nVar == null || (oVar = nVar.c) == null || (qVar = oVar.b) == null || (rVar = qVar.b) == null || (list = rVar.b) == null) ? false : !list.isEmpty());
            case 18:
                ey.l lVar2 = (ey.l) obj;
                k71.k.g(lVar2, "data");
                ey.n nVar2 = lVar2.a;
                if (nVar2 == null || (oVar2 = nVar2.c) == null || (qVar2 = oVar2.b) == null || (rVar2 = qVar2.b) == null) {
                    return null;
                }
                xx.a aVar4 = rVar2.a.b;
                return new x01.i(aVar4.a, aVar4.b, !aVar4.c);
            case 19:
                ey.l lVar3 = (ey.l) obj;
                k71.k.g(lVar3, "data");
                ey.n nVar3 = lVar3.a;
                List list3 = (nVar3 == null || (oVar3 = nVar3.c) == null || (qVar3 = oVar3.b) == null || (rVar3 = qVar3.b) == null) ? null : rVar3.b;
                return list3 == null ? arrayList2 : list3;
            case 20:
                ey.l lVar4 = (ey.l) obj;
                k71.k.g(lVar4, "data");
                ey.n nVar4 = lVar4.a;
                if (nVar4 == null || (oVar4 = nVar4.c) == null || (qVar4 = oVar4.b) == null || (rVar4 = qVar4.b) == null) {
                    return null;
                }
                List<ey.m> list4 = rVar4.b;
                if (list4 != null) {
                    ArrayList arrayList4 = new ArrayList();
                    for (ey.m mVar : list4) {
                        if (mVar != null) {
                            uw.d dVar = mVar.c;
                            String str9 = dVar.a;
                            String str10 = dVar.b;
                            Integer valueOf = Integer.valueOf(dVar.c);
                            ZonedDateTime zonedDateTime2 = dVar.d;
                            boolean z4 = dVar.e;
                            String str11 = dVar.f;
                            tz0.d Q = t1.Q(dVar.g);
                            String str12 = dVar.h;
                            z = z3;
                            String str13 = dVar.i;
                            String str14 = dVar.j;
                            uw.c cVar2 = dVar.k;
                            if (cVar2 != null && (aVar = cVar2.b) != null) {
                                str7 = aVar.a;
                            } else if (cVar2 == null || (bVar = cVar2.c) == null) {
                                str = str14;
                                str2 = str10;
                                zonedDateTime = zonedDateTime2;
                                z2 = z4;
                                str3 = str11;
                                str4 = str12;
                                str5 = str13;
                                str6 = null;
                                cVar = new tz0.c(str9, str2, valueOf, zonedDateTime, z2, str3, Q, str4, str5, str, str6);
                            } else {
                                str7 = bVar.a;
                            }
                            str6 = str7;
                            str = str14;
                            str2 = str10;
                            zonedDateTime = zonedDateTime2;
                            z2 = z4;
                            str3 = str11;
                            str4 = str12;
                            str5 = str13;
                            cVar = new tz0.c(str9, str2, valueOf, zonedDateTime, z2, str3, Q, str4, str5, str, str6);
                        } else {
                            z = z3;
                            cVar = null;
                        }
                        if (cVar != null) {
                            arrayList4.add(cVar);
                        }
                        z3 = z;
                    }
                    arrayList = arrayList4;
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    arrayList2 = arrayList;
                }
                ArrayList arrayList5 = qVar4.a.a;
                ArrayList arrayList6 = new ArrayList(x61.n.F(arrayList5, 10));
                int size = arrayList5.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList5.get(i2);
                    i2++;
                    ey.t tVar = (ey.t) obj2;
                    arrayList6.add(new tz0.a(t1.Q(tVar.b), tVar.a));
                }
                xx.a aVar5 = rVar4.a.b;
                return new tz0.e(arrayList2, arrayList6, new x01.i(aVar5.a, aVar5.b, !aVar5.c));
            case 21:
                d00.u uVar = (d00.u) obj;
                k71.k.g(uVar, "$this$mapOrApiFailure");
                return uVar;
            case 22:
                x0 x0Var = (x0) obj;
                k71.k.g(x0Var, "$this$mapOrApiFailure");
                return b31.b.h(x0Var);
            case 23:
                l81.f fVar = (l81.f) obj;
                k71.k.g(fVar, "$this$Json");
                fVar.c = true;
                return a0Var;
            case 24:
                Resources resources = (Resources) obj;
                k71.k.g(resources, "resources");
                return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
            case 25:
                c2.b bVar4 = (c2.b) obj;
                long j = bVar4.a;
                return (9223372034707292159L & j) != 9205357640488583168L ? new a0.r(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (bVar4.a & 4294967295L))) : z0.a;
            case 26:
                a0.r rVar5 = (a0.r) obj;
                return new c2.b((Float.floatToRawIntBits(rVar5.a) << 32) | (Float.floatToRawIntBits(rVar5.b) & 4294967295L));
            case 27:
                return new k1(((Long) obj).longValue());
            case 28:
                HttpException httpException = (HttpException) obj;
                k71.k.g(httpException, "exception");
                try {
                    q0 q0Var = httpException.t;
                    String t = (q0Var == null || (c0Var = q0Var.c) == null) ? null : c0Var.t();
                    if (t != null) {
                        String optString = new JSONObject(t).optString("message");
                        if (optString.length() != 0) {
                            return optString;
                        }
                    }
                } catch (Exception unused) {
                }
                return null;
            default:
                v7.a aVar6 = (v7.a) obj;
                k71.k.g(aVar6, "_connection");
                v7.c F0 = aVar6.F0("SELECT DISTINCT work_spec_id FROM SystemIdInfo");
                try {
                    ArrayList arrayList7 = new ArrayList();
                    while (F0.B0()) {
                        arrayList7.add(F0.l0(0));
                    }
                    return arrayList7;
                } finally {
                    F0.close();
                }
        }
    }

    public /* synthetic */ e(k7 k7Var) {
        this.r = 1;
    }
}
