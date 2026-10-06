package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class ew {
    public String a;
    public aw b;
    public String c;

    public ew(String str, aw awVar, String str2) {
        this.a = str;
        this.b = awVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew)) {
            return false;
        }
        ew ewVar = (ew) obj;
        return k71.k.b(this.a, ewVar.a) && k71.k.b(this.b, ewVar.b) && k71.k.b(this.c, ewVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        aw awVar = this.b;
        return this.c.hashCode() + ((hashCode + (awVar == null ? 0 : awVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Repository(id=");
        sb.append(this.a);
        sb.append(", mergeQueue=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
