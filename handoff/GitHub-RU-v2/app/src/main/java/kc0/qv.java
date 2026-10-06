package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class qv {
    public final String a;
    public final ud0.a b;

    public qv(String str, ud0.a aVar) {
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qv)) {
            return false;
        }
        qv qvVar = (qv) obj;
        return k71.k.b(this.a, qvVar.a) && k71.k.b(this.b, qvVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return jo.f4.p("Author(__typename=", this.a, ", actorFields=", this.b, ")");
    }
}
