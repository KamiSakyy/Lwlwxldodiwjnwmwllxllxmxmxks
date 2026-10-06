package jo;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class uo {
    public final ArrayList a;
    public final ArrayList b;
    public final ArrayList c;

    public uo(ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = arrayList3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uo)) {
            return false;
        }
        uo uoVar = (uo) obj;
        return this.a.equals(uoVar.a) && this.b.equals(uoVar.b) && this.c.equals(uoVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobileCopilotPaywall(allFeatures=");
        sb.append(this.a);
        sb.append(", disclaimers=");
        sb.append(this.b);
        sb.append(", paywallProducts=");
        return com.github.rudroid.m0.j(")", sb, this.c);
    }
}
