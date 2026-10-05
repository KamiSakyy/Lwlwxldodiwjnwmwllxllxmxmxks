package w61;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements Serializable {
    public final Object r;
    public final Object s;
    public final Object t;

    public q(Object obj, Object obj2, Object obj3) {
        this.r = obj;
        this.s = obj2;
        this.t = obj3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return k71.k.b(this.r, qVar.r) && k71.k.b(this.s, qVar.s) && k71.k.b(this.t, qVar.t);
    }

    public final int hashCode() {
        Object obj = this.r;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.s;
        int hashCode2 = (hashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.t;
        return hashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.r + ", " + this.s + ", " + this.t + ')';
    }
}
