package q;

import android.os.LocaleList;
import android.widget.TextView;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class q0 {
    public static LocaleList a(String str) {
        return LocaleList.forLanguageTags(str);
    }

    public static void b(TextView textView, LocaleList localeList) {
        textView.setTextLocales(localeList);
    }
}
