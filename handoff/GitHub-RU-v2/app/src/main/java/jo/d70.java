package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d70 implements aaShadow.v0 {
    public ArrayList a;
    public String b;
    public String c;

    public d70(String str, String str2, ArrayList arrayList) {
        this.a = arrayList;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d70)) {
            return false;
        }
        d70 d70Var = (d70) obj;
        return this.a.equals(d70Var.a) && this.b.equals(d70Var.b) && this.c.equals(d70Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + com.github.rudroid.copilot.h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Data(spokenLanguages=");
        sb.append(this.a);
        sb.append(", id=");
        sb.append(this.b);
        sb.append(", __typename=");
        return com.github.rudroid.copilot.h1.p(sb, this.c, ")");
    }
}
