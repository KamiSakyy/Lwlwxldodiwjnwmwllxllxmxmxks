package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ps {
    public String a;
    public ks b;
    public ms c;
    public ns d;
    public String e;

    public ps(String str, ks ksVar, ms msVar, ns nsVar, String str2) {
        this.a = str;
        this.b = ksVar;
        this.c = msVar;
        this.d = nsVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ps)) {
            return false;
        }
        ps psVar = (ps) obj;
        return k71.k.b(this.a, psVar.a) && k71.k.b(this.b, psVar.b) && k71.k.b(this.c, psVar.c) && k71.k.b(this.d, psVar.d) && k71.k.b(this.e, psVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ms msVar = this.c;
        int hashCode2 = (hashCode + (msVar == null ? 0 : msVar.hashCode())) * 31;
        ns nsVar = this.d;
        return this.e.hashCode() + ((hashCode2 + (nsVar != null ? nsVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", owner=");
        sb.append(this.b);
        sb.append(", ref=");
        sb.append(this.c);
        sb.append(", release=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
