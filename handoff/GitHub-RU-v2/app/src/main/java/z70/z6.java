package z70;

/* loaded from: /home/user/work/p/classes3.dex */
public final class z6 {
    public final String a;
    public final a50.a b;

    public z6(String str, a50.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6)) {
            return false;
        }
        z6 z6Var = (z6) obj;
        return k71.k.b(this.a, z6Var.a) && k71.k.b(this.b, z6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
    public Object a() { return null; }
}
