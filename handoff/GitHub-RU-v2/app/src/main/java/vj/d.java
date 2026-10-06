package vj;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public String a;
    public long b;

    public d(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        k.g(str, "id");
        this.a = str;
        this.b = currentTimeMillis;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k.b(this.a, dVar.a) && this.b == dVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DeepLinkHashesEntry(id=" + this.a + ", timestamp=" + this.b + ")";
    }
    public Object z(Object p1, Object p2) { return null; }
}
