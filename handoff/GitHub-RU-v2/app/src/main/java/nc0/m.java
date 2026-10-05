package nc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public final c0 a;
    public final String b;
    public final String c;
    public final String d;

    public m(c0 c0Var, String str, String str2, String str3) {
        this.a = c0Var;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && k71.k.b(this.b, mVar.b) && k71.k.b(this.c, mVar.c) && k71.k.b(this.d, mVar.d);
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
