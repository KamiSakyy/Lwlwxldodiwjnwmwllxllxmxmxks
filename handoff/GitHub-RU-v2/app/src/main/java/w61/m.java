package w61;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m implements Serializable {
    public Throwable r;

    public m(Throwable th) {
        k71.k.g(th, "exception");
        this.r = th;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            return k71.k.b(this.r, ((m) obj).r);
        }
        return false;
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    public final String toString() {
        return "Failure(" + this.r + ')';
    }
}
