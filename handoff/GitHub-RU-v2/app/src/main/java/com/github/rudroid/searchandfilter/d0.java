package com.github.rudroid.searchandfilter;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class d0 {
    public boolean a;
    public List b;
    public bm.l c;

    public d0(boolean z, List list, bm.l lVar) {
        this.a = z;
        this.b = list;
        this.c = lVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return false;
        }
        d0 d0Var = (d0) obj;
        return this.a == d0Var.a && k71.k.b(this.b, d0Var.b) && this.c == d0Var.c;
    }

    public final int hashCode() {
        int c = f1.e.c(this.b, Boolean.hashCode(this.a) * 31, 31);
        bm.l lVar = this.c;
        return c + (lVar == null ? 0 : lVar.hashCode());
    }

    public final String toString() {
        return "FilterUiModel(isVisible=" + this.a + ", filters=" + this.b + ", newFilterBadgeType=" + this.c + ")";
    }

    public /* synthetic */ d0() {
        this(false, x61.rShadow.r, null);
    }
}
