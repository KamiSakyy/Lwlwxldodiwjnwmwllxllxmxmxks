package com.github.rudroid.auth;

import android.content.Context;
import com.github.service.models.ApiFailure;
import com.github.service.models.ApiFailureType;

/* loaded from: /home/user/work/p/classes.dex */
public final class m {

    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8558a;

        static {
            int[] iArr = new int[ApiFailureType.values().length];
            try {
                iArr[ApiFailureType.SERVER_VERSION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f8558a = iArr;
        }
    }

    public static final String a(Context context, ApiFailure apiFailure) {
        String string;
        ApiFailureType apiFailureType = apiFailure != null ? apiFailure.r : null;
        if ((apiFailureType == null ? -1 : a.f8558a[apiFailureType.ordinal()]) != 1) {
            String string2 = context.getString(2131954649);
            k71.k.f(string2, "getString(...)");
            return string2;
        }
        String str = (String) apiFailure.w.get("failure_data_key_server_version");
        if (str != null && (string = context.getString(2131954670, str)) != null) {
            return string;
        }
        String string3 = context.getString(2131954649);
        k71.k.f(string3, "getString(...)");
        return string3;
    }
}
