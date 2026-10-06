package com.github.rudroid.uitoolkit.markdown.components;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
final class u {
    public final boolean a;
    public final ArrayList b;

    public u(ArrayList arrayList, boolean z) {
        this.a = z;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a == uVar.a && this.b.equals(uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MarkdownTableRow(isHeader=" + this.a + ", cells=" + this.b + ")";
    }
}
