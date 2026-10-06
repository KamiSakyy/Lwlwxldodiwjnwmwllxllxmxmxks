package sw0;

import aa.q;
import aa.t0;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ResolveInfo;
import cq.o0;
import cq.p0;
import cq.q0;
import cq.u2;
import gv.q4;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import jn0.k20;
import jn0.m20;
import jn0.n20;
import jn0.o20;
import jn0.p20;
import jn0.r20;
import jn0.s20;
import jn0.t20;
import jn0.u20;
import jo.ad;
import jo.b4;
import jo.bd;
import jo.h2;
import jo.iw;
import jo.j2;
import jo.jw;
import jo.k2;
import jo.kw;
import jo.o30;
import jo.w3;
import jo.y3;
import jo.z3;
import k71.k;
import m10.b00;
import m10.fd;
import m10.nd;
import m7.y;
import p01.m;
import rz.a1;
import rz.s0;
import rz.u;
import rz.v;
import rz.w;
import rz.xShadow;
import rz.x0;
import rz.y0;
import ur0.o;
import x01.i;
import x61.n;
import x61.rShadow;
import yz0.e4;
import zx.h;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class e implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ e(int i) {
        this.r = i;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        m20 m20Var;
        p20 p20Var;
        s20 s20Var;
        String str;
        String str2;
        u2 u2Var;
        y0 y0Var;
        u2 u2Var2;
        boolean z;
        v vVar;
        w wVar;
        tz.c cVar;
        List list;
        tz.b bVar;
        tz.b bVar2;
        tz.b bVar3;
        tz.b bVar4;
        List list2;
        y3 y3Var;
        switch (this.r) {
            case 0:
                k20 k20Var = (k20) obj;
                k.g(k20Var, "data");
                List list3 = k20Var.b.c;
                return list3 == null ? rShadow.r : list3;
            case 1:
                k20 k20Var2 = (k20) obj;
                k.g(k20Var2, "data");
                u20 u20Var = k20Var2.b;
                t20 t20Var = k20Var2.a;
                String str3 = t20Var != null ? t20Var.b : null;
                List<o20> list4 = (t20Var == null || (s20Var = t20Var.e) == null) ? null : s20Var.a;
                List<n20> list5 = rShadow.r;
                if (list4 == null) {
                    list4 = list5;
                }
                ArrayList arrayList = new ArrayList();
                for (o20 o20Var : list4) {
                    o oVar = o20Var != null ? o20Var.a.c : null;
                    if (oVar != null) {
                        arrayList.add(oVar);
                    }
                }
                ArrayList arrayList2 = new ArrayList(n.F(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    arrayList2.add(a.a.A((o) obj2));
                }
                List list6 = u20Var.c;
                if (list6 != null) {
                    list5 = list6;
                }
                ArrayList arrayList3 = new ArrayList();
                for (n20 n20Var : list5) {
                    o oVar2 = (n20Var == null || (p20Var = n20Var.b) == null) ? null : p20Var.c;
                    if (oVar2 != null) {
                        arrayList3.add(oVar2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(n.F(arrayList3, 10));
                int size2 = arrayList3.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj3 = arrayList3.get(i2);
                    i2++;
                    arrayList4.add(a.a.A((o) obj3));
                }
                m mVar = new m(arrayList2, arrayList4, ((t20Var == null || (m20Var = t20Var.d) == null) ? 0 : m20Var.a) > 0);
                r20 r20Var = u20Var.b;
                boolean z2 = r20Var.a;
                String str4 = r20Var.b;
                return new e4(str3, mVar, new i(str4, z2, str4 == null));
            case 2:
                Context context = (Context) obj;
                List<ResolveInfo> queryIntentActivities = context.getPackageManager().queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0);
                ArrayList arrayList5 = new ArrayList(queryIntentActivities.size());
                int size3 = queryIntentActivities.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    ResolveInfo resolveInfo = queryIntentActivities.get(i3);
                    ResolveInfo resolveInfo2 = resolveInfo;
                    if (!context.getPackageName().equals(resolveInfo2.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo2.activityInfo;
                        if (activityInfo.exported) {
                            String str5 = activityInfo.permission;
                            if (str5 != null && context.checkSelfPermission(str5) != 0) {
                            }
                        }
                    }
                    arrayList5.add(resolveInfo);
                }
                return arrayList5;
            case 3:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 4:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 5:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 6:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 7:
                q0 q0Var = (q0) obj;
                k.g(q0Var, "it");
                o0 o0Var = q0Var.b;
                if (o0Var != null) {
                    fd.Companion.getClass();
                    str = ((q) fd.l).a;
                } else {
                    nd.Companion.getClass();
                    str = ((q) nd.c).a;
                }
                o0 a = o0Var != null ? o0.a(o0Var, o0Var.b + 1, true) : null;
                p0 p0Var = q0Var.c;
                return new j2(new h2(new k2(str, q0.a(q0Var, a, p0Var != null ? p0.a(p0Var, p0Var.b + 1, true) : null))));
            case 8:
                q0 q0Var2 = (q0) obj;
                k.g(q0Var2, "it");
                o0 o0Var2 = q0Var2.b;
                if (o0Var2 != null) {
                    fd.Companion.getClass();
                    str2 = ((q) fd.l).a;
                } else {
                    nd.Companion.getClass();
                    str2 = ((q) nd.c).a;
                }
                o0 a2 = o0Var2 != null ? o0.a(o0Var2, o0Var2.b - 1, false) : null;
                p0 p0Var2 = q0Var2.c;
                return new iw(new jw(new kw(str2, q0.a(q0Var2, a2, p0Var2 != null ? p0.a(p0Var2, p0Var2.b - 1, false) : null))));
            case 9:
                h hVar = (h) obj;
                k.g(hVar, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(hVar.b != null);
            case 10:
                ad adVar = (ad) obj;
                k.g(adVar, "$this$fetchWithPartialResultErrors");
                bd bdVar = adVar.a;
                return Boolean.valueOf((bdVar != null ? bdVar.a : null) != null);
            case 11:
                x0 x0Var = (x0) obj;
                k.g(x0Var, "data");
                a1 a1Var = x0Var.a;
                if (a1Var == null || (u2Var = a1Var.c) == null) {
                    return null;
                }
                return y.P(u2Var);
            case 12:
                x0 x0Var2 = (x0) obj;
                k.g(x0Var2, "$this$fetchWithPartialResultErrors");
                a1 a1Var2 = x0Var2.a;
                return Boolean.valueOf(((a1Var2 == null || (y0Var = a1Var2.b) == null) ? null : y0Var.b) != null);
            case 13:
                u uVar = (u) obj;
                k.g(uVar, "data");
                xShadow xVar = uVar.a;
                if (xVar == null || (u2Var2 = xVar.d) == null) {
                    return null;
                }
                return y.P(u2Var2);
            case 14:
                u uVar2 = (u) obj;
                k.g(uVar2, "$this$observeWithPartialResultErrors");
                xShadow xVar2 = uVar2.a;
                if (xVar2 != null && (vVar = xVar2.c) != null && (wVar = vVar.b) != null && (cVar = wVar.b) != null && (list = cVar.a) != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (((tz.a) it.next()) != null) {
                            z = true;
                            return Boolean.valueOf(z);
                        }
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 15:
                tz.c cVar2 = (tz.c) obj;
                if (cVar2 == null || (bVar = cVar2.b) == null) {
                    return null;
                }
                return Boolean.valueOf(bVar.a);
            case 16:
                tz.c cVar3 = (tz.c) obj;
                if (cVar3 == null || (bVar2 = cVar3.b) == null) {
                    return null;
                }
                return bVar2.b;
            case 17:
                tz.c cVar4 = (tz.c) obj;
                if (cVar4 == null || (bVar3 = cVar4.b) == null) {
                    return null;
                }
                return Boolean.valueOf(bVar3.a);
            case 18:
                tz.c cVar5 = (tz.c) obj;
                if (cVar5 == null || (bVar4 = cVar5.b) == null) {
                    return null;
                }
                return bVar4.b;
            case 19:
                s0 s0Var = (s0) obj;
                k.g(s0Var, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(s0Var.a != null);
            case 20:
                gv.e4 e4Var = (gv.e4) obj;
                k.g(e4Var, "state");
                return gv.e4.a(e4Var, b00.u);
            case 21:
                q4 q4Var = (q4) obj;
                k.g(q4Var, "fragment");
                String str6 = q4Var.a;
                String str7 = q4Var.c;
                k.g(str6, "id");
                k.g(str7, "__typename");
                return new q4(str6, str7, false);
            case 22:
                gv.e4 e4Var2 = (gv.e4) obj;
                k.g(e4Var2, "state");
                return gv.e4.a(e4Var2, b00.t);
            case 23:
                m00.b bVar5 = (m00.b) obj;
                k.g(bVar5, "it");
                m00.c cVar6 = bVar5.a;
                return Boolean.valueOf(((cVar6 != null ? Boolean.valueOf(cVar6.b) : null) == null || cVar6.b) ? false : true);
            case 24:
                o30 o30Var = (o30) obj;
                k.g(o30Var, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(o30Var.a != null);
            case 25:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 26:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 27:
                k.g((s01.n) obj, "it");
                return new b4(t0.d);
            case 28:
                w3 w3Var = (w3) obj;
                k.g(w3Var, "data");
                z3 z3Var = w3Var.a.b;
                return Boolean.valueOf((z3Var == null || (list2 = z3Var.b) == null) ? false : !list2.isEmpty());
            default:
                w3 w3Var2 = (w3) obj;
                k.g(w3Var2, "data");
                z3 z3Var2 = w3Var2.a.b;
                if (z3Var2 == null || (y3Var = z3Var2.a) == null) {
                    return null;
                }
                return new i(y3Var.c, y3Var.a, !y3Var.b);
        }
    }
    public static Object z(Object p1, Object p2, Object p3) { return null; }
}
