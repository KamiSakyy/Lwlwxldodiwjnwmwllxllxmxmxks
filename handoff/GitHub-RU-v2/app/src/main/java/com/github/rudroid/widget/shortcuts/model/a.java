package com.github.rudroid.widget.shortcuts.model;

import k71.k;

/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public final String a;
    public final xz0.e b;

    public a(xz0.e eVar) {
        k.g(eVar, "item");
        String title = eVar.getTitle();
        k.g(title, "name");
        this.a = title;
        this.b = eVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return k.b(this.a, aVar.a) && k.b(this.b, aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ShortcutItem(name=" + this.a + ", item=" + this.b + ")";
    }
}
