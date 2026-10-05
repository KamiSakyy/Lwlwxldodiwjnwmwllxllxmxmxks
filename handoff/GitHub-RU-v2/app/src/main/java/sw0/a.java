package sw0;

import k71.k;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final String a;
    public final String b;

    public a(String str) {
        k.g(str, "queryString");
        this.a = str;
        this.b = p10.c.a(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && k.b(this.a, ((a) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return f1.e.z("AdvancedSearchParameters(queryString=", this.a, ")");
    }
}
