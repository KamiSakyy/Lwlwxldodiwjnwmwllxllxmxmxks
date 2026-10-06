package com.github.rudroid.widget.contribution;

import android.content.Context;
import android.net.NetworkRequest;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import b6.q0;
import com.github.rudroid.widget.WidgetUIState;
import com.github.rudroid.widget.contribution.ContributionWidgetSettingsActivity;
import com.google.android.gms.internal.measurement.b4;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import v8.z;
import w61.a0;
import y71.n1;
import yz0.d8;
import z01.r1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ContributionWidgetWorker extends CoroutineWorker {
    public static final a Companion = new a();
    public static final v8.f j;
    public Context g;
    public oa.m h;
    public hl.c i;

    public static final class a {
        public static void a(Context context) {
            k71.k.g(context, "context");
            w8.q Z = w8.q.Z(context);
            k71.k.f(Z, "getInstance(...)");
            Z.s("ContributionWidgetWorker", v8.n.s, new z(ContributionWidgetWorker.class).e(ContributionWidgetWorker.j).d(v8.a.r, 10000L, TimeUnit.MILLISECONDS).a());
        }
    }

    static {
        v8.y yVar = v8.y.r;
        j = new v8.f(new e9.i((NetworkRequest) null), v8.y.s, false, false, false, false, -1L, -1L, x61.m.K0(new LinkedHashSet()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContributionWidgetWorker(Context context, WorkerParameters workerParameters, oa.m mVar, hl.c cVar) {
        super(context, workerParameters);
        k71.k.g(context, "context");
        k71.k.g(workerParameters, "workerParameters");
        k71.k.g(mVar, "userManager");
        k71.k.g(cVar, "fetchUserContributionsUseCase");
        this.g = context;
        this.h = mVar;
        this.i = cVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|91|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x01e3, code lost:
    
        if (e(r4, r0, r2) == r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x020e, code lost:
    
        if (e(r4, r5, r2) == r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x009a, code lost:
    
        if (r0 == r3) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x004d, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0184 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:19:0x0048, B:20:0x01bb, B:27:0x0180, B:29:0x0184, B:32:0x0125, B:34:0x012b, B:37:0x013b, B:42:0x0197, B:45:0x0193, B:61:0x0117, B:66:0x0081, B:67:0x00b5, B:68:0x00be, B:70:0x00c4, B:73:0x00f1, B:78:0x00f5, B:80:0x00fb, B:85:0x00a1), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012b A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:19:0x0048, B:20:0x01bb, B:27:0x0180, B:29:0x0184, B:32:0x0125, B:34:0x012b, B:37:0x013b, B:42:0x0197, B:45:0x0193, B:61:0x0117, B:66:0x0081, B:67:0x00b5, B:68:0x00be, B:70:0x00c4, B:73:0x00f1, B:78:0x00f5, B:80:0x00fb, B:85:0x00a1), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0197 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:19:0x0048, B:20:0x01bb, B:27:0x0180, B:29:0x0184, B:32:0x0125, B:34:0x012b, B:37:0x013b, B:42:0x0197, B:45:0x0193, B:61:0x0117, B:66:0x0081, B:67:0x00b5, B:68:0x00be, B:70:0x00c4, B:73:0x00f1, B:78:0x00f5, B:80:0x00fb, B:85:0x00a1), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0193 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:19:0x0048, B:20:0x01bb, B:27:0x0180, B:29:0x0184, B:32:0x0125, B:34:0x012b, B:37:0x013b, B:42:0x0197, B:45:0x0193, B:61:0x0117, B:66:0x0081, B:67:0x00b5, B:68:0x00be, B:70:0x00c4, B:73:0x00f1, B:78:0x00f5, B:80:0x00fb, B:85:0x00a1), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c4 A[Catch: all -> 0x004d, TryCatch #1 {all -> 0x004d, blocks: (B:19:0x0048, B:20:0x01bb, B:27:0x0180, B:29:0x0184, B:32:0x0125, B:34:0x012b, B:37:0x013b, B:42:0x0197, B:45:0x0193, B:61:0x0117, B:66:0x0081, B:67:0x00b5, B:68:0x00be, B:70:0x00c4, B:73:0x00f1, B:78:0x00f5, B:80:0x00fb, B:85:0x00a1), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00fb A[Catch: all -> 0x004d, TRY_LEAVE, TryCatch #1 {all -> 0x004d, blocks: (B:19:0x0048, B:20:0x01bb, B:27:0x0180, B:29:0x0184, B:32:0x0125, B:34:0x012b, B:37:0x013b, B:42:0x0197, B:45:0x0193, B:61:0x0117, B:66:0x0081, B:67:0x00b5, B:68:0x00be, B:70:0x00c4, B:73:0x00f1, B:78:0x00f5, B:80:0x00fb, B:85:0x00a1), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r11v9, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r17v0, types: [com.github.rudroid.widget.contribution.ContributionWidgetWorker, v8.w] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v23 */
    /* JADX WARN: Type inference failed for: r4v24 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0139 -> B:30:0x0191). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x0178 -> B:26:0x0180). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(a71.c cVar) {
        s sVar;
        java.util.List r4;
        List<z5.k> list;
        LinkedHashSet linkedHashSet;
        List list2;
        LinkedHashSet linkedHashSet2;
        List list3;
        int i;
        Iterator it;
        ArrayList arrayList;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList2;
        Iterator it2;
        String str;
        w61.k kVar;
        List list4;
        if (cVar instanceof s) {
            sVar = (s) cVar;
            int i5 = sVar.E;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                sVar.E = i5 - Integer.MIN_VALUE;
                Object obj = sVar.C;
                Object obj2 = b71.a.r;
                r4 = sVar.E;
                Context context = this.g;
                x61.s sVar2 = x61.s.r;
                switch (r4) {
                    case 0:
                        sy.y.j(obj);
                        q0 q0Var = new q0(context);
                        sVar.E = 1;
                        obj = q0Var.c(f.class, sVar);
                        break;
                    case 1:
                        sy.y.j(obj);
                        List list5 = (List) obj;
                        ContributionWidgetModel contributionWidgetModel = new ContributionWidgetModel(sVar2, WidgetUIState.Loading.INSTANCE);
                        sVar.u = list5;
                        sVar.E = 2;
                        Object e = e(list5, contributionWidgetModel, sVar);
                        list = list5;
                        if (e == obj2) {
                            return obj2;
                        }
                        linkedHashSet = new LinkedHashSet();
                        for (z5.k kVar2 : list) {
                            ContributionWidgetSettingsActivity.Companion.getClass();
                            k71.k.g(context, "context");
                            k71.k.g(kVar2, "glanceId");
                            String string = ContributionWidgetSettingsActivity.a.a(context).getString("selected_contribution_user" + kVar2, null);
                            if (string != null) {
                                linkedHashSet.add(string);
                            }
                        }
                        list3 = list;
                        if (linkedHashSet.isEmpty()) {
                            ContributionWidgetModel contributionWidgetModel2 = new ContributionWidgetModel(sVar2, WidgetUIState.SignedOut.INSTANCE);
                            sVar.u = list;
                            sVar.v = linkedHashSet;
                            sVar.E = 3;
                            if (e(list, contributionWidgetModel2, sVar) != obj2) {
                                list2 = list;
                                linkedHashSet2 = linkedHashSet;
                                v8.i iVar = v8.i.b;
                                linkedHashSet = linkedHashSet2;
                                list3 = list2;
                            }
                            return obj2;
                        }
                        ArrayList arrayList3 = new ArrayList();
                        i = 0;
                        it = linkedHashSet.iterator();
                        arrayList = arrayList3;
                        i2 = 0;
                        i3 = 0;
                        if (!it.hasNext()) {
                            ContributionWidgetModel contributionWidgetModel3 = new ContributionWidgetModel(x61.x.A(arrayList), WidgetUIState.Loaded.INSTANCE);
                            sVar.getClass();
                            sVar.u = list3;
                            sVar.v = null;
                            sVar.w = null;
                            sVar.x = null;
                            sVar.y = null;
                            sVar.E = 5;
                            Object e2 = e(list3, contributionWidgetModel3, sVar);
                            r4 = list3;
                            if (e2 == obj2) {
                            }
                            return v8.v.a();
                        }
                        String str2 = (String) it.next();
                        oa.j h = this.h.h(str2);
                        if (h == null) {
                            kVar = null;
                            list3 = list3;
                            if (kVar != null) {
                                arrayList.add(kVar);
                            }
                            if (!it.hasNext()) {
                            }
                        } else {
                            hl.c cVar2 = this.i;
                            com.github.rudroid.utilities.ui.emojipicker.e eVar = new com.github.rudroid.utilities.ui.emojipicker.e(11);
                            cVar2.getClass();
                            y71.y J = b31.b.J(((r1) cVar2.a.a(h)).g(), h, eVar);
                            sVar.getClass();
                            sVar.u = list3;
                            sVar.v = null;
                            sVar.w = arrayList;
                            sVar.x = it;
                            sVar.y = str2;
                            sVar.z = i2;
                            sVar.A = i3;
                            sVar.B = i;
                            sVar.E = 4;
                            Object v = n1.v(J, sVar);
                            if (v != obj2) {
                                i4 = i2;
                                obj = v;
                                arrayList2 = arrayList;
                                it2 = it;
                                str = str2;
                                list4 = list3;
                                d8 d8Var = (d8) obj;
                                kVar = d8Var == null ? new w61.k(str, d8Var.a) : null;
                                i2 = i4;
                                it = it2;
                                arrayList = arrayList2;
                                list3 = list4;
                                if (kVar != null) {
                                }
                                if (!it.hasNext()) {
                                }
                            }
                        }
                        return obj2;
                    case 2:
                        List list6 = sVar.u;
                        sy.y.j(obj);
                        list = list6;
                        linkedHashSet = new LinkedHashSet();
                        while (r8.hasNext()) {
                        }
                        list3 = list;
                        if (linkedHashSet.isEmpty()) {
                        }
                        ArrayList arrayList32 = new ArrayList();
                        i = 0;
                        it = linkedHashSet.iterator();
                        arrayList = arrayList32;
                        i2 = 0;
                        i3 = 0;
                        if (!it.hasNext()) {
                        }
                        return obj2;
                    case 3:
                        linkedHashSet2 = sVar.v;
                        list2 = sVar.u;
                        try {
                            sy.y.j(obj);
                            v8.i iVar2 = v8.i.b;
                            linkedHashSet = linkedHashSet2;
                            list3 = list2;
                            ArrayList arrayList322 = new ArrayList();
                            i = 0;
                            it = linkedHashSet.iterator();
                            arrayList = arrayList322;
                            i2 = 0;
                            i3 = 0;
                            if (!it.hasNext()) {
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            r4 = list2;
                            if (((v8.w) this).b.c >= 10) {
                                ContributionWidgetModel contributionWidgetModel4 = new ContributionWidgetModel(sVar2, WidgetUIState.Retrying.INSTANCE);
                                sVar.getClass();
                                sVar.u = null;
                                sVar.v = null;
                                sVar.w = null;
                                sVar.x = null;
                                sVar.y = null;
                                sVar.E = 6;
                                break;
                            } else {
                                ContributionWidgetModel contributionWidgetModel5 = new ContributionWidgetModel(sVar2, new WidgetUIState.Error(th.getMessage()));
                                sVar.getClass();
                                sVar.u = null;
                                sVar.v = null;
                                sVar.w = null;
                                sVar.x = null;
                                sVar.y = null;
                                sVar.E = 7;
                                break;
                            }
                            return obj2;
                        }
                        return obj2;
                    case 4:
                        int i6 = sVar.B;
                        i3 = sVar.A;
                        int i7 = sVar.z;
                        String str3 = sVar.y;
                        Iterator it3 = sVar.x;
                        Collection collection = sVar.w;
                        List list7 = sVar.u;
                        try {
                            sy.y.j(obj);
                            i = i6;
                            list4 = list7;
                            arrayList2 = collection;
                            it2 = it3;
                            str = str3;
                            i4 = i7;
                            d8 d8Var2 = (d8) obj;
                            if (d8Var2 == null) {
                            }
                            i2 = i4;
                            it = it2;
                            arrayList = arrayList2;
                            list3 = list4;
                            if (kVar != null) {
                            }
                            if (!it.hasNext()) {
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            r4 = list7;
                            if (((v8.w) this).b.c >= 10) {
                            }
                            return obj2;
                        }
                        return obj2;
                    case 5:
                        List list8 = sVar.u;
                        sy.y.j(obj);
                        r4 = list8;
                        return v8.v.a();
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
        sVar = new s(this, (c71.c) cVar);
        Object obj3 = sVar.C;
        Object obj22 = b71.a.r;
        r4 = sVar.E;
        Context context2 = this.g;
        x61.s sVar22 = x61.s.r;
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
    public final Object e(List list, ContributionWidgetModel contributionWidgetModel, c71.c cVar) {
        t tVar;
        int i;
        Iterator it;
        int i2;
        ContributionWidgetModel contributionWidgetModel2;
        boolean hasNext;
        if (cVar instanceof t) {
            tVar = (t) cVar;
            int i3 = tVar.z;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                tVar.z = i3 - Integer.MIN_VALUE;
                Object obj = tVar.x;
                b71.a aVar = b71.a.r;
                i = tVar.z;
                if (i != 0) {
                    sy.y.j(obj);
                    it = list.iterator();
                    i2 = 0;
                    contributionWidgetModel2 = contributionWidgetModel;
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sy.y.j(obj);
                        return a0.a;
                    }
                    i2 = tVar.w;
                    it = tVar.v;
                    ContributionWidgetModel contributionWidgetModel3 = tVar.u;
                    sy.y.j(obj);
                    contributionWidgetModel2 = contributionWidgetModel3;
                }
                while (true) {
                    hasNext = it.hasNext();
                    Context context = this.g;
                    if (hasNext) {
                        f fVar = new f();
                        tVar.u = null;
                        tVar.v = null;
                        tVar.z = 2;
                    } else {
                        z5.k kVar = (z5.k) it.next();
                        l lVar = l.a;
                        u uVar = new u(contributionWidgetModel2, null);
                        tVar.u = contributionWidgetModel2;
                        tVar.v = it;
                        tVar.w = i2;
                        tVar.z = 1;
                        if (b4.t0(context, lVar, kVar, uVar, tVar) == aVar) {
                            break;
                        }
                    }
                }
                return aVar;
            }
        }
        tVar = new t(this, cVar);
        Object obj2 = tVar.x;
        b71.a aVar2 = b71.a.r;
        i = tVar.z;
        if (i != 0) {
        }
        while (true) {
            hasNext = it.hasNext();
            Context context2 = this.g;
            if (hasNext) {
            }
        }
        return aVar2;
    }
}
