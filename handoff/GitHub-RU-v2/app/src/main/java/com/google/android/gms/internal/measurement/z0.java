package com.google.android.gms.internal.measurement;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z0 extends g1 {
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z0(k1 k1Var, Object obj, Object obj2, int i) {
        super(k1Var, true);
        this.v = i;
        this.x = obj;
        this.y = obj2;
        this.w = k1Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(17:19|20|(1:22)|23|24|(12:56|57|58|27|(1:55)(1:31)|32|33|34|(1:36)(1:51)|37|38|(1:40)(3:42|(1:49)(1:45)|46))|26|27|(1:29)|55|32|33|34|(0)(0)|37|38|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00c4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00d7, code lost:
    
        r7.b(r0, true, false);
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c1 A[Catch: Exception -> 0x0091, DynamiteModule$LoadingException -> 0x00c4, TRY_ENTER, TryCatch #1 {DynamiteModule$LoadingException -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:51:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1 A[Catch: Exception -> 0x0091, TryCatch #2 {Exception -> 0x0091, blocks: (B:20:0x0076, B:22:0x008c, B:23:0x0094, B:27:0x00aa, B:29:0x00b1, B:32:0x00ba, B:36:0x00c1, B:37:0x00c8, B:38:0x00da, B:42:0x00e1, B:46:0x00fa, B:51:0x00c6, B:54:0x00d7, B:57:0x00a1), top: B:19:0x0076, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c6 A[Catch: Exception -> 0x0091, DynamiteModule$LoadingException -> 0x00c4, TryCatch #1 {DynamiteModule$LoadingException -> 0x00c4, blocks: (B:36:0x00c1, B:37:0x00c8, B:51:0x00c6), top: B:34:0x00bf, outer: #2 }] */
    @Override // com.google.android.gms.internal.measurement.g1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a() {
        Boolean valueOf;
        k1 k1Var;
        Bundle bundle;
        switch (this.v) {
            case 0:
                try {
                    Context context = (Context) this.x;
                    c21.u.g(context);
                    String a = com.google.android.gms.measurement.internal.c2.a(context);
                    Resources resources = context.getResources();
                    if (TextUtils.isEmpty(a)) {
                        a = com.google.android.gms.measurement.internal.c2.a(context);
                    }
                    int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", a);
                    l0 l0Var = null;
                    if (identifier != 0) {
                        try {
                            valueOf = Boolean.valueOf(resources.getBoolean(identifier));
                        } catch (Resources.NotFoundException unused) {
                        }
                        k1Var = (k1) this.w;
                        boolean z = (valueOf == null && valueOf.booleanValue()) ? false : true;
                        k1Var.getClass();
                        l0Var = k0.asInterface(k21.e.c(context, !z ? k21.e.c : k21.e.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                        k1Var.f = l0Var;
                        if (k1Var.f == null) {
                            int a2 = k21.e.a(context, ModuleDescriptor.MODULE_ID);
                            u0 u0Var = new u0(133005L, Math.max(a2, r6), Boolean.TRUE.equals(valueOf) || k21.e.d(context, ModuleDescriptor.MODULE_ID, false) < a2, (Bundle) this.y, com.google.android.gms.measurement.internal.c2.a(context));
                            l0 l0Var2 = k1Var.f;
                            c21.u.g(l0Var2);
                            l0Var2.initialize(new j21.b(context), u0Var, this.r);
                            break;
                        } else {
                            break;
                        }
                    }
                    valueOf = null;
                    k1Var = (k1) this.w;
                    if (valueOf == null) {
                    }
                    k1Var.getClass();
                    l0Var = k0.asInterface(k21.e.c(context, !z ? k21.e.c : k21.e.b, ModuleDescriptor.MODULE_ID).b("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
                    k1Var.f = l0Var;
                    if (k1Var.f == null) {
                    }
                } catch (Exception e) {
                    ((k1) this.w).b(e, true, false);
                    return;
                }
            case 1:
                l0 l0Var3 = ((k1) this.w).f;
                c21.u.g(l0Var3);
                l0Var3.getMaxUserProperties((String) this.x, (i0) this.y);
                break;
            case 2:
                Bundle bundle2 = (Bundle) this.y;
                if (bundle2 != null) {
                    bundle = new Bundle();
                    if (bundle2.containsKey("com.google.app_measurement.screen_service")) {
                        Object obj = bundle2.get("com.google.app_measurement.screen_service");
                        if (obj instanceof Bundle) {
                            bundle.putBundle("com.google.app_measurement.screen_service", (Bundle) obj);
                        }
                    }
                } else {
                    bundle = null;
                }
                l0 l0Var4 = ((j1) this.w).r.f;
                c21.u.g(l0Var4);
                l0Var4.onActivityCreatedByScionActivityInfo(w0.j((Activity) this.x), bundle, this.s);
                break;
            default:
                l0 l0Var5 = ((j1) this.w).r.f;
                c21.u.g(l0Var5);
                l0Var5.onActivitySaveInstanceStateByScionActivityInfo(w0.j((Activity) this.x), (i0) this.y, this.s);
                break;
        }
    }

    @Override // com.google.android.gms.internal.measurement.g1
    public void b() {
        switch (this.v) {
            case 1:
                ((i0) this.y).c(null);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, Activity activity, i0 i0Var) {
        super(j1Var.r, true);
        this.v = 3;
        this.x = activity;
        this.y = i0Var;
        this.w = j1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(j1 j1Var, Bundle bundle, Activity activity) {
        super(j1Var.r, true);
        this.v = 2;
        this.y = bundle;
        this.x = activity;
        this.w = j1Var;
    }
}
