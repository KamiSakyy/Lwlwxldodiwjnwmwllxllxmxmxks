package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p3 {
    public String a;
    public mr0.a b;

    public p3(String str, mr0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p3)) {
            return false;
        }
        p3 p3Var = (p3) obj;
        return k71.k.b(this.a, p3Var.a) && k71.k.b(this.b, p3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkDownFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
