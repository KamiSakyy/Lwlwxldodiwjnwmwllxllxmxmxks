package com.github.rudroid.twofactor;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.github.rudroid.pushnotifications.PushNotificationsService;
import com.github.rudroid.pushnotifications.g0;
import com.github.rudroid.twofactor.h;
import com.github.service.models.response.type.MobileAppAction;
import com.github.service.models.response.type.MobileAppElement;
import com.github.service.models.response.type.MobileSubjectType;
import ic.n0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class TwoFactorActivity extends d<n0> {
    public static final a Companion = new a();
    public final int k0;
    public com.github.rudroid.utilities.e l0;

    public static final class a {
        public static Intent a(Context context, boolean z, fn.a aVar) {
            Intent intent = new Intent(context, (Class<?>) TwoFactorActivity.class);
            if (aVar != null) {
                h.a aVar2 = h.Companion;
                Bundle bundle = new Bundle();
                aVar2.getClass();
                bundle.putParcelable("key_auth_request", aVar.b);
                bundle.putString("key_auth_user", aVar.a.a);
                intent.putExtras(bundle);
                intent.putExtra("key_from_push_notification", z);
            }
            intent.addFlags(131072);
            return intent;
        }
    }

    public TwoFactorActivity() {
        this.j0 = false;
        C(new c(this));
        this.k0 = 2131558449;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s0().O.setOnFinished(new e(this, 0));
        PushNotificationsService.Companion.getClass();
        n4.b0 b0Var = new n4.b0(this);
        g0.a aVar = com.github.rudroid.pushnotifications.g0.Companion;
        b0Var.b.cancel(null, -1026946604);
        if (bundle == null && getIntent().getBooleanExtra("key_from_push_notification", true)) {
            MobileSubjectType mobileSubjectType = MobileSubjectType.PUSH_NOTIFICATION_MOBILE_AUTH_REQUEST;
            oa.j g = b0().g();
            if (g != null) {
                com.github.rudroid.utilities.e eVar = this.l0;
                if (eVar != null) {
                    eVar.a(g, new wj.e(MobileAppElement.NOTIFICATION_PUSH, MobileAppAction.PRESS, mobileSubjectType, null, 8));
                } else {
                    k71.k.m("analytics");
                    throw null;
                }
            }
        }
    }

    public final int t0() {
        return this.k0;
    }
}
