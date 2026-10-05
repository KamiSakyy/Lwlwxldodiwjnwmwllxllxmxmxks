package kf0;

import gn0.j8;
import k71.k;
import x.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final String a;
    public final j8 b;
    public final String c;
    public final String d;

    public c(String str, j8 j8Var, String str2, String str3) {
        this.a = str;
        this.b = j8Var;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return k.b(this.a, cVar.a) && this.b == cVar.b && k.b(this.c, cVar.c) && k.b(this.d, cVar.d);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LatestStatus(__typename=");
        sb.append(this.a);
        sb.append(", state=");
        sb.append(this.b);
        sb.append(", environmentUrl=");
        return i.k(sb, this.c, ", id=", this.d, ")");
    }
}
