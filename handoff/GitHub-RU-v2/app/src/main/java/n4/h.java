package n4;

import android.app.LocaleManager;
import android.os.LocaleList;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h {
    public static LocaleList a(Object obj) {
        return ((LocaleManager) obj).getApplicationLocales();
    }
}
