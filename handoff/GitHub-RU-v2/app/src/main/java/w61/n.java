package w61;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n implements Serializable {
    public Object r;

    public static final Throwable a(Object obj) {
        if (obj instanceof m) {
            return ((m) obj).r;
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof n) {
            return k71.k.b(this.r, ((n) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        Object obj = this.r;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public final String toString() {
        Object obj = this.r;
        if (obj instanceof m) {
            return ((m) obj).toString();
        }
        return "Success(" + obj + ')';
    }
}
