package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class bu {
    public final String a;
    public final int b;
    public final yt c;
    public final String d;

    public bu(String str, int i, yt ytVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = ytVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu)) {
            return false;
        }
        bu buVar = (bu) obj;
        return k71.k.b(this.a, buVar.a) && this.b == buVar.b && k71.k.b(this.c, buVar.c) && k71.k.b(this.d, buVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "Discussion(id=", this.a, ", number=", ", comments=");
        n.append(this.c);
        n.append(", __typename=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
