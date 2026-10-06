package com.github.rudroid.accounts;

import java.util.List;

/* loaded from: /home/user/work/p/classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public List f4340a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f4341b;

    public b(List list, boolean z10) {
        k71.k.g(list, "listItems");
        this.f4340a = list;
        this.f4341b = z10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.f4340a, bVar.f4340a) && this.f4341b == bVar.f4341b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f4341b) + (this.f4340a.hashCode() * 31);
    }

    public final String toString() {
        return "AccountViewUiModel(listItems=" + this.f4340a + ", inManageMode=" + this.f4341b + ")";
    }
}
