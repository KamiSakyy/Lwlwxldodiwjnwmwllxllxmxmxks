package ay0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class e {
    public final String a;
    public final i0 b;

    public e(String str, i0 i0Var) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = i0Var;
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
        return "Value(__typename=" + this.a + ", projectV2GroupValueFragment=" + this.b + ")";
    }
    public Object z(Object p1, Object p2, Object p3) { return null; }
}
