package ea0;

import hc0.wz;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public wz a;
    public boolean b;

    public b(wz wzVar, boolean z) {
        this.a = wzVar;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && this.b == bVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "NavLink(identifier=" + this.a + ", hidden=" + this.b + ")";
    }
    public Object b(Object p1, Object p2, Object p3) { return null; }
    public Object c(Object p1, Object p2) { return null; }
    public Object e(Object p1, Object p2, Object p3) { return null; }
}
