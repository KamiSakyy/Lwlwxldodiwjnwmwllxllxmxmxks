package q00;

import java.util.ArrayList;
import x01.i;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public final ArrayList a;
    public final i b;

    public b(ArrayList arrayList, i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.a.equals(bVar.a) && this.b.equals(bVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TopReposUnfilteredPaged(topRepos=" + this.a + ", page=" + this.b + ")";
    }
}
