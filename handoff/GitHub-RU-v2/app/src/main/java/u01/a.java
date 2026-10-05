package u01;

import java.util.List;
import x01.i;

/* loaded from: /home/user/work/p/classes4.dex */
public final class a {
    public final i a;
    public final Object b;

    public a(List list, i iVar) {
        this.a = iVar;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a.equals(aVar.a) && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RepositoryIssueTypes(page=" + this.a + ", issueTypes=" + this.b + ")";
    }
}
