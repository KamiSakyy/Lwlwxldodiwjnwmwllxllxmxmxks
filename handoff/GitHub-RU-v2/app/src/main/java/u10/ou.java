package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class ou {
    public final nu a;
    public final String b;
    public final String c;

    public ou(nu nuVar, String str, String str2) {
        this.a = nuVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ou)) {
            return false;
        }
        ou ouVar = (ou) obj;
        return k71.k.b(this.a, ouVar.a) && k71.k.b(this.b, ouVar.b) && k71.k.b(this.c, ouVar.c);
    }

    public final int hashCode() {
        nu nuVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((nuVar == null ? 0 : nuVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
