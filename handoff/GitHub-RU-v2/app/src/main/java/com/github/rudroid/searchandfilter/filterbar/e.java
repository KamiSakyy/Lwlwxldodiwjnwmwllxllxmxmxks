package com.github.rudroid.searchandfilter.filterbar;

/* loaded from: /home/user/work/p/classes3.dex */
public final class e {
    public String a;
    public j71.a b;

    public e(String str, j71.a aVar) {
        k71.k.g(str, "label");
        this.a = str;
        this.b = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return k71.k.b(this.a, eVar.a) && k71.k.b(this.b, eVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        j71.a aVar = this.b;
        return hashCode + (aVar == null ? 0 : aVar.hashCode());
    }

    public final String toString() {
        return "FilterBarContextMenuItem(label=" + this.a + ", action=" + this.b + ")";
    }
    public static Object r(Object p1, Object p2, Object p3) { return null; }
}
