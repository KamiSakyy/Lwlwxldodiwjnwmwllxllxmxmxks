package com.github.rudroid.settings.copilot.managesubscription;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.github.rudroid.activities.p2;

/* loaded from: /home/user/work/p/classes3.dex */
final class l implements j71.a {
    public final /* synthetic */ CopilotManageSubscriptionActivity r;
    public final /* synthetic */ cg.a s;

    public l(CopilotManageSubscriptionActivity copilotManageSubscriptionActivity, cg.a aVar) {
        this.r = copilotManageSubscriptionActivity;
        this.s = aVar;
    }

    public final Object a() {
        String str = this.s.a.c;
        k71.k.f(str, "getProductId(...)");
        p2 p2Var = this.r;
        k71.k.g(p2Var, "context");
        Uri.Builder builder = new Uri.Builder();
        builder.scheme("https").authority("play.google.com").appendPath("store").appendPath("account").appendPath("subscriptions").appendQueryParameter("sku", str).appendQueryParameter("package", "com.github.rudroid");
        try {
            p2Var.startActivity(new Intent("android.intent.action.VIEW", builder.build()));
        } catch (ActivityNotFoundException unused) {
        }
        return w61.a0.a;
    }
}
