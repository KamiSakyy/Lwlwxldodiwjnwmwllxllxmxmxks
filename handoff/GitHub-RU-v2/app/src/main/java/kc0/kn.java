package kc0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class kn {
    public final String a;
    public final jn b;
    public final gn0.bk c;
    public final ArrayList d;
    public final String e;

    public kn(String str, jn jnVar, gn0.bk bkVar, ArrayList arrayList, String str2) {
        this.a = str;
        this.b = jnVar;
        this.c = bkVar;
        this.d = arrayList;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn)) {
            return false;
        }
        kn knVar = (kn) obj;
        return this.a.equals(knVar.a) && this.b.equals(knVar.b) && this.c == knVar.c && this.d.equals(knVar.d) && this.e.equals(knVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + no.a.b(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Node(id=");
        sb.append(this.a);
        sb.append(", discussion=");
        sb.append(this.b);
        sb.append(", pattern=");
        sb.append(this.c);
        sb.append(", gradientStopColors=");
        sb.append(this.d);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.e, ")");
    }
}
