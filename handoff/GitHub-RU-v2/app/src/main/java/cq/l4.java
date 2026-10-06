package cq;

/* loaded from: /home/user/work/p/classes3.dex */
public final class l4 {
    public final String a;
    public final us.a b;

    public l4(String str, us.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4)) {
            return false;
        }
        l4 l4Var = (l4) obj;
        return k71.k.b(this.a, l4Var.a) && k71.k.b(this.b, l4Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkDownFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
