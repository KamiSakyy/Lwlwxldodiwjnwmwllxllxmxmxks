package com.github.rudroid.support;

import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.View;
import com.github.rudroid.utilities.ui.g1;
import com.github.rudroid.utilities.ui.h0;
import com.github.rudroid.utilities.ui.n0;
import com.github.rudroid.utilities.ui.s0;
import com.github.rudroid.utilities.ui.t1;
import com.github.rudroid.utilities.ui.u1;
import com.github.rudroid.views.ProgressActionView;
import kotlin.NoWhenBranchMatchedException;

@c71.e(c = "com.github.rudroid.support.SupportBottomSheetDialog$configureToolbar$1", f = "SupportBottomSheetDialog.kt", l = {}, m = "invokeSuspend", v = 1)
/* loaded from: /home/user/work/p/classes3.dex */
final class f extends c71.j implements j71.e {
    public /* synthetic */ Object v;
    public final /* synthetic */ SupportBottomSheetDialog w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(SupportBottomSheetDialog supportBottomSheetDialog, a71.c cVar) {
        super(2, cVar);
        this.w = supportBottomSheetDialog;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        f fVar = new f(this.w, cVar);
        fVar.v = obj;
        return fVar;
    }

    public final Object s(Object obj, Object obj2) {
        f r = r((a71.c) obj2, (g1) obj);
        w61.a0 a0Var = w61.a0.a;
        r.v(a0Var);
        return a0Var;
    }

    public final Object v(Object obj) {
        Drawable mutate;
        g1 g1Var = (g1) this.v;
        b71.a aVar = b71.a.r;
        sy.y.j(obj);
        h hVar = (h) g1Var.getData();
        boolean z = hVar != null ? hVar.c : false;
        SupportBottomSheetDialog supportBottomSheetDialog = this.w;
        MenuItem menuItem = supportBottomSheetDialog.W0;
        if (menuItem == null) {
            k71.k.m("submitMenuItem");
            throw null;
        }
        menuItem.setEnabled(z);
        MenuItem menuItem2 = supportBottomSheetDialog.W0;
        if (menuItem2 == null) {
            k71.k.m("submitMenuItem");
            throw null;
        }
        Drawable icon = menuItem2.getIcon();
        if (icon != null && (mutate = icon.mutate()) != null) {
            mutate.setTint(z ? supportBottomSheetDialog.i4().getColor(2131100986) : supportBottomSheetDialog.i4().getColor(2131100987));
        }
        if (g1Var instanceof n0) {
            MenuItem menuItem3 = supportBottomSheetDialog.W0;
            if (menuItem3 == null) {
                k71.k.m("submitMenuItem");
                throw null;
            }
            menuItem3.setActionView((View) null);
        } else if (g1Var instanceof s0) {
            MenuItem menuItem4 = supportBottomSheetDialog.W0;
            if (menuItem4 == null) {
                k71.k.m("submitMenuItem");
                throw null;
            }
            ProgressActionView progressActionView = supportBottomSheetDialog.X0;
            if (progressActionView == null) {
                k71.k.m("progressActionView");
                throw null;
            }
            menuItem4.setActionView(progressActionView);
        } else if (g1Var instanceof t1) {
            MenuItem menuItem5 = supportBottomSheetDialog.W0;
            if (menuItem5 == null) {
                k71.k.m("submitMenuItem");
                throw null;
            }
            menuItem5.setActionView((View) null);
            supportBottomSheetDialog.s4();
        } else if (!(g1Var instanceof h0) && !(g1Var instanceof u1)) {
            throw new NoWhenBranchMatchedException();
        }
        return w61.a0.a;
    }
}
