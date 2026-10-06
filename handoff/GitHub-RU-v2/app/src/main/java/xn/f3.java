package xn;

import java.util.Map;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f3 {
    public static final e3 Companion = new e3();
    public final Map a;

    public f3(Map map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f3) && k71.k.b(this.a, ((f3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "QuotaSnapshot(quotas=" + this.a + ")";
    }
}
