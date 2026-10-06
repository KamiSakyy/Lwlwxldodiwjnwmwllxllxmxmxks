package com.github.rudroid.widget.shortcuts.viewmodel;

import com.github.domain.shortcuts.model.StoredShortcutModel;
import com.github.rudroid.utilities.ui.g1;
import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public final class b {
    public z5.k a;
    public oa.j b;
    public List c;
    public StoredShortcutModel d;
    public g1 e;
    public float f;

    public b(z5.k kVar, oa.j jVar, List list, StoredShortcutModel storedShortcutModel, g1 g1Var, float f) {
        k71.k.g(list, "users");
        this.a = kVar;
        this.b = jVar;
        this.c = list;
        this.d = storedShortcutModel;
        this.e = g1Var;
        this.f = f;
    }

    public static b a(b bVar, oa.j jVar, StoredShortcutModel storedShortcutModel, g1 g1Var, float f, int i) {
        z5.k kVar = bVar.a;
        if ((i & 2) != 0) {
            jVar = bVar.b;
        }
        oa.j jVar2 = jVar;
        List list = bVar.c;
        if ((i & 8) != 0) {
            storedShortcutModel = bVar.d;
        }
        StoredShortcutModel storedShortcutModel2 = storedShortcutModel;
        if ((i & 16) != 0) {
            g1Var = bVar.e;
        }
        g1 g1Var2 = g1Var;
        if ((i & 32) != 0) {
            f = bVar.f;
        }
        bVar.getClass();
        k71.k.g(list, "users");
        return new b(kVar, jVar2, list, storedShortcutModel2, g1Var2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return k71.k.b(this.a, bVar.a) && k71.k.b(this.b, bVar.b) && k71.k.b(this.c, bVar.c) && k71.k.b(this.d, bVar.d) && k71.k.b(this.e, bVar.e) && Float.compare(this.f, bVar.f) == 0;
    }

    public final int hashCode() {
        z5.k kVar = this.a;
        int hashCode = (kVar == null ? 0 : kVar.hashCode()) * 31;
        oa.j jVar = this.b;
        int c = f1.e.c(this.c, (hashCode + (jVar == null ? 0 : jVar.hashCode())) * 31, 31);
        StoredShortcutModel storedShortcutModel = this.d;
        return Float.hashCode(this.f) + ((this.e.hashCode() + ((c + (storedShortcutModel != null ? storedShortcutModel.hashCode() : 0)) * 31)) * 31);
    }

    public final String toString() {
        return "ShortcutWidgetActivityState(glanceId=" + this.a + ", selectedUser=" + this.b + ", users=" + this.c + ", selectedShortcut=" + this.d + ", shortcutState=" + this.e + ", opacity=" + this.f + ")";
    }
}
