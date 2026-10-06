package u4;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.view.MenuItem;
import p.oShadow;

/* loaded from: /home/user/work/p/classes.dex */
public interface a extends MenuItem {
    a a(oShadow oVar);

    @Override // android.view.MenuItem
    int getAlphabeticModifiers();

    @Override // android.view.MenuItem
    CharSequence getContentDescription();

    @Override // android.view.MenuItem
    ColorStateList getIconTintList();

    @Override // android.view.MenuItem
    PorterDuff.Mode getIconTintMode();

    @Override // android.view.MenuItem
    int getNumericModifiers();

    @Override // android.view.MenuItem
    CharSequence getTooltipText();

    o h();

    @Override // android.view.MenuItem
    MenuItem setAlphabeticShortcut(char c10, int i);

    @Override // android.view.MenuItem
    a setContentDescription(CharSequence charSequence);

    @Override // android.view.MenuItem
    MenuItem setIconTintList(ColorStateList colorStateList);

    @Override // android.view.MenuItem
    MenuItem setIconTintMode(PorterDuff.Mode mode);

    @Override // android.view.MenuItem
    MenuItem setNumericShortcut(char c10, int i);

    @Override // android.view.MenuItem
    MenuItem setShortcut(char c10, char c11, int i, int i10);

    @Override // android.view.MenuItem
    a setTooltipText(CharSequence charSequence);
}
