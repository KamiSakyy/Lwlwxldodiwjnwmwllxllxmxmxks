package com.github.rudroid.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MenuItem;
import android.view.View;
import p.w;

@SuppressLint({"RestrictedApi"})
/* loaded from: /home/user/work/p/classes3.dex */
public final class f implements p.j, w {
    public b r;
    public o.i s;
    public p.l t;
    public p.v u;

    public interface a {
    }

    public interface b {
        void onMenuItemClick(MenuItem menuItem);
    }

    public f(Context context, View view) {
        k71.k.g(view, "anchor");
        this.s = new o.i(context);
        p.l lVar = new p.l(context);
        this.t = lVar;
        p.v vVar_r7 = new p.v(context, lVar, view, false, 2130969649, 0);
        this.u = vVar_r7;
        lVar.e = this;
        lVar.x = true;
        vVar_r7.h = this;
        p.t tVar = vVar_r7.i;
        if (tVar != null) {
            tVar.e(this);
        }
        vVar_r7.g = true;
        p.t tVar2 = vVar_r7.i;
        if (tVar2 != null) {
            tVar2.o(true);
        }
    }

    public final void a() {
        p.v vVar_r7 = this.u;
        if (vVar_r7.b()) {
            vVar_r7.i.dismiss();
        }
    }

    public final void b(p.l lVar, boolean z) {
        k71.k.g(lVar, "menu");
    }

    public final void c() {
        p.v vVar_r7 = this.u;
        if (vVar_r7.b()) {
            return;
        }
        if (vVar_r7.e == null) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
        vVar_r7.d(0, 0, false, false);
    }

    public final boolean e(p.l lVar, MenuItem menuItem) {
        k71.k.g(menuItem, "item");
        b bVar = this.r;
        if (bVar == null) {
            return false;
        }
        bVar.onMenuItemClick(menuItem);
        return true;
    }

    public final void j(p.l lVar) {
        k71.k.g(lVar, "menu");
    }

    public final boolean p(p.l lVar) {
        k71.k.g(lVar, "subMenu");
        return true;
    }
}
