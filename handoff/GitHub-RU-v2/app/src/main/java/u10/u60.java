package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u60 {
    public final String a;
    public final s60 b;
    public final String c;

    public u60(String str, s60 s60Var, String str2) {
        this.a = str;
        this.b = s60Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u60)) {
            return false;
        }
        u60 u60Var = (u60) obj;
        return k71.k.b(this.a, u60Var.a) && k71.k.b(this.b, u60Var.b) && k71.k.b(this.c, u60Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }







}
