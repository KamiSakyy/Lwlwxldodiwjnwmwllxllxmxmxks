package com.github.rudroid.searchandfilter.complexfilter.explore;

import com.github.service.models.response.Language;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final Language a;
    public final boolean b;

    public a(Language language, boolean z) {
        k71.k.g(language, "language");
        this.a = language;
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
        return k71.k.b(this.a, aVar.a) && this.b == aVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableLanguage(language=" + this.a + ", isSelected=" + this.b + ")";
    }
}
