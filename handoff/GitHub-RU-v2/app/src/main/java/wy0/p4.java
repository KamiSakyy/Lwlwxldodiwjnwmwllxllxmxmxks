package wy0;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.github.rudroid.agents.sessionevents.SessionEventsFragment;
import com.github.rudroid.agents.sessionevents.navigation.SessionEventsRoute;
import com.github.rudroid.explore.ExploreTrendingFragment;
import com.github.rudroid.feed.FeedFragment;
import com.github.rudroid.feed.awesometopics.AwesomeListsFragment;
import com.github.rudroid.feed.filter.FeedFilterFragment;
import com.github.rudroid.feed.navigation.ExploreAwesomeListsRoute;
import com.github.rudroid.feed.navigation.ExploreScreenRoute;
import com.github.rudroid.feed.navigation.ExploreTrendingReposRoute;
import com.github.rudroid.feed.navigation.FeedFilterRoute;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import jn0.o10;
import pz0.gu;

/* loaded from: /home/user/work/p/classes4.dex */
public final /* synthetic */ class p4 implements j71.c {
    public final /* synthetic */ int r;

    public /* synthetic */ p4(int i) {
        this.r = i;
    }

    @Override // j71.c
    public final Object k(Object obj) {
        wx0.b bVar;
        List list;
        jn0.q3 q3Var;
        switch (this.r) {
            case 0:
                wx0.c cVar = (wx0.c) obj;
                if (cVar == null || (bVar = cVar.b) == null) {
                    return null;
                }
                return bVar.b;
            case 1:
                ux0.s0 s0Var = (ux0.s0) obj;
                k71.k.g(s0Var, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(s0Var.a != null);
            case 2:
                xt0.u3 u3Var = (xt0.u3) obj;
                k71.k.g(u3Var, "state");
                return xt0.u3.a(u3Var, gu.u);
            case 3:
                xt0.u3 u3Var2 = (xt0.u3) obj;
                k71.k.g(u3Var2, "state");
                return xt0.u3.a(u3Var2, gu.t);
            case 4:
                xt0.g4 g4Var = (xt0.g4) obj;
                k71.k.g(g4Var, "fragment");
                String str = g4Var.a;
                String str2 = g4Var.c;
                k71.k.g(str, "id");
                k71.k.g(str2, "__typename");
                return new xt0.g4(str, str2, false);
            case 5:
                py0.b bVar2 = (py0.b) obj;
                k71.k.g(bVar2, "it");
                py0.c cVar2 = bVar2.a;
                return Boolean.valueOf(((cVar2 != null ? Boolean.valueOf(cVar2.b) : null) == null || cVar2.b) ? false : true);
            case 6:
                o10 o10Var = (o10) obj;
                k71.k.g(o10Var, "$this$observeWithPartialResultErrors");
                return Boolean.valueOf(o10Var.a != null);
            case 7:
                return Integer.valueOf(((Integer) obj).intValue() + 1);
            case 8:
                return Integer.valueOf(((Integer) obj).intValue() - 1);
            case 9:
                k71.k.g((s01.n) obj, "it");
                return new jn0.t3(aa.t0.d);
            case 10:
                jn0.o3 o3Var = (jn0.o3) obj;
                k71.k.g(o3Var, "data");
                jn0.r3Shadow r3Var = o3Var.a.b;
                return Boolean.valueOf((r3Var == null || (list = r3Var.b) == null) ? false : !list.isEmpty());
            case 11:
                jn0.o3 o3Var2 = (jn0.o3) obj;
                k71.k.g(o3Var2, "data");
                jn0.r3Shadow r3Var2 = o3Var2.a.b;
                if (r3Var2 == null || (q3Var = r3Var2.a) == null) {
                    return null;
                }
                return new x01.i(q3Var.c, q3Var.a, !q3Var.b);
            case 12:
                jn0.o3 o3Var3 = (jn0.o3) obj;
                k71.k.g(o3Var3, "data");
                jn0.r3Shadow r3Var3 = o3Var3.a.b;
                List list2 = r3Var3 != null ? r3Var3.b : null;
                return list2 == null ? x61.rShadow.r : list2;
            case 13:
                jn0.o3 o3Var4 = (jn0.o3) obj;
                k71.k.g(o3Var4, "data");
                jn0.r3Shadow r3Var4 = o3Var4.a.b;
                List list3 = r3Var4 != null ? r3Var4.b : null;
                if (list3 == null) {
                    list3 = x61.rShadow.r;
                }
                ArrayList S = x61.m.S(list3);
                ArrayList arrayList = new ArrayList(x61.n.F(S, 10));
                int size = S.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = S.get(i);
                    i++;
                    jn0.p3 p3Var = (jn0.p3) obj2;
                    arrayList.add(new yz0.h4(p3Var.b, p3Var.c));
                }
                jn0.q3 q3Var2 = r3Var4 != null ? r3Var4.a : null;
                return new yz0.i4(arrayList, q3Var2 != null ? new x01.i(q3Var2.c, q3Var2.a, !q3Var2.b) : new x01.i(null, false, true));
            case 14:
                Context context = (Context) obj;
                k71.k.g(context, "it");
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            case 15:
                Context context2 = (Context) obj;
                k71.k.g(context2, "it");
                if (context2 instanceof ContextWrapper) {
                    return ((ContextWrapper) context2).getBaseContext();
                }
                return null;
            case 16:
                k71.k.g((t6.c) obj, "$this$initializer");
                return new x6.p();
            case 17:
                Context context3 = (Context) obj;
                k71.k.g(context3, "it");
                ContextWrapper contextWrapper = context3 instanceof ContextWrapper ? (ContextWrapper) context3 : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 18:
                Context context4 = (Context) obj;
                k71.k.g(context4, "it");
                if (context4 instanceof Activity) {
                    return (Activity) context4;
                }
                return null;
            case 19:
                x6.w wVar = (x6.w) obj;
                k71.k.g(wVar, "it");
                return wVar.t;
            case 20:
                x6.x xVar = (x6.w) obj;
                k71.k.g(xVar, "it");
                if (!(xVar instanceof x6Shadow.x)) {
                    return null;
                }
                a7.q qVar = xVar.x;
                return qVar.t(qVar.b);
            case 21:
                View view = (View) obj;
                k71.k.g(view, "it");
                Object parent = view.getParent();
                if (parent instanceof View) {
                    return (View) parent;
                }
                return null;
            case 22:
                View view2 = (View) obj;
                k71.k.g(view2, "it");
                Object tag = view2.getTag(2131363075);
                if (tag instanceof WeakReference) {
                    return (x6.a0) ((WeakReference) tag).get();
                }
                if (tag instanceof x6Shadow.a0) {
                    return (x6.a0) tag;
                }
                return null;
            case 23:
                x6.e0 e0Var = (x6.e0) obj;
                k71.k.g(e0Var, "$this$navOptions");
                e0Var.b = true;
                return w61.a0.a;
            case 24:
                l81.f fVar = (l81.f) obj;
                k71.k.g(fVar, "$this$Json");
                fVar.c = true;
                return w61.a0.a;
            case 25:
                x6.y yVar = (x6.y) obj;
                k71.k.g(yVar, "$this$navigation");
                x6.p0 p0Var = yVar.g;
                z6.e r = com.github.rudroid.m0.r(p0Var, z6.e.class);
                k71.e a = k71.xShadow.a(ExploreScreenRoute.class);
                k71.e a2 = k71.xShadow.a(FeedFragment.class);
                x61.s sVar = x61.s.r;
                z6.i iVar = new z6.i(r, a, sVar, a2);
                ArrayList arrayList2 = yVar.j;
                arrayList2.add(iVar.a());
                arrayList2.add(new z6.i(p0Var.b(sy.w.r(z6.e.class)), k71.xShadow.a(ExploreAwesomeListsRoute.class), sVar, k71.xShadow.a(AwesomeListsFragment.class)).a());
                arrayList2.add(new z6.i(p0Var.b(sy.w.r(z6.e.class)), k71.xShadow.a(ExploreTrendingReposRoute.class), sVar, k71.xShadow.a(ExploreTrendingFragment.class)).a());
                arrayList2.add(new z6.i(p0Var.b(sy.w.r(z6.e.class)), k71.xShadow.a(FeedFilterRoute.class), sVar, k71.xShadow.a(FeedFilterFragment.class)).a());
                gf.a.a(yVar);
                ze.b.a(yVar);
                rf.g.a(yVar);
                oc.b.a(yVar);
                ee.b.a(yVar);
                arrayList2.add(new z6.i(p0Var.b(sy.w.r(z6.e.class)), k71.xShadow.a(SessionEventsRoute.class), sVar, k71.xShadow.a(SessionEventsFragment.class)).a());
                return w61.a0.a;
            case 26:
                k71.k.g((String) obj, "it");
                return w61.a0.a;
            case 27:
                v7.a aVar = (v7.a) obj;
                k71.k.g(aVar, "_connection");
                v7.c F0 = aVar.F0("SELECT * FROM filter_bars ORDER BY\n                CASE WHEN ? = 1 THEN timestamp END ASC,\n                CASE WHEN ? = 0 THEN timestamp END DESC");
                long j = 0;
                try {
                    F0.c(1, j);
                    F0.c(2, j);
                    int o = y9.a.o(F0, "id");
                    int o2 = y9.a.o(F0, "filter");
                    int o3 = y9.a.o(F0, "metadata");
                    int o4 = y9.a.o(F0, "timestamp");
                    ArrayList arrayList3 = new ArrayList();
                    while (F0.B0()) {
                        arrayList3.add(new xj.e(F0.getLong(o4), F0.l0(o), F0.isNull(o2) ? null : F0.l0(o2), F0.l0(o3)));
                    }
                    return arrayList3;
                } finally {
                    F0.close();
                }
            case 28:
                wl0.a aVar2 = (wl0.a) obj;
                k71.k.g(aVar2, "it");
                return aVar2.d;
            default:
                wl0.a aVar3 = (wl0.a) obj;
                k71.k.g(aVar3, "it");
                return Boolean.valueOf(k71.k.b(aVar3.h, Boolean.FALSE));
        }
    }
}
