package dl0;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes4.dex */
public final class y {
    public String a;
    public s b;
    public String c;

    public y(String str, s sVar, String str2) {
        this.a = str;
        this.b = sVar;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return k71.k.b(this.a, yVar.a) && k71.k.b(this.b, yVar.b) && k71.k.b(this.c, yVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node2(id=");
        sb.append(this.a);
        sb.append(", commit=");
        sb.append(this.b);
        sb.append(", __typename=");
        return h1.p(sb, this.c, ")");
    }
}
