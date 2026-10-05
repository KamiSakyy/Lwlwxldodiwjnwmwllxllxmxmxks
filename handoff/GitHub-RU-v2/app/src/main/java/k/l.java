package k;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class l {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }

    public static void b(Object obj, LocaleList localeList) {
        ((LocaleManager) obj).setApplicationLocales(localeList);
    }
}
