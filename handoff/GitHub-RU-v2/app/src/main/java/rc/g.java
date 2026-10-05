package rc;

import android.view.MenuItem;

/* loaded from: /home/user/work/p/classes.dex */
public final class g implements MenuItem.OnActionExpandListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j71.a f31354a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j71.a f31355b;

    public g(j71.a aVar, j71.a aVar2) {
        this.f31354a = aVar;
        this.f31355b = aVar2;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionCollapse(MenuItem menuItem) {
        k71.k.g(menuItem, "item");
        this.f31355b.a();
        return true;
    }

    @Override // android.view.MenuItem.OnActionExpandListener
    public final boolean onMenuItemActionExpand(MenuItem menuItem) {
        k71.k.g(menuItem, "item");
        this.f31354a.a();
        return true;
    }
}
