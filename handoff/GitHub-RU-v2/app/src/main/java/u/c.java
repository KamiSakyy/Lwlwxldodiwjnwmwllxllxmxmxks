package u;

import android.os.LocaleList;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class c {
    public static String a() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }
}
