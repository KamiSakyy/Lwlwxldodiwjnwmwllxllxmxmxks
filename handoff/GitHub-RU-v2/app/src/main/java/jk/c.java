package jk;

import com.github.rudroid.copilot.h1;
import java.util.ArrayList;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class c {
    public final ArrayList a;
    public final x01.i b;
    public final String c;

    public c(String str, ArrayList arrayList, x01.i iVar) {
        this.a = arrayList;
        this.b = iVar;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.a.equals(cVar.a) && this.b.equals(cVar.b) && k.b(this.c, cVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DiscussionCategoriesDataPage(discussionCategories=");
        sb.append(this.a);
        sb.append(", page=");
        sb.append(this.b);
        sb.append(", repositoryId=");
        return h1.p(sb, this.c, ")");
    }
}
