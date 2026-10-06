package b01;

import com.github.rudroid.copilot.h1;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public final ArrayList a;
    public final x01.i b;
    public final String c;

    public d(String str, ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.a.equals(dVar.a) && this.b.equals(dVar.b) && k71.k.b(this.c, dVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionCategoriesPage(categories=");
        sb.append(this.a);
        sb.append(", page=");
        sb.append(this.b);
        sb.append(", repositoryId=");
        return h1.p(sb, this.c, ")");
    }
}
