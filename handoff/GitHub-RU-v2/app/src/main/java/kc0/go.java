package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class go {
    public String a;
    public qf0.a b;

    public go(String str, qf0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go)) {
            return false;
        }
        go goVar = (go) obj;
        return k71.k.b(this.a, goVar.a) && k71.k.b(this.b, goVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "DiffLine(__typename=" + this.a + ", diffLineFragment=" + this.b + ")";
    }
}
