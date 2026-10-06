package mo;

/* loaded from: /home/user/work/p/classes3.dex */
public final class n {
    public d0 a;
    public String b;
    public String c;
    public String d;

    public n(d0 d0Var, String str, String str2, String str3) {
        this.a = d0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return k71.k.b(this.a, nVar.a) && k71.k.b(this.b, nVar.b) && k71.k.b(this.c, nVar.c) && k71.k.b(this.d, nVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (str == null ? 0 : str.hashCode())) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OnRelease(repository=");
        sb.append(this.a);
        sb.append(", name=");
        sb.append(this.b);
        sb.append(", url=");
        return x.i.k(sb, this.c, ", id=", this.d, ")");
    }
}
