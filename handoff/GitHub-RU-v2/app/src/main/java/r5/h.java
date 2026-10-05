package r5;

import android.content.Context;
import b6.n0;
import cn.r;
import java.util.LinkedHashSet;
import java.util.Set;
import k71.k;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final LinkedHashSet f31169a = new LinkedHashSet();

    public static final q5.b a(Context context, String str, Set set) {
        k.g(context, "context");
        k.g(str, "sharedPreferencesName");
        k.g(set, "keysToMigrate");
        if (set != f31169a) {
            return new q5.b(context, str, set, new n0(set, null, 1), new r(3, (a71.c) null, 9));
        }
        return new q5.b(context, str, q5.c.f30982a, new n0(set, null, 1), new r(3, (a71.c) null, 9));
    }
}
