package l11;

/* loaded from: /home/user/work/p/classes4.dex */
public final class n extends y {
    public l a;

    public n(l lVar) {
        this.a = lVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        Object obj2 = x.r;
        if (obj2.equals(obj2)) {
            return this.a.equals(((n) yVar).a);
        }
        return false;
    }

    public final int hashCode() {
        return ((x.r.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        return "ClientInfo{clientType=" + x.r + ", androidClientInfo=" + this.a + "}";
    }
}
