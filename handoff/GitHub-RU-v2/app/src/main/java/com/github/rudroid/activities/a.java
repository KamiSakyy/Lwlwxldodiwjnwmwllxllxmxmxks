package com.github.rudroid.activities;

import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements o.a {
    @Override // o.a
    public final boolean b(o.b bVar, MenuItem menuItem) {
        k71.k.g(menuItem, "item");
        int itemId = menuItem.getItemId();
        if (itemId == 2131362110) {
            throw null;
        }
        if (itemId != 2131362179) {
            return true;
        }
        throw null;
    }

    @Override // o.a
    public final boolean g(o.b bVar, Menu menu) {
        throw null;
    }

    @Override // o.a
    public final boolean o(o.b bVar, Menu menu) {
        k71.k.g(menu, "menu");
        bVar.f().inflate(2131689482, menu);
        Drawable icon = menu.findItem(2131362110).getIcon();
        if (icon != null) {
            icon.mutate();
            icon.setTint(-1);
        }
        Drawable icon2 = menu.findItem(2131362179).getIcon();
        if (icon2 == null) {
            return true;
        }
        icon2.mutate();
        icon2.setTint(-1);
        return true;
    }

    @Override // o.a
    public final void q(o.b bVar) {
        throw null;
    }
    public Object Z(Object p1) { return null; }
    public Object a0() { return null; }
}
