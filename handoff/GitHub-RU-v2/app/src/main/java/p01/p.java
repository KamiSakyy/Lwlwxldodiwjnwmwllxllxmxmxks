package p01;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class p {
    public final ArrayList a;
    public final x01.i b;

    public p(ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p)) {
            return false;
        }
        p pVar = (p) obj;
        return this.a.equals(pVar.a) && this.b.equals(pVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ViewerTemplateRepositoriesPaged(repositories=" + this.a + ", page=" + this.b + ")";
    }
}
