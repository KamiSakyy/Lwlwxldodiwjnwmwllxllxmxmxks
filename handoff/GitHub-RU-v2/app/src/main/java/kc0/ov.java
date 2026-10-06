package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ov {
    public final kv a;
    public final nv b;
    public final String c;
    public final String d;

    public ov(kv kvVar, nv nvVar, String str, String str2) {
        this.a = kvVar;
        this.b = nvVar;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov)) {
            return false;
        }
        ov ovVar = (ov) obj;
        return k71.k.b(this.a, ovVar.a) && k71.k.b(this.b, ovVar.b) && k71.k.b(this.c, ovVar.c) && k71.k.b(this.d, ovVar.d);
    }

    public final int hashCode() {
        kv kvVar = this.a;
        int hashCode = (kvVar == null ? 0 : kvVar.hashCode()) * 31;
        nv nvVar = this.b;
        return this.d.hashCode() + com.github.rudroid.copilot.h1.i((hashCode + (nvVar != null ? nvVar.hashCode() : 0)) * 31, this.c, 31);
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
