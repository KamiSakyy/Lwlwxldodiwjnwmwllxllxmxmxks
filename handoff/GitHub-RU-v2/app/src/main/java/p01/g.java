package p01;

import com.github.rudroid.m0;
import com.github.service.models.response.type.StatusState;

/* loaded from: /home/user/work/p/classes4.dex */
public final class g {
    public static final f Companion = new f();
    public static final g e = new g("main", false, null, StatusState.UNKNOWN__);
    public final String a;
    public final boolean b;
    public final String c;
    public final StatusState d;

    public g(String str, boolean z, String str2, StatusState statusState) {
        k71.k.g(str, "name");
        k71.k.g(statusState, "statusState");
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = statusState;
        "refs/heads/".concat(str);
    }

    public final boolean equals(Object obj) {
        boolean b;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (!k71.k.b(this.a, gVar.a) || this.b != gVar.b) {
            return false;
        }
        String str = gVar.c;
        String str2 = this.c;
        if (str2 == null) {
            if (str == null) {
                b = true;
            }
            b = false;
        } else {
            if (str != null) {
                b = k71.k.b(str2, str);
            }
            b = false;
        }
        return b && this.d == gVar.d;
    }

    public final int hashCode() {
        int e2 = x.i.e(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return this.d.hashCode() + ((e2 + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        String str = this.c;
        String a = str == null ? "null" : qb.a.a(str);
        StringBuilder o = m0.o("Ref(name=", this.a, ", viewerCanCommit=", ", oid=", this.b);
        o.append(a);
        o.append(", statusState=");
        o.append(this.d);
        o.append(")");
        return o.toString();
    }
}
