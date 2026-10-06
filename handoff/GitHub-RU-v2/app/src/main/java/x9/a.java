package x9;

import android.content.Context;

/* loaded from: /home/user/work/p/classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public volatile i80.d f33969a;

    /* renamed from: b, reason: collision with root package name */
    public Context f33970b;

    /* renamed from: c, reason: collision with root package name */
    public volatile o f33971c;

    /* renamed from: d, reason: collision with root package name */
    public volatile boolean f33972d;

    public final boolean a() {
        try {
            Context context = this.f33970b;
            return context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("com.google.android.play.billingclient.enableBillingOverridesTesting", false);
        } catch (Exception unused) {
            com.google.android.gms.internal.play_billing.t.h("BillingClient");
            return false;
        }
    }
}
