package com.github.rudroid.uitoolkit.markdown.components;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
final class t {
    public static final a Companion = new a();
    public static final t e;
    public final List a;
    public final List b;
    public final int c;
    public final int d;

    public static final class a {
    }

    static {
        x61.r rVar = x61.r.r;
        e = new t(rVar, rVar);
    }

    public t(List list, List list2) {
        this.a = list;
        this.b = list2;
        this.c = x61.m.w0(list);
        this.d = x61.m.w0(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return k71.k.b(this.a, tVar.a) && k71.k.b(this.b, tVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MarkdownTableMetrics(columnWidths=" + this.a + ", rowHeights=" + this.b + ")";
    }
}
