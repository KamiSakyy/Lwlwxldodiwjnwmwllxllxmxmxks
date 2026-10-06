package jn0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class cp {
    public String a;
    public bp b;
    public pz0.dn c;
    public ArrayList d;
    public String e;

    public cp(String str, bp bpVar, pz0.dn dnVar, ArrayList arrayList, String str2) {
        this.a = str;
        this.b = bpVar;
        this.c = dnVar;
        this.d = arrayList;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp)) {
            return false;
        }
        cp cpVar = (cp) obj;
        return this.a.equals(cpVar.a) && this.b.equals(cpVar.b) && this.c == cpVar.c && this.d.equals(cpVar.d) && this.e.equals(cpVar.e);
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
