package e80;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final int b;

    public a(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k71.k.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return m0.b(this.b, "Comments(__typename=", this.a, ", totalCount=", ")");
    }
}
