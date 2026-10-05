package p;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public class l implements Menu {

    /* renamed from: z, reason: collision with root package name */
    public static final int[] f30249z = {1, 4, 5, 3, 2, 0};

    /* renamed from: a, reason: collision with root package name */
    public final Context f30250a;

    /* renamed from: b, reason: collision with root package name */
    public final Resources f30251b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30252c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f30253d;

    /* renamed from: e, reason: collision with root package name */
    public j f30254e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f30255f;

    /* renamed from: g, reason: collision with root package name */
    public final ArrayList f30256g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f30257h;
    public final ArrayList i;

    /* renamed from: j, reason: collision with root package name */
    public final ArrayList f30258j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f30259k;
    public CharSequence m;

    /* renamed from: n, reason: collision with root package name */
    public Drawable f30260n;

    /* renamed from: o, reason: collision with root package name */
    public View f30261o;

    /* renamed from: w, reason: collision with root package name */
    public n f30269w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f30271y;
    public int l = 0;

    /* renamed from: p, reason: collision with root package name */
    public boolean f30262p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f30263q = false;

    /* renamed from: r, reason: collision with root package name */
    public boolean f30264r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f30265s = false;

    /* renamed from: t, reason: collision with root package name */
    public boolean f30266t = false;

    /* renamed from: u, reason: collision with root package name */
    public final ArrayList f30267u = new ArrayList();

    /* renamed from: v, reason: collision with root package name */
    public final CopyOnWriteArrayList f30268v = new CopyOnWriteArrayList();

    /* renamed from: x, reason: collision with root package name */
    public boolean f30270x = false;

    public l(Context context) {
        boolean z10;
        boolean z11 = false;
        this.f30250a = context;
        Resources resources = context.getResources();
        this.f30251b = resources;
        this.f30255f = new ArrayList();
        this.f30256g = new ArrayList();
        this.f30257h = true;
        this.i = new ArrayList();
        this.f30258j = new ArrayList();
        this.f30259k = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            if (Build.VERSION.SDK_INT >= 28) {
                z10 = a5.l.D(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z10 = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z10) {
                z11 = true;
            }
        }
        this.f30253d = z11;
    }

    public final n a(int i, int i10, int i11, CharSequence charSequence) {
        int i12;
        int i13 = ((-65536) & i11) >> 16;
        if (i13 < 0 || i13 >= 6) {
            throw new IllegalArgumentException("order does not contain a valid category.");
        }
        int i14 = (f30249z[i13] << 16) | (65535 & i11);
        n nVar = new n(this, i, i10, i11, i14, charSequence, this.l);
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size() - 1;
        while (true) {
            if (size < 0) {
                i12 = 0;
                break;
            }
            if (((n) arrayList.get(size)).f30278d <= i14) {
                i12 = size + 1;
                break;
            }
            size--;
        }
        arrayList.add(i12, nVar);
        p(true);
        return nVar;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i10, int i11, ComponentName componentName, Intent[] intentArr, Intent intent, int i12, MenuItem[] menuItemArr) {
        int i13;
        PackageManager packageManager = this.f30250a.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = queryIntentActivityOptions != null ? queryIntentActivityOptions.size() : 0;
        if ((i12 & 1) == 0) {
            removeGroup(i);
        }
        for (int i14 = 0; i14 < size; i14++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i14);
            int i15 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i15 < 0 ? intent : intentArr[i15]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            n a10 = a(i, i10, i11, resolveInfo.loadLabel(packageManager));
            a10.setIcon(resolveInfo.loadIcon(packageManager));
            a10.f30281g = intent2;
            if (menuItemArr != null && (i13 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i13] = a10;
            }
        }
        return size;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public final void b(x xVar, Context context) {
        this.f30268v.add(new WeakReference(xVar));
        xVar.c(context, this);
        this.f30259k = true;
    }

    public final void c(boolean z10) {
        if (this.f30266t) {
            return;
        }
        this.f30266t = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30268v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.b(this, z10);
            }
        }
        this.f30266t = false;
    }

    @Override // android.view.Menu
    public final void clear() {
        n nVar = this.f30269w;
        if (nVar != null) {
            d(nVar);
        }
        this.f30255f.clear();
        p(true);
    }

    public final void clearHeader() {
        this.f30260n = null;
        this.m = null;
        this.f30261o = null;
        p(false);
    }

    @Override // android.view.Menu
    public final void close() {
        c(true);
    }

    public boolean d(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30268v;
        boolean z10 = false;
        if (!copyOnWriteArrayList.isEmpty() && this.f30269w == nVar) {
            w();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 = xVar.k(nVar);
                    if (z10) {
                        break;
                    }
                }
            }
            v();
            if (z10) {
                this.f30269w = null;
            }
        }
        return z10;
    }

    public boolean e(l lVar, MenuItem menuItem) {
        j jVar = this.f30254e;
        return jVar != null && jVar.e(lVar, menuItem);
    }

    public boolean f(n nVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30268v;
        boolean z10 = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z10 = xVar.j(nVar);
                if (z10) {
                    break;
                }
            }
        }
        v();
        if (z10) {
            this.f30269w = nVar;
        }
        return z10;
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f30275a == i) {
                return nVar;
            }
            if (nVar.hasSubMenu() && (findItem = nVar.f30286o.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public final n g(int i, KeyEvent keyEvent) {
        ArrayList arrayList = this.f30267u;
        arrayList.clear();
        h(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (n) arrayList.get(0);
        }
        boolean n10 = n();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            char c10 = n10 ? nVar.f30283j : nVar.f30282h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (n10 && c10 == '\b' && i == 67))) {
                return nVar;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.f30255f.get(i);
    }

    public final void h(List list, int i, KeyEvent keyEvent) {
        boolean n10 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i == 67) {
            ArrayList arrayList = this.f30255f;
            int size = arrayList.size();
            for (int i10 = 0; i10 < size; i10++) {
                n nVar = (n) arrayList.get(i10);
                if (nVar.hasSubMenu()) {
                    nVar.f30286o.h(list, i, keyEvent);
                }
                char c10 = n10 ? nVar.f30283j : nVar.f30282h;
                if ((modifiers & 69647) == ((n10 ? nVar.f30284k : nVar.i) & 69647) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (n10 && c10 == '\b' && i == 67)) && nVar.isEnabled()) {
                        list.add(nVar);
                    }
                }
            }
        }
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.f30271y) {
            return true;
        }
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((n) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public final void i() {
        ArrayList l = l();
        if (this.f30259k) {
            CopyOnWriteArrayList copyOnWriteArrayList = this.f30268v;
            Iterator it = copyOnWriteArrayList.iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                x xVar = (x) weakReference.get();
                if (xVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z10 |= xVar.d();
                }
            }
            ArrayList arrayList = this.i;
            ArrayList arrayList2 = this.f30258j;
            if (z10) {
                arrayList.clear();
                arrayList2.clear();
                int size = l.size();
                for (int i = 0; i < size; i++) {
                    n nVar = (n) l.get(i);
                    if ((nVar.f30295x & 32) == 32) {
                        arrayList.add(nVar);
                    } else {
                        arrayList2.add(nVar);
                    }
                }
            } else {
                arrayList.clear();
                arrayList2.clear();
                arrayList2.addAll(l());
            }
            this.f30259k = false;
        }
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return g(i, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public l k() {
        return this;
    }

    public final ArrayList l() {
        boolean z10 = this.f30257h;
        ArrayList arrayList = this.f30256g;
        if (!z10) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.f30255f;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            n nVar = (n) arrayList2.get(i);
            if (nVar.isVisible()) {
                arrayList.add(nVar);
            }
        }
        this.f30257h = false;
        this.f30259k = true;
        return arrayList;
    }

    public boolean m() {
        return this.f30270x;
    }

    public boolean n() {
        return this.f30252c;
    }

    public boolean o() {
        return this.f30253d;
    }

    public final void p(boolean z10) {
        if (this.f30262p) {
            this.f30263q = true;
            if (z10) {
                this.f30264r = true;
                return;
            }
            return;
        }
        if (z10) {
            this.f30257h = true;
            this.f30259k = true;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30268v;
        if (copyOnWriteArrayList.isEmpty()) {
            return;
        }
        w();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar = (x) weakReference.get();
            if (xVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                xVar.f();
            }
        }
        v();
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i10) {
        return q(findItem(i), null, i10);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i10) {
        n g7 = g(i, keyEvent);
        boolean q10 = g7 != null ? q(g7, null, i10) : false;
        if ((i10 & 2) != 0) {
            c(true);
        }
        return q10;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean q(MenuItem menuItem, x xVar, int i) {
        boolean z10;
        n nVar = (n) menuItem;
        if (nVar == null || !nVar.isEnabled()) {
            return false;
        }
        l lVar = nVar.f30285n;
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = nVar.f30287p;
        if ((onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(nVar)) && !lVar.e(lVar, nVar)) {
            Intent intent = nVar.f30281g;
            if (intent != null) {
                try {
                    lVar.f30250a.startActivity(intent);
                } catch (ActivityNotFoundException unused) {
                }
            }
            o oVar = nVar.A;
            if (oVar == null || !oVar.f30299b.onPerformDefaultAction()) {
                z10 = false;
                o oVar2 = nVar.A;
                boolean z11 = oVar2 == null && oVar2.f30299b.hasSubMenu();
                if (!nVar.d()) {
                    z10 |= nVar.expandActionView();
                    if (z10) {
                        c(true);
                    }
                } else if (nVar.hasSubMenu() || z11) {
                    if ((i & 4) == 0) {
                        c(false);
                    }
                    if (!nVar.hasSubMenu()) {
                        d0 d0Var = new d0(this.f30250a, this, nVar);
                        nVar.f30286o = d0Var;
                        d0Var.setHeaderTitle(nVar.f30279e);
                    }
                    d0 d0Var2 = nVar.f30286o;
                    if (z11) {
                        oVar2.f30299b.onPrepareSubMenu(d0Var2);
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = this.f30268v;
                    if (!copyOnWriteArrayList.isEmpty()) {
                        r0 = xVar != null ? xVar.i(d0Var2) : false;
                        Iterator it = copyOnWriteArrayList.iterator();
                        while (it.hasNext()) {
                            WeakReference weakReference = (WeakReference) it.next();
                            x xVar2 = (x) weakReference.get();
                            if (xVar2 == null) {
                                copyOnWriteArrayList.remove(weakReference);
                            } else if (!r0) {
                                r0 = xVar2.i(d0Var2);
                            }
                        }
                    }
                    z10 |= r0;
                    if (!z10) {
                        c(true);
                    }
                } else if ((i & 1) == 0) {
                    c(true);
                }
                return z10;
            }
        }
        z10 = true;
        o oVar22 = nVar.A;
        if (oVar22 == null) {
        }
        if (!nVar.d()) {
        }
        return z10;
    }

    public final void r(x xVar) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.f30268v;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            x xVar2 = (x) weakReference.get();
            if (xVar2 == null || xVar2 == xVar) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (((n) arrayList.get(i11)).f30276b == i) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 >= 0) {
            int size2 = arrayList.size() - i11;
            while (true) {
                int i12 = i10 + 1;
                if (i10 >= size2 || ((n) arrayList.get(i11)).f30276b != i) {
                    break;
                }
                if (i11 >= 0 && i11 < arrayList.size()) {
                    arrayList.remove(i11);
                }
                i10 = i12;
            }
            p(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                i10 = -1;
                break;
            } else if (((n) arrayList.get(i10)).f30275a == i) {
                break;
            } else {
                i10++;
            }
        }
        if (i10 < 0 || i10 >= arrayList.size()) {
            return;
        }
        arrayList.remove(i10);
        p(true);
    }

    public final void s(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(j());
        int size = this.f30255f.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).s(bundle);
            }
        }
        int i10 = bundle.getInt("android:menu:expandedactionview");
        if (i10 <= 0 || (findItem = findItem(i10)) == null) {
            return;
        }
        findItem.expandActionView();
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z10, boolean z11) {
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f30276b == i) {
                nVar.f30295x = (nVar.f30295x & (-5)) | (z11 ? 4 : 0);
                nVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.f30270x = z10;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z10) {
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f30276b == i) {
                nVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z10) {
        ArrayList arrayList = this.f30255f;
        int size = arrayList.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            n nVar = (n) arrayList.get(i10);
            if (nVar.f30276b == i) {
                int i11 = nVar.f30295x;
                int i12 = (i11 & (-9)) | (z10 ? 0 : 8);
                nVar.f30295x = i12;
                if (i11 != i12) {
                    z11 = true;
                }
            }
        }
        if (z11) {
            p(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.f30252c = z10;
        p(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f30255f.size();
    }

    public final void t(Bundle bundle) {
        int size = this.f30255f.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((d0) item.getSubMenu()).t(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void u(int i, CharSequence charSequence, int i10, Drawable drawable, View view) {
        if (view != null) {
            this.f30261o = view;
            this.m = null;
            this.f30260n = null;
        } else {
            if (i > 0) {
                this.m = this.f30251b.getText(i);
            } else if (charSequence != null) {
                this.m = charSequence;
            }
            if (i10 > 0) {
                this.f30260n = this.f30250a.getDrawable(i10);
            } else if (drawable != null) {
                this.f30260n = drawable;
            }
            this.f30261o = null;
        }
        p(false);
    }

    public final void v() {
        this.f30262p = false;
        if (this.f30263q) {
            this.f30263q = false;
            p(this.f30264r);
        }
    }

    public final void w() {
        if (this.f30262p) {
            return;
        }
        this.f30262p = true;
        this.f30263q = false;
        this.f30264r = false;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return a(0, 0, 0, this.f30251b.getString(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.f30251b.getString(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, CharSequence charSequence) {
        return a(i, i10, i11, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, CharSequence charSequence) {
        n a10 = a(i, i10, i11, charSequence);
        d0 d0Var = new d0(this.f30250a, this, a10);
        a10.f30286o = d0Var;
        d0Var.setHeaderTitle(a10.f30279e);
        return d0Var;
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i10, int i11, int i12) {
        return a(i, i10, i11, this.f30251b.getString(i12));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i10, int i11, int i12) {
        return addSubMenu(i, i10, i11, this.f30251b.getString(i12));
    }



}
