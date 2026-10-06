package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ne {
    public String a;
    public String b;
    public c30.h c;

    public ne(String str, String str2, c30.h hVar) {
        k71.k.g(str2, "id");
        this.a = str;
        this.b = str2;
        this.c = hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ne)) {
            return false;
        }
        ne neVar = (ne) obj;
        return k71.k.b(this.a, neVar.a) && k71.k.b(this.b, neVar.b) && k71.k.b(this.c, neVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("User(__typename=", this.a, ", id=", this.b, ", followUserFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
    public ne(String p1, String p2, Object p3) {
    }
}
