package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class pw {
    public ow a;
    public String b;
    public String c;

    public pw(ow owVar, String str, String str2) {
        this.a = owVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pw)) {
            return false;
        }
        pw pwVar = (pw) obj;
        return k71.k.b(this.a, pwVar.a) && k71.k.b(this.b, pwVar.b) && k71.k.b(this.c, pwVar.c);
    }

    public final int hashCode() {
        ow owVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((owVar == null ? 0 : owVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(readme=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
