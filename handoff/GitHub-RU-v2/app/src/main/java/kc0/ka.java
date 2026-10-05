package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ka {
    public final String a;
    public final ud0.a b;

    public ka(String str, ud0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ka)) {
            return false;
        }
        ka kaVar = (ka) obj;
        return k71.k.b(this.a, kaVar.a) && k71.k.b(this.b, kaVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return jo.f4.p("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
