package u10;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class gm {
    public String a;
    public fm b;
    public hc0.bj c;
    public ArrayList d;
    public String e;

    public gm(String str, fm fmVar, hc0.bj bjVar, ArrayList arrayList, String str2) {
        this.a = str;
        this.b = fmVar;
        this.c = bjVar;
        this.d = arrayList;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gm)) {
            return false;
        }
        gm gmVar = (gm) obj;
        return this.a.equals(gmVar.a) && this.b.equals(gmVar.b) && this.c == gmVar.c && this.d.equals(gmVar.d) && this.e.equals(gmVar.e);
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
