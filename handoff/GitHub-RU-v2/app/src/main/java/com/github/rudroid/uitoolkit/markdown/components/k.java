package com.github.rudroid.uitoolkit.markdown.components;

import com.github.rudroid.copilot.h1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class k {
    public final int a;
    public final Object b;
    public final List c;
    public final int d;

    public k(int i, List list, y61.b bVar) {
        k71.k.g(bVar, "rows");
        this.a = i;
        this.b = list;
        this.c = bVar;
        this.d = bVar.a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.a == kVar.a && this.b.equals(kVar.b) && k71.k.b(this.c, kVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + h1.h(Integer.hashCode(this.a) * 31, this.b, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MarkdownTableContent(columnCount=");
        sb.append(this.a);
        sb.append(", columnAlignments=");
        sb.append(this.b);
        sb.append(", rows=");
        return x.i.l(sb, this.c, ")");
    }
}
