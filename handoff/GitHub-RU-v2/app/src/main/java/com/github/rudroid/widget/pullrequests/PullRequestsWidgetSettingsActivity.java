package com.github.rudroid.widget.pullrequests;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import b6.q0;
import com.github.rudroid.activities.m0;
import com.github.rudroid.copilot.ui.v0;
import com.github.rudroid.widget.WidgetUIState;
import com.google.android.gms.internal.measurement.b4;
import java.util.Iterator;
import java.util.List;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class PullRequestsWidgetSettingsActivity extends m0 {
    public static final a Companion = new a();

    public static final class a {
        public static String a(SharedPreferences sharedPreferences, z5.k kVar) {
            k71.k.g(sharedPreferences, "<this>");
            k71.k.g(kVar, "glanceId");
            return sharedPreferences.getString("selected_pulls_user" + kVar, null);
        }

        public static SharedPreferences b(Context context) {
            k71.k.g(context, "context");
            SharedPreferences sharedPreferences = context.getSharedPreferences("PullRequestsWidgetSettingsActivity", 0);
            k71.k.f(sharedPreferences, "getSharedPreferences(...)");
            return sharedPreferences;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a5, code lost:
    
        if (v8.l0.S(r9, r6, r0) == r11) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r9 == r11) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0094 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object s0(PullRequestsWidgetSettingsActivity pullRequestsWidgetSettingsActivity, Context context, c71.c cVar) {
        i iVar;
        int i;
        Context context2;
        int i2;
        PullRequestsWidgetModel pullRequestsWidgetModel;
        Iterator it;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i3 = iVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                iVar.A = i3 - Integer.MIN_VALUE;
                Object obj = iVar.y;
                Object obj2 = b71.a.r;
                i = iVar.A;
                if (i != 0) {
                    y.j(obj);
                    q0 q0Var = new q0(context);
                    iVar.u = context;
                    iVar.A = 1;
                    obj = q0Var.c(c.class, iVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            y.j(obj);
                            return a0.a;
                        }
                        i2 = iVar.x;
                        it = iVar.w;
                        pullRequestsWidgetModel = iVar.v;
                        context2 = iVar.u;
                        y.j(obj);
                        while (true) {
                            if (it.hasNext()) {
                                z5.k kVar = (z5.k) it.next();
                                com.github.rudroid.widget.pullrequests.a aVar = com.github.rudroid.widget.pullrequests.a.a;
                                j jVar = new j(pullRequestsWidgetModel, null);
                                iVar.u = context2;
                                iVar.v = pullRequestsWidgetModel;
                                iVar.w = it;
                                iVar.x = i2;
                                iVar.A = 2;
                                if (b4.t0(context2, aVar, kVar, jVar, iVar) == obj2) {
                                    break;
                                }
                            } else {
                                c cVar2 = new c();
                                iVar.u = null;
                                iVar.v = null;
                                iVar.w = null;
                                iVar.A = 3;
                            }
                        }
                        return obj2;
                    }
                    context = iVar.u;
                    y.j(obj);
                }
                context2 = context;
                i2 = 0;
                pullRequestsWidgetModel = new PullRequestsWidgetModel(null, WidgetUIState.Waiting.INSTANCE);
                it = ((List) obj).iterator();
                while (true) {
                    if (it.hasNext()) {
                    }
                }
                return obj2;
            }
        }
        iVar = new i(pullRequestsWidgetSettingsActivity, cVar);
        Object obj3 = iVar.y;
        Object obj22 = b71.a.r;
        i = iVar.A;
        if (i != 0) {
        }
        context2 = context;
        i2 = 0;
        pullRequestsWidgetModel = new PullRequestsWidgetModel(null, WidgetUIState.Waiting.INSTANCE);
        it = ((List) obj3).iterator();
        while (true) {
            if (it.hasNext()) {
            }
        }
        return obj22;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        Bundle extras;
        super.onCreate(bundle);
        int i = 0;
        setResult(0);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null) {
            i = extras.getInt("appWidgetId", 0);
        }
        if (i == 0) {
            finish();
        } else {
            e.c.a(this, new r1.d(new v0(this, i, 10), true, 1265171020));
        }
    }

    public static Object getIntent(Object... a) {
        return null;
    }
    public Object setResult(int) { return null; }
}
