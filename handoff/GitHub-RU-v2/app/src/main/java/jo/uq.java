package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uq {
    public String a;
    public tq b;
    public m10.ks c;
    public ArrayList d;
    public String e;

    public uq(String str, tq tqVar, m10.ks ksVar, ArrayList arrayList, String str2) {
        this.a = str;
        this.b = tqVar;
        this.c = ksVar;
        this.d = arrayList;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uq)) {
            return false;
        }
        uq uqVar = (uq) obj;
        return this.a.equals(uqVar.a) && this.b.equals(uqVar.b) && this.c == uqVar.c && this.d.equals(uqVar.d) && this.e.equals(uqVar.e);
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
