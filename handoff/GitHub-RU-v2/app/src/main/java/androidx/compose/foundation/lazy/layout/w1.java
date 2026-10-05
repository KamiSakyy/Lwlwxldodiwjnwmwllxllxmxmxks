package androidx.compose.foundation.lazy.layout;

import android.os.Build;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w1 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1 f1521a;

    static {
        v1 v1Var;
        String str = Build.FINGERPRINT;
        if (str != null) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            k71.k.f(lowerCase, "toLowerCase(...)");
            if (lowerCase.equals("robolectric")) {
                v1Var = new v1();
                f1521a = v1Var;
            }
        }
        v1Var = null;
        f1521a = v1Var;
    }
}
