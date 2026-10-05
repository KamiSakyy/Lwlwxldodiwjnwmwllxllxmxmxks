package hd0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final String a;
    public final int b;

    public d(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return k71.k.b(this.a, dVar.a) && this.b == dVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return m0.b(this.b, "CountWithOffSet(offSet=", this.a, ", count=", ")");
    }
}
