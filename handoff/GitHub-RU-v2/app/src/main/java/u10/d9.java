package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d9 {
    public final String a;
    public final e30.a b;

    public d9(String str, e30.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d9)) {
            return false;
        }
        d9 d9Var = (d9) obj;
        return k71.k.b(this.a, d9Var.a) && k71.k.b(this.b, d9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return no.a.m("Actor(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
