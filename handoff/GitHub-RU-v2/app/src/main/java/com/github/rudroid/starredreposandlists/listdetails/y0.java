package com.github.rudroid.starredreposandlists.listdetails;

import com.github.rudroid.copilot.h1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public final com.github.service.models.response.a a;
    public final String b;
    public final String c;
    public final int d;

    public y0(com.github.service.models.response.a aVar, String str, String str2, int i) {
        k71.k.g(str, "listName");
        k71.k.g(str2, "listDescription");
        this.a = aVar;
        this.b = str;
        this.c = str2;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return k71.k.b(this.a, y0Var.a) && k71.k.b(this.b, y0Var.b) && k71.k.b(this.c, y0Var.c) && this.d == y0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + h1.i(h1.i(this.a.hashCode() * 31, this.b, 31), this.c, 31);
    }

    public final String toString() {
        return "ListHeaderData(listOwner=" + this.a + ", listName=" + this.b + ", listDescription=" + this.c + ", repoCount=" + this.d + ")";
    }
}
