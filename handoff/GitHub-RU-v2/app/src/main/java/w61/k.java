package w61;

import java.io.Serializable;

/* loaded from: /home/user/work/p/classes4.dex */
public final class k implements Serializable {
    public Object r;
    public Object s;

    public k(Object obj, Object obj2) {
        this.r = obj;
        this.s = obj2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return k71.k.b(this.r, kVar.r) && k71.k.b(this.s, kVar.s);
    }

    public final int hashCode() {
        Object obj = this.r;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.s;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public final String toString() {
        return "(" + this.r + ", " + this.s + ')';
    }
}
