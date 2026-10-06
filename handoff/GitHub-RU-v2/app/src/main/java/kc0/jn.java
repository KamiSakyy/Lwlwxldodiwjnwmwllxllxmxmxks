package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class jn {
    public int a;
    public String b;
    public fn c;
    public gn d;
    public String e;
    public String f;

    public jn(int i, String str, fn fnVar, gn gnVar, String str2, String str3) {
        this.a = i;
        this.b = str;
        this.c = fnVar;
        this.d = gnVar;
        this.e = str2;
        this.f = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jn)) {
            return false;
        }
        jn jnVar = (jn) obj;
        return this.a == jnVar.a && k71.k.b(this.b, jnVar.b) && k71.k.b(this.c, jnVar.c) && k71.k.b(this.d, jnVar.d) && k71.k.b(this.e, jnVar.e) && k71.k.b(this.f, jnVar.f);
    }

    public final int hashCode() {
        int i = com.github.rudroid.copilot.h1.i(Integer.hashCode(this.a) * 31, this.b, 31);
        fn fnVar = this.c;
        return this.f.hashCode() + com.github.rudroid.copilot.h1.i((this.d.hashCode() + ((i + (fnVar == null ? 0 : fnVar.hashCode())) * 31)) * 31, this.e, 31);
    }

    public final String toString() {
        StringBuilder n = x.i.n(this.a, "Discussion(number=", ", title=", this.b, ", author=");
        n.append(this.c);
        n.append(", category=");
        n.append(this.d);
        n.append(", id=");
        return x.i.k(n, this.e, ", __typename=", this.f, ")");
    }
}
