package u10;

/* loaded from: /home/user/work/p/classes3.dex */
public final class au {
    public wt a;
    public zt b;
    public String c;
    public String d;

    public au(wt wtVar, zt ztVar, String str, String str2) {
        this.a = wtVar;
        this.b = ztVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof au)) {
            return false;
        }
        au auVar = (au) obj;
        return k71.k.b(this.a, auVar.a) && k71.k.b(this.b, auVar.b) && k71.k.b(this.c, auVar.c) && k71.k.b(this.d, auVar.d);
    }

    public final int hashCode() {
        wt wtVar = this.a;
        int hashCode = (wtVar == null ? 0 : wtVar.hashCode()) * 31;
        zt ztVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (ztVar != null ? ztVar.hashCode() : 0)) * 31, this.c, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(defaultBranchRef=");
        sb.append(this.a);
        sb.append(", refs=");
        sb.append(this.b);
        sb.append(", id=");
        return x.i.k(sb, this.c, ", __typename=", this.d, ")");
    }
}
