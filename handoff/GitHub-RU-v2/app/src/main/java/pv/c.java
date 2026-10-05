package pv;

import a0.s0;
import aa.h0;
import com.github.rudroid.copilot.h1;
import java.util.List;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c implements h0 {
    public final String a;
    public final String b;
    public final boolean c;
    public final List d;

    public c(String str, String str2, List list, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && k.b(this.b, cVar.b) && this.c == cVar.c && k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        int e = i.e(h1.i(this.a.hashCode() * 31, this.b, 31), 31, this.c);
        List list = this.d;
        return e + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder o = s0.o("ReactionFragment(__typename=", this.a, ", id=", this.b, ", viewerCanReact=");
        o.append(this.c);
        o.append(", reactionGroups=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
