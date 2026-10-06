package com.github.rudroid.templates;

import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public final ArrayList a;
    public final String b;

    public u(String str, ArrayList arrayList) {
        k71.k.g(str, "repoId");
        this.a = arrayList;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return this.a.equals(uVar.a) && k71.k.b(this.b, uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IssuesTemplatesUiModel(templates=" + this.a + ", repoId=" + this.b + ")";
    }
}
