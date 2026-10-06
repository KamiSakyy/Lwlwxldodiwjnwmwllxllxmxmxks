package ap0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y3 {
    public String a;
    public mr0.a b;

    public y3(String str, mr0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y3)) {
            return false;
        }
        y3 y3Var = (y3) obj;
        return k71.k.b(this.a, y3Var.a) && k71.k.b(this.b, y3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TextFieldFileLine(__typename=" + this.a + ", fileLineFragment=" + this.b + ")";
    }
}
