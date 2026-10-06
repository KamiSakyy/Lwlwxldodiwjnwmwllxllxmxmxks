package m00;

import com.github.rudroid.m0;
import jo.f4;

/* loaded from: /home/user/work/p/classes3.dex */
public final class t {
    public String a;
    public boolean b;
    public boolean c;

    public t(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && this.b == tVar.b && this.c == tVar.c;
    }

    public final int hashCode() {
        String str = this.a;
        return Boolean.hashCode(this.c) + x.i.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
    }

    public final String toString() {
        return f4.s(m0.o("PageInfo(endCursor=", this.a, ", hasNextPage=", ", hasPreviousPage=", this.b), this.c, ")");
    }
}
