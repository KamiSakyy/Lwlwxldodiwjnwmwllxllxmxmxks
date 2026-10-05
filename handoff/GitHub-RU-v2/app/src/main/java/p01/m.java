package p01;

import java.util.ArrayList;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class m {
    public final ArrayList a;
    public final ArrayList b;
    public final boolean c;

    public m(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        this.a = arrayList;
        this.b = arrayList2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return this.a.equals(mVar.a) && this.b.equals(mVar.b) && this.c == mVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + no.a.b(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RepositoryIssues(pinnedIssues=");
        sb.append(this.a);
        sb.append(", issues=");
        sb.append(this.b);
        sb.append(", areIssueTypesAvailable=");
        return f4.s(sb, this.c, ")");
    }
}
