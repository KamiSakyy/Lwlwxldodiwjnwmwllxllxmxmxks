package f1;

import java.util.LinkedHashMap;
import java.util.Locale;

/* loaded from: /home/user/work/p/classes.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f23767a = new LinkedHashMap();

    public final String a(Long l, Locale locale, boolean z10) {
        if (l == null) {
            return null;
        }
        return h1.j.k(l.longValue(), z10 ? "yMMMMEEEEd" : "yMMMd", locale, this.f23767a);
    }

    public final boolean equals(Object obj) {
        return obj instanceof t2;
    }

    public final int hashCode() {
        return 436998964;
    }
}
