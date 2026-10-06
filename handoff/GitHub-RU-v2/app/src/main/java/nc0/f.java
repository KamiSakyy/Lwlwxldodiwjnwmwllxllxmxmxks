package nc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final String a;
    public final int b;
    public final v c;
    public final String d;

    public f(String str, int i, v vVar, String str2) {
        this.a = str;
        this.b = i;
        this.c = vVar;
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
