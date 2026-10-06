package yz0;

import com.github.service.models.response.Language;
import java.util.ArrayList;
import java.util.List;

/* loaded from: /home/user/work/p/classes4.dex */
public final class o {
    public static final n Companion = new n();
    public final String a;
    public final Language b;
    public final int c;
    public final int d;
    public final List e;
    public final ArrayList f;
    public final Integer g;

    public o(String str, Language language, int i, int i2, List list, ArrayList arrayList) {
        Integer valueOf;
        this.a = str;
        this.b = language;
        this.c = i;
        this.d = i2;
        this.e = list;
        this.f = arrayList;
        p pVar = (p) x61.m.W(list);
        if (pVar != null) {
            valueOf = Integer.valueOf(pVar.e);
        } else {
            p pVar2 = (p) x61.m.W(arrayList);
            valueOf = pVar2 != null ? Integer.valueOf(pVar2.e) : null;
        }
        this.g = valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.a.equals(oVar.a) && this.b.equals(oVar.b) && this.c == oVar.c && this.d == oVar.d && this.e.equals(oVar.e) && this.f.equals(oVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + f1.e.c(this.e, a0.s0.b(this.d, a0.s0.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CodeSearchResult(pathWithName=");
        sb.append(this.a);
        sb.append(", language=");
        sb.append(this.b);
        sb.append(", maxLineNumber=");
        a0.s0.z(sb, this.c, ", matchCount=", this.d, ", prominentSnippets=");
        sb.append(this.e);
        sb.append(", allSnippets=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class b {
        public b() {
        }
    }
}
