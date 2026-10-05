package k;

import android.content.res.Configuration;
import android.os.LocaleList;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class s {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static w4.c b(Configuration configuration) {
        return w4.c.a(configuration.getLocales().toLanguageTags());
    }

    public static void c(w4.c cVar) {
        LocaleList.setDefault(LocaleList.forLanguageTags(cVar.f33318a.f33319a.toLanguageTags()));
    }

    public static void d(Configuration configuration, w4.c cVar) {
        configuration.setLocales(LocaleList.forLanguageTags(cVar.f33318a.f33319a.toLanguageTags()));
    }
}
