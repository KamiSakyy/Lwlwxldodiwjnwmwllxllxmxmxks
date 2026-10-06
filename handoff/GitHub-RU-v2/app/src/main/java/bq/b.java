package bq;

import a0.s0;
import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public class b {
    public String a;
    public String b;
    public int c;

    public b(String str, int i, String str2) {
        k.g(str, "owner");
        k.g(str2, "name");
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k.b(this.a, bVar.a) && k.b(this.b, bVar.b) && this.c == bVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + h1.i(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return s0.l(s0.o("FilesChangedParameters(owner=", this.a, ", name=", this.b, ", number="), this.c, ")");
    }
}
