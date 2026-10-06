package q51;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import w80.a0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class i {
    public static final long b = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern c = Pattern.compile("\\AA[\\w-]{38}\\z");
    public static i d;
    public final a0 a;

    public i(a0 a0Var) {
        this.a = a0Var;
    }

    public final boolean a(r51.a aVar) {
        if (TextUtils.isEmpty(aVar.c)) {
            return true;
        }
        long j = aVar.f + aVar.e;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a.getClass();
        return j < timeUnit.toSeconds(System.currentTimeMillis()) + b;
    }
}
