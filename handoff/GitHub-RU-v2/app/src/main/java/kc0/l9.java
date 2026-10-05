package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l9 {
    public final String a;
    public final ud0.a b;

    public l9(String str, ud0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9)) {
            return false;
        }
        l9 l9Var = (l9) obj;
        return k71.k.b(this.a, l9Var.a) && k71.k.b(this.b, l9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return jo.f4.p("Actor(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
