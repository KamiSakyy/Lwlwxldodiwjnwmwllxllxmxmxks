package com.github.rudroid.widget.pullrequests;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.NetworkRequest;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b6.q0;
import com.github.rudroid.widget.WidgetUIState;
import com.github.rudroid.widget.pullrequests.PullRequestsWidgetSettingsActivity;
import com.github.service.models.response.PullRequestWidgetData;
import com.github.service.models.response.PullsWidgetFilter;
import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import v8.v;
import v8.w;
import v8.y;
import v8.z;
import w61.a0;
import x61.x;
import y71.n1Shadow;
import z01.r1;
import zk.a1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class PullRequestsWidgetWorker extends CoroutineWorker {
    public static final a Companion = new a();
    public static final v8.f j;
    public Context g;
    public oa.m h;
    public a1 i;

    public static final class a {
        public static void a(Context context) {
            k71.k.g(context, "context");
            w8.q Z = w8.q.Z(context);
            k71.k.f(Z, "getInstance(...)");
            Z.s("PullRequestsWidgetWorker", v8.n.s, new z(PullRequestsWidgetWorker.class).e(PullRequestsWidgetWorker.j).d(v8.a.r, 10000L, TimeUnit.MILLISECONDS).a());
        }
    }

    static {
        y yVar = y.r;
        j = new v8.f(new e9.i((NetworkRequest) null), y.s, false, false, false, false, -1L, -1L, x61.m.K0(new LinkedHashSet()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PullRequestsWidgetWorker(Context context, WorkerParameters workerParameters, oa.m mVar, a1 a1Var) {
        super(context, workerParameters);
        k71.k.g(context, "context");
        k71.k.g(workerParameters, "workerParameters");
        k71.k.g(mVar, "userManager");
        k71.k.g(a1Var, "pullRequestsWidgetDataUseCase");
        this.g = context;
        this.h = mVar;
        this.i = a1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|104|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00ac, code lost:
    
        if (r0 == r3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0050, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0221, code lost:
    
        if (e(r4, r0, r2) == r3) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0251, code lost:
    
        if (e(r4, r5, r2) == r3) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01c5 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x004b, B:20:0x01f5, B:27:0x01b8, B:31:0x01c5, B:33:0x014a, B:35:0x0150, B:38:0x015f, B:40:0x0169, B:41:0x016b, B:46:0x01cc, B:49:0x01be, B:63:0x0139, B:64:0x013b, B:72:0x00d2, B:73:0x00e0, B:75:0x00e6, B:78:0x00f7, B:80:0x010e, B:82:0x0116, B:85:0x0114, B:88:0x011a, B:90:0x0120, B:98:0x00bc), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0150 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x004b, B:20:0x01f5, B:27:0x01b8, B:31:0x01c5, B:33:0x014a, B:35:0x0150, B:38:0x015f, B:40:0x0169, B:41:0x016b, B:46:0x01cc, B:49:0x01be, B:63:0x0139, B:64:0x013b, B:72:0x00d2, B:73:0x00e0, B:75:0x00e6, B:78:0x00f7, B:80:0x010e, B:82:0x0116, B:85:0x0114, B:88:0x011a, B:90:0x0120, B:98:0x00bc), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01cc A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x004b, B:20:0x01f5, B:27:0x01b8, B:31:0x01c5, B:33:0x014a, B:35:0x0150, B:38:0x015f, B:40:0x0169, B:41:0x016b, B:46:0x01cc, B:49:0x01be, B:63:0x0139, B:64:0x013b, B:72:0x00d2, B:73:0x00e0, B:75:0x00e6, B:78:0x00f7, B:80:0x010e, B:82:0x0116, B:85:0x0114, B:88:0x011a, B:90:0x0120, B:98:0x00bc), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x004b, B:20:0x01f5, B:27:0x01b8, B:31:0x01c5, B:33:0x014a, B:35:0x0150, B:38:0x015f, B:40:0x0169, B:41:0x016b, B:46:0x01cc, B:49:0x01be, B:63:0x0139, B:64:0x013b, B:72:0x00d2, B:73:0x00e0, B:75:0x00e6, B:78:0x00f7, B:80:0x010e, B:82:0x0116, B:85:0x0114, B:88:0x011a, B:90:0x0120, B:98:0x00bc), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e6 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x004b, B:20:0x01f5, B:27:0x01b8, B:31:0x01c5, B:33:0x014a, B:35:0x0150, B:38:0x015f, B:40:0x0169, B:41:0x016b, B:46:0x01cc, B:49:0x01be, B:63:0x0139, B:64:0x013b, B:72:0x00d2, B:73:0x00e0, B:75:0x00e6, B:78:0x00f7, B:80:0x010e, B:82:0x0116, B:85:0x0114, B:88:0x011a, B:90:0x0120, B:98:0x00bc), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0120 A[Catch: all -> 0x0050, TryCatch #0 {all -> 0x0050, blocks: (B:19:0x004b, B:20:0x01f5, B:27:0x01b8, B:31:0x01c5, B:33:0x014a, B:35:0x0150, B:38:0x015f, B:40:0x0169, B:41:0x016b, B:46:0x01cc, B:49:0x01be, B:63:0x0139, B:64:0x013b, B:72:0x00d2, B:73:0x00e0, B:75:0x00e6, B:78:0x00f7, B:80:0x010e, B:82:0x0116, B:85:0x0114, B:88:0x011a, B:90:0x0120, B:98:0x00bc), top: B:7:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.github.rudroid.widget.pullrequests.PullRequestsWidgetWorker, v8.w] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x015e -> B:29:0x01c3). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:44:0x01b3 -> B:26:0x01b8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        k kVar;
        java.util.List r4;
        SharedPreferences b;
        List<z5.k> list;
        LinkedHashSet linkedHashSet;
        LinkedHashMap linkedHashMap;
        PullsWidgetFilter pullsWidgetFilter;
        List list2;
        int i;
        Collection arrayList;
        Iterator it;
        Map map;
        int i2;
        int i3;
        List list3;
        List list4;
        String str;
        List list5;
        List list6;
        PullRequestWidgetData pullRequestWidgetData;
        if (cVar instanceof k) {
            kVar = (k) cVar;
            int i4 = kVar.G;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                kVar.G = i4 - Integer.MIN_VALUE;
                Object obj = kVar.E;
                Object obj2 = b71.a.r;
                r4 = kVar.G;
                Context context = this.g;
                w61.k kVar2 = null;
                switch (r4) {
                    case 0:
                        sy.y.j(obj);
                        q0 q0Var = new q0(context);
                        kVar.G = 1;
                        obj = q0Var.c(c.class, kVar);
                        break;
                    case 1:
                        sy.y.j(obj);
                        List list7 = (List) obj;
                        PullRequestsWidgetSettingsActivity.Companion.getClass();
                        b = PullRequestsWidgetSettingsActivity.a.b(context);
                        PullRequestsWidgetModel pullRequestsWidgetModel = new PullRequestsWidgetModel(null, WidgetUIState.Loading.INSTANCE);
                        kVar.u = list7;
                        kVar.v = b;
                        kVar.G = 2;
                        Object e = e(list7, pullRequestsWidgetModel, kVar);
                        list = list7;
                        if (e == obj2) {
                            return obj2;
                        }
                        linkedHashSet = new LinkedHashSet();
                        linkedHashMap = new LinkedHashMap();
                        for (z5.k kVar3 : list) {
                            PullRequestsWidgetSettingsActivity.Companion.getClass();
                            String a2 = PullRequestsWidgetSettingsActivity.a.a(b, kVar3);
                            if (a2 != null) {
                                linkedHashSet.add(a2);
                                String string = b.getString("selected_pulls_filter" + kVar3, null);
                                if (string == null || (pullsWidgetFilter = PullsWidgetFilter.valueOf(string)) == null) {
                                    pullsWidgetFilter = PullsWidgetFilter.CREATED;
                                }
                                linkedHashMap.put(a2, pullsWidgetFilter);
                            }
                        }
                        list2 = list;
                        if (linkedHashSet.isEmpty()) {
                            PullRequestsWidgetModel pullRequestsWidgetModel2 = new PullRequestsWidgetModel(null, WidgetUIState.SignedOut.INSTANCE);
                            kVar.u = list;
                            kVar.v = null;
                            kVar.w = linkedHashSet;
                            kVar.x = linkedHashMap;
                            kVar.G = 3;
                            Object e2 = e(list, pullRequestsWidgetModel2, kVar);
                            list3 = list;
                            if (e2 == obj2) {
                                return obj2;
                            }
                            v8.i iVar = v8.i.b;
                            list2 = list3;
                        }
                        i = 0;
                        arrayList = new ArrayList();
                        it = linkedHashSet.iterator();
                        map = linkedHashMap;
                        i2 = 0;
                        i3 = 0;
                        list4 = list2;
                        if (!it.hasNext()) {
                            PullRequestsWidgetModel pullRequestsWidgetModel3 = new PullRequestsWidgetModel(x.A((List) arrayList), WidgetUIState.Loaded.INSTANCE);
                            kVar.getClass();
                            kVar.u = list4;
                            kVar.v = null;
                            kVar.w = null;
                            kVar.x = null;
                            kVar.y = null;
                            kVar.z = null;
                            kVar.A = null;
                            kVar.G = 5;
                            Object e3 = e(list4, pullRequestsWidgetModel3, kVar);
                            r4 = list4;
                            if (e3 == obj2) {
                            }
                            return v.a();
                        }
                        String str2 = (String) it.next();
                        oa.j h = this.h.h(str2);
                        if (h == null) {
                            list5 = list4;
                            if (kVar2 != null) {
                                arrayList.add(kVar2);
                            }
                            kVar2 = null;
                            list4 = list5;
                            if (!it.hasNext()) {
                            }
                        } else {
                            a1 a1Var = this.i;
                            PullsWidgetFilter pullsWidgetFilter2 = (PullsWidgetFilter) map.get(str2);
                            if (pullsWidgetFilter2 == null) {
                                pullsWidgetFilter2 = PullsWidgetFilter.REVIEW_REQUESTED;
                            }
                            com.github.rudroid.utilities.ui.emojipicker.e eVar = new com.github.rudroid.utilities.ui.emojipicker.e(12);
                            a1Var.getClass();
                            k71.k.g(pullsWidgetFilter2, "pullsWidgetFilter");
                            y71.y J = b31.b.J(((r1) a1Var.a.a(h)).u(pullsWidgetFilter2), h, eVar);
                            kVar.getClass();
                            kVar.u = list4;
                            kVar.v = null;
                            kVar.w = null;
                            kVar.x = map;
                            kVar.y = arrayList;
                            kVar.z = it;
                            kVar.A = str2;
                            kVar.B = i3;
                            kVar.C = i2;
                            kVar.D = i;
                            kVar.G = 4;
                            Object v = n1Shadow.v(J, kVar);
                            if (v != obj2) {
                                str = str2;
                                obj = v;
                                list6 = list4;
                                pullRequestWidgetData = (PullRequestWidgetData) obj;
                                if (pullRequestWidgetData != null) {
                                    kVar2 = null;
                                    list5 = list6;
                                } else {
                                    kVar2 = new w61.k(str, pullRequestWidgetData);
                                    list5 = list6;
                                }
                                if (kVar2 != null) {
                                }
                                kVar2 = null;
                                list4 = list5;
                                if (!it.hasNext()) {
                                }
                            }
                        }
                        return obj2;
                    case 2:
                        SharedPreferences sharedPreferences = kVar.v;
                        List list8 = kVar.u;
                        try {
                            sy.y.j(obj);
                            b = sharedPreferences;
                            list = list8;
                            linkedHashSet = new LinkedHashSet();
                            linkedHashMap = new LinkedHashMap();
                            while (r9.hasNext()) {
                            }
                            list2 = list;
                            if (linkedHashSet.isEmpty()) {
                            }
                            i = 0;
                            arrayList = new ArrayList();
                            it = linkedHashSet.iterator();
                            map = linkedHashMap;
                            i2 = 0;
                            i3 = 0;
                            list4 = list2;
                            if (!it.hasNext()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = list8;
                            if (((w) this).b.c < 3) {
                                PullRequestsWidgetModel pullRequestsWidgetModel4 = new PullRequestsWidgetModel(null, WidgetUIState.Retrying.INSTANCE);
                                kVar.getClass();
                                kVar.u = null;
                                kVar.v = null;
                                kVar.w = null;
                                kVar.x = null;
                                kVar.y = null;
                                kVar.z = null;
                                kVar.A = null;
                                kVar.G = 6;
                                break;
                            } else {
                                PullRequestsWidgetModel pullRequestsWidgetModel5 = new PullRequestsWidgetModel(null, new WidgetUIState.Error(th.getMessage()));
                                kVar.getClass();
                                kVar.u = null;
                                kVar.v = null;
                                kVar.w = null;
                                kVar.x = null;
                                kVar.y = null;
                                kVar.z = null;
                                kVar.A = null;
                                kVar.G = 7;
                                break;
                            }
                            return obj2;
                        }
                        return obj2;
                    case 3:
                        Map map2 = kVar.x;
                        linkedHashSet = kVar.w;
                        List list9 = kVar.u;
                        try {
                            sy.y.j(obj);
                            linkedHashMap = map2;
                            list3 = list9;
                            v8.i iVar2 = v8.i.b;
                            list2 = list3;
                            i = 0;
                            arrayList = new ArrayList();
                            it = linkedHashSet.iterator();
                            map = linkedHashMap;
                            i2 = 0;
                            i3 = 0;
                            list4 = list2;
                            if (!it.hasNext()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = list9;
                            if (((w) this).b.c < 3) {
                            }
                            return obj2;
                        }
                        return obj2;
                    case 4:
                        int i5 = kVar.D;
                        i2 = kVar.C;
                        i3 = kVar.B;
                        String str3 = kVar.A;
                        it = kVar.z;
                        arrayList = kVar.y;
                        map = kVar.x;
                        List list10 = kVar.u;
                        try {
                            sy.y.j(obj);
                            str = str3;
                            i = i5;
                            list6 = list10;
                            pullRequestWidgetData = (PullRequestWidgetData) obj;
                            if (pullRequestWidgetData != null) {
                            }
                            if (kVar2 != null) {
                            }
                            kVar2 = null;
                            list4 = list5;
                            if (!it.hasNext()) {
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            r4 = list10;
                            if (((w) this).b.c < 3) {
                            }
                            return obj2;
                        }
                        return obj2;
                    case 5:
                        Map map3 = kVar.x;
                        List list11 = kVar.u;
                        sy.y.j(obj);
                        r4 = list11;
                        return v.a();
                    case 6:
                        sy.y.j(obj);
                        return new v8.t();
                    case 7:
                        sy.y.j(obj);
                        return new v8.s();
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        kVar = new k(this, (c71.c) cVar);
        Object obj3 = kVar.E;
        Object obj22 = b71.a.r;
        r4 = kVar.G;
        Context context2 = this.g;
        w61.k kVar22 = null;
        switch (r4) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007d, code lost:
    
        if (v8.l0.S(r11, r5, r0) == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(List list, PullRequestsWidgetModel pullRequestsWidgetModel, c71.c cVar) {
        l lVar;
        int i;
        Iterator it;
        int i2;
        PullRequestsWidgetModel pullRequestsWidgetModel2;
        boolean hasNext;
        if (cVar instanceof l) {
            lVar = (l) cVar;
            int i3 = lVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                lVar.z = i3 - Integer.MIN_VALUE;
                Object obj = lVar.x;
                b71.a aVar = b71.a.r;
                i = lVar.z;
                if (i != 0) {
                    sy.y.j(obj);
                    it = list.iterator();
                    i2 = 0;
                    pullRequestsWidgetModel2 = pullRequestsWidgetModel;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0.a;
                    }
                    i2 = lVar.w;
                    it = lVar.v;
                    PullRequestsWidgetModel pullRequestsWidgetModel3 = lVar.u;
                    sy.y.j(obj);
                    pullRequestsWidgetModel2 = pullRequestsWidgetModel3;
                }
                while (true) {
                    hasNext = it.hasNext();
                    Context context = this.g;
                    if (hasNext) {
                        c cVar2 = new c();
                        lVar.u = null;
                        lVar.v = null;
                        lVar.z = 2;
                    } else {
                        z5.k kVar = (z5.k) it.next();
                        com.github.rudroid.widget.pullrequests.a aVar2 = com.github.rudroid.widget.pullrequests.a.a;
                        m mVar = new m(pullRequestsWidgetModel2, null);
                        lVar.u = pullRequestsWidgetModel2;
                        lVar.v = it;
                        lVar.w = i2;
                        lVar.z = 1;
                        if (b4.t0(context, aVar2, kVar, mVar, lVar) == aVar) {
                            break;
                        }
                    }
                }
                return aVar;
            }
        }
        lVar = new l(this, cVar);
        Object obj2 = lVar.x;
        b71.a aVar3 = b71.a.r;
        i = lVar.z;
        if (i != 0) {
        }
        while (true) {
            hasNext = it.hasNext();
            Context context2 = this.g;
            if (hasNext) {
            }
        }
        return aVar3;
    }
}
