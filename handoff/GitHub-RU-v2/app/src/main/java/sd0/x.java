package sd0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class x {
    public String a;
    public eg0.a b;

    public x(String str, eg0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        return k71.k.b(this.a, xVar.a) && k71.k.b(this.b, xVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkDownFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
