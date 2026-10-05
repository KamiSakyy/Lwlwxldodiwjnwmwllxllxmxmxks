package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class kl {
    public final ll a;
    public final String b;
    public final String c;

    public kl(ll llVar, String str, String str2) {
        this.a = llVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kl)) {
            return false;
        }
        kl klVar = (kl) obj;
        return k71.k.b(this.a, klVar.a) && k71.k.b(this.b, klVar.b) && k71.k.b(this.c, klVar.c);
    }

    public final int hashCode() {
        ll llVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((llVar == null ? 0 : llVar.hashCode()) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Organization(organizationDiscussionsRepository=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
