package com.github.rudroid.searchandfilter.complexfilter.project;

import com.github.service.models.response.LegacyProjectWithNumber;

/* loaded from: /home/user/work/p/classes3.dex */
public final class o {
    public LegacyProjectWithNumber a;
    public boolean b;

    public o(LegacyProjectWithNumber legacyProjectWithNumber, boolean z) {
        k71.k.g(legacyProjectWithNumber, "project");
        this.a = legacyProjectWithNumber;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return k71.k.b(this.a, oVar.a) && this.b == oVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectableProject(project=" + this.a + ", isSelected=" + this.b + ")";
    }
}
