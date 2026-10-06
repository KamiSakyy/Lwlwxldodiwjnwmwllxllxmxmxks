package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class z9 {
    public final String a;
    public final cp0.c b;

    public z9(String str, cp0.c cVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z9)) {
            return false;
        }
        z9 z9Var = (z9) obj;
        return k71.k.b(this.a, z9Var.a) && k71.k.b(this.b, z9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        cp0.c cVar = this.b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public final String toString() {
        return f1.e.i("Owner(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
