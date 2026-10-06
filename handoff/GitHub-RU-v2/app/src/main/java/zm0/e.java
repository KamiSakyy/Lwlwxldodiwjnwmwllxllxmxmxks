package zm0;

import aa.v0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e implements v0 {
    public final l a;
    public final m b;

    public e(l lVar, m mVar) {
        this.a = lVar;
        this.b = mVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        l lVar = this.a;
        int hashCode = (lVar == null ? 0 : lVar.hashCode()) * 31;
        m mVar = this.b;
        return hashCode + (mVar != null ? mVar.hashCode() : 0);
    }

    public final String toString() {
        return "Data(repository=" + this.a + ", resource=" + this.b + ")";
    }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
