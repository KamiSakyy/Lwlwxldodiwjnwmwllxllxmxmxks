package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class x8 {
    public String a;
    public e30.a b;

    public x8(String str, e30.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x8)) {
            return false;
        }
        x8 x8Var = (x8) obj;
        return k71.k.b(this.a, x8Var.a) && k71.k.b(this.b, x8Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        e30.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return no.a.m("Owner(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
