package jn0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class my {
    public final String a;
    public final ky b;
    public final String c;

    public my(String str, ky kyVar, String str2) {
        this.a = str;
        this.b = kyVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof my)) {
            return false;
        }
        my myVar = (my) obj;
        return k71.k.b(this.a, myVar.a) && k71.k.b(this.b, myVar.b) && k71.k.b(this.c, myVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Compare(id=");
        sb.append(this.a);
        sb.append(", commits=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
