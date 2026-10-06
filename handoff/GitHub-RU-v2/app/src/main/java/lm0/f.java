package lm0;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f {
    public ArrayList a;
    public x01.i b;

    public f(ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.a.equals(fVar.a) && this.b.equals(fVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopReposUnfilteredPaged(topRepos=" + this.a + ", page=" + this.b + ")";
    }
}
