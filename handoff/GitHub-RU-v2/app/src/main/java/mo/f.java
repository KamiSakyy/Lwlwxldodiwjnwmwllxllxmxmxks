package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public String a;
    public int b;
    public w c;
    public String d;

    public f(String str, int i, w wVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = wVar;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && this.b == fVar.b && k71.k.b(this.c, fVar.c) && k71.k.b(this.d, fVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + a0.s0.b(this.b, this.a.hashCode() * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder n = a0.s0.n(this.b, "OnDiscussion(url=", this.a, ", number=", ", repository=");
        n.append(this.c);
        n.append(", id=");
        n.append(this.d);
        n.append(")");
        return n.toString();
    }
}
