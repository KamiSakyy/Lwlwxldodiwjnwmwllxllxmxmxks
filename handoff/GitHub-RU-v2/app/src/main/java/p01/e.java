package p01;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final String b;

    public e(String str, String str2) {
        this.a = str;
        this.b = str2;
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
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return x.i.g("ParentRepo(owner=", this.a, ", name=", this.b, ")");
    }
    public Object c(Object p1, Object p2, Object p3) { return null; }
    public Object x(Object p1, Object p2, Object p3, Object p4, Object p5) { return null; }
}
