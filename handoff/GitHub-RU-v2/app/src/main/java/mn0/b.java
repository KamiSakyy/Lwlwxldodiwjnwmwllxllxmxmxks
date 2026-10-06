package mn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b {
    public int a;
    public String b;
    public String c;

    public b(String str, int i, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a == bVar.a && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        return com.github.rudroid.copilot.h1.p(x.i.n(this.a, "Issue(number=", ", id=", this.b, ", __typename="), this.c, ")");
    }
}
