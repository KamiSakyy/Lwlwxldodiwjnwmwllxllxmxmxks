package com.github.rudroid.utilities.viewmodel;

import java.util.Set;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a<T> {
    public static final C0012a Companion = new C0012a();
    public boolean a;
    public Set b;

    /* renamed from: com.github.rudroid.utilities.viewmodel.a$a, reason: collision with other inner class name */
    public static final class C0012a {
    }

    public a(Set set, boolean z) {
        this.a = z;
        this.b = set;
    }

    public static a a(a aVar, Set set) {
        boolean z = aVar.a;
        aVar.getClass();
        return new a(set, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.a == aVar.a && this.b.equals(aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "MultiSelectState(isInMultiSelectMode=" + this.a + ", selectedItems=" + this.b + ")";
    }
}
