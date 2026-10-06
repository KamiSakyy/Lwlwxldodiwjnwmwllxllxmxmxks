package jo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ig {
    public String a;
    public String b;
    public dw.k7 c;

    public ig(String str, String str2, dw.k7 k7Var) {
        this.a = str;
        this.b = str2;
        this.c = k7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ig)) {
            return false;
        }
        ig igVar = (ig) obj;
        return k71.k.b(this.a, igVar.a) && k71.k.b(this.b, igVar.b) && k71.k.b(this.c, igVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder o = a0.s0.o("Repository(__typename=", this.a, ", id=", this.b, ", userListMetadataForRepositoryFragment=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
