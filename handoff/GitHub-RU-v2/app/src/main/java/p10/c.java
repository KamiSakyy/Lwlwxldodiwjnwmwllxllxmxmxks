package p10;

import fg.d;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import k71.k;
import t71.n;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public static final n a = new n("@today(?:([+-])(\\d+)([dwmy]))?(?![a-zA-Z0-9+-])");
    public static final SimpleDateFormat b = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static String a(String str) {
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        k.f(calendar, "getInstance(...)");
        k.g(str, "query");
        return a.f(str, new d(23, date, calendar));
    }
}
