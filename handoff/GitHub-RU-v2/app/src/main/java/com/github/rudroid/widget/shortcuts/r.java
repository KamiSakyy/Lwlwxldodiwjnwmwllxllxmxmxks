package com.github.rudroid.widget.shortcuts;

import com.github.domain.shortcuts.model.StoredShortcutModel;

/* loaded from: /home/user/work/p/classes3.dex */
public final class r {
    public oa.j a;
    public StoredShortcutModel b;
    public float c;

    public r(oa.j jVar, StoredShortcutModel storedShortcutModel, float f) {
        k71.k.g(jVar, "user");
        this.a = jVar;
        this.b = storedShortcutModel;
        this.c = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r)) {
            return false;
        }
        r rVar = (r) obj;
        return k71.k.b(this.a, rVar.a) && k71.k.b(this.b, rVar.b) && Float.compare(this.c, rVar.c) == 0;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        StoredShortcutModel storedShortcutModel = this.b;
        return Float.hashCode(this.c) + ((hashCode + (storedShortcutModel == null ? 0 : storedShortcutModel.hashCode())) * 31);
    }

    public final String toString() {
        return "ShortcutWidgetConfiguration(user=" + this.a + ", shortcut=" + this.b + ", opacity=" + this.c + ")";
    }
    public Object b(Object p1, Object p2) { return null; }
}
