package c21;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import java.util.Locale;
import x.q0;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class n {
    public static final q0 a = new q0(0);
    public static Locale b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = i21.b.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i == 1) {
            return resources.getString(2131951948, a2);
        }
        if (i == 2) {
            return g21.b.a(context) ? resources.getString(2131951958) : resources.getString(2131951955, a2);
        }
        if (i == 3) {
            return resources.getString(2131951945, a2);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", a2);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", a2);
        }
        if (i == 9) {
            return resources.getString(2131951953, a2);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", a2);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", a2);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", a2);
            case 18:
                return resources.getString(2131951957, a2);
            default:
                return resources.getString(2131951952, a2);
        }
    }

    public static String c(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(2131951949);
        }
        if (i == 2) {
            return resources.getString(2131951956);
        }
        if (i == 3) {
            return resources.getString(2131951946);
        }
        if (i == 5) {
            return e(context, "common_google_play_services_invalid_account_title");
        }
        if (i == 7) {
            return e(context, "common_google_play_services_network_error_title");
        }
        if (i == 17) {
            return e(context, "common_google_play_services_sign_in_failed_title");
        }
        if (i != 20) {
            return null;
        }
        return e(context, "common_google_play_services_restricted_profile_title");
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e = e(context, str);
        if (e == null) {
            e = resources.getString(2131951952);
        }
        return String.format(resources.getConfiguration().locale, e, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        q0 q0Var = a;
        synchronized (q0Var) {
            try {
                Locale locale = context.getResources().getConfiguration().getLocales().get(0);
                if (!locale.equals(b)) {
                    q0Var.clear();
                    b = locale;
                }
                String str2 = (String) q0Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = z11.g.e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier != 0) {
                        String string = resources.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            a.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
