package com.github.rudroid.widget.contribution;

import android.content.Context;
import android.content.SharedPreferences;
import androidx.lifecycle.d1;
import b6.q0;
import com.github.rudroid.widget.WidgetUIState;
import com.github.rudroid.widget.contribution.ContributionWidgetWorker;
import com.google.android.gms.internal.measurement.b4;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ContributionWidgetSettingsActivity extends com.github.rudroid.widget.f {
    public static final a Companion = new a();

    public static final class a {
        public static SharedPreferences a(Context context) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("ContributionWidgetSettingActivity", 0);
            k71.k.f(sharedPreferences, "getSharedPreferences(...)");
            return sharedPreferences;
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x00d6  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0148  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00a1  */
        /* JADX WARN: Removed duplicated region for block: B:50:0x006b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0148 -> B:12:0x014a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object b(Context context, oa.j jVar, q0 q0Var, c71.c cVar) {
            n nVar;
            int i;
            SharedPreferences a;
            Context context2;
            oa.j jVar2;
            Iterator it;
            int i2;
            Context context3;
            SharedPreferences sharedPreferences;
            oa.j jVar3;
            z5.k kVar;
            Iterator it2;
            int i3;
            int i4;
            f fVar;
            if (cVar instanceof n) {
                nVar = (n) cVar;
                int i5 = nVar.D;
                if ((i5 & Integer.MIN_VALUE) != 0) {
                    nVar.D = i5 - Integer.MIN_VALUE;
                    Object obj = nVar.B;
                    Serializable serializable = b71.a.r;
                    i = nVar.D;
                    if (i != 0) {
                        sy.y.j(obj);
                        a = a(context);
                        nVar.u = context;
                        nVar.v = jVar;
                        nVar.w = a;
                        nVar.D = 1;
                        Serializable c = q0Var.c(f.class, nVar);
                        if (c != serializable) {
                            context2 = context;
                            obj = c;
                            jVar2 = jVar;
                        }
                        return serializable;
                    }
                    if (i != 1) {
                        if (i == 2) {
                            int i6 = nVar.A;
                            int i7 = nVar.z;
                            kVar = nVar.y;
                            Iterator it3 = nVar.x;
                            sharedPreferences = nVar.w;
                            oa.j jVar4 = nVar.v;
                            context3 = nVar.u;
                            sy.y.j(obj);
                            i4 = i6;
                            i3 = i7;
                            it2 = it3;
                            jVar3 = jVar4;
                            fVar = new f();
                            nVar.u = context3;
                            nVar.v = jVar3;
                            nVar.w = sharedPreferences;
                            nVar.x = it2;
                            nVar.y = null;
                            nVar.z = i3;
                            nVar.A = i4;
                            nVar.D = 3;
                            if (fVar.k0(context3, kVar, nVar) != serializable) {
                            }
                            return serializable;
                        }
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i3 = nVar.z;
                        it2 = nVar.x;
                        SharedPreferences sharedPreferences2 = nVar.w;
                        jVar3 = nVar.v;
                        Context context4 = nVar.u;
                        sy.y.j(obj);
                        it = it2;
                        jVar2 = jVar3;
                        i2 = i3;
                        a = sharedPreferences2;
                        context2 = context4;
                        while (it.hasNext()) {
                            w61.k kVar2 = (w61.k) it.next();
                            String str = (String) kVar2.r;
                            z5.k kVar3 = (z5.k) kVar2.s;
                            if (k71.k.b(str, jVar2.a)) {
                                ContributionWidgetSettingsActivity.Companion.getClass();
                                SharedPreferences.Editor edit = a.edit();
                                edit.remove("selected_contribution_user" + kVar3);
                                edit.apply();
                                l lVar = l.a;
                                o oVar = new o(2, null);
                                nVar.u = context2;
                                nVar.v = jVar2;
                                nVar.w = a;
                                nVar.x = it;
                                nVar.y = kVar3;
                                nVar.z = i2;
                                nVar.A = 0;
                                nVar.D = 2;
                                if (b4.t0(context2, lVar, kVar3, oVar, nVar) != serializable) {
                                    context3 = context2;
                                    kVar = kVar3;
                                    sharedPreferences = a;
                                    i3 = i2;
                                    jVar3 = jVar2;
                                    it2 = it;
                                    i4 = 0;
                                    fVar = new f();
                                    nVar.u = context3;
                                    nVar.v = jVar3;
                                    nVar.w = sharedPreferences;
                                    nVar.x = it2;
                                    nVar.y = null;
                                    nVar.z = i3;
                                    nVar.A = i4;
                                    nVar.D = 3;
                                    if (fVar.k0(context3, kVar, nVar) != serializable) {
                                        sharedPreferences2 = sharedPreferences;
                                        context4 = context3;
                                        it = it2;
                                        jVar2 = jVar3;
                                        i2 = i3;
                                        a = sharedPreferences2;
                                        context2 = context4;
                                        while (it.hasNext()) {
                                        }
                                    }
                                }
                                return serializable;
                            }
                        }
                        return a0.a;
                    }
                    a = nVar.w;
                    jVar2 = nVar.v;
                    context2 = nVar.u;
                    sy.y.j(obj);
                    ArrayList arrayList = new ArrayList();
                    for (z5.k kVar4 : (List) obj) {
                        ContributionWidgetSettingsActivity.Companion.getClass();
                        String string = a.getString("selected_contribution_user" + kVar4, null);
                        w61.k kVar5 = string == null ? null : new w61.k(string, kVar4);
                        if (kVar5 != null) {
                            arrayList.add(kVar5);
                        }
                    }
                    it = arrayList.iterator();
                    i2 = 0;
                    while (it.hasNext()) {
                    }
                    return a0.a;
                }
            }
            nVar = new n(this, cVar);
            Object obj2 = nVar.B;
            Serializable serializable2 = b71.a.r;
            i = nVar.D;
            if (i != 0) {
            }
            ArrayList arrayList2 = new ArrayList();
            while (r0.hasNext()) {
            }
            it = arrayList2.iterator();
            i2 = 0;
            while (it.hasNext()) {
            }
            return a0.a;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a7, code lost:
    
        if (v8.l0.S(r9, r5, r0) == r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005a, code lost:
    
        if (r9 == r11) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object v0(ContributionWidgetSettingsActivity contributionWidgetSettingsActivity, Context context, c71.c cVar) {
        q qVar;
        int i;
        Context context2;
        int i2;
        ContributionWidgetModel contributionWidgetModel;
        Iterator it;
        if (cVar instanceof q) {
            qVar = (q) cVar;
            int i3 = qVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                qVar.A = i3 - Integer.MIN_VALUE;
                Object obj = qVar.y;
                Object obj2 = b71.a.r;
                i = qVar.A;
                if (i != 0) {
                    sy.y.j(obj);
                    q0 q0Var = new q0(context);
                    qVar.u = context;
                    qVar.A = 1;
                    obj = q0Var.c(f.class, qVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            sy.y.j(obj);
                            return a0.a;
                        }
                        i2 = qVar.x;
                        it = qVar.w;
                        contributionWidgetModel = qVar.v;
                        context2 = qVar.u;
                        sy.y.j(obj);
                        while (true) {
                            if (it.hasNext()) {
                                z5.k kVar = (z5.k) it.next();
                                l lVar = l.a;
                                r rVar = new r(contributionWidgetModel, null);
                                qVar.u = context2;
                                qVar.v = contributionWidgetModel;
                                qVar.w = it;
                                qVar.x = i2;
                                qVar.A = 2;
                                if (b4.t0(context2, lVar, kVar, rVar, qVar) == obj2) {
                                    break;
                                }
                            } else {
                                f fVar = new f();
                                qVar.u = null;
                                qVar.v = null;
                                qVar.w = null;
                                qVar.A = 3;
                            }
                        }
                        return obj2;
                    }
                    context = qVar.u;
                    sy.y.j(obj);
                }
                context2 = context;
                i2 = 0;
                contributionWidgetModel = new ContributionWidgetModel(x61.s.r, WidgetUIState.Waiting.INSTANCE);
                it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                return obj2;
            }
        }
        qVar = new q(contributionWidgetSettingsActivity, cVar);
        Object obj3 = qVar.y;
        Object obj22 = b71.a.r;
        i = qVar.A;
        if (i != 0) {
        }
        context2 = context;
        i2 = 0;
        contributionWidgetModel = new ContributionWidgetModel(x61.s.r, WidgetUIState.Waiting.INSTANCE);
        it = ((List) obj3).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        return obj22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.github.rudroid.widget.f
    public final String s0(b6.c cVar) {
        Companion.getClass();
        return a.a(this).getString("selected_contribution_user" + cVar, null);
    }

    @Override // com.github.rudroid.widget.f
    public final int t0() {
        return 2131951967;
    }

    @Override // com.github.rudroid.widget.f
    public final void u0(Context context, oa.j jVar, b6.c cVar) {
        k71.k.g(context, "context");
        k71.k.g(jVar, "user");
        Companion.getClass();
        SharedPreferences a2 = a.a(context);
        String str = jVar.a;
        SharedPreferences.Editor edit = a2.edit();
        edit.putString("selected_contribution_user" + cVar, str);
        edit.apply();
        b0.z(d1.i(this), (a71.h) null, (v71.a0) null, new p(this, context, null), 3).o0(new com.github.rudroid.support.u(13, this));
        ContributionWidgetWorker.Companion.getClass();
        ContributionWidgetWorker.a.a(context);
    }
}
