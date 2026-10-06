package com.github.rudroid.widget.shortcuts.model;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import java.util.ArrayList;
import k71.k;
import oa.j;

/* loaded from: /home/user/work/p/classes3.dex */
public final class h {
    public j a;
    public StoredShortcutModel b;
    public ArrayList c;
    public float d;

    public h(j jVar, StoredShortcutModel storedShortcutModel, ArrayList arrayList, float f) {
        k.g(jVar, "user");
        k.g(storedShortcutModel, "shortcut");
        this.a = jVar;
        this.b = storedShortcutModel;
        this.c = arrayList;
        this.d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return k.b(this.a, hVar.a) && k.b(this.b, hVar.b) && this.c.equals(hVar.c) && Float.compare(this.d, hVar.d) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.d) + no.a.b(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ShortcutWidgetModel(user=" + this.a + ", shortcut=" + this.b + ", items=" + this.c + ", opacity=" + this.d + ")";
    }

}
