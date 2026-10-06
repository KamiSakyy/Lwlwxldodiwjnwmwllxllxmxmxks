package gh;

import a0.s0;
import com.github.rudroid.copilot.h1;
import com.github.rudroid.m0;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class f {
    public String a;
    public String b;
    public String c;
    public boolean d;

    public f(String str, String str2, String str3, boolean z) {
        k.g(str, "id");
        k.g(str2, "title");
        k.g(str3, "description");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return k.b(this.a, fVar.a) && k.b(this.b, fVar.b) && k.b(this.c, fVar.c) && this.d == fVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return m0.k(s0.o("SelectableOption(id=", this.a, ", title=", this.b, ", description="), this.c, ", enabled=", this.d, ")");
    }

    public /* synthetic */ f(int i, String str, String str2, String str3, boolean z) {
        this(str, str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? true : z);
    }
}
