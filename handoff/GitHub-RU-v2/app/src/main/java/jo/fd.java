package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class fd implements aaShadow.v0 {
    public final id a;
    public final jd b;
    public final String c;
    public final String d;

    public fd(id idVar, jd jdVar, String str, String str2) {
        this.a = idVar;
        this.b = jdVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fd)) {
            return false;
        }
        fd fdVar = (fd) obj;
        return k71.k.b(this.a, fdVar.a) && k71.k.b(this.b, fdVar.b) && k71.k.b(this.c, fdVar.c) && k71.k.b(this.d, fdVar.d);
    }

    public final int hashCode() {
        id idVar = this.a;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((this.b.hashCode() + ((idVar == null ? 0 : idVar.hashCode()) * 31)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(repository=");
        sb.append(this.a);
        sb.append(", search=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
