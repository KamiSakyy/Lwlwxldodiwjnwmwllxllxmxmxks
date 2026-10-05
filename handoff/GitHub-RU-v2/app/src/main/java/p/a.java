package p;

import android.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* loaded from: /home/user/work/p/classes.dex */
public final class a implements u4.a {

    /* renamed from: a, reason: collision with root package name */
    public CharSequence f30200a;

    /* renamed from: b, reason: collision with root package name */
    public CharSequence f30201b;

    /* renamed from: c, reason: collision with root package name */
    public Intent f30202c;

    /* renamed from: d, reason: collision with root package name */
    public char f30203d;

    /* renamed from: e, reason: collision with root package name */
    public int f30204e;

    /* renamed from: f, reason: collision with root package name */
    public char f30205f;

    /* renamed from: g, reason: collision with root package name */
    public int f30206g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f30207h;
    public Context i;

    /* renamed from: j, reason: collision with root package name */
    public CharSequence f30208j;

    /* renamed from: k, reason: collision with root package name */
    public CharSequence f30209k;
    public ColorStateList l;
    public PorterDuff.Mode m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f30210n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f30211o;

    /* renamed from: p, reason: collision with root package name */
    public int f30212p;

    @Override // u4.a
    public final u4.a a(o oVar) {
        throw new UnsupportedOperationException();
    }

    public final void b() {
        Drawable drawable = this.f30207h;
        if (drawable != null) {
            if (this.f30210n || this.f30211o) {
                this.f30207h = drawable;
                Drawable mutate = drawable.mutate();
                this.f30207h = mutate;
                if (this.f30210n) {
                    mutate.setTintList(this.l);
                }
                if (this.f30211o) {
                    this.f30207h.setTintMode(this.m);
                }
            }
        }
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        return null;
    }

    @Override // u4.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f30206g;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f30205f;
    }

    @Override // u4.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f30208j;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        return this.f30207h;
    }

    @Override // u4.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.l;
    }

    @Override // u4.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.m;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f30202c;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return R.id.home;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // u4.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f30204e;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f30203d;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return 0;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f30200a;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f30201b;
        return charSequence != null ? charSequence : this.f30200a;
    }

    @Override // u4.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f30209k;
    }

    @Override // u4.a
    public final o h() {
        return null;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f30212p & 1) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f30212p & 2) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f30212p & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f30212p & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        this.f30205f = Character.toLowerCase(c10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        this.f30212p = (z10 ? 1 : 0) | (this.f30212p & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        this.f30212p = (z10 ? 2 : 0) | (this.f30212p & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setContentDescription(CharSequence charSequence) {
        this.f30208j = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        this.f30212p = (z10 ? 16 : 0) | (this.f30212p & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f30207h = drawable;
        b();
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.l = colorStateList;
        this.f30210n = true;
        b();
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.m = mode;
        this.f30211o = true;
        b();
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f30202c = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        this.f30203d = c10;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f30203d = c10;
        this.f30205f = Character.toLowerCase(c11);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f30200a = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f30201b = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTooltipText(CharSequence charSequence) {
        this.f30209k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        this.f30212p = (this.f30212p & 8) | (z10 ? 0 : 8);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        this.f30205f = Character.toLowerCase(c10);
        this.f30206g = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final u4.a setContentDescription_dup(CharSequence charSequence) {
        this.f30208j = charSequence;
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        this.f30203d = c10;
        this.f30204e = KeyEvent.normalizeMetaState(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        this.f30200a = this.i.getResources().getString(i);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final u4.a setTooltipText_dup(CharSequence charSequence) {
        this.f30209k = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.f30207h = this.i.getDrawable(i);
        b();
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f30203d = c10;
        this.f30204e = KeyEvent.normalizeMetaState(i);
        this.f30205f = Character.toLowerCase(c11);
        this.f30206g = KeyEvent.normalizeMetaState(i10);
        return this;
    }
}
