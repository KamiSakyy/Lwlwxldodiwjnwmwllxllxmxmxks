package com.github.rudroid.searchandfilter.complexfilter.repository;

import com.github.service.models.response.SimpleRepository;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public SimpleRepository a;
    public boolean b;

    public r(SimpleRepository simpleRepository, boolean z) {
        k71.k.g(simpleRepository, "repository");
        this.a = simpleRepository;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && this.b == rVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableRepository(repository=" + this.a + ", isSelected=" + this.b + ")";
    }
}
