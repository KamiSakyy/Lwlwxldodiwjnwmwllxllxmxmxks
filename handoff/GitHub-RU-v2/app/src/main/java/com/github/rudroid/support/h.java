package com.github.rudroid.support;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public static final a Companion = new a();
    public static final h f = new h(x61.r.r, false, false, null, null);
    public List a;
    public boolean b;
    public boolean c;
    public g d;
    public g e;

    public static final class a {
    }

    public h(List list, boolean z, boolean z2, g gVar, g gVar2) {
        this.a = list;
        this.b = z;
        this.c = z2;
        this.d = gVar;
        this.e = gVar2;
    }

    public static h a(h hVar, List list, boolean z, boolean z2, g gVar, g gVar2, int i) {
        if ((i & 1) != 0) {
            list = hVar.a;
        }
        List list2 = list;
        if ((i & 2) != 0) {
            z = hVar.b;
        }
        boolean z3 = z;
        if ((i & 4) != 0) {
            z2 = hVar.c;
        }
        boolean z4 = z2;
        if ((i & 8) != 0) {
            gVar = hVar.d;
        }
        g gVar3 = gVar;
        if ((i & 16) != 0) {
            gVar2 = hVar.e;
        }
        return new h(list2, z3, z4, gVar3, gVar2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k71.k.b(this.a, hVar.a) && this.b == hVar.b && this.c == hVar.c && this.d == hVar.d && this.e == hVar.e;
    }

    public final int hashCode() {
        int e = x.i.e(x.i.e(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        g gVar = this.d;
        int hashCode = (e + (gVar == null ? 0 : gVar.hashCode())) * 31;
        g gVar2 = this.e;
        return hashCode + (gVar2 != null ? gVar2.hashCode() : 0);
    }

    public final String toString() {
        return "SupportFormUIState(screenshots=" + this.a + ", isSupportEligible=" + this.b + ", canSubmit=" + this.c + ", bodyConstraintError=" + this.d + ", subjectConstraintError=" + this.e + ")";
    }
}
