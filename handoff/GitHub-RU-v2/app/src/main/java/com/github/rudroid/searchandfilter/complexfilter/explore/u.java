package com.github.rudroid.searchandfilter.complexfilter.explore;

import com.github.service.models.response.SpokenLanguage;

/* loaded from: /home/user/work/p/classes3.dex */
public final class u {
    public final SpokenLanguage a;
    public final boolean b;

    public u(SpokenLanguage spokenLanguage, boolean z) {
        k71.k.g(spokenLanguage, "spokenLanguage");
        this.a = spokenLanguage;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return k71.k.b(this.a, uVar.a) && this.b == uVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableSpokenLanguage(spokenLanguage=" + this.a + ", isSelected=" + this.b + ")";
    }
}
