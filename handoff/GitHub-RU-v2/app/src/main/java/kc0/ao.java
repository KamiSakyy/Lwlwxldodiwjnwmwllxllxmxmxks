package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ao {
    public String a;
    public ud0.a b;

    public ao(String str, ud0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return false;
        }
        ao aoVar = (ao) obj;
        return k71.k.b(this.a, aoVar.a) && k71.k.b(this.b, aoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return jo.f4Shadow.p("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
