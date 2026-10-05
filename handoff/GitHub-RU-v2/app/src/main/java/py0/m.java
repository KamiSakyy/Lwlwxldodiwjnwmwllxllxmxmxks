package py0;

import com.github.rudroid.m0;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public final String a;
    public final boolean b;
    public final boolean c;
    public final String d;

    public m(String str, String str2, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return k71.k.b(this.a, mVar.a) && this.b == mVar.b && this.c == mVar.c && k71.k.b(this.d, mVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        return m0.l(m0.o("Repository(id=", this.a, ", isArchived=", ", isEmpty=", this.b), this.c, ", __typename=", this.d, ")");
    }
}
