package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f9 {
    public final String a;
    public final ud0.a b;

    public f9(String str, ud0.a aVar) {
        k71.k.g(str, "__typename");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f9)) {
            return false;
        }
        f9 f9Var = (f9) obj;
        return k71.k.b(this.a, f9Var.a) && k71.k.b(this.b, f9Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        ud0.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return jo.f4.p("Owner(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
