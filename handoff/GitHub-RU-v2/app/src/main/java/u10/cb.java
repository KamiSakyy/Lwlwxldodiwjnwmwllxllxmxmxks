package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class cb {
    public final db a;
    public final String b;
    public final String c;

    public cb(db dbVar, String str, String str2) {
        this.a = dbVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cb)) {
            return false;
        }
        cb cbVar = (cb) obj;
        return k71.k.b(this.a, cbVar.a) && k71.k.b(this.b, cbVar.b) && k71.k.b(this.c, cbVar.c);
    }

    public final int hashCode() {
        db dbVar = this.a;
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i((dbVar == null ? 0 : dbVar.hashCode()) * 31, this.b, 31);
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
