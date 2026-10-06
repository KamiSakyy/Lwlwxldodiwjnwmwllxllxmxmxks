package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class n implements u4.a {
    public o A;
    public MenuItem.OnActionExpandListener B;

    /* renamed from: a, reason: collision with root package name */
    public final int f30275a;

    /* renamed from: b, reason: collision with root package name */
    public final int f30276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f30277c;

    /* renamed from: d, reason: collision with root package name */
    public final int f30278d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f30279e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f30280f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f30281g;

    /* renamed from: h, reason: collision with root package name */
    public char f30282h;

    /* renamed from: j, reason: collision with root package name */
    public char f30283j;
    public Drawable l;

    /* renamed from: n, reason: collision with root package name */
    public final l f30285n;

    /* renamed from: o, reason: collision with root package name */
    public d0 f30286o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f30287p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f30288q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f30289r;

    /* renamed from: y, reason: collision with root package name */
    public int f30296y;

    /* renamed from: z, reason: collision with root package name */
    public View f30297z;
    public int i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f30284k = 4096;
    public int m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f30290s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f30291t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30292u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30293v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30294w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f30295x = 16;
    public boolean C = false;

    public n(l lVar, int i, int i10, int i11, int i12, CharSequence charSequence, int i13) {
        this.f30285n = lVar;
        this.f30275a = i10;
        this.f30276b = i;
        this.f30277c = i11;
        this.f30278d = i12;
        this.f30279e = charSequence;
        this.f30296y = i13;
    }

    public static void b(int i, int i10, String str, StringBuilder sb2) {
        if ((i & i10) == i10) {
            sb2.append(str);
        }
    }

    @Override // u4.a
    public final u4.a a(o oVar) {
        this.f30297z = null;
        this.A = oVar;
        this.f30285n.p(true);
        o oVar2 = this.A;
        if (oVar2 != null) {
            oVar2.f30298a = new kk.a(17, this);
            oVar2.f30299b.setVisibilityListener(oVar2);
        }
        return this;
    }

    public final Drawable c(Drawable drawable) {
        if (drawable != null && this.f30294w && (this.f30292u || this.f30293v)) {
            drawable = drawable.mutate();
            if (this.f30292u) {
                drawable.setTintList(this.f30290s);
            }
            if (this.f30293v) {
                drawable.setTintMode(this.f30291t);
            }
            this.f30294w = false;
        }
        return drawable;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f30296y & 8) == 0) {
            return false;
        }
        if (this.f30297z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f30285n.d(this);
        }
        return false;
    }

    public final boolean d() {
        o oVar;
        if ((this.f30296y & 8) != 0) {
            if (this.f30297z == null && (oVar = this.A) != null) {
                this.f30297z = oVar.f30299b.onCreateActionView(this);
            }
            if (this.f30297z != null) {
                return true;
            }
        }
        return false;
    }

    public final void e(boolean z10) {
        if (z10) {
            this.f30295x |= 32;
        } else {
            this.f30295x &= -33;
        }
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if (!d()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.B;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f30285n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f30297z;
        if (view != null) {
            return view;
        }
        o oVar = this.A;
        if (oVar == null) {
            return null;
        }
        View onCreateActionView = oVar.f30299b.onCreateActionView(this);
        this.f30297z = onCreateActionView;
        return onCreateActionView;
    }

    @Override // u4.a, android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f30284k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.f30283j;
    }

    @Override // u4.a, android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f30288q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f30276b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.l;
        if (drawable != null) {
            return c(drawable);
        }
        int i = this.m;
        if (i == 0) {
            return null;
        }
        Drawable o5 = w8.s.o(this.f30285n.f30250a, i);
        this.m = 0;
        this.l = o5;
        return c(o5);
    }

    @Override // u4.a, android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f30290s;
    }

    @Override // u4.a, android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f30291t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f30281g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f30275a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // u4.a, android.view.MenuItem
    public final int getNumericModifiers() {
        return this.i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f30282h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f30277c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f30286o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f30279e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f30280f;
        return charSequence != null ? charSequence : this.f30279e;
    }

    @Override // u4.a, android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f30289r;
    }

    @Override // u4.a
    public final o h() {
        return this.A;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f30286o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.C;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f30295x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f30295x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f30295x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        o oVar = this.A;
        return (oVar == null || !oVar.f30299b.overridesItemVisibility()) ? (this.f30295x & 8) == 0 : (this.f30295x & 8) == 0 && this.A.f30299b.isVisible();
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i;
        this.f30297z = view;
        this.A = null;
        if (view != null && view.getId() == -1 && (i = this.f30275a) > 0) {
            view.setId(i);
        }
        l lVar = this.f30285n;
        lVar.f30259k = true;
        lVar.p(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10) {
        if (this.f30283j == c10) {
            return this;
        }
        this.f30283j = Character.toLowerCase(c10);
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z10) {
        int i = this.f30295x;
        int i10 = (z10 ? 1 : 0) | (i & (-2));
        this.f30295x = i10;
        if (i != i10) {
            this.f30285n.p(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z10) {
        int i = this.f30295x;
        int i10 = i & 4;
        l lVar = this.f30285n;
        if (i10 == 0) {
            int i11 = (i & (-3)) | (z10 ? 2 : 0);
            this.f30295x = i11;
            if (i != i11) {
                lVar.p(false);
            }
            return this;
        }
        ArrayList arrayList = lVar.f30255f;
        int size = arrayList.size();
        lVar.w();
        for (int i12 = 0; i12 < size; i12++) {
            n nVar = (n) arrayList.get(i12);
            if (nVar.f30276b == this.f30276b && (nVar.f30295x & 4) != 0 && nVar.isCheckable()) {
                boolean z11 = nVar == this;
                int i13 = nVar.f30295x;
                int i14 = (z11 ? 2 : 0) | (i13 & (-3));
                nVar.f30295x = i14;
                if (i13 != i14) {
                    nVar.f30285n.p(false);
                }
            }
        }
        lVar.v();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z10) {
        if (z10) {
            this.f30295x |= 16;
        } else {
            this.f30295x &= -17;
        }
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.m = 0;
        this.l = drawable;
        this.f30294w = true;
        this.f30285n.p(false);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f30290s = colorStateList;
        this.f30292u = true;
        this.f30294w = true;
        this.f30285n.p(false);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f30291t = mode;
        this.f30293v = true;
        this.f30294w = true;
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f30281g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10) {
        if (this.f30282h == c10) {
            return this;
        }
        this.f30282h = c10;
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.B = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f30287p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11) {
        this.f30282h = c10;
        this.f30283j = Character.toLowerCase(c11);
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i) {
        int i10 = i & 3;
        if (i10 != 0 && i10 != 1 && i10 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f30296y = i;
        l lVar = this.f30285n;
        lVar.f30259k = true;
        lVar.p(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i) {
        setShowAsAction(i);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f30279e = charSequence;
        this.f30285n.p(false);
        d0 d0Var = this.f30286o;
        if (d0Var != null) {
            d0Var.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f30280f = charSequence;
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z10) {
        int i = this.f30295x;
        int i10 = (z10 ? 0 : 8) | (i & (-9));
        this.f30295x = i10;
        if (i != i10) {
            l lVar = this.f30285n;
            lVar.f30257h = true;
            lVar.p(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f30279e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // u4.a, android.view.MenuItem
    public final u4.a setContentDescription_dup(CharSequence charSequence) {
        this.f30288q = charSequence;
        this.f30285n.p(false);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final u4.a setTooltipText_dup(CharSequence charSequence) {
        this.f30289r = charSequence;
        this.f30285n.p(false);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c10, int i) {
        if (this.f30283j == c10 && this.f30284k == i) {
            return this;
        }
        this.f30283j = Character.toLowerCase(c10);
        this.f30284k = KeyEvent.normalizeMetaState(i);
        this.f30285n.p(false);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setNumericShortcut(char c10, int i) {
        if (this.f30282h == c10 && this.i == i) {
            return this;
        }
        this.f30282h = c10;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f30285n.p(false);
        return this;
    }

    @Override // u4.a, android.view.MenuItem
    public final MenuItem setShortcut(char c10, char c11, int i, int i10) {
        this.f30282h = c10;
        this.i = KeyEvent.normalizeMetaState(i);
        this.f30283j = Character.toLowerCase(c11);
        this.f30284k = KeyEvent.normalizeMetaState(i10);
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i) {
        this.l = null;
        this.m = i;
        this.f30294w = true;
        this.f30285n.p(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i) {
        setTitle(this.f30285n.f30250a.getString(i));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i) {
        int i10;
        l lVar = this.f30285n;
        Context context = lVar.f30250a;
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) new LinearLayout(context), false);
        this.f30297z = inflate;
        this.A = null;
        if (inflate != null && inflate.getId() == -1 && (i10 = this.f30275a) > 0) {
            inflate.setId(i10);
        }
        lVar.f30259k = true;
        lVar.p(true);
        return this;
    }

    public Object d = null;
    public Object e = null;
    public Object q = null;
    public Object r = null;
}
