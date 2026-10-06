package com.github.rudroid.viewmodels.search;

import com.github.rudroid.copilot.h1;
import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public String a;
    public boolean b;

    public a(String str, boolean z) {
        k.g(str, "query");
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return h1.n("SearchQuery(query=", this.a, ", wasSubmittedExplicitly=", ")", this.b);
    }
}
