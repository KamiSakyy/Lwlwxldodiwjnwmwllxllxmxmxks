package kc0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class nq {
    public String a;
    public iq b;
    public kq c;
    public lq d;
    public String e;

    public nq(String str, iq iqVar, kq kqVar, lq lqVar, String str2) {
        this.a = str;
        this.b = iqVar;
        this.c = kqVar;
        this.d = lqVar;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nq)) {
            return false;
        }
        nq nqVar = (nq) obj;
        return k71.k.b(this.a, nqVar.a) && k71.k.b(this.b, nqVar.b) && k71.k.b(this.c, nqVar.c) && k71.k.b(this.d, nqVar.d) && k71.k.b(this.e, nqVar.e);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        kq kqVar = this.c;
        int hashCode2 = (hashCode + (kqVar == null ? 0 : kqVar.hashCode())) * 31;
        lq lqVar = this.d;
        return this.e.hashCode() + ((hashCode2 + (lqVar != null ? lqVar.hashCode() : 0)) * 31);
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
