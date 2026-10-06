package p01;

import com.github.rudroid.m0;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class l {
    public String a;
    public boolean b;
    public boolean c;

    public l(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return k71.k.b(this.a, lVar.a) && this.b == lVar.b && this.c == lVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + x.i.e(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return f4.s(m0.o("RepositoryEmptyAndArchivedStatus(id=", this.a, ", isArchived=", ", isEmpty=", this.b), this.c, ")");
    }
}
