package go0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public final String a;
    public final int b;

    public f(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k71.k.b(this.a, fVar.a) && this.b == fVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return m0.b(this.b, "CountWithOffSet(offSet=", this.a, ", count=", ")");
    }
}
